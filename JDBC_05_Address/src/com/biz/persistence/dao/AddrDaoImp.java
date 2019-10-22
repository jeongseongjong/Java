package com.biz.persistence.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.addr.config.DBContract;
import com.biz.persistence.AddrDTO;

public class AddrDaoImp extends AddrDao {

	@Override
	public List<AddrDTO> selectAll() {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;

		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet rst = pStr.executeQuery();

			List<AddrDTO> addrList = new ArrayList<AddrDTO>();

			while (rst.next()) {

				AddrDTO dto = this.rst_2_DTO(rst);

				addrList.add(dto);

			}
			rst.close();
			pStr.close();
			return addrList;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	private AddrDTO rst_2_DTO(ResultSet rst) throws SQLException {

		AddrDTO dto = AddrDTO.builder()
				.A_id(rst.getLong("A_ID"))
				.A_name(rst.getString("A_NAME"))
				.A_tel(rst.getString("A_TEL"))
				.A_addr(rst.getString("A_ADDR"))
				.A_chain(rst.getString("A_CHAIN"))
				.build();

		return dto;
	}

	@Override
	public AddrDTO findById(long A_id) {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;
		sql += " WHERE A_id = ? ";

		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setLong(1, A_id);
			ResultSet rst = pStr.executeQuery();

			AddrDTO addrDTO = null;
			if (rst.next()) {
				addrDTO = this.rst_2_DTO(rst);
			}
			rst.close();
			pStr.close();
			return addrDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<AddrDTO> findByName(String A_name) {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;

		sql += " WHERE A_name LIKE '%' || ? || '%' ";

		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, A_name);
			ResultSet rst = pStr.executeQuery();

			List<AddrDTO> addrList = new ArrayList<AddrDTO>();

			while (rst.next()) {

				AddrDTO dto = this.rst_2_DTO(rst);

				addrList.add(dto);
			}
			rst.close();
			pStr.close();
			return addrList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<AddrDTO> findByTel(String A_tel) {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;

		sql += " WHERE A_tel LIKE '%' || ? ";

		try {

			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, A_tel);

			ResultSet rst = pStr.executeQuery();

			List<AddrDTO> addrList = new ArrayList<AddrDTO>();

			while (rst.next()) {

				AddrDTO addrDTO = this.rst_2_DTO(rst);

				addrList.add(addrDTO);

			}
			rst.close();
			pStr.close();
			return addrList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	@Override
	public List<AddrDTO> findByAddr(String A_addr) {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;

		sql += " WHERE A_addr LIKE '%' || ? || '%' ";

		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, A_addr);
			ResultSet rst = pStr.executeQuery();

			List<AddrDTO> addrList = new ArrayList<AddrDTO>();

			while (rst.next()) {

				AddrDTO dto = this.rst_2_DTO(rst);

				addrList.add(dto);
			}
			rst.close();
			pStr.close();
			return addrList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<AddrDTO> findByChain(String A_chain) {

		PreparedStatement pStr = null;
		String sql = DBContract.SQL.SELECT_ADDR;

		sql += " WHERE A_chain LIKE '%' || ? || '%' ";

		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, A_chain);
			ResultSet rst = pStr.executeQuery();

			List<AddrDTO> addrList = new ArrayList<AddrDTO>();

			while (rst.next()) {

				AddrDTO dto = this.rst_2_DTO(rst);

				addrList.add(dto);
			}
			rst.close();
			pStr.close();
			return addrList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int insert(AddrDTO addrDTO) {

		PreparedStatement pStr = null;
		String sql = " INSERT INTO tbl_addr( ";
		sql += " A_name,";
		sql += " A_tel,";
		sql += " A_addr,";
		sql += " A_chain)";
		sql += " VALUES( " + " 'A' || LPAD(SEQ_ADDR.NEXTVAL,4,'0')," 
				+ "?," 
				+ "?," 
				+ "?," 
				+ "? ) ";
		try {

			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, addrDTO.getA_name());
			pStr.setString(2, addrDTO.getA_tel());
			pStr.setString(3, addrDTO.getA_addr());
			pStr.setString(4, addrDTO.getA_chain());

			int ret = pStr.executeUpdate();
			pStr.close();
			return ret;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(AddrDTO addrDTO) {

		PreparedStatement pStr = null;
		String sql = " UPDATE tbl_addr SET ";
		sql += " A_NAME = ?, ";
		sql += " A_TEL = ?, ";
		sql += " A_ADDR = ?, ";
		sql += " A_CHAIN = ? ";
		sql += " WHERE A_ID = ? ";

		try {

			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, addrDTO.getA_name());
			pStr.setString(2, addrDTO.getA_tel());
			pStr.setString(3, addrDTO.getA_addr());
			pStr.setString(4, addrDTO.getA_chain());
			pStr.setLong(5, addrDTO.getA_id());

			int ret = pStr.executeUpdate();
			if (ret > 0) {
				System.out.println("주소 정보를 확인");
			} else {
				System.out.println("주소 정보확인 실패");
			}

			pStr.close();
			return ret;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String A_id) {

		PreparedStatement pStr = null;
		String sql = " DELETE FROM tbl_addr ";
		sql += " WHERE A_id = ? " ;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, A_id);
			int ret = pStr.executeUpdate();
			
			pStr.close();
			return ret;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;
	}

}





















