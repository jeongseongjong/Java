package com.biz.student.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;
import com.biz.student.service.StudentReadServiceV1;
import com.biz.student.service.StudentViewServiceV1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentEx_01 {

	public static void main(String[] args) {

		StudentReadServiceV1 sr = new StudentReadServiceV1();
		StudentViewServiceV1 sv = new StudentViewServiceV1();

		Scanner scan = new Scanner(System.in);
		
		String studentFile = "src/com/biz/student/com.biz.student.txt";
		
		try {
			sr.ReadServiceV1(studentFile);
			List<StudentVO> stdList = sr.getStdList();
			sv.setStdList(stdList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("=================================");
			System.out.println("학생검색");
			System.out.println("=================================");
			System.out.println("1.이름 2.학년 3.학년범위 0.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			System.out.println("---------------------------------");
			int intM = Integer.valueOf(strM);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("누구찾니 >> ");
				String strName = scan.nextLine();
				sv.view(strName);
			}
			if(intM == 2) {
				System.out.print("몇학년찾니 >> ");
				String strGrade = scan.nextLine();
				sv.view(Integer.valueOf(strGrade));
			}
			if(intM == 3) {
				System.out.print("최저학년 >> ");
				String lessGrade = scan.nextLine();
				System.out.print("최고학년 >> ");
				String grGrade = scan.nextLine();
				sv.view(Integer.valueOf(lessGrade), Integer.valueOf(grGrade));
			}
		}
		
		
	}
}
