package com.biz.test.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.test.domain.StudentVO;

import lombok.Setter;

@Setter
public class StudentViewServiceV1 extends StudentViewServiceABS {

	List<StudentVO> stdList;

	public StudentViewServiceV1() {
		stdList = new ArrayList<StudentVO>();
		
	}

	public void title() {
		System.out.println("====================================");
		System.out.println("학생리스트");
		System.out.println("====================================");
		System.out.println("번호\t이름\t전화번호\t학년\t주소");
		System.out.println("------------------------------------");
	}

	public void body(StudentVO vo) {
		System.out.print(vo.getS_num() + "\t");
		System.out.print(vo.getS_name() + "\t");
		System.out.print(vo.getS_tel() + "\t");
		System.out.print(vo.getS_grade() + "\t");
		System.out.print(vo.getS_addr() + "\n");

	}

	@Override
	public void view() {
		this.title();
		for (StudentVO vo : stdList) {
			this.body(vo);
		}
		System.out.println("==============================");
	}

	@Override
	public void search(String strName) {
		this.title();
		for (StudentVO vo : stdList) {
			if (vo.getS_name().contains(strName)) {
				this.body(vo);
			}
		}
	}

	@Override
	public void search(int grGrade, int lessGrade) {
		this.title();
		for (StudentVO vo : stdList) {
			int grade = Integer.valueOf(vo.getS_grade());
			if (grade >= grGrade && grade <= lessGrade) {
				this.body(vo);
			}
		}
	}

}
