package com.biz.var;

public class Var_05 {

	public static void main(String[] args) {
		
		// 변수선언할때 0으로 저장
		// ==> 변수선언과 clear 라고 한다.
		int num1 = 0;
		
		/*
		 * 1. num1에 저장된 값(0)을 CPU로 복제
		 * 2. 숫자 10 을 CUPU로 복제
		 * 3. 두 값(0,10)을 덧셉
		 * 4. 그 결과를 num1 변수에 저장
		 * ==> num1의 값을 10 증가시켜라
		 */
		num1 = num1 + 10;
		
		/*
		 * 1. num1에 저장된 값(10)을 CPU 복제
		 * 2. 숫자 5를 CPU로 복제
		 * 3. 두 값(10, 5)을 덧셉
		 * 4. 그 결과를 num1 변수에 저장
		 * ==> num1의 값을 5 증가 시켜라
		 */
		num1 = num1 + 5;
		
		
	}
}
