package com.biz.pay.service;

import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperPrintServiceV1 {
	
	List<String> payStrList;
	
	public void setPayStrList(List<String> payStrList) {
		this.payStrList = payStrList;
	}
	
	public void List() {
		
	}
	
	public void print() {
		
		PaperServiceV2 pm = new PaperServiceV2();
		for(String pay : payStrList) {
			String[] pays = pay.split(":");
			
			System.out.println("==============================");
			System.out.printf("사원번호 : %s, 급여 : %s", pays[0], pays[1]);
			System.out.println("------------------------------");
			
			int intPay = Integer.valueOf(pays[1]);
			pm.make(intPay);
			List<PaperVO> paperList = pm.getPaperList();
			
			for(PaperVO vo : paperList) {
				System.out.println(vo.getPaper() + "\t" + vo.getCount());
			}
			
		}
		
		
	}
}
