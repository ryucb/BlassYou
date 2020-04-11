package com.petmily.board.service;

import static com.petmily.board.common.JDBCTemplate.close;
import static com.petmily.board.common.JDBCTemplate.commit;
import static com.petmily.board.common.JDBCTemplate.getConnection;
import static com.petmily.board.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.petmily.board.model.dao.BoardDao;
import com.petmily.board.model.vo.PetSitterBoard;

public class BoardService {
   private BoardDao dao = new BoardDao();
   
   public int boardInsert(PetSitterBoard  pb) {
      //게시글 등록
      Connection conn = getConnection();
      
     
      int set = dao.setting(conn,pb.getUserId());
      
    
      
 
	     int result = dao.boardInsert(conn, pb);
	     int boardNo = dao.boardNo(conn,pb.getUserId());
	     System.out.println("service넘버:"+boardNo);
	      pb.setBoardNo(boardNo);
	      if(result>0) {
	         for(String img : pb.getBoardImages()) {
	            result = dao.boardImg(conn, pb,img);
	         }
	         if(result>0) {
	            for(String plus : pb.getPlus()) {
	               result = dao.plusOptionInsert(conn,plus,pb,pb.getBoardNo());
	            }
	         }else {
	            rollback(conn);
	         }
	         if(result>0) {
	            for(String defaults : pb.getServiceTypes()) {
	               result = dao.defaultOption(conn,defaults,pb,pb.getBoardNo());
	            }         
	         }else {
	            rollback(conn);
	         }
	         }else { 
	            commit(conn);
	      }
        close(conn);
      return result;
   }
   
   public PetSitterBoard boardDetail(String userId) {
      Connection conn = getConnection();
      PetSitterBoard pb = new PetSitterBoard();
      pb = dao.boardDetail(conn,userId);
      pb = dao.imgDetail(conn,pb);
      pb = dao.plusOptionDetail(conn,pb);
      pb= dao.defaultOptionDetail(conn,pb);
      System.out.println("dao: " +pb.getBoardImages());
      System.out.println("dao2: " +pb.getSmallPrice1());
      System.out.println("pb:" + pb);
      close(conn);
      
      return pb;
   }
   public PetSitterBoard boardUpdate(String userId) {
	   Connection conn = getConnection();
	   PetSitterBoard pb = new PetSitterBoard();
	   	  pb = dao.boardUpdate(conn,userId);
	      pb = dao.imgUpdate(conn,pb);
	      pb = dao.plusOptionUpdate(conn,pb);
	      pb= dao.defaultOptionUpdate(conn,pb);
	      close(conn);
	      return pb;
   }
   
   


//   
//   public PetSitterBoard imgUpdate(int boardNo) { Connection conn =
//    getConnection(); PetSitterBoard pb = dao.boardUpdate(conn, boardNo); }
//    
   
   
   
   
   
   
}