package com.biz.classes.grade;

/*
 * 어떤 class를 만들고
 * 맴버변수, 메서드에
 * 한개라도 static 이라는 키워드를 붙이면
 * class가 static class가 된다.
 * 
 * static ≠ Dynamic
 * static이 Run(컴파일 후 실행)
 * JVM이 자동으로 클래스를 선언, 생성, 초기화하여
 * 사용할 수 있도록 미리 준비시켜준다는 개념
 */
public class StaticGrade {

	// 맴버변수 들
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		// StaticGrade 클래스의 
		// sum() 메서드의 몸체부분
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
		
		
		
		
		
		
		
	}
	
}
