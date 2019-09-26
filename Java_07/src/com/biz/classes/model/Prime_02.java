package com.biz.classes.model;

import java.util.Scanner;

public class Prime_02 {
	public static void main(String[] args) {
	
		PrimeService pService = new PrimeService();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 키보드로 숫자를 입력받아서
		 * 입력한 숫자가 -1이면 게임을 종료하고
		 * 그렇지 않으면 입력한 숫자를 
		 * PrimeService.checkPrime() 메서드에게 보내서
		 * 소수인지 판별하는 게임
		 */
		while(true) {		
			System.out.print("숫자(-1 : 종료) >> ");
			String strNum = scanner.nextLine();
			
			// 정수로 변환
			int num = Integer.valueOf(strNum);
			
			// 입력한 숫자가 0보다 작으면 반복문 종료
			if(num < 0) break;
			
			//PrimService의 checkPrime() 메서드에게
			// num 변수에 담긴 값을 보내고 
			pService.checkPrime(num);
			System.out.println("=============================");
		}
			System.out.println("GAEM OVER!!!");
	}
}
