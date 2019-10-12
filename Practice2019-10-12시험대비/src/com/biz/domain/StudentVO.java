package com.biz.domain;

public class StudentVO {

	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;

	
	
	public StudentVO(String s_num, String s_name, String s_tel, String s_addr, int s_grade) {
		super();
		this.s_num = s_num;
		this.s_name = s_name;
		this.s_tel = s_tel;
		this.s_addr = s_addr;
		this.s_grade = s_grade;
	}

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_tel() {
		return s_tel;
	}

	public void setS_tel(String s_tel) {
		this.s_tel = s_tel;
	}

	public String getS_addr() {
		return s_addr;
	}

	public void setS_addr(String s_addr) {
		this.s_addr = s_addr;
	}

	public int getS_grade() {
		return s_grade;
	}

	public void setS_grade(int s_grade) {
		this.s_grade = s_grade;
	}

	@Override
	public String toString() {
		return "StudentVO [s_num=" + s_num + ", s_name=" + s_name + ", s_tel=" + s_tel + ", s_addr=" + s_addr
				+ ", s_grade=" + s_grade + "]";

	}

}
