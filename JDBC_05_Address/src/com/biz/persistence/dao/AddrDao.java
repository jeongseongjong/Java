package com.biz.persistence.dao;

import java.sql.Connection;
import java.util.List;

import com.biz.addr.config.DBConnection;
import com.biz.persistence.AddrDTO;

public abstract class AddrDao {

	protected Connection dbConn = null;
	
	public AddrDao() {
		this.dbConn = DBConnection.getDBConnection();
		
	}
	
	
	public abstract List<AddrDTO> selectAll();
	
	public abstract AddrDTO findById(long A_id);
	
	public abstract List<AddrDTO> findByName(String A_name);
	public abstract List<AddrDTO> findByTel(String A_tel);
	public abstract List<AddrDTO> findByAddr(String A_addr);
	public abstract List<AddrDTO> findByChain(String A_chain);


	public abstract int insert(AddrDTO addrDTO);
	public abstract int update(AddrDTO addrDTO);
	public abstract int delete(String A_id);


	
	
	
}
