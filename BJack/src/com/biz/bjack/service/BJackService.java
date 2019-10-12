package com.biz.bjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.bjack.domain.DeckVO;

public class BJackService {

	// 카드 덱리스트 객체 생성
	private List<DeckVO> deckList;
	// 카드의 이미지, 숫자 생성
	private String image = "다이아몬드(◆):스페이드(♠):하트(♥):클로버(♣)";
	private String num = "A234567890KQJ";
	// deckList를 배열로 선언
	public BJackService() {
		deckList = new ArrayList();
	}
	// i를 설정하여 덱이 52장이기때문에 53장보다 작을때까지 반복
	// 무작위로 카드가 나와야 하기에 Collections.shuffle 사용
	public List<DeckVO> getDeck(){
		for(int i = 0 ; i < 53 ; i++) {
			Collections.shuffle(deckList);
		}
		// void없으니까 return 해주는 deckList 만들기
		return deckList;
	
	}
	// 카드 내용 만들기
	public void makeDeck() {
		// 정해놓은 이미지와 숫자를 : , 글자 단위로 쪼개기
		String[] images = image.split(":");
		String[] nums = num.split("");
		// 쪼개놓은 이미지 images와 nums를 i 와 n 이라는 멤버변수에 담기
		for(String i : images) {
			for(String n: nums) {
				// i와 n을 vo에 담기위해 vo객체 생성
				DeckVO vo = new DeckVO();
				vo.setImage(i);
				vo.setNum(n);
				// Score라는 객체 생성후 초기화
				int intScore = 0 ;
				// n이 String형 이기때문에 Integer이용 intScore로 주입
				// n에서 0은 10으로 해석되기 때문에 intScore가 0 이라면 10으로 인식
				try {
					intScore = Integer.valueOf(n);
					if(intScore == 0 ) intScore = 10;
					// n이 문자열 A라면 1 이라고 적용한다.
				} catch (Exception e) {
					if(n.equals('A')) {
						intScore = 1;
						// 그외는 10으로 적용
					}else {
						intScore = 10;
					}
				}
				// intScore를 set을 이용하여 가져온다음 vo객체에 담아준다.
				vo.setScore(intScore);
				// intScore가 담겨진 vo를 deckList에 주입
				deckList.add(vo);

			}
			
		}

	}
	// 카드 생성이 제대로 됐는지 확인하기 위해 메서드 생성
	public void viewCardList() {
		// deckList를 DeckVO에 있는 vo에 주입
		for(DeckVO vo : deckList) {
			// toString에 있는 메서드들이 모두 정의됐기때문에
			// vo를 이용 console에 표출
			System.out.println(vo.toString());
		}
		System.out.println("===============");
		System.out.println("카드매수:" + deckList.size());
		
	}

}
