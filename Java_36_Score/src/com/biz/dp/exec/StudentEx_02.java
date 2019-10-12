package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		
		System.out.println(System.currentTimeMillis());
		// 객체를 생성하고, setter로 필드값을 주입한 후 List에 저장
		for(long i = 0 ; i < 10000 ; i++) {
			StudentVO stdVO = new StudentVO();
			stdVO.setSt_num(String.format("%05d", i));
			stdList.add(stdVO);
		}
		System.out.println(System.currentTimeMillis());
	
		// 필드생성자에 값을 주입하면서 직접add() method에 객체를 주입
		for(long i = 0 ; i < 10000 ; i++) {
			stdList.add(new StudentVO
					(String.format("%05d", i),"","","",0,""));
		}
		start = System.currentTimeMillis();
		
		
		
	}
}
