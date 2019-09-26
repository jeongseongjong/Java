package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.string.domain.StudentVO;

public class StudentServiceV1 implements StringService {

	List<StudentVO> stdList;

	public StudentServiceV1() {
		stdList = new ArrayList<StudentVO>();

	}

	/*
	 * 학생정보를 문자열형태로 가지고 있는 
	 * students 배열을 미리 생성해 두고 배열에 
	 * 저장된 문자열을 split()으로 분해하여 
	 * 각 항목별로 만들고
	 * 학생정보 리스트를 만드는데 사용할 것
	 */

	@Override
	public void input() {
		String[] students = new String[] { 
				"AAA : 서울 : 010-111 : 01", 
				"BBB : 광주 : 010-222 : 02",
				"CCC : 목포 : 010-333 : 03"

		};

		// students 배열의 0번째 요소에 저장된 문자열을
		// 콜론을 기준으로 분리하여 배열로 생성하라
		String[] stdArray = students[0].split(" : ");
		// stdArray[0] -> "AAA"
		// stdArray[1] -> "서울"
		// stdArray[2] -> "010-111"
		// stdArray[3] -> "01"

		// 학번생성을 위한 변수 선언
		int intNum = 1;
		for (String s : students) {
			StudentVO stdVO = new StudentVO();

			// intNum 값을 문자열 학번으로 변환시키고
			// 1을 증가
			String strNum = String.format("%05d", intNum++);
			stdVO.setStrNum(strNum);

			// students 요소가 담긴 s 변수를
			// 콜론(:) 문자열로 분해
			// stdArray 배열에 담기
			// stdArray 배열에 담긴 요소들을
			// stdVO에 세팅하기
			stdArray = s.split(" : ");
			stdVO.setStrName(stdArray[0]);
			stdVO.setStrAddr(stdArray[1]);
			stdVO.setStrTel(stdArray[2]);
			stdVO.setIntAge(Integer.valueOf(stdArray[3]));

			// 리스트에 추가
			stdList.add(stdVO);
		}

	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("학생명부");
		System.out.println("================================");
		System.out.println("학번\t이름\t주소\t전화\t나이");
		System.out.println("--------------------------------");
		for (StudentVO vo : stdList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getIntAge() + "\n");
		}
		System.out.println("==================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

	// 학번으로 학생정보를 조회하는 method()
	public StudentVO search(String strNum) {
		
		for(StudentVO stdVO : stdList) {
			if (stdVO.getStrNum().equals(strNum)){
				System.out.println("찾음");
				return stdVO; // stdVO의 타입은 StudentVO이다.
			}
		}
		return null;
	}

	public List<StudentVO> getScoreList(){
		
		return stdList;
		
	}
}
