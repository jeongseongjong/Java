package com.biz.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.domain.StudentVO;
import com.biz.service.StudentReadServiceV1;
import com.biz.service.StudentViewServiceABS;
import com.biz.service.StudentViewServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/lombok/학생정보.txt";

		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();

		Scanner scan = new Scanner(System.in);

		try
		{
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();
		}catch(
		Exception e)
		{
			// TODO: handle exception
		}while(true)
		{
			System.out.println("===============================");
			System.out.println("학생정보");
			System.out.println("===============================");
			System.out.println("1.이름 2.학년");
			System.out.println("-------------------------------");
			System.out.println("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if (intM == 1) {
				System.out.println("이름 >> ");
				String s_Name = scan.nextLine();

			}

		}
		System.out.println(sView.get);
	}
	}
}
