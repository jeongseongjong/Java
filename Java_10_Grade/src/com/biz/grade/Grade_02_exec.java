package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {
// 한클래스에서 메서드 분리방법
// 각 메서드에 static을 붙여야 한다.
	private static int[] intKor;
	private static Scanner scan;

	public static void main(String[] args) {
		intKor = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}

		// main()에서 배열의 개수만큼 반복적으로
		// view() 메서드에게 국어점수를 표시하도록 지시
		for (int i = 0; i < intKor.length; i++) {
			view(i); // 하나씩 대입
		}
		
		// 아예 intKor 배열을 통째로 view() 메서드에게 보내고
		// 알아서 표시하도록 지시
		view(intKor); // 한번에 전체를 보내주고 알아서해라
	} // main end

	public static void input(int index) {
		System.out.print((index+1) + "번의 국어 >> ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}

	// index번째 배열의 국어 점수를 표시
	public static void view(int index) {
		System.out.println((index+1) + "번 국어 : " + intKor[index]);
	}
	
	// intKor 배열전체를 표시 
	public static void view(int[] intKor) {
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.println((i+1) + "번국어 : " + intKor[i]);
		}
	}
}