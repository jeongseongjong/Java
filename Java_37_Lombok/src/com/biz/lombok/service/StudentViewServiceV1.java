package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

	List<StudentVO> stdList;
	
	@Override
	public void view() {

		
		System.out.println("==========================================");
		System.out.println("학생리스트");
		System.out.println("==========================================");
		System.out.println("번호\t이름\t전화번호\t학년\t주소");
		System.out.println("------------------------------------------");
		for(StudentVO vo : stdList) {
			System.out.print(vo.getS_num()+"\t");
			System.out.print(vo.getS_name()+"\t");
			System.out.print(vo.getS_tel()+"\t");
			System.out.print(vo.getS_grade()+"\t");
			System.out.print(vo.getS_addr()+"\n");
		}
		System.out.println("==========================================");
		
	}

	@Override
	public void view(String strname) {
		// TODO Auto-generated method stub

	}

	@Override
	public void view(int intGrade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub

	}

}
