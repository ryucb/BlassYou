package com.petmily.reservation.model.dao;

import static com.petmily.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.petmily.board.model.dao.BoardDao2;
import com.petmily.reservation.model.vo.PetReservation;
public class ReservationDao {
	
	private Properties prop = new Properties();

	public ReservationDao() {
		
		try {
			String path = BoardDao2.class.getResource("/sql/rev/rev-query.properties").getPath();
			prop.load(new FileReader(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<PetReservation> requestRev(Connection conn,String id) {
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		PetReservation pr = null;
		List<PetReservation> list = new ArrayList();
		String sql = prop.getProperty("requestRev");
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				pr = new PetReservation();
				
				pr.setReservationCode(rs.getInt("RCODE"));
				pr.setCheckIn(rs.getString("CIN"));
				pr.setCheckOut(rs.getString("COUT"));
				pr.setResType(rs.getString("RTYPE"));
				pr.setPrice(rs.getInt("PRICE"));
				pr.setBoardNo(rs.getInt("PCODE"));
				list.add(pr);
			}
			System.out.println("dao"+list);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	
	public PetReservation requestRevs(Connection conn,String id,PetReservation p) {
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		
		String sql = prop.getProperty("requestRevs");
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1,p.getBoardNo());
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				p.setBoardNo(rs.getInt("BCODE"));
				p.setBoardTitle(rs.getString("BTITLE"));
				p.setSitterName(rs.getString("UNAME"));
				
			}
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return p;
	}
	
	public int requestCancel(Connection conn,int no) {
		PreparedStatement pstmt = null;
		System.out.println("dao"+no);
		int result =0 ;
		String sql = prop.getProperty("requestCancel");
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			result=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	
	

}
