package com.biz.iolist.exec;

import com.biz.iolist.service.IoListService;
import com.biz.iolist.service.IolistServiceImpV1;

public class IolistEx_01 {

	//iolistVO , iolistV1과 묶음
	public static void main(String[] args) {

		IoListService ioService = new IolistServiceImpV1();
		ioService.input(5);
		ioService.total();
		ioService.list();
	}

}
