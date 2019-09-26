package com.biz.loop;

public class Loop_11 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 0 ; i <= 10; i+=2 ) {
			sum += i;
		}
		System.out.println("0부터 짝수의 합:" + sum);
		
		sum = 0;
		for(int i = 1 ; i <= 10; i+=2 ) {
			sum += i;
		}
		System.out.println("1부터 홀수의 합:" + sum);
	}
}
