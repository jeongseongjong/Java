package com.biz.for_if;

public class If_05 {

	public static void main(String[] args) {

		int num = 33;
		
		/*
		 * if 와 else를 같이 사용하는 명령문
		 * if(조건이 true) true 조건 명령실행
		 * else -> true가 아닌 조건 명령실행
		 * 
		 * if 키워드에 조건은 수없이 많은 조건중에서
		 * 		true인 경우가 단 1번만 있는 조건
		 * else 는 나머지 모든 조건
		 */
		
		// num 변수에 담긴 값이 3의 배수이냐?
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		
		// 아니면(true가 아니면 == false 공식이 아니다!!)
		else
			System.out.println(num + "는 3의 배수가 아니다!!");
		
		if(num % 2 == 0)
			System.out.println(num + "는 짝수!!");
		else {
			// num % 2가 0이 아닌경우
			// 당연히 홀수 이겠지만
			// 홀수!! 이다 라고 생각하지 말기!!
			// 짝수가 아니다 라고 생각하자
			System.out.println(num + "는 홀수!!");
		// 홀수라는 표현보다는 짝수가 아니다라는 표현이
		// 더 좋은 표현이다.===>>>
			System.out.println(num + "는 짝수가 아니다!!");
		}
	
		if(num % 2 == 1)
			System.out.println(num + "는 홀수이다!!");
		else
			System.out.println(num + "는 홀수가 아니다!!");

	}
}