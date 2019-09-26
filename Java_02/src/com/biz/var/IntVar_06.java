package com.biz.var;

public class IntVar_06 {

	public static void main(String[] args) {

		int num1 = 0;
		num1 = 999;
		num1 = 9_999;
		num1 = 99_999;
		num1 = 999_999;
		
		// java 1.7부터 사용가능한 숫자 구분기호( ㄴ_ )
		num1 = 9_999_999;
		num1 = 99_999_999;
		num1 = 999_999_999;
		// num1 = 9999999999; // int 형 범위 초과
	}

}
