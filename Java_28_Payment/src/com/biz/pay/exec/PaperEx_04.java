package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperServiceV2;

public class PaperEx_04 {

	public static void main(String[] args) {
		
		PaperServiceV2 pm = new PaperServiceV2();
		
		pm.make(3758790);
		List<PaperVO> pList = pm.getPaperList();
		
	}
}
