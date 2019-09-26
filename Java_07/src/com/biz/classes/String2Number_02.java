package com.biz.classes;

public class String2Number_02 {

	public static void main(String[] args) {

		String strNum1 = "30";
		System.out.println(Integer.valueOf(strNum1));

		// 문자열형 숫자를 숫자로 바꿀 때
		// 숫자의 앞, 뒤 중간에 문자, 빈칸 등이 있으면 
		// 숫자로 변환하지 못한다.
		String strNum2 = "30";
		System.out.println(Integer.valueOf(strNum2));
		
		String strNum3 = " 30";
		System.out.println(Integer.valueOf(strNum3));
		
		String strNum4 = "A30";
		System.out.println(Integer.valueOf(strNum4));
		
		String strNum5 = "30A";
		System.out.println(Integer.valueOf(strNum5));
		
	}

}
