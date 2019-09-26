package com.biz.array;

import java.util.Random;
import java.util.Scanner;

public class Array_test {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[100];
		int sum = 0;
		for (int i = 0; i < intNum.length; i++) {

			intNum[i] = rnd.nextInt(10) + 1;
			
			System.out.println(" 번호 : " + (i) + " : " + intNum[i]);

			if (intNum[i] % 2 == 0)
				sum = intNum[i] + sum; 
		
				;

		}
		System.out.println("짝수의 합 : " + sum);
	}
}