package com.biz.practice;

public class LargeFor {

	public static void main(String[] args) {

		String[] strKor = new String[5];

		// for (int i = 1; i < strKor.length; ++i) {
		//	System.out.println(i+1);
	//	}
			int[] intEng = new int[5];
			intEng[0] = 1;
			intEng[1] = 2;
			intEng[2] = 3;
			intEng[3] = 4;
			intEng[4] = 5;
			for (int k : intEng) {
				k=10;
				System.out.println(k);
			
		}
	}
}