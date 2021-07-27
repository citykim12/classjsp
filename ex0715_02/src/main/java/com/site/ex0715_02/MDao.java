package com.site.ex0715_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//db연결 class →	여기에서만 db연결
public class MDao {
	
	public MDao(){}
	MDto mDto = new MDto();
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	//Connection 객체 연결
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
		
	}
	
	//회원가입
	public int memberInsert(MDto mDto) {
		int resultNum=0;
		
		try {
			conn = getConnection();	//Connection 메소드 호출
			String sql="insert into member2 values(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDto.getId());
			pstmt.setString(2, mDto.getPw());
			pstmt.setString(3, mDto.getName());
			pstmt.setString(4, mDto.getNickname());
			pstmt.setString(5, mDto.getGender());
			pstmt.setString(6, mDto.getTel());
			pstmt.setString(7, mDto.getAddress1());
			pstmt.setString(8, mDto.getAddress2());
			pstmt.setString(9, mDto.getHobby());
			//성공하면 1, 실패하면 0
			resultNum = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return resultNum;
	}
	
	
	//로그인 id,pw체크
	public MDto loginSelect(String userId, String userPw) {
		
		try {
			conn = getConnection();	//Connection 메소드 호출
			String sql="select * from member2 where id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs = pstmt.executeQuery();	//id와 pw가 맞으면 rs 1개 갖고 있음
			
			if(rs.next()) {
				mDto.setId(rs.getString("id"));
				mDto.setPw(rs.getString("pw"));
				mDto.setName(rs.getString("name"));
				mDto.setNickname(rs.getString("nickname"));
				mDto.setGender(rs.getString("gender"));
				mDto.setTel(rs.getString("tel"));
				mDto.setAddress1(rs.getString("address1"));
				mDto.setAddress2(rs.getString("address2"));
				mDto.setHobby(rs.getString("hobby"));
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return mDto;
	} //loginSelect
	
}
