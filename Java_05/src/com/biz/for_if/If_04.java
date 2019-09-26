package com.biz.for_if;

public class If_04 {

	/*
	 * 1부터 100까지 숫자중에서
	 * 짝수의 합을 구하시오
	 */
	public static void main(String[] args) {

		// 합을 저장할 변수를 선언 및 초기화
		int sum = 0;
		
		// 숫자를 1부터 100까지 나열
		for(int i = 1; i <= 100; i++) {	
			
			// 나열된 숫자가 짝수인가?
			if(i % 2 == 0) // i 값을 어딘가에 계속 덧셈(누적)
				
				// 짝수이면 sum 변수에 덧셈(누적)
				sum += i;
		}
		System.out.println("1부터 100까지 숫자 중 짝수의 합 : " + sum);

	}

}
