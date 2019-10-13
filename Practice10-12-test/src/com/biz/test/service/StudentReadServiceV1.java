package com.biz.test.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.test.domain.StudentVO;

import lombok.Getter;
@Getter
public class StudentReadServiceV1 {

	List<StudentVO> stdList;
	public StudentReadServiceV1() {
		stdList = new ArrayList();
		
	}
	
	public void ReadService(String studentFile) throws Exception{
		FileReader fileReader;
		BufferedReader buffer;
		
		
		fileReader = new FileReader(studentFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			String[] sList = reader.split(":");
			stdList.add(StudentVO.builder().
					s_num(sList[0]).
					s_name(sList[1]).
					s_tel(sList[2]).
					s_grade(Integer.valueOf(sList[3])).
					s_addr(Integer.valueOf(sList[4])).build()
					);
		}
		buffer.close();
		fileReader.close();
		
		
	}
	
	
	
}
