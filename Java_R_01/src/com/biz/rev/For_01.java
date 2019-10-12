package com.biz.rev;

public class For_01 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("대한민국");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int num = 0;
		for (int i = 0; i < 10; i++) {
			num += i;

		}
		
		num = 1;
		for(int i = 1 ; i < 10 ; i++) {
			num *= i;
			// num *= i; -> 1*1*2*3*4*5*6*7*8*9
		}
	}
}
