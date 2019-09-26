package com.biz.iolist.model;

/*
 * VO클래스 만들기
 * 1. private으로 시작하는 멤버변수 정의
 * 2. get / set 메서드 정이
 * 3. super 생성자, field 생성자 정의
 * 4. toString() 정의
 * 5. 2번~4번은 이클립의 자동코드 생성기능을 이용하자
 */
public class GradeVO {

	private String strNum;
	private String strName;
	private int intKorea;
	
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeVO(String strNum) {
		this.strNum = strNum;
	}
	
	public GradeVO(String strNum, String strName, int intKorea) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKorea = intKorea;
	}


	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKorea() {
		return intKorea;
	}
	public void setIntKorea(int intKorea) {
		this.intKorea = intKorea;
	}


	/*
	 * Object클래스에 정의된 toString()메서드는
	 * 객체가 생성된 주소를 보여주는 메서드이다
	 * 실제 자바에서 객체가 생성된(저장된)주소는 별 의미가 없다
	 * 
	 * 그래서 vo 클래스를 만들 때
	 * 이클립스의 자동코드 작성 기능을 이용해서
	 * toString() method를 재 정의한다.
	 * 
	 * 이렇게 재 정의를 하면
	 * vo 객체의 멤버변수에 어떤 값을 setting 한 후
	 * 값들이 정상적으로 저장되어 있는가
	 * 확인하는 용도로 toString()을 사용할 수 있다.
	 */

	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKorea=" + intKorea + "]";
	}
	
	
}
