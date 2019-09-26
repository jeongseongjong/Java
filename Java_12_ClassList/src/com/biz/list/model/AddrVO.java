package com.biz.list.model;

/*
 * 고객관리 app을 만드는데
 * 고객의 주소록을 관리하는 클래스를 디자인
 * 
 * 이름, name, String
 * 주소, addr, String
 * 전화번호, tel, String
 * 핸드폰 HP, String
 * 
 * 포인트, point, int, intPoint
 */
public class AddrVO {

	private String strName;
	private String strAddr;
	private String strTel;
	private String strHp;
	
	private int intPoint;
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrHp() {
		return strHp;
	}
	public void setStrHp(String strHp) {
		this.strHp = strHp;
	}
	public int getIntPoint() {
		return intPoint;
	}
	public void setIntPoint(int intPoint) {
		this.intPoint = intPoint;
	}
	
	
}
