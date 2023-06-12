package com.util;

public class Validators {

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isAlpha(String str) {
		String alphaRegEx = "[a-zA-Z]+";
		return str.matches(alphaRegEx);
	}

	public static boolean isDigit(String str) {
		String digitRegEx = "[0-9]+";
		return str.matches(digitRegEx);
	}

	public static boolean isEmail(String str) {
		String emailRegEx = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}";
		return str.matches(emailRegEx);

	}

	public static void main(String[] args) {
		String data = "te";
		String regEx = "[a-z]+";
		// + => 1 or N
		// * => 0 or N
		// . => 0 or 1
		System.out.println(data.matches(regEx));
		System.out.println(isEmail("tejas@gmail.com"));
		System.out.println(isEmail("tejas@gmail.in"));
		System.out.println(isEmail("tejas@gmail.coma"));
		System.out.println(isEmail("tejas@gmail.comaa"));

	}
}
