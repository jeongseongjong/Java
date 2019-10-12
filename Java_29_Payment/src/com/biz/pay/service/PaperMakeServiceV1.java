package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * 급여액에 대한 화폐매수를 계산하고
 *  그 결과를 List에 담도록 설정
 */
public class PaperMakeServiceV1 {

	List<PaperVO> paperList;
	
	public List<PaperVO> getPaperList(){
		return this.paperList;
	}
	
	public void make(int pay) {

		paperList = new ArrayList<PaperVO>();
		int paper = 50000;
		int sw = 1;
		while(true) {
			if(pay < 5) break;
			
			int paperCount = (int)(pay / paper);
			
			PaperVO pVO= new PaperVO();
			pVO.setPaper(paper + "");
			pVO.setCount(paperCount);
			
			paperList.add(pVO);
			pay -= (paper * paperCount);
			if(sw>0) {
				paper /= 5;	
			}else {
				paper /= 2;
			}
			sw *= (-1); // 1, -1 , 1, -1 계속변화
			
			// 최초 pay에서 paper 계산
			// paper 금액만큼 삭제
			// paper count 계산하도록 수행
		}
		
	
	
	
	}
}
