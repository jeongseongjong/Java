package com.biz.keyinput;

import java.util.Scanner;

/*
 * 키보드로 무엇인가(문자, 숫자...)를 입력하면
 * 변수에 저장하고
 * 변수에 저장된 내용을 console에 표시
 * 
 * 컴퓨터와 사용자간에 서로 주고받기
 * Interactive, 대화형 프로젝트
 */
public class KeyInput_01 {

	public static void main(String[] args) {
		
		/*
		 * Scanner : 키보드에서 무엇인가를 입력하면
		 * 			그 내용을 수신하여 
		 * 			문자열로 변환 시켜주는 클래스
		 * Scanner 클래스는 직접 어떤일을 수행할 수 없고
		 * 반드시 변수(대리자)로 선언을 해 주어야 한다. 
		 */
		// Scanner 클래스를 scanner 변수로 선언
		Scanner scanner;
		
		/*
		 * 기본형 변수, primitive (type) 변수
		 * 첫글자가 소문자인 키워드로 선언한 변수
		 */
		int iNum;
		long lNum;
		float fNum1;
		double dNum;
		boolean bYes;
		char cA;
		
		/*
		 * 참조형 변수, type 변수
		 * 클래스 키워드를 이용해서 선언한 변수
		 * (클래스 키워드는 첫글자가 대문자인 형태)
		 * 
		 * 객체(object)라고 부른다.
		 * 		여기서는 st와 sc
		 * 
		 * 객체의 특징중 하나는
		 * 객체.method() 형태의 다양한 기능들을
		 * 클래스로 부터 물려받아 사용할 수 있다.
		 * st.length(), st.toUpperCase()
		 * 
		 * 객쳉 이름을 명명할 때
		 * 변수의 명명규칙과 같은 문법이 적용된다.
		 * 
		 * 그리고 객체이름은 일반적으로 클래스이름의 첫글자를
		 * 소문자로하여 작성한다.
		 */
		String str;
		Scanner scan;
	
	}

}
