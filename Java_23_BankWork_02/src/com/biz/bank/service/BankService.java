package com.biz.bank.service;
/*
 * BankService에서 할일이 아직 명확히 정의되지 않아서
 * 비어있는 interface를 생성
 * 실지 class를 만들면서 interface 정의 수행
 * 
 * 1. 장고원장(파일)으로부터 계좌들의 잔고리스트를 가져와서 리스트 생성
 * 2. 계좌별 입출금 수행
 * 3. 잔고원장에 입출금내역 반영
 * 4. 계좌별 입출금내역(List)를 파일로 저장
 * 
 * interface는 method의 정의만 있고
 *  ==> method prototype정의
 *  method가 구체적으로 무슨일을 하는지 모름
 *  
 *  구현될 method의 return type과 매개변수의 형식만 지정한다.
 */
public interface BankService {

	// 잔고원장으로부터 계좌들의 잔고리스트를 가져와서
	// 리스트로 생성하는 메서드
	// obj.readBook("거래원장.txt")형식으로 호출될 method
	public void readBook(String bookFile) throws Exception;
	
	// 계좌번호를 받아서 정보를 보여주는 method
	
	public void viewAcc();
	
	// 조회된 계좌번호에 해당하는 계좌에
	// 키보드로부터 입금액을 입력받아서 입금 처리 수행
	public void input() throws Exception ;
	
	public void output() throws Exception ;
	
	// 입출금이 완료되었을때 원장정보를 업데이트 하는 method
	public void bookWrite(String bookFile) throws Exception ;
	
	// 각 계좌별 입출금 내역을 파일에 저장
	public void accListWrite(String remark, int money) throws Exception ;
	
	
	
}
