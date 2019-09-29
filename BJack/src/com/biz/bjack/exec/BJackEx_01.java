package com.biz.bjack.exec;

import java.util.Scanner;

import com.biz.bjack.service.BJackService;
import com.biz.bjack.service.PlayService;

public class BJackEx_01 {

	public static void main(String[] args) {
		
		// 키보드를 입력하여 콘솔에 출력하기 위해 scan 객체 생성
		Scanner scan = new Scanner(System.in);
		// 서비스클래스에 입려된 정보를 받아오기 위해 bs 객체 생성
		BJackService bs = new BJackService();
		// 카드 덱 정보를 bs에 담아주기
		bs.makeDeck();
		
		// 블랙잭 게임을 반복하기 위해 While문 작성
		while(true) {
			System.out.println("=========================");
			System.out.println(" GAME Start ");
			System.out.println("=========================");
			// 요즘 화자가 되고있는 타짜의 곽철용, 고니를 딜러, 플레이어로 소환
			PlayService dealer = new PlayService(bs.getDeck(),"곽철용");
			PlayService player = new PlayService(bs.getDeck(),"고니");
			// 2장씩 뽑아야 하기때문에 for문이용 반복
			for(int i = 0 ; i < 2 ; i++) {
				dealer.pick();
				player.pick();
			}
			// 게임진행을 위한 while문 생성
			while(true) {
				System.out.println("=============================");
				System.out.println("1.Go   2.Stop   0.GameEnd");
				System.out.println("-----------------------------");
				System.out.print("선택>> ");
				String strMenu = scan.nextLine();
				
				try {
					int intMenu = Integer.valueOf(strMenu);
					if(intMenu == 1) {
						
						dealer.pick();
						player.pick();
					}
					
					int dSum = dealer.sumScore();
					int pSum = player.sumScore();
					
					if(pSum > 21) {
						System.out.println("winner : 곽철용");
						break;
					} else if(dSum > 21) {
						System.out.println("고니 : 이 돈 내가 다 가집니다.");
						break;
					}
					
					if(intMenu == 2) {
						if(dSum > pSum) {
							System.out.println("고니야 란이 내꺼다");
						} else {
							System.out.println("곽철용 : 어이 젊은친구 신사답게 행동해");
						}
						System.out.println("ENDING");
						break;
					}
						
						if(intMenu == 0) {
							System.out.println("보름후에 다시와");
							// main method에서 return 문을 만나면
							// 프로젝트 실행이 종료된다.
							return;
						}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
