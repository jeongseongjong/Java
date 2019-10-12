package com.biz.blackjack.domain;

public class BlackJackVO {

	private String image ;
	private String num ;
	private int score ;
	
	
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
	@Override
	public String toString() {
		return "BlackJackVO [image=" + image + ", num=" + num + ", score=" + score + "]";
	}
	
	
	
}
