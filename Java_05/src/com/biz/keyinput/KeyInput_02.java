package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		// scanner 선언
		// System.in
		// 		키보드와 JVM 사이에서
		// 		키보드의 전기신호를
		// 		커퓨터의 이진수 정보로 변환시키는 역할을
		// 		수행하는 클래스
		// new Scanner() : 생성자 method라고 읽는다.
		// 		scanner 객체를 사용할 수 있도록
		//		생성, 초기화를 수행한다.
		Scanner scanner = new Scanner(System.in);
		
		//String 형 변수를 선언 및 생성하는 원형 문법
		String strNation = new String("대한민국");
		
		// String 형 변수는 클래스 이지만
		//		사용 편의성을 위해서
		//		일반 변수처럼 선언, 생성할 수 있도록
		//		문법상 예외적인 사용법이 만들어져 있다.
		String strKorea = "대한민국";

		String strKeyIn = new String(); // = **
		
		/*
		 * 이 코드가 실행이 되면
		 * 프로젝트는 모든 진행을 멈추고
		 * 키보드에 무엇인가 입력되기를 기다린다.
		 * Enter를 누를때까지 마냥 기다리기만 한다.
		 */
		strKeyIn = scanner.nextLine();
		System.out.println("키보드에서 입력된 문자열 : "
					+ strKeyIn);
		
		
		
	}

}
