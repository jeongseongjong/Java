package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;

import lombok.Setter;

@Setter
public class StudentViewServiceV1 {

	List<StudentVO> stdList;
	public StudentViewServiceV1() {
		stdList = new ArrayList();
	}
	public void title() {
		System.out.println("==============================");
		System.out.println("학생정보");
		System.out.println("==============================");
		System.out.println("학번\t이름\t학년\t주소");
		System.out.println("------------------------------");
	}
	public void body(StudentVO vo) {
		System.out.print(vo.getNum() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getGrade() + "\t");
		System.out.print(vo.getAddr() + "\n");
		
	}
	public void view() {
		this.title();
		for(StudentVO vo : stdList) {
			this.body(vo);
		}
	}
	public void view(String name) {
		this.title();
		for(StudentVO vo : stdList) {
			if(vo.getName().contains(name)) {
				this.body(vo);
			}
		}
	}
	public void view(int grade) {
		this.title();
		for(StudentVO vo : stdList) {
			if(vo.getGrade() == grade) {
				this.body(vo);
			}
		}
	}
	public void view(int lessGrade, int grGrade) {
		this.title();
		for(StudentVO vo : stdList) {
			int grade = Integer.valueOf(vo.getGrade());
			if(grade >= lessGrade && grade <= grGrade) {
				this.body(vo);
			}
		}
	}
}
