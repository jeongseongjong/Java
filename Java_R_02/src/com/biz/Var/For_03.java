package com.biz.Var;

public class For_03 {

	public static void main(String[] args) {

		for (int i = 5; i < 12; i++) {

		}
		for (int i = 10; i < 5; i++) { // -> 실행x

		}

		// if / for() 반복문에는 ;를 찍지 않는다.
		for (int i = 0; i < 10000; i++) {
			System.out.println("대한민국");
		}
	}
}