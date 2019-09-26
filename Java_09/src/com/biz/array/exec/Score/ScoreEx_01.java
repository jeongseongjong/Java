package com.biz.array.exec.Score;

import java.util.Random;

import com.biz.arrays.model.ScoreVO;

/*
 * ScoreEx_01 클래스에서는
 * ScoreVO 클래스를 객체로 선언한 후
 * 맴버변수에 값을 저장하는 코드가 만들어져 있다.
 * 
 * 이때 ScoreVO 클래스 입장에서 바라보면
 * ScoreEx_01 클래스를 외부 클래스라고 한다.
 * ScoreVO를 이용해서 무언가 코드를 수행하는 곳들
 * (클래스, 메서드)들을 ScoreVO의 외부라고 한다. 
 */
public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreVO[] sVO = new ScoreVO[20];
		Random rnd = new Random();

		// 선언된 sVO의 각 요소를 초기화하고
		// 임의 값으로 과목점수를 setting
		for (int i = 0; i < sVO.length; i++) {

			// 각 과목의 점수를 달리 하기 위해서
			// 과목별로 점수를 생성한다.
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			String strNum = String.format("%03d", i + 1);

			sVO[i] = new ScoreVO();
			sVO[i].strNum = strNum;
			sVO[i].intKor = intKor;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath;

			// int intSum = intKor + intEng + intMath
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;

			// ScoreVO.intSum 맴버변수는
			// 접근제한자를 private으로 선언하였기 때문에
			// 외부에서 해당 변수에 접근할 수 없다.
			// sVO[i].intSum = intSum;
		}

		System.out.println("===============================");
		System.out.println("학번\t총점");
		System.out.println("===============================");
		for (int i = 0; i < sVO.length; i++) {
			System.out.printf("%s\t%d\n",
					sVO[i].strNum,
					sVO[i].sum());
		}
		System.out.println("-------------------------------");
	}
}