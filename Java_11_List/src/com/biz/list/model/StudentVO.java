package com.biz.list.model;

public class StudentVO {

	private int intNum;
	private String strName;
	
	private String strDept; // 전공
	private int intGrade; // 학년
	
	private String strTel;
	private String strAddr;
	
	// private으로 선언되 맴버변수에 접근할 수 있도록
	// 통로를 생성하는데
	
	// getter(), setter()
	// private으로 정보 은닉된 맴버변수를 
	// 외부에서 접근할 수 있도록
	// 통로역할을 수행하는 method
	
	// 학번 맴버변수 값을 읽을 method
	public int getIntNum() {
		return intNum;
	}
	
	// 학번 맴버변수에 값을 저장할 method
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrDept() {
		return strDept;
	}

	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
}
