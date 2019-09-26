package com.biz.string.exec;

import java.util.Random;

public class StringEx_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		/*
		 * 임의 난수 10개를 생성하는 반복문에서 생성된 
		 * 난수의 3번 위치숫자들의 합을 구하시오
		 * (시작위치는 0부터)
		 */
		int intR = 0 ;
		int intSum = 0 ;
		for (int i = 0; i < 10; i++) {
			int rNum = rnd.nextInt();
			if (rNum < 0) {
				rNum *= (-1);
			}String strNum = rNum + "";
			
			String[] rNum1 = strNum.split("");
			intR = Integer.valueOf(rNum1[3]);
			intSum += intR;
			
		}
		System.out.println(intSum);
	}
}