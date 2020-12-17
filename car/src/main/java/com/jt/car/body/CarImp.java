package com.jt.car.body;

import com.jt.car.body.conf.CarDetails;
import com.jt.car.body.conf.Command;
import com.jt.car.body.conf.Park;

public class CarImp implements Car {

	private String originalDirector = CarDetails.getORIGINALDIRECTOR();

	private int Y = CarDetails.getY();

	private int X = CarDetails.getX();

	private  String[] directorArray = CarDetails.getDirectorarray();

	public CarImp() {

	}

	public CarImp(String originalDirector) {
		this.originalDirector = originalDirector;

	}

	public CarImp(String originalDirector, int X) {
		this(originalDirector);
		this.X = X;
		
	}

	public CarImp(String originalDirector, int X, int Y) {
		this(originalDirector, X);
		this.Y = Y;
	}

	@Override
	public void move(String command) throws Exception {
		if (Command.getCommand()[0].equals(command)) {
			for (int i = 0; i < 4; i++) {
				if (directorArray[i].equals(originalDirector)) {
					this.XyOperate(i);
					break;
				}
			}

		} else {
			for (int i = 0; i < 4; i++) {
				if (directorArray[i].equals(originalDirector)) {
					if (i < 3) {
						originalDirector = directorArray[i + 1];
					} else {
						originalDirector = directorArray[0];
					}

					break;
				}

			}

		}

		this.Caution();
	}

	@Override
	public int getPositionX() {

		return X;
	}

	@Override
	public int getPositionY() {

		return Y;
	}

	@Override
	public String getOrientation() {

		return originalDirector;
	}

	public void Caution() {
		System.out.println( "汽车目前处在坐标 "+this.getPositionX()+","+this.getPositionY()+" 朝向正"+this.getOrientation()+"方向");
	}
	
	public void XyOperate(int i) throws Exception {
		 switch(i) {
		 case 0: Y+=1;break;
		 case 1: X-=1;break;
		 case 2: Y-=1;break;
		 case 3: X+=1;break;
		 }
		 if(X<=0||Y<=0||X>Park.getWIDTH()||Y>Park.getHeight()) {
			 throw new Exception("超出停车范围！！！");
		 }
	}

}
