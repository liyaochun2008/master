package com.jt.car.body;

public interface Car {
	
	 void move(String command) throws Exception;
	    
	 int getPositionX();
	    
	 int getPositionY();
	  
	 String getOrientation();

}
