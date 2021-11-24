package com.kh.object.practice;

public class StaticSample {
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		char[] cArr = value.toCharArray();
		
		cArr[index] = c;
		
		value = String.valueOf(cArr);
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String str) {
		return value + str;
	}
}
