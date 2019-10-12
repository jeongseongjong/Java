package com.biz.string;

public class Char {

	public static void main(String[] args) {

		int i = 0;
		String str = "hello";
		char[] cA = new char[10];
		for (i = 0; i < str.length(); i++) {
			cA[i] = str.charAt(i);

		}
		System.out.println(cA[1]);
	}
}
