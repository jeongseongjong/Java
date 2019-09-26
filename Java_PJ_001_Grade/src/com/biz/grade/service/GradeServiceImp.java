package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.GradeVO;

public class GradeServiceImp implements GradeService {

	Scanner scan;
	List<GradeVO> gradeList;
	// String[] stdList = new String[]
	// "AAA : 서울특별시 : 010-111-1111 : 컴공과 : 1",
	// "BBB : 광주광역시 : 010-222-2222 : 기공과 : 2",
	// "CCC : 부산광역시 : 010-333-3333 : 토목과 : 3",

	public GradeServiceImp() {
		scan = new Scanner(System.in);
		gradeList = new ArrayList<GradeVO>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void input(int size) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {

			GradeVO gVO = new GradeVO();

			String strNum = String.format("%04d", (i + 1));
			System.out.print("이름 : ");
			String strName = scan.nextLine();
			System.out.print("전화번호 : ");
			String strTel = scan.nextLine();
			System.out.print("주소 : ");
			String strAddr = scan.nextLine();
			System.out.print("학과 : ");
			String strDept = scan.nextLine();
			System.out.print("학년 : ");
			String strGrade = scan.nextLine();
			int intGrade = 0;
			try {
				intGrade = Integer.valueOf(strGrade);

			} catch (Exception e) {
				System.out.println("숫자만입력");
				return;
				// TODO: handle exception
			}
			gVO.setStrNum(strNum);
			gVO.setStrName(strName);
			gVO.setStrTel(strTel);
			gVO.setStrAddr(strAddr);
			gVO.setStrDept(strDept);
			gVO.setIntGrade(intGrade);

			gradeList.add(gVO);

		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("학생명부");
		System.out.println("=========================================");
		System.out.println("학번\t이름\t전화번호\t주소\t학과\t학년");
		System.out.println("=========================================");

		for (GradeVO vo : gradeList) {
			System.out.printf("%4s\t", vo.getStrNum());
			System.out.printf("%4s\t", vo.getStrName());
			System.out.printf("%4s\t", vo.getStrTel());
			System.out.printf("%4s\t", vo.getStrAddr());
			System.out.printf("%4s\t", vo.getStrDept());
			System.out.printf("%4d\n", vo.getIntGrade());
			System.out.println("=========================================");
		}
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
