package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class DeckServiceV1 {

	List<DeckVO> deckList;
	String suit = "다이아몬드:하드:스페이드:클로버";
	String[] arrSuit = new String[] {"다이아몬드","하드","스페이드","클로버"};
	
	String denomination = "A234567890KQJ";
	
	public DeckServiceV1() {
		
		this.deckList = new LinkedList<DeckVO>();
	}
	
	public List<DeckVO> getDeck(){
		
		int nSize = deckList.size();
		for(int i = 0 ; i < nSize ; i++) {
			Collections.shuffle(this.deckList);
		}
		
		for(DeckVO vo : deckList) {
			Collections.shuffle(this.deckList);
		}
		
		return this.deckList;
	}
	
	public void makeDeck() {
		
		String[] denoms = denomination.split("");
		for(String suit : arrSuit) {
			for(String denom : denoms) {
				
				// 각 카드가 갖게될 value생성
				// value값은 denoms 기준으로 생성
				
				int intValue = 0 ;

				try {
					
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (Exception e) {
					if(denom.equals("A")) intValue = 1;
					else intValue = 10;
				}
				
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);
				deckList.add(dVO);
				
				
			}
		}
		
	}
	
}










