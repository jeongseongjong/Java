package com.biz.classes.model;

import java.util.Scanner;

public class Prime_01 {

	/*
	 * 어떤수(num)가 소수인지 아닌지 알아보자
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 >> ");
		String strNum = scanner.nextLine();
		
		int num = Integer.valueOf(strNum);
		
		int index;
		for(index = 2 ; index < num ; index++) {
			if(num % index == 0) break;
		}
		
		// index = ?
		if(index >= num) {
			System.out.println(num + "는 소수 (prime)이다!!");
		} else {
			System.out.println(num + "는 소수가 아니다!!!");
		}
		
	}
}
