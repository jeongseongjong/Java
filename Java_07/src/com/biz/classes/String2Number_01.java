package com.biz.classes;

public class String2Number_01 {

	public static void main(String[] args) {

		String strNum1 = "30";
		String strNum2 = 40 + "";
		
		String strNum3 = "30.0";
		String strNum4 = "30.123";
		
		System.out.println(strNum1 + strNum2);
		System.out.println(strNum3 + strNum4);
		
		// 문자열형 숫자를 실제 숫자값을 변환하여
		// 덧셈 (또는 4칙연산)을 수행
		
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		
		System.out.println(intNum1 + intNum2);
		System.out.println(intNum1 * intNum2);
		System.out.println(intNum1 / intNum2);
		System.out.println(intNum1 - intNum2);
		
		float fNum3 = Float.valueOf(strNum3);
		float fNum4 = Float.valueOf(strNum4);
		
		System.out.println(fNum3 + fNum4);
		
	}

}
