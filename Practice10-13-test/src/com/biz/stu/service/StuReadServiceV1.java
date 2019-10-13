package com.biz.stu.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.stu.domain.StuVO;

import lombok.Getter;
@Getter
public class StuReadServiceV1 {

	List<StuVO> stdList;
	public void StuReadServiceV1(){
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
			
			stdList.add(StuVO.builder().
					num(sList[0]).
					name(sList[1]).
					tel(sList[2]).
					grade(Integer.valueOf(sList[3])).
					addr(Integer.valueOf(sList[44])).build()
					);
		}
		buffer.close();
		fileReader.close();
	}
}
