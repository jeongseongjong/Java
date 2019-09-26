package com.biz.var;

public class Var_04 {

	public static void main(String[] args) {
		
		/*
		 * 2개의 변수를 선언하고
		 * 1개의 변수값과 자신을 
		 * 더해서 다른 변수에 저장하기
		 */
		int num1 = 3;
		int num2 = 10;
		
		// 한번 변수에 저장된 값은
		// 읽기를 아무리 많이 수행해도 그 값은 변함이 없다
		// 10 + 10을 num1에 저장하라
		// 한번 변수에 저장된 값은
		// 누군가, 어디선가 그 변수에 새로운 값을
		// 저장하기 전까지는 같은 값을 게속 읽을 수 있다.
		num1 = num2 + num2;
		
		System.out.println(num2 + num2);
		System.out.println(num2 + num2);
		System.out.println(num2 + num2);
		System.out.println(num2 + num2);
		System.out.println(num2 + num2);
		System.out.println(num2 + num2);
	}
}
