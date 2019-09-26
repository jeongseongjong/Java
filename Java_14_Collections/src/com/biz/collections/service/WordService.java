package com.biz.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	private Scanner scan;

	public WordService() {

		scan = new Scanner(System.in);

		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morning");
		wordList.add("tomorrow");
		wordList.add("school");
		wordList.add("computer");
		wordList.add("human");

		count = 0;

	}

	public void makeWord() {

		// 단어 리스트를 믹스
		Collections.shuffle(wordList);

		// 믹스된 단어리스트에 0번째 단어 추출
		word = wordList.get(0);

		// 추출된 단어를 알파벳단위로 나누어 List로 변환
		words = Arrays.asList(word.split(""));

		// 알파벳 믹스
		Collections.shuffle(words);
	}

	public boolean input() {

		if (count < 1) {
			this.makeWord();
		}

		System.out.println("================================");
		System.out.println("단어맞추기 게임!!");
		System.out.println("--------------------------------");
		System.out.println("제시한 알파벳에 잘 배열하여");
		System.out.println("단어를 완성하시오");
		System.out.println("---------------------------------");
		System.out.println(words);
		System.out.println("---------------------------------");
		System.out.print("(-1 : END) >> ");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals("-1")) {
			return true;
		}
		if (strKeyIn.equalsIgnoreCase(word)) {
			System.out.println(count + 1  + "번째에 정답입니다");
			count = 0;
		} else {
			System.out.println("오답입니다");
			count++;
		}
		System.out.println("Press Any to Continue...");
		scan.nextLine();
		
		return false;
	}

}
