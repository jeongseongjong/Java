package com.biz.Var;

public class Var_03 {

	public static void main(String[] args) {
		
		String s1 = "30";
		String s2 = "40";
		
		// 문자열형 변수 ss를 선언하고
		// s1과 s2를 연산하여 ss에 저장하라
		String ss = s1 + s2 ;
		
		ss = "30" + "40";
		
		// 문자형 s1/s2를 정수로 변환 n1/n2에 저장
		int n1 = Integer.valueOf(s1);
		int n2 = Integer.valueOf(s2);
		
		// n1과 n2를 연산하여 nn에 저장하라
		int nn = n1 + n2;
	}
}
