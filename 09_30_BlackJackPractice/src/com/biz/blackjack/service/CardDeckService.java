package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.BlackJackVO;

public class CardDeckService {

	List<BlackJackVO> deckList ;
	
	String image = "스페이드:하트:클로버:다이아";
	String num = "A23456789KQJ";
	
	public CardDeckService(List<BlackJackVO> deck) {
		// TODO Auto-generated constructor stub
	}

	public List<BlackJackVO> getDeck() {

		deckList = new ArrayList();
		/*
		 * char[] images = new char[image.length()]; for(int i = 0 ; i < images.length ;
		 * i++) { images[i] = (image.charAt(i)); }
		 */

		for (int i = 0; i < 53; i++) {
			Collections.shuffle(Arrays.asList(deckList));

		}
		return (deckList);
	}

	public void DeckService() {
		String[] images = image.split(":");
		String[] nums = num.split("");

		for (String i : images) {
			for (String n : nums) {
				BlackJackVO cd = new BlackJackVO();
				cd.setImage(i);
				cd.setNum(n);

				int intScore = 0;
				try {
					intScore = Integer.valueOf(n);
					if (intScore == 0)
						intScore = 10;

				} catch (Exception e) {
					if (n.equals('A')) {
						intScore = 1;

					} else {
						intScore = 10;
					}
				}
				
				cd.setScore(intScore);
				deckList.add(cd);
				
			}
		}

	}


}
