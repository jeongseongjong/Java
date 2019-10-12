package com.biz.pay.domain;

public class PayReadVO {

	private int num;
	private int pay;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "PayReadVO [num=" + num + ", pay=" + pay + "]";
	}
	
	
}
