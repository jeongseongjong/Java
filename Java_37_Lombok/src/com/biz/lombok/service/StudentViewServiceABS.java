package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceABS {

	private List<StudentVO> stdList;

	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}

	/*
	 * stdList를 콘솔에 보이기
	 */
	public abstract void view();
	
	/*
	 * strName 문자열을 매개변수로 받아서
	 * strName 문자열과 일치하는 학생이름이 있는 리스트만 보이기
	 */
	public abstract void view(String strname) ;
	
	/*
	 * intGrade 정수값을 매개변수로 받아서 
	 * intGrade 정수값과 일치하는 학년의 리스트만 보이기
	 */
	public abstract void view(int intGrade) ;
	
	/*
	 * 두개의 정수값을 매개변수로 받아서
	 * grGrade부터 lessGrade범위의 학년 리스트만 보이기
	 */
	public abstract void view(int grGrade, int lessGrade);
	
}
