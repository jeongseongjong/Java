package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {
	
	List<AddrVO> addrList = new ArrayList<AddrVO>();
	@Override
	public void input() {
		// input() method의 구현
		// input() method에서 할일들의 코드를
		// 작성하는것
		// 형태만 만들어진 input() method에
		// 구체적인 코드를 작성하는것
		addrList = new ArrayList<AddrVO>();
	
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
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
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

	@Override
	public void view(int num) {
		
		 if(num > addrList.size() - 1) {
			 System.out.println("데이터가 없음");
			 return; // view() method 강재 종료
		 }
		
		
		AddrVO aVO = addrList.get(num);
		System.out.println("이름 : " + aVO.getStrName());
		System.out.println("전화 : " + aVO.getStrTel());
		System.out.println("주소 : " + aVO.getStrAddr());
		System.out.println("이메일 : " + aVO.getStrEmail());
		System.out.println("핸드폰 : " + aVO.getStrHp());
	}

}
