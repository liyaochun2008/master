package com.jt.car.body.conf;

public class Command {

	private static String[] command = { "forward", "clockwise" };

	public static String[] getCommand() {
		return command;
	}

	public static void setCommand(String[] command) {
		Command.command = command;
	}

}
