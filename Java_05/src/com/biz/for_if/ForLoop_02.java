package com.biz.for_if;

public class ForLoop_02 {

	public static void main(String[] args) {

		/*
		 * sum = 1 + 2 + 3 + ... + 10
		 */
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println("1~10까지 덧셈 결과 : " + sum);

	}

}
