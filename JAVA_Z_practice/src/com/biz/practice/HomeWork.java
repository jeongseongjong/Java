package com.biz.practice;

public class HomeWork {

	public static void main(String[] args) {
		ScoreVO[] scoreVO = new ScoreVO[5];

		for(int i = 0 ; i < scoreVO.length ; i++) {
			scoreVO[i] = new ScoreVO();
		}
		
		scoreVO[0].setIntKor(92);
		scoreVO[1].setIntEng(87);
		scoreVO[2].setIntMath(65);

		
		int intSum = scoreVO[0].getIntKor();
		intSum += scoreVO[1].getIntEng();
		intSum += scoreVO[2].getIntMath();

		System.out.printf("합계 : %5d", intSum);

	}
}
