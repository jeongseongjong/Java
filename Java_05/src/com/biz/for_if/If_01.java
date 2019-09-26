package com.biz.for_if;

public class If_01 {

	public static void main(String[] args) {

		// for(처음한번 ; 조건 ; 증가) { 명령문들....}
		
		// (조건연산문) 이 true 일 경우만,
		// 따라오는 명령문을 실행할 수 있다.
		if(3==3) System.out.println("3은 3이다!!");
		if( 3 > 3) System.out.println("3이 3보다 크다!!");
		if(3 != 3) System.out.println("3은 3이 아니다!!!");

		if(3==3) {
			
			System.out.println("3은 3이다!!");
			System.out.println("물은 물이다!!");
			System.out.println("산은 산이다!!");
			System.out.println("하늘은 하늘이다!!");
			System.out.println("바다는 바다이다!!");
		}
	}

}
