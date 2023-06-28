package com.elfun;

import java.util.Date;

public class GreetFun {

	public static String greet() {

		Date d = new Date();

		if (d.getHours() > 0 && d.getHours() <= 11) {
			return "Good Morning";
		} else if (d.getHours() >= 12 && d.getHours() <= 17) {
			return "Good AfterNoon";
		} else {
			return "Good Evening";
		}
	}
}
