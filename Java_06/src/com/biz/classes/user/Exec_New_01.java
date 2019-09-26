package com.biz.classes.user;

public class Exec_New_01 {

	public static void main(String[] args) {

		// add() 메서드는 static 메서드이다.
		User_01.add();
		
		// 1. User_New_01 클래스를 un 객체로 선언
		// 2. new User_New_01() : 생성자 메서드로
		//		un 객체를 사용할 수 있도록 초기화
		User_New_01 un = new User_New_01();
		un.add();
		
		/*
		 * 어떤 클래스에 있는 method에
		 * static 키워드가 붙어있으면
		 * 클래스.method() 형식으로 호출하여 사용가능하지만
		 * 
		 * static 키워드가 없는 method는
		 * 객체를 생성하여
		 * 객체.method() 형식으로 호출해야 한다.
		 * 
		 * 이때 객체는 클래스의 대리자(복제자)역할을 한다.
		 */
	}

}
