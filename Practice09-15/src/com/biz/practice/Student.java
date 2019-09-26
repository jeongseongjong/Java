package com.biz.practice;

import java.util.ArrayList;

public class Student {
	private int studentNum;
	private String studentName;
	private ArrayList<Subject> subjectList;

	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);

		subjectList.add(subject);

	}

	public void showStudentInfo() {

		int total = 0;
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();

			System.out.println(
					studentNum + "학생" + studentName + "님의 " + 
			subject.getName() + "과목의 점수는" +
							subject.getScorePoint() + "입니다.");
		}

		System.out.println("학생의 총점은 " + total);
	}
}
