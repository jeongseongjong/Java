package com.biz.pay.domain;

public class PaperVO {

	private String memeber;
	private String paper ;
	private int count ;
	
	public String getMemeber() {
		return memeber;
	}
	public void setMemeber(String memeber) {
		this.memeber = memeber;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "PaperVO [memeber=" + memeber + ", paper=" + paper + ", count=" + count + "]";
	}
	
	
	
	
	
}
