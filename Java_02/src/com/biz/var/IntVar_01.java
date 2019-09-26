package com.biz.var;

public class IntVar_01 {
	
	public static void main(String[] args) {

		// 정수형을 저장할 num1 변수 선언
		int num1; // int num1 = 30;
		
		// 정수형을 저장할 num2 변수를 선언하고
		// 정수 30을 저장하라
		int num2 = 30;
		System.out.println(num2);
		
		// 변수를 선언만 하였을때는 변수에 저장된
		// 어떤 것도 '읽기'를 시도해서는 안된다!!
		num1 = 40;
		
		// 선언만 된 변수에 어떤 값을 저장하기 전까지는
		// 절대 읽기를 시도할 수 없다.
		System.out.println(num1);
	}

}
