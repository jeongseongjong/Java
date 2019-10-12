package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {
		
		PaperMakeServiceV1 pm = new PaperMakeServiceV1();
		
		pm.make(3785790);
		
		List<PaperVO> paperList = pm.getPaperList();
		
		for(PaperVO vo : paperList) {
			System.out.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
		}
	}
}
