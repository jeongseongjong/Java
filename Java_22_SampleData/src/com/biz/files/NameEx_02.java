package com.biz.files;

public class NameEx_02 {

	public static void main(String[] args) {
		/*
		 * 이름리스트.txt와 성씨리스트.txt 파일을 읽어서 리스트를 만들고
		 * 두 리스트의 값을 임의 조합하여
		 * 3글자의 이름을 생성하고
		 * 한국인이름.txt 로 저장하라
		 * 
		 * 1. 성씨 한자제외
		 * 2. 리스트는 100개 작성
		 * 3. 이름과 성의 순서가 동일하지말아라
		 * 4. Service 클래스를 작성하여 과제를 수행하시오
		 * 
		 */
		
		System.out.printf("시작 : %d\n",
				System.currentTimeMillis());
		
		String nameFile = "src/com/biz/files/이름리스트.txt";
		String famFile = "src/com/biz/files/성씨리스트.txt";
		String korNameFile = "src/com/biz/files/한국인이름.txt";
		
		
		NameService ns = new NameServiceV2();
		
		try {
			ns.readNameList(nameFile);
			ns.readFamList(famFile);
			ns.writeNameFile(korNameFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("샘플데이터 생성완료");
				
		
		
		
		
		
		
		
		
		
	}
}
