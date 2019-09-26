package com.biz.classes.student;

public class StudentExec_01 {

	// Student 클래스를 활용하여
	// 실제 작동되는 코드를 작성
	public static void main(String[] args) {
		
		Student student = new Student(); 
			
			student.strNum = "001";
			student.strName = "홍길동";
			student.intYear = 2012;
			student.strDept = "회계학";
			
			student.viewInfo();
			
			student.list();
		
		
	}
}
