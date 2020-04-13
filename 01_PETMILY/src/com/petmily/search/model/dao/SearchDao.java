package com.petmily.search.model.dao;

import static com.petmily.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.petmily.search.model.vo.PetsitterSearch;

public class SearchDao {
	
	private Properties prop=new Properties();
	
	
	public SearchDao() {
		
		try {
			String path=SearchDao.class.getResource("/sql/petsitterSearch/search-query.properties").getPath();
			prop.load(new FileReader(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public List<PetsitterSearch> selectSearch(Connection conn,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("selectSearch");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, (cPage-1)*numPerPage+1);
			pstmt.setInt(2, cPage*numPerPage);
			
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
		
	}
	
	public int selectSearchCount(Connection conn) {
		
		Statement stmt=null;
		ResultSet rs=null;
		int count=0;
		
		String sql=prop.getProperty("selectSearchCount");
		
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			rs.next();
			count=rs.getInt("cnt");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
		}
		
		return count;
	}
	
	
	public List<PetsitterSearch> searchPetsitter(Connection conn,String key,int cPage,int numPerPage) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		// select * from member where userid => where 'userid'
		// select * from member where username
		// select * from member where gender
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("searchPetsitter");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+key+"%");
			pstmt.setInt(2,  (cPage-1)*numPerPage+1);
			pstmt.setInt(3,  cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
			
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	public int selectCount(Connection conn,String key) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int result=0;
		String sql=prop.getProperty("selectCountSearch");
		
		System.out.println(sql);
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			
			rs=pstmt.executeQuery();
			
			rs.next();
			result=rs.getInt(1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return result;
		
		
	}
	
	public List<PetsitterSearch> searchTitle(Connection conn,String title,int cPage,int numPerPage) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		// select * from member where userid => where 'userid'
		// select * from member where username
		// select * from member where gender
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("searchTitle");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+title+"%");
			pstmt.setInt(2,  (cPage-1)*numPerPage+1);
			pstmt.setInt(3,  cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
			
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	
	public void searchImage(Connection conn, PetsitterSearch ps) {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ps.setImgFile(new ArrayList());
		String sql=prop.getProperty("searchImage");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, ps.getBoardCode());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ps.getImgFile().add(rs.getString(1));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
	}
	
	
	public void countComment(Connection conn, PetsitterSearch ps) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql=prop.getProperty("countComment");
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ps.getPetsitterId());
			rs=pstmt.executeQuery();
			
			rs.next();
			ps.setReviewCount(rs.getInt(1));
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}
			
	}
	
	public List<PetsitterSearch> filterTakingDrug(Connection conn,String takingDrug,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterTakingDrug");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,takingDrug);
			pstmt.setInt(2,(cPage-1)*numPerPage+1);
			pstmt.setInt(3,cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	public List<PetsitterSearch> filterPickup(Connection conn,String key,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterPickup");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,key);
			pstmt.setInt(2,(cPage-1)*numPerPage+1);
			pstmt.setInt(3,cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	
	public List<PetsitterSearch> filterIndoorPlay(Connection conn,String key,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterIndoorPlay");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,key);
			pstmt.setInt(2,(cPage-1)*numPerPage+1);
			pstmt.setInt(3,cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	
	public List<PetsitterSearch> filterOldDogCare(Connection conn,String key,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterOldDogCare");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,key);
			pstmt.setInt(2,(cPage-1)*numPerPage+1);
			pstmt.setInt(3,cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	
	public List<PetsitterSearch> filterProPetsitter(Connection conn,String key,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterProPetsitter");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,key);
			pstmt.setInt(2,(cPage-1)*numPerPage+1);
			pstmt.setInt(3,cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
	}
	
	public List<PetsitterSearch> selectFilterpopularity(Connection conn,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterpopularity");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, (cPage-1)*numPerPage+1);
			pstmt.setInt(2, cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
		
	}
	
	
	public List<PetsitterSearch> selectFilterNewestPost(Connection conn,int cPage,int numPerPage){
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<PetsitterSearch> list=new ArrayList<PetsitterSearch>();
		
		String sql=prop.getProperty("filterNewestPost");
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, (cPage-1)*numPerPage+1);
			pstmt.setInt(2, cPage*numPerPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				PetsitterSearch ps=new PetsitterSearch();
				
				ps.setProPetsitter(rs.getString("pet_sitter_type"));
				ps.setBoardCode(rs.getInt("board_code"));
				ps.setPetsitterId(rs.getString("user_id"));
				ps.setBoardTitle(rs.getString("board_title"));
				ps.setBoardInfo(rs.getString("board_info"));
				ps.setOneDayCareSprice(rs.getInt("one_day_care_s_price"));
				ps.setOneDayCareMprice(rs.getInt("one_day_care_m_price"));
				ps.setOneDayCareBprice(rs.getInt("one_day_care_b_price"));
				ps.setBoardAddress(rs.getString("board_address"));
				ps.setBoardAddressComment(rs.getString("board_address_comment"));
				ps.setBoardBlind(rs.getString("board_blind"));
				ps.setPetsitterId(rs.getString("pet_sitter_id"));
				
				list.add(ps);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}return list;
		
		
	}
	
	public int reviewCount(Connection conn) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int result=0;
		
		String sql=prop.getProperty("reviewCount");
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			
			rs.next();
			result=rs.getInt(1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}
		return result;
	}
	
	public int starAvg(Connection conn) {
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int result=0;
		
		String sql=prop.getProperty("starAvg");
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			
			rs.next();
			result=rs.getInt(1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			close(rs);
			close(pstmt);
		}
		return result;
	}
	
	public int insertBookmark(Connection conn,String userId,String petsitterId) {
		
		PreparedStatement pstmt=null;
		
		int result=0;
		
		String sql=prop.getProperty("insertBookmark");
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, petsitterId);
			
			result=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
		
	}
	
}
