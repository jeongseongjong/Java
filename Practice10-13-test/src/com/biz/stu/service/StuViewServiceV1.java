package com.biz.stu.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.stu.domain.StuVO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StuViewServiceV1 extends StuABS{
	
	List<StuVO> stdList;
	public StuViewServiceV1() {
		stdList = new ArrayList();
	}
	public void title() {
		System.out.println("===============================");
		System.out.println("학생리스트");
		System.out.println("===============================");
		System.out.println("넘버\t이름\t전화번호\t학년\t주소");
		System.out.println("-------------------------------");
	}
	public void body(StuVO vo) {
		System.out.print(vo.getNum() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getTel() + "\t");
		System.out.print(vo.getGrade() + "\t");
		System.out.print(vo.getAddr() + "\t");
		
	}
	public void view() {
		this.title();
		for(StuVO vo : stdList) {
			this.body(vo);
		}
		System.out.println("==============================");
	}
	public void view(String name) {
		this.title();
		for(StuVO vo : stdList) {
			if(vo.getName().contains(name)) {
				this.body(vo);	
			}
		}
	}
	public void view(int grade) {
		this.title();
		for(StuVO vo : stdList) {
			if(vo.getGrade() == grade) {
				this.body(vo);
			}
		}
	}
	public void view(int lessGrade, int grGrade) {
		this.title();
		for(StuVO vo : stdList) {
			int grade = Integer.valueOf(vo.getGrade()); 
			if(grade >= lessGrade && grade <= grGrade) {
				this.body(vo);
			}
		}
	}
}
