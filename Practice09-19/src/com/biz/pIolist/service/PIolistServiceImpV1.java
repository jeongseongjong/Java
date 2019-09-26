package com.biz.pIolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.biz.pIolist.domain.PIolistVO;

public class PIolistServiceImpV1 implements PIolistService{

	List<PIolistVO> ioList;

	@Override
	public void read(String fileName) throws Exception{

		FileReader fileReader ;
		BufferedReader buffer ;
		
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
	public void summary() {
		// TODO Auto-generated method stub
		
	}
	
}
