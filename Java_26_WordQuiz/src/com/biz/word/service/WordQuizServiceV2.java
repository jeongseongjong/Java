package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1{
	WordVO wordVO ;
	public int nCount;

	public WordQuizServiceV2() {
		nCount = 0 ;
	}
	// V1에서 선언된 wordVOList를 사용하기 위해 제거
	// List<WordVO> wordVOList;

	// V1에서 선언된 setWordVOList() 를 사용하기 위해 제거
	//	public void setWordVOList(List<WordVO> wordVOList) {
	//	this.wordVOList = wordVOList;
	//	}
	
	// wordVOList에서 임의 1개의 영단어를 추출
	// 알파벳을 낱개로 분해한후
	// 무작위로 섞어서 console에 보이시오
	public void viewEngWord() {
		
		// 단어맞추기를 1번이라도 틀린적이 있으면
		// nCount가 0보다 클것이고
		// 그러면 이미 생성되어 있는 wordVO를
		// private viewEngWord(wordVO)에게 보내서
		// 다시한번 뒤섞은 뒤 보여주기
		if (nCount > 0) {
			System.out.println();
			this.viewEngWord(wordVO);
			return;
		}
		
		// 새로운 단어 시작이 되는 경우
		// 게임을 최초로 시작한 경우
		// 앞에서 단어를 맞추었을 경우
		Random rnd = new Random();
		int nSize = wordVOList.size();
		int index = rnd.nextInt(nSize);

		wordVO = wordVOList.get(index);

		// 임시코드 실제 삭제될 코드
		// System.out.println(wordVO.getEngWord());
		this.viewEngWord(wordVO);
		
		
	} // end viewEngWord()
	
	private void viewEngWord(WordVO wordVO) {
		String word = wordVO.getEngWord();
		System.out.println(wordVO.getEngWord());

		// String word = wordVO.getEngWord();
		// String[] words = word.split(":");
		// List<String> quizWords = Arrays.asList(words);
		// 문자열배열을 문자열형 List로 바꾸는 방법

		List<String> words = Arrays.asList(word.split(""));

		// 믹스~~
		Collections.shuffle(words);
		System.out.println(words);

		// ABC순~~
		Collections.sort(words);
		System.out.println(words);
	}

	@Override
	public void quizExec() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.print("단어입력, 힌트(H), 종료(-0) >> ");
		String strEngWord = scan.nextLine();
		
		if(strEngWord.equals("H")){
			
			System.out.println("-----------------------------");
			System.out.print("단어입력 힌트(H) >> ");
			System.out.println("-----------------------------");
			String strEngWord = scan.nextLine();
			
			int half = wordVO.getEngWord().length() /2 ;
			System.out.println(wordVO.getEngWord().substring(0, half));
			System.out.println("------------------------------");
			
	}
		if (wordVO.getEngWord().equals(rndWord)) {
			System.out.println("----------------------------");
			System.out.print("정답 ");
			System.out.println("시도횟수 : " + (nCount + 1));
			System.out.println("----------------------------");
			System.out.println(wordVO.getKorMean());
			System.out.println("----------------------------");
			nCount = 0;
		} else {
			System.out.println("------------------------------------");
			System.out.println((nCount + 1) + "번 틀렸슈");
			System.out.print("계속(Enter), 힌트보기(H+Enter) >> ");
			String strH = scan.nextLine();
			if(strH.equals("H")) {
				System.out.println("-----------------------------------");
				System.out.println(wordVO.getKorMean());
				System.out.println("-----------------------------------");
			}
			
			nCount++;
		}
		

	}
}

