package com.biz.classes.model;

/*
 * 사용자 정의형 클래스
 * 필요에 따라서 사용자(개발자)가 코드를 생성하여
 * 만들어둔 클래스
 * 
 * 맴버변수와 method를 갖는 클래스
 * 맴버변수 : 어떤 값을 저장할 변수들의 모음
 * method : 기능, 할일 등을 정의하는 코드
 */
public class StudentVO {

	/*
	 * 정보처리에서 학생정보를 데이터로 하여 가공을 하려할때
	 * 어떠한 항목을 데이터로 만들면 좋을지를 
	 * 생각하여 그러한 항목들을 맴버변수로 선언한다.
	 * 
	 * 학번, 이름, 전화, 주소, 학년, 생년월일
	 * 전공
	 */
	public String strNum;
	public String strName;
	public String strTel;
	public String strAddr;
	public String strGrade;
	public String strDept;
}
