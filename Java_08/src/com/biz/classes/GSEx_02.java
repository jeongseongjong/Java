package com.biz.classes;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_02 {

	public static void main(String[] args) {
		
		/*
		 * Random 클래스
		 * 임의 범위에 있는 숫자를 추출해서
		 * 다양값을 만들수 있는 클래스 도구
		 */
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i ++) {
			
			// 임의 정수를 생성하는 코드
			// Random.nextInt(10)
			// 0부터 9까지의 임의 난수를 발생
			
			// Random.nextInt(10) + 1
			// 1부터 10까지의 난수 발생
			
			// Random.nextInt(50(0~49)) + 51; 
			int n = rnd.nextInt(10)+1;
			System.out.println(n);
		}
		
		GradeScoreVO[] gsVO = new GradeScoreVO[100];
		for(int i = 0 ; i < gsVO.length ; i++) {
			gsVO[i] = new GradeScoreVO();
		
			
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			gsVO[i].strNum = String.format("%03d", i+1);
			
			gsVO[i].intKor = intKor;
			gsVO[i].intEng = intEng;
			gsVO[i].intMath = intMath;
			
			gsVO[i].total();
			gsVO[i].average();
			}
		System.out.println("================================");
		System.out.println("성적 일람표");		
		System.out.println("--------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------");
		for(int i = 0 ; i < gsVO.length ; i++) {
			System.out.printf(gsVO[i].strNum + "\t");
			System.out.printf("%3d\t", gsVO[i].intKor);
			System.out.printf("%3d\t", gsVO[i].intEng);
			System.out.printf("%3d\t", gsVO[i].intMath);
			System.out.printf("%3d\t", gsVO[i].total);
			System.out.printf("%5.2f\n", gsVO[i].average);
		}
		System.out.println("===================================");
		
		
	}
}
