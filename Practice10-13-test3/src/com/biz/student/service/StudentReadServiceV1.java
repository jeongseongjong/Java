package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;

import lombok.Getter;

@Getter
public class StudentReadServiceV1 {
	
	List<StudentVO> stdList;
	public StudentReadServiceV1() {
		stdList = new ArrayList();
	}
	public void ReadServiceV1(String studentFile) throws Exception {
		FileReader fileReader = new FileReader(studentFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		while(true) {
			String reader = buffer.readLine();
			if(reader == null)break;
			String[] sList = reader.split(":");
			
			stdList.add(StudentVO.builder().
					num(sList[0]).
					name(sList[1]).
					grade(Integer.valueOf(sList[2])).
					addr(sList[3]).build()
					);
		}
		buffer.close();
		fileReader.close();
	}
	
}
