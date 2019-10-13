package com.biz.test.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.test.domain.StudentVO;
import com.biz.test.service.StudentReadServiceV1;
import com.biz.test.service.StudentViewServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {
	
		StudentReadServiceV1 sr = new StudentReadServiceV1();
		StudentViewServiceV1 sv = new StudentViewServiceV1();
		
		Scanner scan = new Scanner(System.in);
		
		String studentFile = "src/com/biz/test/abs/학생정보.txt";
		
		try {
			sr.ReadService(studentFile);
			List<StudentVO> stdList = sr.getStdList();
			sv.setStdList(stdList);
		} catch (Exception e) {
			// TODO: handle exception
		}
		while(true) {
			System.out.println("================================");
			System.out.println("학생검색");
			System.out.println("================================");
			System.out.println("1.이름 2.학년 0.종료");
			System.out.println("--------------------------------");
			System.out.print("선택 >>");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("왓츄넴 ? >> ");
				String strName = scan.nextLine();
				sv.search(strName);
			}else if(intM == 2) {
				System.out.print("최저 몇학년 ? >>");
				String grGrade = scan.nextLine();
				System.out.print("최고 몇학년 ? >>");
				String lessGrade = scan.nextLine();
				try {
					sv.search(Integer.valueOf(grGrade), Integer.valueOf(lessGrade));	
				} catch (Exception e) {
					System.out.println("숫자만 기입");
				
				}
				
			}
		}

	
	}
}
