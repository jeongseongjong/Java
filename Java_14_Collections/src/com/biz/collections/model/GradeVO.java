package com.biz.collections.model;

public class GradeVO {

	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	
	
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "GradeVO [strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ "]";
	}
	
	
	
	
}
