package com.biz.stu.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.stu.domain.StuVO;
import com.biz.stu.service.StuReadServiceV1;
import com.biz.stu.service.StuViewServiceV1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StuEx_01 {

	public static void main(String[] args) {

		StuReadServiceV1 sRead = new StuReadServiceV1();
		StuViewServiceV1 sView = new StuViewServiceV1();

		String studentFile = "src/com/biz/txt/학생정보.txt";
		Scanner scan = new Scanner(System.in);

		try {
			sRead.ReadService(studentFile);
			List<StuVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
		} catch (Exception e) {

		}
		while (true) {
			System.out.println("==================================");
			System.out.println("학생검색");
			System.out.println("==================================");
			System.out.println("1.이름 2.학년 3.최저/최고학년 0.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			System.out.println("-----------------------------------");
			int intM = Integer.valueOf(strM);
			if (intM == 0)
				break;
			if (intM == 1) {
				System.out.print("니 이름이 무어니 ? >>");
				String strName = scan.nextLine();
				sView.view(strName);
			} else if (intM == 2) {
				System.out.print("니 몇학년 이니 ? >>");
				int intGrade = scan.nextInt();
				sView.view(intGrade);

			} else if (intM == 3) {
				System.out.print("최저 몇학년 ? >>");
				String lessGrade = scan.nextLine();
				System.out.print("최고 몇학년 ? >>");
				String grGrade = scan.nextLine();
				try {
					sView.view(Integer.valueOf(lessGrade), Integer.valueOf(grGrade));
				} catch (Exception e) {
					System.out.println("숫자만 기입");

				}

			}

		}

	}
}
