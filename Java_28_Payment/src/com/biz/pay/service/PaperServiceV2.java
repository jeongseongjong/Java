package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperServiceV2 {
	
	private List<PaperVO> pList;
	
	public PaperServiceV2() {
		pList = new ArrayList();
		
	}
	public List<PaperVO> getPaperList(){
		return pList;
	}
	public void make(int pay) {
		
		int money = 50000;
		int sw = 1;
		
		while(true) {
			int count = (int)(pay / money);
			
			PaperVO vo = new PaperVO(money + "", count);
			System.out.printf("%d 원권 : %d", money, count);
			if(sw > 0) {
				count /= 5;
			}else {
				count /= 2;
			}
			sw *= (-1);
			String p = money + "";
			vo.setPaper(p);
			vo.setCount(count);
			pList.add(vo);
			
		}
		
	}
}
