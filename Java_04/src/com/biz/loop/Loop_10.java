package com.biz.loop;

public class Loop_10 {

	public static void main(String[] args) {
		/*
		 * 2개의 변수(num1, num2)를 선언하여
		 * num1 부터 num2까지의 덧셈을 계산
		 */

		int num1 = 5;
		int num2 = 255;
		
		int sum = 0;
		for(int i = num1;i <= num2;i++) {
			sum += i;
	}
		System.out.printf("%d 부터 %d 까지의 덧셈 : %d\n", num1, num2, sum);
	}
}