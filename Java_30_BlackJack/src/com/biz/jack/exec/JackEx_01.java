package com.biz.jack.exec;

import java.util.List;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.service.DeckServiceV1;

public class JackEx_01 {

	public static void main(String[] args) {
		
		DeckServiceV1 deck = new DeckServiceV1();
		
		deck.makeDeck();
		List<DeckVO> deckList = deck.getDeck();
		for(DeckVO vo : deckList){
			System.out.println(vo);
		}
	}
}





















