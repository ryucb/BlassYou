package com.petmily.user.model.service;

import static com.petmily.common.JDBCTemplete_User.close;
import static com.petmily.common.JDBCTemplete_User.commit;
import static com.petmily.common.JDBCTemplete_User.rollback;

import java.sql.Connection;
import java.util.List;

import com.petmily.common.JDBCTemplete_User;
import com.petmily.user.model.dao.UserDao;
import com.petmily.user.model.vo.User;
import com.petmily.user.model.vo.UserBookMark;
import com.petmily.user.model.vo.UserBookMarkBoard;

public class UserService {
//	유저와 연관있는 서비스 영역
	
	private UserDao dao = new UserDao();
	
//	로그인 처리 기능
	public User userSelect(String user_id, String password) {
		Connection conn = JDBCTemplete_User.getConnection();
		User user = dao.userSelect(conn, user_id, password);
		close(conn);
		return user;
	}
	
//	회원가입 중, [아이디 중복확인] 체크하기
	public boolean userIdDuplicate(String userId) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.userIdDuplicate(conn, userId);
		close(conn);
		return flag;
	}
	
//	회원가입 중, [휴대번호 중복확인] 체크하기
	public boolean phoneDuplicate(String phone) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.phoneDuplicate(conn, phone);
		close(conn);
		return flag;
	}
	
//	회원가입 중, [이메일 중복확인] 체크하기
	public boolean emailDuplicate(String email) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.emailDuplicate(conn, email);
		close(conn);
		return flag;
	}
	
//	회원가입 로직
	public int userJoin(User u) {
		Connection conn = JDBCTemplete_User.getConnection();
		int result = dao.userJoin(conn, u);
		close(conn);
		return result;
	}
	
	
	
//	------------------------------------------------
	
//	내정보보기 화면전환(마이페이지) 로직
	public User userSelect(String id) {
		Connection conn = JDBCTemplete_User.getConnection();
		User u = dao.userSelect(conn, id);
		close(conn);
		return u;
	}
	
//	회원 정보 수정 로직
	public int userUpdate(String id, String newPw, String email, String phone, String postNum, String address, String detailAddress) {
		Connection conn = JDBCTemplete_User.getConnection();
		int result = dao.userUpdate(conn, id, newPw, email, phone, postNum, address, detailAddress);
		
		if(result>0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	
//	회원탈퇴 로직
	public int userDelete(String id) {
		Connection conn = JDBCTemplete_User.getConnection();
		int result = dao.userDelete(conn, id);
		
		if(result > 0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	
//	북마크 로직
	public List<UserBookMarkBoard> userBookMarkList(String id) {
		Connection conn = JDBCTemplete_User.getConnection();
		List<UserBookMarkBoard> list = dao.userBookMarkBoard(conn, id);
		close(conn);
		return list;
	}
	
	
	
	
	
}
