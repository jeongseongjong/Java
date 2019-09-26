package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {

		// 정수형 배열 intKor를 5개 생성
		// 정수형 배열을 선언하겠다. 키워드(명령어)
		// 배열의 이름
		// 정수형 배열 5개를 생성
		int[] intKor = new int[5];

		// Scanner 클래스를 사용하겠다.
		// scan 객체로 선언하겠다.
		// Scanner를 시스템과 연결하라
		Scanner scan = new Scanner(System.in);

		// ===================================
		// 배열개수만큼 반복될 코드
		// -----------------------------------
		for (int i = 0; i < intKor.length; i++) {

			System.out.print("국어점수 >> ");
			String strKor = scan.nextLine();

			// 5개의 배열중에 0번째 위치에 방금 입력한
			// 점수를 저장하겠다.
			intKor[i] = Integer.valueOf(strKor);
			// ===================================
		}
	}

}
