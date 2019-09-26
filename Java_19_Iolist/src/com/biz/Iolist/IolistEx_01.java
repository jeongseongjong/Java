package com.biz.Iolist;

import java.io.FileReader;

import com.biz.Iolist.service.IolistService;
import com.biz.Iolist.service.IolistServiceImpV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		IolistService is = new IolistServiceImpV1();
		
		String fileName = "src/com/biz/Iolist/매입매출정보.txt";
		try {
			is.read(fileName);
			is.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
