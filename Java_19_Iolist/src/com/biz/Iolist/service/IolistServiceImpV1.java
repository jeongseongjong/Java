package com.biz.Iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.biz.Iolist.domain.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	List<IolistVO> ioList;
	
	@Override
	public void read(String fileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)
				break;
			
			System.out.println(reader);
		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

	}

	@Override
	public void summany() {
		// TODO Auto-generated method stub

	}

}
