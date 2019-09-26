package com.biz.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz_01 {

	public static void main(String[] args) {
		
		String strWord = "yesterday";
		
		// 문자열을 알파벳 단위로 잘라서 문자열 배열로
		// 만들어주는 method
		String[] words = strWord.split("");
		
		for(int i = 0 ; i < words.length ; i++) {
			System.out.println(words[i]);
		}
		
		// Arrays.asList(배열)
		// 배열을 List 자료구조로 바꾸어 주는 method
		List<String> alphaList = Arrays.asList(words);
		System.out.println(alphaList);
	
		Collections.shuffle(alphaList);
		System.out.println(alphaList);
	
	
	}
}
