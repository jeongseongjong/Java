package com.biz.for_if;

public class If_07 {

	public static void main(String[] args) {

		int num = 56;
		
		// && : AND 좌우 조건이 모두 true일때만 결과가 true
		if(num % 3 == 0 && num % 6 == 0) {
			System.out.println(num 
					+"는 3의 배수이며, 5의 배수이다.");
	}
		
		// || : OR 좌우 조건중 1개만 true 이면 결과가 true
		if(num % 3 == 0 || num % 6 == 0) {
			System.out.println(num 
					+"는 3의 배수이거나, 6의 배수이다.");
			System.out.println(num 
					+"는 3의 배수 또는 6의 배수이다.");
		
}
}
}