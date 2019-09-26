package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV2 {

	int intBalance = 0;
	String strAccNum;

	Scanner scanner = null;

	// BankServiceV1의 생성자
	public BankServiceV2() {
		scanner = new Scanner(System.in);
	}
	
	// BankServiceV1의 또다른 생성자
	
	public BankServiceV2(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scanner = new Scanner(System.in);
	}

	public boolean viewAcc() {
		
		System.out.print("계좌번호 >> ");
		String strAccKeyIn = scanner.nextLine();
		if (strAccKeyIn.equals(strAccNum)) {
			System.out.println("=============================");
			System.out.printf("계좌번호 : %s\n", strAccNum);
			System.out.printf("잔고 : %d\n", intBalance);
			System.out.println("=============================");
		}else {
			System.out.println("계좌번호 없음");
			return false;
		}	
		return true;
	}
	
	public void input() throws NumberFormatException{
		System.out.println("입금처리");
		/*
		 * 1. 입금을 받고 
		 * 2. 계좌잔액 = 입금액 + 계좌잔액
		 */
		System.out.print("입금액 >>");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		intBalance += intInput;
		System.out.printf("잔액 : %s\n", intBalance);
		
	}

	// output 메서드가 실행되는 동안 NumberFormat이 발생하면
	// 호출한 곳에 알려주라
	public void output() throws NumberFormatException{
		System.out.println("출금처리");
		System.out.println("================================");
		/*
		 * 2. 출금을 받고
		 * 3. 잔액 >= 출금 : 잔액 = 잔액 - 출금액
		 *    잔액 < 출금 : 출금거부
		 */
		System.out.print("출금액 >> ");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
			
		}else {
			System.out.println("잔액부족");
			
			
			
		}System.out.printf("잔액 : %s\n", intBalance);
	}


}
