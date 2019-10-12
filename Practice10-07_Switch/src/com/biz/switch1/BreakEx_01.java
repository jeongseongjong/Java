package com.biz.switch1;

public class BreakEx_01 {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for (i = 0; i < 100; i++) {
			sum += i;
			if (sum >= 100)
				break;
		}
		System.out.println("i 값 : " + i);
		System.out.println("sum 값 : " + sum);
	}
}
