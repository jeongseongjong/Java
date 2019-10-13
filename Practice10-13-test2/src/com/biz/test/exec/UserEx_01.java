package com.biz.test.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.test.domain.UserVO;
import com.biz.test.service.UserReadServiceV1;
import com.biz.test.service.UserViewServiceV1;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserEx_01 {

	public static void main(String[] args) {

		UserReadServiceV1 ur = new UserReadServiceV1();
		UserViewServiceV1 uv = new UserViewServiceV1();

		Scanner scan = new Scanner(System.in);
		
		String userFile = "src/com/biz/test/text/com.biz.user.txt";
		try {
			ur.UserRead(userFile);
			List<UserVO> userList = ur.getUserList();
			uv.setUserList(userList);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		while (true) {
			System.out.println("=========================");
			System.out.println("사람검색");
			System.out.println("=========================");
			System.out.println("1.이름 2.나이 3.최저나이/최고나이 0.종료");
			System.out.println("-------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			System.out.println("-------------------------");

			int intM = Integer.valueOf(strM);
			if (intM == 0) 
				break;
			if (intM == 1) {
				System.out.print("이름검색 >> ");
				String strName = scan.nextLine();
				uv.view(strName);
			} else if (intM == 2) {
				System.out.print("나이검색 >> ");
				String age = scan.nextLine();
				uv.view(Integer.valueOf(age));
			} else if (intM == 3) {
				System.out.print("얼라 >>");
				String lsAge = scan.nextLine();
				System.out.print("노인 >> ");
				String grAge = scan.nextLine();
				try {
					uv.view(Integer.valueOf(lsAge), Integer.valueOf(grAge));
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		}
	}
}
