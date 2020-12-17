package com.jt.car;

import java.util.Scanner;

import com.jt.car.body.Car;
import com.jt.car.body.CarImp;

/**
 * "forward", "clockwise" (目前可选用的指令) 
 * 替换变量指令 按回车 可操作
 * 
 *  (全自动可使用定时器替换随机操作)
 *
 */
public class App {
	public static void main(String[] args) {
		String direction = "北";
		int x = 1;
		int y = 1;
		String action ="clockwise";
		Car car = new CarImp(direction, x, y);
		Scanner scan = new Scanner(System.in);
		while ("".equals(scan.nextLine())) {
			try {
				car.move(action);
			} catch (Exception e) {
				System.err.println("超出停车范围");
				e.printStackTrace();
			}
		}

	}
}
