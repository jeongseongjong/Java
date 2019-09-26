package com.biz.array.service;

import com.biz.arrays.model.MemberVO;

public class MemberService {

	private MemberVO[] mVO;

	//

	// 클래스의 생성자 method
	// return type 키워드가 없는 method
	// method의 이름이 클래스 이름과 같다.
	// 클래스를 객체로 생성(선언 + 초기화) 할 때
	// 자동으로 호출되어 실행되는 method
	public MemberService() {

		// 1. 배열 10개를 만들고
		mVO = new MemberVO[10];

		// 2. 배열의 개수만큼 반복하면서
		for (int i = 0; i < mVO.length; i++) {

			// 3. 각요소를 객체로 생성하고
			mVO[i] = new MemberVO();

			// 4. 임의로 이름을 생성하여
			//	 배열 요소의 strName 변수에 저장
			mVO[i].strName = String.format("KO%03d", i);
		}
	}

	public MemberService(int length) {
		
		// length 값 만큼 배열 선언
		mVO = new MemberVO[length];
		
		for(int i = 0 ; i < mVO.length ; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName 
				= String.format("K-%05d", i);
			mVO[i].strTel 
				= String.format("010-%04d-%04d", i+1, i+1);
		}
			
		
	}
	
	
	public MemberVO[] getMemberVO() {
		return mVO;
	}
	
	public void memberListView() {
		System.out.println("=====================================");
		System.out.println("이름\t전화번호");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i < mVO.length ; i++) {
		System.out.printf("%s\t%s\n", mVO[i].strName, mVO[i].strTel);
	}
		System.out.println("=====================================");
	}
}
