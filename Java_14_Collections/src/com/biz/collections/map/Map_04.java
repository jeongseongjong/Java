package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.biz.collections.model.GradeVO;

public class Map_04 {

	public static void main(String[] args) {
		
		/*
		 * Map 데이터 구조
		 * 데이터를 저장할 때 key, value의 쌍(pair)으로 put을 하며
		 * 데이터를 조회(찾기)할때 key값 만으로
		 * 빠르고 쉽게 찾을 수 있다.
		 * 데이터가 어떤 위치(index)에 있는지 몰라도
		 * 내용으로 검색하는 연상검색 기능을 구현한다.
		 * 
		 */
		Map<String,GradeVO> grades 
			= new HashMap<String,GradeVO>();
		
		GradeVO vo = new GradeVO();
		vo.setStrName("AAA");
		vo.setIntKor(90);
		vo.setIntEng(80);
		vo.setIntMath(70);
		grades.put("AAA", vo);
		
		vo= new GradeVO();
		vo.setStrName("BBB");
		vo.setIntKor(60);
		vo.setIntEng(80);
		vo.setIntMath(70);
		grades.put("BBB", vo);
		
		vo= new GradeVO();
		vo.setStrName("CCC");
		vo.setIntKor(80);
		vo.setIntEng(70);
		vo.setIntMath(60);
		grades.put("CCC", vo);
		
		System.out.println("BBB의 성적 : " + grades.get("BBB").toString());
	}
}
