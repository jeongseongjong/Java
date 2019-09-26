package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int[] intKor = new int[50]; // 닥치고 외우자(문법)
		int[] intEng = new int[50];

		Random rnd = new Random();

		int intKorSum = 0;
		int intEngSum = 0;

		System.out.println("=================");
		System.out.print("Kor\t Eng\n");
		System.out.println("-----------------");
		
		int intKorTotal = 0;
		int intEngTotal = 0;
		for (int i = 0; i < intKor.length; i++) {
			
			// intKorTotal 변수에 intKor 배열의 모든 값을
			// 더하라
			// intKorTotal = intKor[0] + ~ + intKor[49]
			
			//intKorTotal = intKorTotal + intKor[i];
			//intEngTotal = intEngTotal + intEng[i];
			
			// 51~100까지 숫자 1개생성
			 intKor[i] = rnd.nextInt(100) + 1;
			// 1~100까지 숫자 1개생성
			 intEng[i] = rnd.nextInt(100) + 1;
			 System.out.println(intKor[i] + "\t" + intEng[i]);
			intKorSum += intKor[i];
			intEngSum += intEng[i];

		}
		System.out.println("===================");
		System.out.printf("%d\t", intKorSum);
		System.out.printf("%d\n", intEngSum);
		System.out.println("--------------------");
	}
}
