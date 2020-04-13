package com.petmily.search.service;

import static com.petmily.common.JDBCTemplate.close;
import static com.petmily.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.petmily.reviewPetsitter.model.vo.ReviewPetsitter;
import com.petmily.search.model.dao.SearchDao;
import com.petmily.search.model.vo.PetsitterSearch;

public class SearchService {

	
	private SearchDao dao=new SearchDao();
	
	
	public List<PetsitterSearch> selectSearch(int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.selectSearch(conn,cPage,numPerPage);
		
		imageCommentSelect(conn, list);

		close(conn);
		
		return list;
	}
	
	
	public int selectSearchCount() {
		
		Connection conn=getConnection();
		int result=dao.selectSearchCount(conn);
		
		close(conn);
		
		return result;
		
	}
	
	public List<PetsitterSearch> searchPetsitter(String key,int cPage,int numPerPage) {
		
		Connection conn=getConnection();
		List<PetsitterSearch> list=dao.searchPetsitter(conn,key,cPage,numPerPage);
		imageCommentSelect(conn, list);
		close(conn);
		
		return list;
	}
	
	public int selectCount(String key) {
		Connection conn=getConnection();
		int count=dao.selectCount(conn,key);
		close(conn);
		
		return count;
		
	}
	
	public List<PetsitterSearch> searchTitle(String title,int cPage,int numPerPage) {
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.searchTitle(conn,title,cPage,numPerPage);
		imageCommentSelect(conn, list);
		close(conn);
		
		return list;
	}
	
	// 약물 복용 버튼
	public List<PetsitterSearch> filterTakingDrug(String takingDrug,int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.filterTakingDrug(conn,takingDrug,cPage,numPerPage);
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
		
	}
	
	// 집 앞 픽업 버튼
	public List<PetsitterSearch> filterPickUp(String key,int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.filterPickup(conn,key,cPage,numPerPage);
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
		
	}
	
	public List<PetsitterSearch> filterIndoorPlay(String key,int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.filterIndoorPlay(conn,key,cPage,numPerPage);
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
		
	}
	public List<PetsitterSearch> filterOldDogCare(String key,int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.filterOldDogCare(conn,key,cPage,numPerPage);
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
		
	}
	public List<PetsitterSearch> filterProPetsitter(String key,int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.filterProPetsitter(conn,key,cPage,numPerPage);
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
		
	}
	
	// 이미지와 댓글 수 메소드
	private void imageCommentSelect(Connection conn, List<PetsitterSearch> list) {
		
		if(list.size()>0) {
			
			for(PetsitterSearch ps : list) {
				
				dao.searchImage(conn, ps);
				dao.countComment(conn, ps);
				
				System.out.println(ps);
			}
		}
	}
	
		
	public List<PetsitterSearch> selectFilterpopularity(int cPage,int numPerPage){
			
			Connection conn=getConnection();
			
			List<PetsitterSearch> list=dao.selectFilterpopularity(conn,cPage,numPerPage);
			
			imageCommentSelect(conn, list);

			close(conn);
			
			return list;
		}
	
	
	
	public List<PetsitterSearch> selectFilterNewestPost(int cPage,int numPerPage){
		
		Connection conn=getConnection();
		
		List<PetsitterSearch> list=dao.selectFilterNewestPost(conn,cPage,numPerPage);
		
		imageCommentSelect(conn, list);
		
		close(conn);
		
		return list;
	}
	
	public int reviewCount() {
		
		Connection conn=getConnection();
		
		int reviewCount=dao.reviewCount(conn);
		
		close(conn);
		
		return reviewCount;
	}
	
	public int starAvg() {
		
		Connection conn=getConnection();
		
		int starAvg=dao.starAvg(conn);
		
		close(conn);
		
		return starAvg;
	}
	
	public int insertBookmark(String userId,String petsitterId) {
		
		Connection conn=getConnection();
		
		int result=dao.insertBookmark(conn,userId,petsitterId);
		
		close(conn);
		
		return result;
	}
	
	
	
}
