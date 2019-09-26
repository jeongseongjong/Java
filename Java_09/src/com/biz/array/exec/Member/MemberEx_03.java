package com.biz.array.exec.Member;

import com.biz.array.service.MemberService;

public class MemberEx_03 {

	public static void main(String[] args) {
		
		// 생성자에 아무런 값도 전달하지 않고 호출
		MemberService ms1 = new MemberService();
		
		// 생성자에 정수 15를 전달하면서 호출
		MemberService ms2 = new MemberService(15);
		
		System.out.println("ms1");
		ms1.memberListView();
		
		System.out.println("ms2");
		ms2.memberListView();
	}
}
