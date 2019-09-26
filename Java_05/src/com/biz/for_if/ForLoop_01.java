package com.biz.for_if;

public class ForLoop_01 {

	public static void main(String[] args) {

		/*
		 * int i = 0 명령문이 최초 1번만 수행되고
		 * i < 10 이 참인가 검사
		 * 		이 조건이 참(true)이면
		 * 		for 명령문의 브라켓( {} )으로 감싼 부분의
		 * 		명령을 반복적으로 수행한다.
		 * 
		 * i의 값이 0부터 9까지 (<10) 1씩 증가되는 조건내에서
		 * 명령문을 반복적으로 수행한다.
		 */
		for(int i = 0; i < 10 ; i++)
			System.out.println(" 여기는 콘솔 출력하는 곳 " + i);
	}

}
