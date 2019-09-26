package com.biz.pIolist.domain;

public class PIolistVO {

	private String strDate ;
	private String strName ;
	private String strIO ;
	private int intPrice ;
	private int intQty ;
	
	
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntQty() {
		return intQty;
	}
	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	@Override
	public String toString() {
		return "PracticeIolistVO [strDate=" + strDate + ", strName=" + strName + ", strIO=" + strIO + ", intPrice="
				+ intPrice + ", intQty=" + intQty + "]";
	}
	
	
	
	
}
