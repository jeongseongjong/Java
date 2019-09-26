package com.biz.Iolist;

import com.biz.Iolist.service.IolistService;
import com.biz.Iolist.service.IolistServiceImpV2;

public class IolistEx_02 {

	public static void main(String[] args) {
		IolistService is = new IolistServiceImpV2();
		
		String fileName = "src/com/biz/Iolist/매입매출정보.txt";
		try {
			is.read(fileName);
			is.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
