package com.biz.service;

import java.util.List;
import java.util.Scanner;

import com.biz.persistence.AddrDTO;
import com.biz.persistence.dao.AddrDao;
import com.biz.persistence.dao.AddrDaoImp;

public class AddrServiceV1 {

	AddrDao addrDao = null;
	Scanner scan = null;

	public AddrServiceV1() {

		addrDao = new AddrDaoImp();
		scan = new Scanner(System.in);
	}

	public void viewAddrList() {

		List<AddrDTO> addrList = addrDao.selectAll();
		this.viewList(addrList);
	}

	private void viewList(List<AddrDTO> addrList) {

		System.out.println("==================================");
		System.out.println("주소 리스트");
		System.out.println("==================================");
		System.out.println("아이디\t이름\t전화번호\t주소\t관계");
		System.out.println("----------------------------------");
		for (AddrDTO addDto : addrList) {
			System.out.printf("%d\t", addDto.getA_id());
			System.out.printf("%s\t", addDto.getA_name());
			System.out.printf("%s\t", addDto.getA_tel());
			System.out.printf("%s\t", addDto.getA_addr());
			System.out.printf("%s\n", addDto.getA_chain());

		}
		System.out.println("======================================");

	}

	public void searchAddrName(boolean aConti) {
		while (true) {
			if (this.searchAddrName() != null)
				break;
		}
	}

	public String searchAddrName() {

		System.out.println("==========================");
		System.out.println("이름 검색");
		System.out.println("==========================");
		System.out.print("이름 (-Q:quit) >> ");
		String strName = scan.nextLine();
		if (strName.equals("-Q"))
			return "-Q";
		this.searchAddrName(strName);
		return strName;

	}

	public boolean searchAddrName(String strName) {

		List<AddrDTO> addrList = addrDao.findByName(strName);

		if (addrList == null || addrList.size() < 1) {
			System.out.println("찾는 이름 없음");
			return false;
		}
		this.viewList(addrList);
		return true;

	}

	public void searchAddrTel(boolean bConti) {
		while (true) {
			if (this.searchAddrTel() != null)
				break;
		}
	}

	public String searchAddrTel() {

		System.out.println("============================");
		System.out.println("전화번호 검색");
		System.out.println("============================");
		System.out.print("전화번호(-Q:quit) >> ");
		String strTel = scan.nextLine();
		if (strTel.equals("-Q"))
			return "-Q";
		this.searchAddrTel(strTel);
		return strTel;

	}

	public boolean searchAddrTel(String strTel) {
		
		List<AddrDTO> addrList = addrDao.findByTel(strTel);
		
		if(addrList == null || addrList.size() < 1) {
			System.out.println("찾는 번호 없음");
			return false;
		}
		this.viewList(addrList);
		return true;
		
	}
	
	public void searchAddrAddr(boolean cConti) {
		while (true) {
			if (this.searchAddrAddr() != null)
				break;
		}
	}
	
	public String searchAddrAddr() {

		System.out.println("==========================");
		System.out.println("주소 검색");
		System.out.println("==========================");
		System.out.print("주소 (-Q:quit) >> ");
		String strAddr = scan.nextLine();
		if (strAddr.equals("-Q"))
			return "-Q";
		this.searchAddrName(strAddr);
		return strAddr;

	}

	public boolean searchAddrAddr(String strAddr) {

		List<AddrDTO> addrList = addrDao.findByAddr(strAddr);

		if (addrList == null || addrList.size() < 1) {
			System.out.println("찾는 주소 없음");
			return false;
		}
		this.viewList(addrList);
		return true;

	}
	
	
	
	public void searchAddrChain(boolean dConti) {
		while (true) {
			if (this.searchAddrChain() != null)
				break;
		}
	}
	
	public String searchAddrChain() {

		System.out.println("==========================");
		System.out.println("관계 검색");
		System.out.println("==========================");
		System.out.print("관계 (-Q:quit) >> ");
		String strChain = scan.nextLine();
		if (strChain.equals("-Q"))
			return "-Q";
		this.searchAddrName(strChain);
		return strChain;

	}

	public boolean searchAddrChain(String strChain) {

		List<AddrDTO> addrList = addrDao.findByChain(strChain);

		if (addrList == null || addrList.size() < 1) {
			System.out.println("찾는 관계 없음");
			return false;
		}
		this.viewList(addrList);
		return true;

	}
	
	

	public void updateAddr() {
		
		System.out.println("==============================");
		System.out.println("주소정보 수정");
		System.out.println("==============================");
		System.out.print("수정할 주소 ID (-Q:quit) >> ");
		String strId = scan.nextLine();
		long longId = Long.valueOf(strId);
		if(strId.equals("-Q"));
		AddrDTO addrDTO = addrDao.findById(longId);
		
		System.out.printf("변경할 이름(%s)", addrDTO.getA_name());
		String strName = scan.nextLine();
		if(strName.trim().length() > 0) {
			addrDTO.setA_name(strName.trim());
		}
		System.out.printf("변경할 전화번호(%s)", addrDTO.getA_tel());
		String strTel = scan.nextLine();
		if(strTel.trim().length() > 0) {
			addrDTO.setA_tel(strTel.trim());
		}
		System.out.printf("변경할 주소(%s)", addrDTO.getA_addr());
		String strAddr = scan.nextLine();
		if(strAddr.trim().length() > 0) {
			addrDTO.setA_addr(strAddr.trim());
		}
		System.out.printf("변경할 관계(%s)", addrDTO.getA_chain());
		String strChain = scan.nextLine();
		if(strChain.trim().length() > 0) {
			addrDTO.setA_chain(strChain.trim());
		
		}
		addrDao.update(addrDTO);
	}
	
}
