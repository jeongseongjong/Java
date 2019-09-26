package com.biz.files;

import java.io.IOException;

import com.biz.files.service.BufferedReaderService;

public class FileEx_05 {

	public static void main(String[] args) {
		
		BufferedReaderService bs = new BufferedReaderService();
		String fileName = "src/com/biz/files/data.txt";
		
		try {
			bs.read(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
