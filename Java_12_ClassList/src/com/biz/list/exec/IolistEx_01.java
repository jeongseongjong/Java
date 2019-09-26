package com.biz.list.exec;

import com.biz.list.service.IolistServiceImp;

public class IolistEx_01 {

	public static void main(String[] args) {
		
		IolistServiceImp ioService = new IolistServiceImp();
		
		ioService.input();
		ioService.list();
		ioService.total();
	}
}
