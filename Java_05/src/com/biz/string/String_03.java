package com.biz.string;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// 대문자로 바꾸어주는 method()
		String sUpper = strNation.toUpperCase();
		System.out.println(sUpper);
		
		System.out.println(strNation.toUpperCase());
		
		// 소문자로 바꾸어주는 method
		String sLower = strNation.toLowerCase();
		System.out.println(sLower);
	}

}
