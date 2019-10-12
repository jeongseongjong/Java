package com.biz.service;

public class ThisService {
	private int kor;
	private int eng;
	private int math;

	public ThisService(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
