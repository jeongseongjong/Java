package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentServiceV1 {

	List<StudentVO> stdList = new ArrayList<StudentVO>();

	public void read(String fileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] sList = reader.split(":");
			StudentVO sVO = new StudentVO();
			sVO.setS_num(sList[0]);
			sVO.setS_name(sList[1]);
			sVO.setS_tel(sList[2]);
			sVO.setS_grade(Integer.valueOf(sList[3]));
			sVO.setS_addr(sList[4]);
			
			stdList.add(sVO);
		}
	}

		
	}
