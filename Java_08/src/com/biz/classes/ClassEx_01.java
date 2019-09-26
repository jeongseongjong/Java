package com.biz.classes;

import java.util.Scanner;

public class ClassEx_01 {

	public static void main(String[] args) {

		/*
		 * 변수
		 * 메모리 어딘가에 값을 저장할 공간을 확보하고
		 * 그곳에 알기 쉽도록 이름을 부여하는 것
		 */
		// 변수의 형을 지정하는 keyword라고 한다.
		// 첫글자가 소문자로 시작하는 keyword
		// primitive(기본형) 변수라고 한다.
		int intnum1 = 0; // 변수를 선언하고 초기화 한다.
		long longNum1 = 0L;
		float floatNum1 = 3.0f;
		double doubleNum1 = 3.0;
		
		char cA= 'A';
		boolean bYes = true;
		boolean bNo = 3 != 3;
		
		// type 형
		// reference (참조형(정확한명칭)변수)
		// 클래스(String)를 사용하여 생성한 변수
		// 객체, Object, Instance라고 한다.
		String strName = "대한민국";
		
		// 참조형 변수
		// Scanner라는 클래스를 사용하여 생성한 변수
		Scanner scanner = new Scanner(System.in);
		
	}

}
