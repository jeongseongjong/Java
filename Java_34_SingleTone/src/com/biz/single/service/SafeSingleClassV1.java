package com.biz.single.service;

public class SafeSingleClassV1 {

	private static SafeSingleClassV1 myObject;
	
	private String name;
	private String nation;
	
	private SafeSingleClassV1() {
		
	}
	
	// getInstance() method에 synchronized 키워드를 추가함으로써 
	// 이 싱글톤클래스는 thread safe상태가 된다.
	// 게으른 초기화 코드 라고한다.
	// 코드실행이 늦기때문에
	public static synchronized SafeSingleClassV1 getInstance() {
		if(myObject == null)
		myObject = new SafeSingleClassV1();
		return myObject;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNation() {
		return this.nation;
	}
}
