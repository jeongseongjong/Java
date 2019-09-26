package com.biz.loop;

public class Loop_13_GuguDan {

	public static void main(String[] args) {
		
		for(int dan = 2 ; dan <= 9;dan++) {
			System.out.println("================");
			System.out.printf("구구단 %d 단",dan);
			System.out.println("----------------");
			
			for(int num = 2; num <= 9 ; num++) {
				
			System.out.printf("%d x %d = %d\n",
				dan, num, dan * num);
			
		}
			System.out.println("================");
	}
	}
}
