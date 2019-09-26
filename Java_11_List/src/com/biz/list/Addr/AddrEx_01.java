package com.biz.list.Addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {

		List<AddrVO> addrList = new ArrayList<AddrVO>();

		AddrVO aVO = new AddrVO();

		aVO.setStrName("AAA");
		aVO.setStrTel("010-111-1111");
		aVO.setStrAddr("서울특별시");
		aVO.setStrEmail("jjong9950@naver.com");
		aVO.setStrHp("010-111-1111");

		addrList.add(aVO);
		aVO = new AddrVO();
		aVO.setStrName("BBB");
		aVO.setStrTel("010-222-2222");
		aVO.setStrAddr("광주");
		aVO.setStrEmail("jjong9950@naver.com");
		aVO.setStrHp("010-222-2222");

		addrList.add(aVO);
		aVO = new AddrVO();
		aVO.setStrName("CCC");
		aVO.setStrTel("010-333-3333");
		aVO.setStrAddr("목포");
		aVO.setStrEmail("jjong9950@naver.com");
		aVO.setStrHp("010-444-4444");

		addrList.add(aVO);

		// addrList의 개수를 계산해서 nSize 변수에 담아달라

		System.out.println("===================================");
		System.out.println("주  소  록");
		System.out.println("===================================");
		System.out.println("이름\t전화\t주소\tEmail\t핸드폰");
		System.out.println("-----------------------------------");

		int nSize = addrList.size();

		// 일반 for
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t", addrList.get(i).getStrName());
			System.out.printf("%s\t", addrList.get(i).getStrTel());
			System.out.printf("%s\t", addrList.get(i).getStrAddr());
			System.out.printf("%s\t", addrList.get(i).getStrEmail());
			System.out.printf("%s\n", addrList.get(i).getStrHp());
		}

		for (AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrTel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHp());
		}

		System.out.println("=========================================");
	}

}
