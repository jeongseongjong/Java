package com.biz.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.domain.StudentVO;
import com.biz.service.StudentReadServiceV1;
import com.biz.service.StudentViewServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentReadServiceV1 ss = new StudentReadServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV1();
		Scanner scan = new Scanner(System.in);
		String fileName = "src/com/biz/txt/학생정보.txt";
		try {
			ss.readStudent(fileName);
			List<StudentVO> stdList = ss.getStdList();
			sView.setView(stdList);
		} catch (Exception e) {
			// TODO: handle exception
		}
		while(true) {
			System.out.println("학생이름검색");
			System.out.println("1.이름 2.학년 0.종료");
			System.out.print("선택 >>");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 0) break;
			if(intM == 1) {
			System.out.print("이름이 뭐에요? >>");
			String strName = scan.nextLine();
			sView.search(strName);
			}else if(intM == 2) {
				System.out.println();
			}
				
		}

	}

}
