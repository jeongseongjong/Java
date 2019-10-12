package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {
	
		String imgFile = "src/com/biz/stream/2019_2.png";
		
		FileInputStream fs = null;
		BufferedInputStream buffer = null;
		
		try {
			fs = new FileInputStream(imgFile);
			buffer = new BufferedInputStream(fs);
			
			byte[] bytes = new byte[32];
			buffer.read(bytes);
			
			for(int i = 0 ; i < bytes.length ; i++) {
				System.out.printf("%02X", bytes[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	}

