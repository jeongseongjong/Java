package com.biz.bank.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankServiceImpV2 extends BankServiceImpV1{

	public void output() throws Exception {
		// TODO 출금처리
		if(bookVO == null)return;
		
		System.out.print("출금액 >> ");
		String strOutput = scan.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		int intBalance = bookVO.getBalance();
		if(intOutput < 0) {
			System.out.println("0원이상 출금하라");
			return;
		}
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
			System.out.println("출금처리");
		}else {
			System.out.println("출금거부");
		return;
		}
		bookVO.setBalance(bookVO.getBalance() - intOutput);
		//System.out.printf("잔고 : %d\n" , intBalance);
		
		// 거래일자, 구분 설정
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate = localDate.format(df);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark("출금");
		
	}
	
}
