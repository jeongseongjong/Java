package com.biz.bjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.bjack.domain.DeckVO;

public class PlayService {

	List<DeckVO> playList;
	List<DeckVO> deckList;
	String playName;
	
	
	public PlayService(List<DeckVO> deckList, String playName) {
		// playList를 배열형식으로 만들어주기
		this.playList = new ArrayList<DeckVO>();
		// deckList는 VO에 만들어져있기 때문에 내용만 넣어준다.
		this.deckList = deckList;
		 // playName또한 생성자에 String형으로 입력했기 때문에 내용만 넣어준다.
		this.playName = playName;
	}
	// 합계를 계산해야 하기때문에 int sumScore() 메서드 생성
	public int sumScore() {
		// int sumScore 생성 / 초기화
		int sumScore = 0 ;
		// playList를 vo 객체에 주입하고
		// vo에 있는 Score를 가져와 sumScore에 더한다.
		for(DeckVO vo : playList) {
			sumScore += vo.getScore();
		}
		return sumScore;
	}
	// 딜러 또는 플레이어가 카드를 가져오는 메서드 생성
		public void pick() {
			// 딜러 곽철용과 같은 이름이나오고 sumScore가 16보다 작다면
			// 곽철용의 점수는 오픈되고 플레이어 고니만 카드를 pick한다.
			if(playName.equals("곽철용") && this.sumScore() > 16) {
				System.out.println("곽철용 점수:" + this.sumScore());
				System.out.println("안받고 더블로가");
			} else {
				// 모르겠음
				playList.add(deckList.get(0));
				deckList.remove(0);
			}

			System.out.println("----------------");
			System.out.println(playName);
			System.out.println("----------------");
			for(DeckVO vo : playList) {
				System.out.println(vo);
		}
	}
}
