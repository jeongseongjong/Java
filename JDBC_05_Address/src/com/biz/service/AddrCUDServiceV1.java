package com.biz.service;

import java.util.Scanner;

import com.biz.persistence.AddrDTO;
import com.biz.persistence.dao.AddrDao;
import com.biz.persistence.dao.AddrDaoImp;

public class AddrCUDServiceV1 {

	private AddrDao addrDao = null;
	private Scanner scan = null;

	public AddrCUDServiceV1() {
		scan = new Scanner(System.in);
		addrDao = new AddrDaoImp();
	}

	public void inputAddr() {
		while (true) {
			System.out.println("=============================");
			System.out.println("이름등록");
			System.out.println("=============================");

			String strA_name = null;
			while (true) {

				System.out.print("1.이름(-Q:quit) >> ");
				strA_name = scan.nextLine();
				if (strA_name.equals("-Q")) break;
				if (strA_name.isEmpty()) {
					System.out.println("이름을 입력하라");
					continue;
				}
				break;
			}
			if (strA_name.equals("-Q")) break;

			System.out.print("2.전화번호(-Q:quit) >> ");
			String strA_tel = scan.nextLine();
			if (strA_tel.equals("-Q")) break;

			System.out.print("3.주소(-Q:quit) >> ");
			String strA_addr = scan.nextLine();
			if (strA_addr.equals("-Q")) break;

			System.out.println("4.관계(-Q:quit) >> ");
			String strA_chain = scan.nextLine();
			if (strA_chain.equals("-Q")) break;

			AddrDTO addrDTO = AddrDTO.builder()
					.A_name(strA_name)
					.A_tel(strA_tel)
					.A_addr(strA_addr)
					.A_chain(strA_chain)
					.build();
					

			int ret = addrDao.insert(addrDTO);
			if (ret > 0)
				System.out.println("주소 저장 완료");
			else
				System.out.println("주소 저장 실패");
		}
	}

	public void deleteAddr() {
		while (true) {
			System.out.println("======================================");
			System.out.print("삭제할 ID(-Q:quit) >> ");
			String strId = scan.nextLine();
			if (strId.equals("0"))
				break;
			long longId = Long.valueOf(strId);

			AddrDTO addrDTO = addrDao.findById(longId);
			if (addrDTO == null) {
				System.out.println("ID 없음");
				continue;
			}
			addrDao.delete(strId);
		}
	}
}
