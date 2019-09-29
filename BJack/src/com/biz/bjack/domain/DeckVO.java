package com.biz.bjack.domain;

public class DeckVO {

	// 카드를 배열하기 위해 그림과 숫자로 나눔
	private String image;  
	private String num; 
	private int score; // 점수

	
	/*
	 * public DeckVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 * public DeckVO(String image, String num, int score) {
	 * super();
		this.image = image;
		this.num = num;
		this.score = score;
	}
	 */
		

	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	// 모든하위클래스에서 이 메서드를 재정의하라
	@Override
	public String toString() {
		return "DeckVO [image=" + image + ", num=" + num + ", score=" + score + "]";
	}

	
}