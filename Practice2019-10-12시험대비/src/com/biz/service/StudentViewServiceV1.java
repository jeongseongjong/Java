package com.biz.service;

import java.util.List;

import com.biz.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS{

	List<StudentVO> stdList;

	public void setView(List<StudentVO> stdList){
		this.stdList = stdList;
	}
	
	public void title() {
		System.out.println("==========================================");
		System.out.println("학생리스트");
		System.out.println("==========================================");
		System.out.println("번호\t이름\t전화번호\t학년\t주소");
		System.out.println("------------------------------------------");
	}
	
	public void body(StudentVO vo) {
		System.out.print(vo.getS_num() + "\t");
		System.out.print(vo.getS_name() + "\t");
		System.out.print(vo.getS_tel() + "\t");
		System.out.print(vo.getS_grade() + "\t");
		System.out.print(vo.getS_addr() + "\n");
	}
	public void view() {
		this.title();
		for (StudentVO vo : stdList) {
			this.body(vo);
		}
		System.out.println("==========================================");

	}

	public void search(String strName) {
		this.title();
		for(StudentVO vo : stdList) {
			if(vo.getS_name().contains(strName));
			this.body(vo);
				
		}
		
	}

	public void view(int intGrade) {
		// TODO Auto-generated method stub

	}

	public void search(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub

		for(StudentVO vo : stdList) {
			int grade = Integer.valueOf(vo.getS_grade());
			if(grade >= grGrade && grade <= lessGrade) {
				this.body(vo);
			}
			
		}
	}

}
