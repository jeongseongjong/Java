package com.biz.pIolist;

import com.biz.pIolist.service.PIolistService;
import com.biz.pIolist.service.PIolistServiceImpV1;

public class PIolistEx_01 {

	public static void main(String[] args) {
		PIolistService is = new PIolistServiceImpV1();
		
		String fileName = "src/com/biz/practiceIolist/매입매출정보.txt";
		try {
			is.read(fileName);
			is.list();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
