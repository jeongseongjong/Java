package com.biz.pay.service;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.exec.PayEx_01;

public class PaperServiceV1 {

	
	
	public void make(int pay, int paper) {
		
	int money = 50000;
	int sw = 1;
	while(true) {
		if(pay < 5)break;
		int count = (int) (pay / money);
		System.out.printf("%d 원권 : %d\n", money, count);
		pay -= (count * money);
		if(sw > 0) {
			money /= 5;
		}else {
			money /= 2;
			}
			sw *= (-1);
		}
	}

}
