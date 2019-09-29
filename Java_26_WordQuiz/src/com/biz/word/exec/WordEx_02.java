package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_02 {

	public static void main(String[] args) {
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		WordListMakeService wk = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV1();
		wq = new WordQuizServiceV2();
		
		// 1. 파일을 읽어서 list를 생성해 두어라(wk에)
		try {
			wk.makeWordList(wordFileName);
			
			// 2. 생성된 list를 가져오기
			List<WordVO> wordList = wk.getWordVOList();
			
			// 3. wq에게 wordList 주입
			wq.setWordVOList(wordList);
			
			// 4. wq에게 주입된 wordList 중 한개를 추출
			// 		영단어를 콘솔에 출력하라
			wq.viewEngWord();
			wq.quizExec();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
