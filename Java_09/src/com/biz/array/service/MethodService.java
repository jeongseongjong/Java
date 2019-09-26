package com.biz.array.service;

import java.util.Random;
import java.util.Scanner;

public class MethodService {

	private int intSum;
	/*
	 * method를 정의할 때
	 * (method 코드를 작성할때)
	 * void method() : return문이 있거나 없거나
	 * 변수를 선언하는 키워드 method()
	 * 		Int method()
	 * 		String method()
	 * 		Float method()
	 * 		boolean method()
	 * 		Long method()
	 * 		double method()
	 * 		Char method()
	 * 		ScoreVO method()
	 * 		StudentVO method()
	 * 		:
	 * 		:
	 * 		: 
	 * 변수를 선언하는 키워드를 변수형(Varriable Type)이라고 하는데
	 * 같은 키워드가 method() 정의 문에 나타나면
	 * 		return type 이라고 한다.
	 * 		이때 이 키워드는 return문에 포함된 값과
	 * 		밀접한 관계가 있다.
	 * 		Int method() { return 0; }
	 * 		String method() { return "대한민국"; }
	 * 		Float method() {return 3.0f ;}
	 * 		boolean method() { return false ; }
	 * 		ScoreVO method() { return sVO ; }
	 * 
	 * 		return 값 ; 문장에서
	 * 		값의 데이터 타입(data type)을 method() 정의문에
	 * 		작성해 준다.
	 * 
	 * 		method type은 double형인데
	 * 		return문에 포함된 값이 "00" 문자열이므로
	 * 		이 코드는 Syntax error가 난다.
	 * 		Double method() { return "00" ; } -> 정수형 자리에 문자형이나와 ERROR
	 */
	
	// void형 method이므로 return문이 선택사항이다.
	// 없어도 된다!!
	public void consoleView() {
		System.out.println("나는 콘솔에 표시하는 method()");
		return ;
	}

	// return num; 문에서
	// num 변수의 data type이 int 형이다.
	// 따라서 이 method의 선언문에는 
	// 		int 키워드가 포함 되어야 한다.
	// 만약 return문에 포함될 값이 없으면
	// 		최소한 return 0; 이라는 문장이라도 완성되어야 한다.
	public int numRet() {
		int num = 100 + 200 + 300 ;
		return num ; // return 0;
	}
	
	// method의 return type이 String(문자열)형 이므로
	// return 문자열 ; 형식의 문장이 완성되어야 한다.
	// 만약 return문에 포함될 값이 없으면 
	//		return""; 또는 return null; 형식의
	//		문장이라도 완성되어야 한다.
	public String strRet() {
		// return "";
		return "우리나라만세";
	}
	
	// method return문에 intSum변수가 포함되어 있다.
	// intSum 변수는 이 클래스의 맴버변수로
	// 변수형(VBarriable type)이 int형이다.
	// 따라서 method 정의문에 int return type이 있어야 한다.
	public int getIntSum() {
		return intSum;
	}
	public void add() {
		System.out.println("매개변수가 없는 method");
	}

	public void add(int num) {
		System.out.printf("매개변수 1개 : %d\n", num);
	}

	public void add(int num1 , int num2) {
		int sum = num1 + num2 ;
		System.out.println("두개의 매개변수 합 : " + sum);
	}

	public void add(float f1, float f2) {
		float sum = f1 + f2;
		System.out.printf("두 실수의 합 : %f", sum);
	}
	

	public void ex() {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
	}
	}


