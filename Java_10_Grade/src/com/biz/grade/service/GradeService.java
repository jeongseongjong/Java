package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	
	private int[] sum;
	
	private Scanner scan ;
	
	// 생성자(메서드) 만들기
	// public으로 선언
	// 메서드 이름은 클래스 이름과 같게
	// return type이 없다
	// (void, int, String 등등 키워드 붙이지 못한다.)
	public GradeService(int length) {
		
		// 여기에서 4의 맴버 배열변수들을 사용할 수 있도록
		// 생성하는 일(연산)을 수행
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		
		sum = new int[length];
		
		scan = new Scanner(System.in);
		
	} // GradeService() end
	
	// 배열의 개수만큼 각 과목의 점수를 입력
	public void input() {

		for(int i = 0 ; i < intKor.length ; i++ ) {
			System.out.print((i+1) + "번 국어 >> ");
			
			// 1. 변수를 사용하여 3줄로 작성한 코드
			// String strKor = scan.nextLine();
			// int intKor = Integer.valueOf(strKor);
			// this.intKor[i] = intKor;
			
			// 2. 문자열 변수 사용을 하지않고
			// 2. 줄로 작성한 코드
			// int intKor = Integer.valueOf(scan.nextLine());
			// this.intKor[i] = intKor;
			int intKor = Integer.valueOf(scan.nextLine());
			this.intKor[i] = intKor;
			
			// 3. 별도의 변수를 선언하지 않고
			//		1줄로 작성한 코드
			System.out.print((i+1) + "번 영어 >> ");
			this.intEng[i] = Integer.valueOf(scan.nextLine());
			
			
			System.out.print((i+1) + "번 수학 >> ");
			int intMath = Integer.valueOf(scan.nextLine());
			this.intMath[i] = intMath;
			
			
		}
	} // input () end
	
	public void view() {
		System.out.println("===========================");
		System.out.println("성적 일람표");
		System.out.println("---------------------------");
		System.out.println("국어\t영어\t수학");
		for(int i = 0 ; i < intKor.length ; i ++) {
			System.out.printf("%d\t%d\t%d\n",
					intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("===========================");
	}
}
