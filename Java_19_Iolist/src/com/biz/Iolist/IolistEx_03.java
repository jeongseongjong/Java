package com.biz.Iolist;

import com.biz.Iolist.service.IolistService;
import com.biz.Iolist.service.IolistServiceImpV3;

public class IolistEx_03 {

	public static void main(String[] args) {
		IolistService is = new IolistServiceImpV3();
		
		String fileName = "src/com/biz/Iolist/매입매출정보.txt";
		try {
			is.read(fileName);
			is.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
