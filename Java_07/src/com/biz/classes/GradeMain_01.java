package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_01 {

	public static void main(String[] args) {

		GradeVO grade01 = new GradeVO();
		
		// grade01 객체의 맴버변수에 값을 setting 한다.
		// 변수에 값을 저장
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		GradeVO grade02 = new GradeVO();
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		GradeVO grade03 = new GradeVO();
		grade03.strNum = "003";
		grade03.strName = "이몽룡";
		
		grade03.intEng = 98;
		grade03.intMath = 78;
		grade03.intKor = 68;
		
		System.out.println("001 학생의 성적");
		System.out.println("국어 : "+ grade01.intKor);
		System.out.println("영어 : "+ grade01.intEng);
		System.out.println("수학 : "+ grade01.intMath);
		
		int intSum = grade01.intKor
				+ grade01.intEng 
				+ grade01.intMath;
		System.out.println("총점 : " + intSum);
		
		System.out.println("002 학생의 성적");
		System.out.println("국어 : "+ grade02.intKor);
		System.out.println("영어 : "+ grade02.intEng);
		System.out.println("수학 : "+ grade02.intMath);
		
		intSum = grade02.intKor
				+ grade02.intEng 
				+ grade02.intMath;
		System.out.println("총점 : " + intSum);
		
		System.out.println("003 학생의 성적");
		System.out.println("국어 : "+ grade03.intKor);
		System.out.println("영어 : "+ grade03.intEng);
		System.out.println("수학 : "+ grade03.intMath);
		
		intSum = grade03.intKor
				+ grade03.intEng 
				+ grade03.intMath;
		System.out.println("총점 : " + intSum);
		
	}

}
