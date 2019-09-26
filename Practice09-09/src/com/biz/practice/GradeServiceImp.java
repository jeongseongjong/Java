package com.biz.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.biz.practice.GradeVO;

public class GradeServiceImp implements GradeService {

	Scanner scan;
	List<GradeVO> gradeList;
	
	public GradeServiceImp() {
		
		scan = new Scanner(System.in);
		gradeList = new ArrayList<GradeVO>() ;
		
	}
	@Override
	public void input(int size) {
		for(int i = 0 ; i < size ; i ++) {
			
			GradeVO gVO = new GradeVO();
			
			String strNum = String.format("%4d", (i+1));
			System.out.print("이름 : ");
			String strName = scan.nextLine();
			System.out.print("주소 : ");
			String strAddr = scan.nextLine();
			System.out.print("전화번호 : ");
			String strTel = scan.nextLine();
			System.out.print("학과 : ");
			String strDept = scan.nextLine();
			System.out.print("학년 : ");
			String strGrade = scan.nextLine();

			int intGrade = 0;
			try { 
				intGrade = Integer.valueOf(strGrade);
			} catch (Exception e) {
				System.out.println("숫자만입력하라아아아아아");
				return;
			}
			gVO.setStrNum(strNum);
			gVO.setStrName(strName);
			gVO.setStrAddr(strAddr);
			gVO.setStrTel(strTel);
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
