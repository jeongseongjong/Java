package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNum = new int[50];
		Random rnd = new Random();

		
		int index = 0;
		for (int i = 2; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;

			for (index = 2; index < intNum[i]; index++) {
				if (intNum[i] % index == 0)
					break;
			}
			if (index >= intNum[i]) {

				System.out.println(intNum[i]);
			}
		}
	}
}
