package com.biz.switch1;

public class ContinueEx_01 {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i  = 0 ; i < 100 ; i++) {
			if(i % 2 == 0) 
				continue;
			total += i;
			
		}System.out.println("1~100까지 홀수의 합 : " + total);
		
		
		
	}
	
	
}
