package com.biz.iolist.exec;

import java.util.Random;

import com.biz.iolist.model.GradeVO;
//GradeVO와 묶임
public class GradeEx_01 {

	public static void main(String[] args) {

		GradeVO gradeVO = new GradeVO();
		
		gradeVO.setStrNum("001");
		gradeVO.setStrName("AAA");
		gradeVO.setIntKorea(90);
		
		String s = gradeVO.toString();
		System.out.println(s);

		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			
			gradeVO = new GradeVO(rnd.nextInt() + "");
			s = gradeVO.toString();
			System.out.println(s);
		}
		
		s = gradeVO.toString();
		System.out.println(s);

	}

}
