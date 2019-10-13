package com.biz.test.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.test.domain.UserVO;

import lombok.Getter;
@Getter
public class UserReadServiceV1 {
	
	List<UserVO> userList;
	public UserReadServiceV1() {
		userList = new ArrayList();
	}
	public void UserRead(String userFile) throws Exception{
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(userFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			String[] sList = reader.split(":");
			
			userList.add(UserVO.builder().
					num(sList[0]).
					name(sList[1]).
					age(Integer.valueOf(sList[2])).
					key(Integer.valueOf(sList[3])).
					weight(Integer.valueOf(sList[4])).build()
					);
		}
		buffer.close();
		fileReader.close();
	}
}
