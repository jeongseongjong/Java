package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		/*
		 * 자바 빈즈패턴(Java Beans Pattern, 자바의 고전적인 코딩)
		 */
		StudentVO stdVO = new StudentVO();
		stdVO.setSt_num("001");
		stdVO.setSt_name("AAA");
		stdVO.setSt_tel("010-0101");
		stdVO.setSt_addr("서울특별시");
		stdVO.setSt_grade(3);
		stdList.add(stdVO);
		
		// setter를 이용해서 필드에 값을 주입하고 List에 추가
		stdVO = new StudentVO();
		stdVO.setSt_num("001");
		stdVO.setSt_name("AAA");
		stdVO.setSt_tel("010-0101");
		stdVO.setSt_addr("서울특별시");
		stdVO.setSt_grade(3);
		stdList.add(stdVO);
		
		// 생성자를 이용해서 필드값을 초기화 하면서 객체를 생성하고
		// 변수 객체에 담았다가 List에 추가
		stdVO = new StudentVO("003", "BBB", "010-2222","남원",3,"005");
		stdVO = new StudentVO("003", "BBB", "010-2222","남원",3,"005");
		stdVO = new StudentVO("003", "BBB", "010-2222","남원",3,"005");
		stdVO = new StudentVO("003", "BBB", "010-2222","남원",3,"005");
		stdVO = new StudentVO("003", "BBB", "010-2222","남원",3,"005");
		stdList.add(stdVO);
		
		// 별도의 변수객체를 만들지 않고
		// add() method에 직접 생성자 코드를 작성해서 List에 추가
		stdList.add(new StudentVO("004", "CCC","010-3333","남원", 3, "005"));
		stdList.add(new StudentVO("004", "CCC","010-3333","남원", 3, "005"));
		stdList.add(new StudentVO("004", "CCC","010-3333","남원", 3, "005"));
		stdList.add(new StudentVO("004", "CCC","010-3333","남원", 3, "005"));
		stdList.add(new StudentVO("004", "CCC","010-3333","남원", 3, "005"));
		
		// 생성자를 이용하는 객체생성
		// 1. 생성자의 매개변수를 순서등을 명확히 인식해야만
		// 		오류가 없는 값을 추가할 수 있다.
		// 2. 지금 당장 추가하지 않아도 될 필드값도
		// 		의무적으로 모두 추가해야하는 단점이 있다.
	}
}


