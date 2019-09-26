package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rnd = new Random();
		// rnd 객체를 사용해서 intNum 배열 50개에
		// 각각숫자를 채워넣기
		// 1~100까지 임의 수를 만들어서
		
		// i값이 0~ (intNum.length - 1)
		
		// i값이 intNum.length -1보다 작으면
		// intNum[i] = 100 코드를 실행하라
		// 그 동안에 i 값은 1씩 증가한다.
		int intSum = 0;
		for(int i = 0 ; i < intNum.length; i++) {
			
			// rnd 객체에 있는 nextInt() method야
			// 1~100까지 중에
			// 숫자 1개를 만들어서
			// intNum 배열의 i번째에 저장하라
			intNum[i] = rnd.nextInt(100)+1;
			}
		System.out.println("합계 : " + intSum);
		System.out.println("평균 : " + intSum / intNum.length);
		
		intNum[0] = 100;
		intNum[1] = 100;
	}
}