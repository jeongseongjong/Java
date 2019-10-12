package com.biz.Var;

public class Var_04 {

	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 4;
		
		// 정수형 -> 문자열형으로 변환
		
		// 1. ""을 계산식에 포함하는 방법
		// n1, n2를 문자열로바껴
		// 계산식은 " " + "n1" + "n2" 가 된다
		// = 34""가 된다
		String s = "" + n1 + n2;
		System.out.println(s);
		
		// 2. 연산으로 하고싶다면 ( )로 묶어주어야 한다.
		s = (n1 + n2) + "";
		
		// 3. n1 + n2가 먼저 계산되고 문자열로 변환
		s = n1 + n2 + " ";
		
	}
}
