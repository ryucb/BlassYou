package com.petmily.board.service;

import static com.petmily.common.JDBCTemplate.close;
import static com.petmily.common.JDBCTemplate.commit;
import static com.petmily.common.JDBCTemplate.getConnection;
import static com.petmily.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.petmily.board.model.dao.BoardDao;
import com.petmily.board.model.vo.PetSitterBoard;
import com.petmily.board.model.vo.PlusOptionService;
import com.petmily.pet.model.vo.PetInfo;
import com.petmily.petsitter.model.vo.PetSitter;
import com.petmily.petsitter.model.vo.PetSitterCertificate;
import com.petmily.review.model.vo.ReviewPetSitter;
import com.petmily.user.model.vo.User;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	public PetSitterBoard getPetSitterBoardT(int boardCode) {
		Connection conn = getConnection();
		PetSitterBoard sitterBoardT = dao.getPetSitterBoardT(conn, boardCode);
		close(conn);
		return sitterBoardT;
	}
	
	public String getSitterId(int boardCode) {
		Connection conn = getConnection();
		String sitterId = dao.getSitterId(conn, boardCode);
		close(conn);
		return sitterId;
	}
	
	public boolean bookmark(String userId, String sitterId) {
		Connection conn = getConnection();
		boolean bookmark = dao.bookmark(conn, userId, sitterId);
		close(conn);
		return bookmark;				
	}
	
	public boolean getCertificateFlag(String sitterId) {
		Connection conn = getConnection();
		boolean certificateFlag = dao.getCertificateFlag(conn, sitterId);
		close(conn);
		return certificateFlag;		
	}
	
	public List<PetSitterCertificate> getCertificate(String sitterId) {
		Connection conn = getConnection();
		List<PetSitterCertificate> certificates = dao.getCertificate(conn, sitterId);
		close(conn);
		return certificates;
	}
	
	public List<ReviewPetSitter> getReviews(String sitterId){
		Connection conn = getConnection();
		List<ReviewPetSitter> reviews = dao.getReviews(conn, sitterId);
		close(conn);
		return reviews;
	}
	
	public void bookmarkDelete(String userId, String sitterId) {
		Connection conn = getConnection();
		boolean result = dao.bookmarkDelete(conn, userId, sitterId);
		
		if(result) {
			commit(conn);
		}
		if(result) {
			rollback(conn);
		}
		
		close(conn);
		
	}
	
	public void bookmarkAdd(String userId, String sitterId) {
		Connection conn = getConnection();
		boolean result = dao.bookmarkAdd(conn, userId, sitterId);
		
		if(result) {
			commit(conn);
		}
		if(result) {
			rollback(conn);
		}
		
		close(conn);
	}
	
	public PetSitter getPetSitterT(String sitterId) {
		Connection conn = getConnection();
		PetSitter sitterT = dao.getPetSitterT(conn, sitterId);
		close(conn);
		return sitterT;
	}
	
	public User getUserInfoT(String sitterId) {
		Connection conn = getConnection();
		User userInfoT = dao.getUserInfoT(conn, sitterId);
		close(conn);
		return userInfoT;
	}
	
//	public String getSitterName(String sitterId) {
//		Connection conn = getConnection();
//		String sitterName = dao.getSitterName(conn, sitterId);
//		close(conn);
//		return sitterName;
//	}

	public List<String> getDefaultService(int boardCode){
		Connection conn = getConnection();
		List<String> defaultServiceList = dao.getDefaultService(conn, boardCode);
		close(conn);
		return defaultServiceList;
	}
	
	public List<PlusOptionService> getPOService(int boardCode) {
		Connection conn = getConnection();
		List<PlusOptionService> pOService = dao.getPOService(conn, boardCode);
		close(conn);
		return pOService;
	}
	
	public List<String> getBoardImg(int boardCode){
		Connection conn = getConnection();
		List<String> boardImgs = dao.getBoardImg(conn, boardCode);
		close(conn);
		return boardImgs;
	}
	
	public List<PetInfo> getPetInfoT(String userId){
		Connection conn = getConnection();
		List<PetInfo> petsT = dao.getPetInfoT(conn, userId);
		close(conn);
		return petsT;
	}
	

}





















