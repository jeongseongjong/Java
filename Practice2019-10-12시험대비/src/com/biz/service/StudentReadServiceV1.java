package com.biz.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.domain.StudentVO;

public class StudentReadServiceV1 {

	private List<StudentVO> stdList;

	public List<StudentVO> getStdList() {
				
		return stdList;
	}

	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	

	public void readStudent(String fileName) throws IOException {
		FileReader fileReader;
		BufferedReader buffer;
		stdList = new ArrayList<StudentVO>();
		
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
		buffer.close();
		fileReader.close();
	}
	
}
