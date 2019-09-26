package com.biz.array.exec.Method;

import com.biz.arrays.model.MemberVO;

public class MethodEx_02 {

	public static void main(String[] args) {

		MemberVO mVO = new MemberVO();
		mVO.strName = "AAA";
		mVO.strTel = "1111";
		mVO.setIntAge(33);
		
		System.out.println("이름 : " + mVO.strName);
		System.out.println("전화번호 : " + mVO.strTel);
		System.out.println("나이 : " + mVO.getIntAge());
	}

}
