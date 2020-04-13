package com.petmily.userReview.service;

import static com.petmily.common.JDBCTemplate.getConnection;
import static com.petmily.common.JDBCTemplate.close;
import java.sql.Connection;
import java.util.List;

import com.petmily.userReview.model.dao.UserReviewDao;
import com.petmily.userReview.model.vo.UserReview;

public class UserReviewService {
	
	private UserReviewDao dao=new UserReviewDao();
	
	public List<UserReview> selectUserReviewList(String userId){
		
		Connection conn=getConnection();
		
		List<UserReview> list=dao.selectUserReviewList(conn,userId);
		
		close(conn);
		//System.out.println(list);
		return list;
		
	}

}
