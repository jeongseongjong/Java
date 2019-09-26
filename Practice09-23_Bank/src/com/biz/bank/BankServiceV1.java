package com.biz.bank;

import java.util.Scanner;

public class BankServiceV1 {

	int intBalance ;
	String strAccNum;
	
	Scanner scan ;
	
	public BankServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public BankServiceV1(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance ;
		scan = new Scanner(System.in);
	}
	
	public boolean viewBank() {
		
		System.out.print("계좌번호 >>");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals(strAccNum)) {
			System.out.println("===============================");
			System.out.printf("계좌번호 : %s\n"+ strAccNum);
			System.out.printf("잔고 : %d\n" + intBalance);
			System.out.println("===============================");
		}else {
			System.out.println("계좌정보 없음");
			return false;
		}
		return true;
	}
	
		public void input() throws NumberFormatException{
			System.out.println("입금처리");
			System.out.print("입금액 >> ");
			String strInput = scan.nextLine();
			int intInput = Integer.valueOf(strInput);
			intBalance += intInput;
			System.out.println(" 잔액 : %s\n" + intBalance);
		
	}
		
		public void output() throws NumberFormatException{
			System.out.println("출금처리");
			System.out.println("================================");
			System.out.print("출금액 >> ");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			if(intBalance >= intOutput) {
				intBalance -= intOutput;
			}else {
				System.out.println("잔액이 부족해용");
			
			
			}System.out.printf("잔액 : %s\n " + intBalance);
			
	}
}
