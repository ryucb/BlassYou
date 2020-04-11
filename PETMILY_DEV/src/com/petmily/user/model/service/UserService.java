package com.petmily.user.model.service;

import static com.petmily.common.JDBCTemplate.commit;
import static com.petmily.common.JDBCTemplate.getConnection;
import static com.petmily.common.JDBCTemplate.rollback;
import static com.petmily.common.JDBCTemplete_User.close;
import static com.petmily.common.JDBCTemplete_User.commit;
import static com.petmily.common.JDBCTemplete_User.rollback;

import java.sql.Connection;
import java.util.List;

import com.petmily.common.JDBCTemplete_User;
import com.petmily.user.model.dao.UserDao;
import com.petmily.user.model.vo.PetSitter2;
import com.petmily.user.model.vo.User;
import com.petmily.user.model.vo.UserBookMark;
import com.petmily.user.model.vo.UserBookMarkBoard;

public class UserService {
//	�쑀���� �뿰愿��엳�뒗 �꽌鍮꾩뒪 �쁺�뿭
	
	private UserDao dao = new UserDao();
	
	public int insertSitter(PetSitter2 pss) {
		Connection conn=getConnection();
		int result=dao.insertUserTable(conn,pss);
	    if(result>0) {
	    	result=dao.insertUserPetSitter(conn, pss);
	    	if(result>0) {
	    		result=dao.insertPetSitterCertificate(conn, pss);
	    		if(result>0) {
	    			result=dao.insertResidenceType(conn, pss);
	    			if(result>0) {
	    				commit (conn);
	    			}else {
		    			rollback(conn);
		    		}
	    		}else {
	    			rollback(conn);
	    		}
	    	}else{
	    		rollback(conn);
	    	}
	    	}else{
	    		rollback(conn);
	    	}
			return result;
	    }
	
	
//	濡쒓렇�씤 泥섎━ 湲곕뒫
	public User userSelect(String user_id, String password) {
		Connection conn = JDBCTemplete_User.getConnection();
		User user = dao.userSelect(conn, user_id, password);
		close(conn);
		return user;
	}
	
//	�쉶�썝媛��엯 以�, [�븘�씠�뵒 以묐났�솗�씤] 泥댄겕�븯湲�
	public boolean userIdDuplicate(String userId) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.userIdDuplicate(conn, userId);
		close(conn);
		return flag;
	}
	
//	�쉶�썝媛��엯 以�, [�쑕��踰덊샇 以묐났�솗�씤] 泥댄겕�븯湲�
	public boolean phoneDuplicate(String phone) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.phoneDuplicate(conn, phone);
		close(conn);
		return flag;
	}
	
//	�쉶�썝媛��엯 以�, [�씠硫붿씪 以묐났�솗�씤] 泥댄겕�븯湲�
	public boolean emailDuplicate(String email) {
		Connection conn = JDBCTemplete_User.getConnection();
		boolean flag = dao.emailDuplicate(conn, email);
		close(conn);
		return flag;
	}
	
//	�쉶�썝媛��엯 濡쒖쭅
	public int userJoin(User u) {
		Connection conn = JDBCTemplete_User.getConnection();
		int result = dao.userJoin(conn, u);
		close(conn);
		return result;
	}
	
	
	
//	------------------------------------------------
	
//	�궡�젙蹂대낫湲� �솕硫댁쟾�솚(留덉씠�럹�씠吏�) 濡쒖쭅
	public User userSelect(String id) {
		Connection conn = JDBCTemplete_User.getConnection();
		User u = dao.userSelect(conn, id);
		close(conn);
		return u;
	}
	
//	�쉶�썝 �젙蹂� �닔�젙 濡쒖쭅
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
	
	
//	�쉶�썝�깉�눜 濡쒖쭅
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
	
	
//	遺곷쭏�겕 濡쒖쭅
	public List<UserBookMarkBoard> userBookMarkList(String id) {
		Connection conn = JDBCTemplete_User.getConnection();
		List<UserBookMarkBoard> list = dao.userBookMarkBoard(conn, id);
		close(conn);
		return list;
	}
	
	
	
	
	
}
