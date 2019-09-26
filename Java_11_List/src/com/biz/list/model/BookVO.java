package com.biz.list.model;

public class BookVO {

	private String strTitle;
	private String strAuth;
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrAuth() {
		return strAuth;
	}
	public void setStrAuth(String strAuth) {
		this.strAuth = strAuth;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	private String strComp;
	private int intPrice;
}
