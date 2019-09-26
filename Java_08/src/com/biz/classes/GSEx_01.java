package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_01 {

	public static void main(String[] args) {

		GradeScoreVO[] gsVO = new GradeScoreVO[10];
		for(int i = 0 ; i < gsVO.length ; i++) {
			gsVO[i] = new GradeScoreVO();
		}
		
		gsVO[0].strNum = "001";
		gsVO[0].intKor = 90;
		gsVO[0].intEng = 80;
		gsVO[0].intMath = 70;
		
		// total() 메서드를 호출하면
		// 과목의 총점을 계산한 후에
		// 자신의 total 맴버변수에 값을 저장해 둔다.
		// 성적내역을 출력할때
		// total 변수의 값을 읽으면
		// 총점을 표시 할 수 있다.
		gsVO[0].total();
		
		// average() 메서드를 호출하면
		// 과목의 평균을 계산한 후에
		// 자신의 average 맴버변수에 값을 저장해 둔다.
		// average 변수의 값을 읽으면
		// 평균을 표시 할 수 있다.
		
		gsVO[0].average();
		
		gsVO[1].strNum = "002";
		gsVO[1].intKor = 80;
		gsVO[1].intEng = 70;
		gsVO[1].intMath = 60;
		gsVO[1].total();
		gsVO[1].average();
		
		gsVO[2].strNum = "003";
		gsVO[2].intKor = 70;
		gsVO[2].intEng = 60;
		gsVO[2].intMath = 50;
		gsVO[2].total();
		gsVO[2].average();
		
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
