package com.biz.classes.student;



	/*
	 * main() 메서드가 없는 class
	 * 정보처리(data 처리)를 하기위해서
	 * 데이터를 보관하고 읽기, 쓰기 등을 수행하는 클래스
	 * 혼자는 아무일도 하지 못한다.
	 * 반드시 어딘가에 있는 main() 메서드에서
	 * 선언, 생성, 초기화를 수행한 후
	 * 포함된 맴버변수에 값을 쓰기, 읽기를 수행하고
	 * 포함된 method를 호출하여 기능을 수행한다.
	 */
	/*
	 * class를 만드는 규칙
	 * 1. 한개의 파일(클래스)에는
	 * 		class 키워드가 특별한 경우가 아니면
	 * 		1개만 존재해야 한다.
	 * 2. 파일의 이름클래스 이름과 같다.
	 * 	현재 이 파일은 Student.java이다.
	 * 3. 클래스 이름의 첫글자는 대문자이다.
	 * 4. method가 없는 클래스는
	 * 		맴버변수만을 가질수 있다.
	 * 		명령문, 계싼식 등 어떠한 것도 있어서는 안된다.
	 */
public class Student {
	
	// 학번, 이름, 입학년도, 전공, 학년 항목이 필요하다.
	// == 이러한 맴버변수가 필요하다.
	// 학년 = 2019 - 입학년도 연산으로 구한다.
	public String strNum;
	public String strName;
	public int intYear; // 입학년도
	public String strDept;
	
	// 학생 개인의 정보보기 기능구현 = 메서드 구현, 정의
	public void viewInfo() {
		System.out.println("학번 : "+ strNum);
		System.out.println("이름 : "+ strName);
		System.out.println("입학년도 : "+ intYear);
		System.out.println("전공 : "+ strDept);
		System.out.println("학년 : "+ (2019 - intYear));
	
	}
	public void list() {
		System.out.printf("%s\t%s\t%d\t%s\t%d\n",
				strNum,
				strName,
				intYear,
				strDept,
				2019-intYear);
	}
}
