package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {

	// 플레이어가 받은 카드를 저장할 List
	List<DeckVO> myDeckList;
	// deck에서 한장씩 플레이어에게 전달할 카드
	List<DeckVO> pubDeckList;
	String playerName;
	
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList,"딜러");
	}
	
	public PlayerServiceV1(List<DeckVO> deckList, String playName) {
		
		this.myDeckList = new ArrayList<DeckVO>();
		this.pubDeckList = deckList;
		this.playerName = playName;
	}
	
	// 자신의 카드 점수 계산
	public int sumValue() {
		int sumValue = 0 ;
		for(DeckVO vo : myDeckList) {
			sumValue += vo.getValue();
		}
		return sumValue;
	}
	// 각 플레이어들이 hit 했을때 수행할 method
	public void hit() {
		
		if(this.playerName.equals("딜러") && this.sumValue() > 16) {
			System.out.println("딜러점수 : " + this.sumValue());
			System.out.println("딜러 HIT 금지");
			
		}else {
			// 받은 카드를 내 카드 리스트에 추가
			myDeckList.add(pubDeckList.get(0));
			
			// 받을카드 첫번 1장 제외
			pubDeckList.remove(0);
		}
		System.out.println("=========================");
		System.out.println(playerName);
		System.out.println("-------------------------");
		
		for(DeckVO vo : myDeckList) {
			System.out.println(vo);
		}
		System.out.println("-------------------------");
		System.out.println("현재점수 : " + this.sumValue());
		
		
	}
	
}



















