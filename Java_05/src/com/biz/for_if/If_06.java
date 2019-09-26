package com.biz.for_if;

public class If_06 {

	public static void main(String[] args) {

		int num = 47;
		/*
		 * 다양한 조건에 따라
		 * 명령문들을 실행 할 경우
		 * 여러번의 조건을 수행하는 방법
		 */
		// 1번코드
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		else if(num % 4 == 0)
			System.out.println(num + "는 4의 배수");
		else if(num % 2 == 0)
			System.out.println(num + "는 2의 배수");
		
		// 2번코드
		if(num % 3 == 0)
			System.out.println(num + "는 3의배수");
		if(num % 4 == 0)
			System.out.println(num + "는 4의배수");
		if(num % 2 == 0)
			System.out.println(num + "는 2의배수");
		
		/*
		 * 1번코드와 2번코드는 변수에 담긴값이
		 * 2,3,4의 배수인가를 알아보는 같은 일을 하는 코드이다.
		 * 하지만 1번코드는 만약 변수에 담긴 값이 3의 배수이면
		 * 		  				3의 배수라는 표시를하고
		 * 						나머지 부분은 건너뛴다.
		 * 그에 반해 2번코드는
		 * 변수에 담긴 값이 3의 배수임을 찾았음에도 불구하고
		 * 4의 배수, 2의 배수 인가를 검사하는 코드가 실행된다.
		 * 조건이 복잡해 질수록 코드실행의 효율성이 2번보다는 1번이 좋다.
		 */
		
		/*
		 * 두 코드를 효율적인 면에서만 비교하지 않고
		 * 문제풀이적 관점에서 비교해 보면
		 * 만약 어떤 값이 2의 배수이면서 4의 배수인경우
		 * 1번코드는 4의 배수인 경우만 표시를 하고
		 * 2번코드는 4의 배수인 경우와 2의 배수인경우 모두를 표시하므로
		 * 			제시된 문제에 따라 적절한 코드를 선택해야 한다.
		 */
	}

}
