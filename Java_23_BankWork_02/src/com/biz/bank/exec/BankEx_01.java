package com.biz.bank.exec;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx_01 {

	public static void main(String[] args) {
		
		// interface로 선언
		// class로 객체를 초기화
		BankService bs = new BankServiceImpV1();
		
		String bookFile = "src/com/biz/bank/활빈당은행잔고원장.txt";
		
		try {
			bs.readBook(bookFile);
			bs.viewAcc();
			bs.input();
			bs.output();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
