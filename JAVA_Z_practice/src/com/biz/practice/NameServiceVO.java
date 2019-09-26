package com.biz.practice;

public class NameServiceVO {

	private String strNum;
	private String strFam;
	private String strSize;
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrFam() {
		return strFam;
	}
	public void setStrFam(String strFam) {
		this.strFam = strFam;
	}
	public String getStrSize() {
		return strSize;
	}
	public void setStrSize(String strSize) {
		this.strSize = strSize;
	}
	@Override
	public String toString() {
		return "NameServiceVO [strNum=" + strNum + ", strFam=" + strFam + ", strSize=" + strSize + "]";
	}
	
}
