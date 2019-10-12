package com.biz.files;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.files.service.FileReaderServiceV1;

public class FielEx_03 {

	public static void main(String[] args) {
		
		FileReaderServiceV1 fs = new FileReaderServiceV1();
		
		try {
			fs.read("src/com/biz/files/data.txt");
		} catch(FileNotFoundException e ) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
