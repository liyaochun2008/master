package com.jt.car.body.conf;

public class CarDetails {

	private static String ORIGINALDIRECTOR = "北";

	private static int Y = 1;

	private static int X = 1;

	private static final String[] DIRECTORARRAY = { "北", "西", "南", "东" };

	public static String getORIGINALDIRECTOR() {
		return ORIGINALDIRECTOR;
	}

	public static void setORIGINALDIRECTOR(String oRIGINALDIRECTOR) {
		ORIGINALDIRECTOR = oRIGINALDIRECTOR;
	}

	public static int getY() {
		return Y;
	}

	public static void setY(int y) {
		Y = y;
	}

	public static int getX() {
		return X;
	}

	public static void setX(int x) {
		X = x;
	}

	public static String[] getDirectorarray() {
		return DIRECTORARRAY;
	}

}
