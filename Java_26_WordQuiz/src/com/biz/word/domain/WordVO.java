package com.biz.word.domain;

import java.util.List;

public class WordVO {

	private String engWord;
	private String korMean;
	private List<String> rndWord;
	
	
	public String getEngWord() {
		return engWord;
	}
	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}
	public String getKorMean() {
		return korMean;
	}
	public List<String> getRndWord() {
		return rndWord;
	}
	public void setRndWord(List<String> rndWord) {
		this.rndWord = rndWord;
	}
	public void setKorMean(String korMean) {
		this.korMean = korMean;
	}
	
	
}
