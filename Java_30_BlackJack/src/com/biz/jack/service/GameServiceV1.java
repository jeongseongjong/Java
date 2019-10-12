package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.uils.BlackJackUtils;

public class GameServiceV1 {

	DeckServiceV1 ds ;
	List<DeckVO> deckList;
	Scanner scan ;
	public GameServiceV1() {
		ds = new DeckServiceV1();
		ds.makeDeck();
		
		// 게임시작을 위해 1벌의 카드생성
		deckList = ds.getDeck();
		scan = new Scanner(System.in);
		
		
	}
	
	public boolean gameStart(String playerName) {
	
		System.out.println(BlackJackUtils.getStringLong("=", 100));
		System.out.println("Game Start !!!");
		System.out.println(BlackJackUtils.getStringLong("=", 100));
		
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 타짜 = new PlayerServiceV1(deckList,playerName);
		
		for(int i = 0 ; i < 2 ; i++) {
		
			딜러.hit();
			타짜.hit();
		}
		// 딜러점수가 16이하라면 의무적으로 hit
		while(true) {
			
			int 딜러점수 = 딜러.sumValue();
			int 타짜점수 = 타짜.sumValue();
			
			if(타짜점수 > 21) {
				System.out.println("딜러승리");
			System.out.println("아무키나 누르세요");
			scan.nextLine();
			return true;
		}
		if(딜러점수 > 21) {
			System.out.println(playerName + "승리");
			System.out.println("아무키나 누르세요");
			scan.nextLine();
			return true;
		}
		
		if(타짜점수 > 21 || 딜러.sumValue() > 21) {
			System.out.println(playerName + "승리");
			System.out.println("아무키나 누르세요");
			scan.nextLine();
			return true;
		}
		
			System.out.println("=========================");
			System.out.println("1.Hit 2.stand 3.게임종료");
			System.out.println("-------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 1) {
				타짜.hit();
				딜러.hit();
			}else {
				
				타짜점수 = 타짜.sumValue();
				딜러점수 = 딜러.sumValue();
				
				if(타짜점수 == 딜러점수) {
					System.out.println("딜러승리");
			}else if(타짜점수 > 딜러점수) {
				System.out.println(playerName + "승리");
			}else {
				System.out.println("딜러 승리");
				}
				System.out.println(BlackJackUtils.getStringLong("*", 100));
				System.out.println("딜러점수 : " + 딜러점수);
				System.out.println(playerName + "점수 : " + 타짜점수);
				System.out.println(BlackJackUtils.getStringLong("*", 100));
			if(intM == 2) 
				return true;
			else if(intM == 3) 
				return false;
				}

			}
		}
	}

