package com.biz.classes.model;

public class AddressVO_01 {

	public String strName;
	public int intTel;
	public String strAdd;
	public String strComu;
	
	public void view(){
	System.out.println("이름 : " + strName);
	System.out.println("전화번호 : " + intTel);
	System.out.println("주소 : " + strAdd);
	System.out.println("관계 : " + strComu);
}
}