package com.biz.bank;

import java.util.Scanner;

public class BankEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String strAccNum = "01";
		int intBalance = 10000;
		
		System.out.println("============");
		System.out.println("신한은행");
		System.out.println("============");
		System.out.println("1.조회 2.입금 3.출금 0.종료");
		System.out.println("--------------");
		System.out.print("선택 >>");
		String strMenu = scan.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		 
		 if(intMenu == 0 ) {
			 System.out.println("업무종료");
		 }else if (intMenu == 1){
			 System.out.println("조회");
			 System.out.print("계좌번호 >> ");
			 String strKeyIn = scan.nextLine();
			 if(strKeyIn.equals(strAccNum)) {
				 System.out.println("===============");
				 System.out.printf("계좌번호 : %s\n", strAccNum);
				 System.out.printf("잔고 : %d\n" , intBalance);
				 System.out.println("================");
			 }else {
				 System.out.println("계좌번호 없어");
			 }
		 } else if(intMenu == 2) {
			 System.out.println("입금처리");
			 System.out.print("계좌번호 >>");
			 String strKeyIn = scan.nextLine();
		 if(strKeyIn.equals(strAccNum)) {
			 System.out.println("===============");
			 System.out.printf("계좌번호 : %s\n" , strAccNum);
			 System.out.printf("잔고 : %d\n" , intBalance);
			 System.out.println("================");
			 System.out.print("입금액 >> ");
			 String strInput = scan.nextLine();
			 int intInput = Integer.valueOf(strInput);
		 }else {
			 System.out.println("계좌없음");
		 }
	} else if(intMenu == 3) {
		System.out.println("출금처리");
		System.out.print("계좌번호 >> ");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals(strAccNum)) {
			 System.out.println("===============");
			 System.out.printf("계좌번호 : %s\n" , strAccNum);
			 System.out.printf("잔고 : %d\n" , intBalance);
			 System.out.println("================");
			 System.out.print("출금액 >> ");
			 String strOutput = scan.nextLine();
			 int intOutput = Integer.valueOf(strOutput);
				 intBalance -= intOutput;
		}else {
			System.out.println("잔액부족");
		}
	}else {
		 System.out.println("계좌번호없음");
		}

	}
}