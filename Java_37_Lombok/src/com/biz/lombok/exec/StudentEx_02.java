package com.biz.lombok.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/lombok/학생정보.txt";
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(sView.setStdList(StudentVO.setStdList));
		
		try {
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		while(true) {
			System.out.println("===============================");
			System.out.println("학생정보");
			System.out.println("===============================");
			System.out.println("1.이름 2.학년");
			System.out.println("-------------------------------");
			System.out.println("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 1) {
				System.out.println("이름 >> ");
				String s_Name = scan.nextLine();
				
			}
			
		}
		
	}
}
