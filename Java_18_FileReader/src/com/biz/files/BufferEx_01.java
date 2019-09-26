package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileReaderBufferServiceV2;

public class BufferEx_01 {

	public static void main(String[] args) {
		
		FileReaderBufferServiceV2 fb = new FileReaderBufferServiceV2();
		String fileName = "src/com/biz/files/data.txt";
		try {
			fb.reade(fileName); // main에서 surround service에서는 add
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}