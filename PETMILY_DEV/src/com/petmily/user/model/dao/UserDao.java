package com.petmily.user.model.dao;

import static com.petmily.common.JDBCTemplete_User.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.petmily.user.model.vo.User;
import com.petmily.user.model.vo.UserBookMarkBoard;


public class UserDao {
	private Properties prop = new Properties();
	
//	기본 생성자에 파일 경로를 선언한다.
	public UserDao() {
		try {
			String path = UserDao.class.getResource("/sql/user/user-query.properties").getPath();
			prop.load(new FileReader(path));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}// UserDao() 기본생성자
	
	
//	로그인 로직 구현
//	클라이언트가 입력한 데이터가 DB에 저장되어 있는지 확인해야 한다.
	public User userSelect(Connection conn, String user_id, String password) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		String sql = prop.getProperty("userSelect");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setUserId(rs.getString("USER_ID")); // 유저 아이디
				user.setPassword(rs.getString("PASSWORD")); // 유저 패스워드
				user.setUserName(rs.getString("USER_NAME")); // 유저 이름
				user.setUserBirth(rs.getString("USER_BIRTH_DAY")); // 유저 생년월일
				user.setPhone(rs.getString("PHONE")); // 유저 휴대번호
				user.setZipCode(rs.getString("ZIP_CODE")); // 유저 우편번호
				user.setAddress(rs.getString("ADDRESS")); // 유저 주소
				user.setDetailAddress(rs.getString("DETAILED_ADDRESS")); // 유저 상세주소
				user.setEmail(rs.getString("EMAIL")); // 유저 이메일
				user.setGender(rs.getString("GENDER")); // 유저 성별
				user.setStatus(rs.getString("STATUS")); // 유저 회원탈퇴여부
				user.setUserType(rs.getString("USER_TYPE")); // 유저 타입(일반, 펫시터, 관리자)
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		}
		return user;
	}
	
	
	
	
//	아이디 중복확인 로직
	public boolean userIdDuplicate(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String sql = prop.getProperty("duplicate");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				flag = true; // true는 이용이 불가능 ( 아이디가 DB에 있으니, 사용할 수 없다! )
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		} 
		return flag;
	}
	
	
//	휴대번호 중복확인 로직
	public boolean phoneDuplicate(Connection conn, String phone) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String sql = prop.getProperty("duplicatePhone");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				flag = true; // true는 이용이 불가능 ( 아이디가 DB에 있으니, 사용할 수 없다! )
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		} 
		return flag;
	}
	
	
//	이메일 중복확인 로직
	public boolean emailDuplicate(Connection conn, String email) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String sql = prop.getProperty("duplicateEmail");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				flag = true; // true는 이용이 불가능 ( 아이디가 DB에 있으니, 사용할 수 없다! )
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		} 
		return flag;
	}
	
	
//	회원가입 로직
	public int userJoin(Connection conn, User u) {
		PreparedStatement pstmt=null;
		int result = 0;
		String sql = prop.getProperty("userJoin");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, u.getUserId()); // 유저 아이디
			pstmt.setString(2, u.getPassword()); // 유저 비밀번호
			pstmt.setString(3, u.getUserName()); // 유저 이름
			pstmt.setString(4, u.getUserBirth()); // 유저 생년월일
			pstmt.setString(5, u.getPhone()); // 유저 휴대폰 번호
			pstmt.setString(6, u.getZipCode()); // 유저 우편번호
			pstmt.setString(7, u.getAddress()); // 유저 주소
			pstmt.setString(8, u.getDetailAddress()); // 유저 상세주소
			pstmt.setString(9, u.getEmail()); // 유저 이메일
			pstmt.setString(10, u.getGender()); // 유저 성별
			result=pstmt.executeUpdate();			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

//	-----------------------------------------------------------
	
//	임의로 만든 내 정보보기를 눌렀을 때, 먼저 뿌려져야 하는 정보를 가져오는 로직
	public User userSelect(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User u = null;
		String sql = prop.getProperty("duplicate"); // id를 찾는 같은 SQL문
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				u = new User();
				u.setUserId(rs.getString("USER_ID"));
				u.setUserName(rs.getString("USER_NAME"));
				u.setUserBirth(rs.getString("USER_BIRTH_DAY"));
				u.setPhone(rs.getString("PHONE"));
				u.setZipCode(rs.getString("ZIP_CODE"));
				u.setAddress(rs.getString("ADDRESS"));
				u.setDetailAddress(rs.getString("DETAILED_ADDRESS"));
				u.setEmail(rs.getString("EMAIL"));
				u.setGender(rs.getString("GENDER"));
				u.setUserType(rs.getString("USER_TYPE"));
				u.setBellRes(rs.getString("BELL_RES"));
				u.setBellChatt(rs.getString("BELL_CHATT"));
				u.setEnrollDate(rs.getDate("ENROLL_DATE"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		}
		return u;
	}
	
	
//	회원정보 수정 로직
	public int userUpdate(Connection conn, String id, String newPw, String email, String phone, String postNum, String address, String detailAddress) {
		PreparedStatement pstmt = null;
		int result= 0;
		String sql = prop.getProperty("userUpdate");
		try {
//			바꿀 정보 : 새 비밀번호, 이메일, 휴대번호, 우편번호, 도로명주소, 상세주소
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, email); 
			pstmt.setString(3, phone); 
			pstmt.setString(4, postNum);
			pstmt.setString(5, address);
			pstmt.setString(6, detailAddress);
			pstmt.setString(7, id); // SQL 조건문
			result = pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(pstmt);
		}
		return result;
	}
	
//	회원탈퇴 로직
	public int userDelete(Connection conn, String id) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = prop.getProperty("userDelete");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // SQL 조건
			result = pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(pstmt);
		}
		return result;
	}
	
//	북마크 로직 (테이블 내용을 가져온다 - UserBookMarkBoard vo 객체)
	public List<UserBookMarkBoard> userBookMarkBoard(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserBookMarkBoard> list = new ArrayList();
		String sql = prop.getProperty("userBookMarkBoard");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserBookMarkBoard ubm = new UserBookMarkBoard();
				ubm.setBoardCode(rs.getInt("BOARD_CODE"));
				ubm.setUserId(rs.getString("USER_ID"));
				ubm.setBoardTitle(rs.getString("BOARD_TITLE"));
				ubm.setBoardInfo(rs.getString("BOARD_INFO"));
				ubm.setOnedaySprice(rs.getInt("ONE_DAY_CARE_S_PRICE"));
				ubm.setOnedayMprice(rs.getInt("ONE_DAY_CARE_M_PRICE"));
				ubm.setOnedayBprice(rs.getInt("ONE_DAY_CARE_B_PRICE"));
				ubm.setBoardAddress(rs.getString("BOARD_ADDRESS"));
				ubm.setBoardAddComment(rs.getString("BOARD_ADDRESS_COMMENT"));
				ubm.setBoardBlind(rs.getString("BOARD_BLIND"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
}
