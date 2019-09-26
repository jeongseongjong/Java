package com.biz.collections.exec;

import com.biz.collections.service.WordService;

public class WordQuiz_03 {

	public static void main(String[] args) {
		
		WordService ws = new WordService();
		// ws.viewWord();
		while(true) {
			if(ws.input()) {
				break;
			}
		}
		System.out.println("GAME OVER !!!");
	}
}

