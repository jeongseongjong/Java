package com.biz.loop;

public class Loop_12 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 10; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		/*
		 * 이중 for 반복문
		 * 2개 이상의 for 문을 반복하여 실행하는 구조
		 * 
		 * 바깥쪽 for 문이 1번 실행될때
		 * 안쪽 for 문은 10번 반복 실행되고
		 * System.out.print("* ")은 모두 100번 실행된다.
		 * 
		 * 안쪽 for 문이 10번 반복 실행된후
		 * System.out.println()을 실행하여 줄바꿈 실행
		 * 
		 * 그렇게 10 * 10 까지 별 박스를  출력한다.
		 */
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
