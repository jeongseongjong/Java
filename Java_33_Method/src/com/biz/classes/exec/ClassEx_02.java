package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {
	/*
	 * 현재 클래스(ClassEx_02)가 아닌
	 * 다른 클래스(ClassServiceV1)에 잇는
	 * 		method호출하기	
	 */
		// cs객체 선언하기
		ClassServiceV1 cs ;
		
		// cs객체 초기화, 생성
		// cs는 인스턴스화
		cs = new ClassServiceV1();
		
		String strName = "홍길동";
		cs.getName(strName);
		
		System.out.println("strName : " + strName);
		
		String[] strNames = new String[2];
		strNames[0] = "이몽룡";
		strNames[1] = "성춘향";
		
		System.out.println("strNames[0] : " + strNames[0]);
		System.out.println("strNames[1] : " + strNames[1]);
		
		// getName(String[] strNames) method 호출
		cs.getName(strNames);
		System.out.println("strNames[0] : " + strNames[0]);
		System.out.println("strNames[1] : " + strNames[1]);
	}
}
