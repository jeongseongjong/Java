package com.biz.test.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.test.domain.UserVO;

import lombok.Setter;

@Setter
public class UserViewServiceV1 {

	List<UserVO> userList;
	public UserViewServiceV1() {
		userList = new ArrayList();
	}
	public void main() {
		System.out.println("================================");
		System.out.println("사람정보");
		System.out.println("================================");
		System.out.println("번호\t이름\t나이\t키\t몸무게");
		System.out.println("--------------------------------");
		
	}
	public void sub(UserVO vo) {
		
		System.out.print(vo.getNum() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getAge() + "\t");
		System.out.print(vo.getKey() + "\t");
		System.out.print(vo.getWeight() + "\n");
	
	}
	public void view() {

		this.main();
		for(UserVO vo : userList) {
			this.sub(vo);
		}
		System.out.println("----------------------------------");
	}
	public void view(String userName) {
		
		this.main();
		for(UserVO vo : userList) {
			if(vo.getName().contains(userName)) {
				this.sub(vo);
			}
		}
	}
	public void view(int userAge) {
		this.main();
		for(UserVO vo : userList) {
			if(vo.getAge() == userAge) {
				this.sub(vo);
			}
		}
	}
	public void view(int lsAge, int grAge) {
		
		this.main();
		for(UserVO vo : userList) {
			int age = Integer.valueOf(vo.getAge());
			if(age >= lsAge && age <= grAge) {
				this.sub(vo);
			}
		}
	}
}
