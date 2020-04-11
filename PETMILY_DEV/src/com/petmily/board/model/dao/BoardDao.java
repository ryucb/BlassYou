package com.petmily.board.model.dao;

import static com.petmily.board.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.petmily.board.model.vo.PetSitterBoard;

import oracle.jdbc.proxy.annotation.Pre;
import sun.security.action.GetIntegerAction;

public class BoardDao {
   
   private Properties prop = new Properties();
   
   public BoardDao() {
   
   try {
      String path=BoardDao.class.getResource("/sql/board/board-query.properties").getPath();
      prop.load(new FileReader(path));
   }catch(IOException e) {
      e.printStackTrace();
   }
}
   
   public int setting(Connection conn,String userId) {
	   PreparedStatement pstmt = null;
	   int result = 0;
	   String sql = prop.getProperty("setting");
	   try {
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, userId);
		   result=pstmt.executeUpdate();
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }finally { 
		   close(pstmt);
	   }
	   return result;
   }
   public int boardNo(Connection conn,String userId) {
	   PreparedStatement pstmt = null;

	   ResultSet rs = null;
	   int result = 0;
	   String sql = prop.getProperty("boardNo");
	   try {
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, userId);
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
   public int boardInsert(Connection conn,PetSitterBoard pb) {
    
      PreparedStatement pstmt=null;
      int result = 0;
      String sql = prop.getProperty("boardInsert");
      try {
         pstmt=conn.prepareStatement(sql);
        
         pstmt.setString(1, pb.getUserId());
         pstmt.setString(2, pb.getBoardTitle());
         pstmt.setString(3, pb.getBoardInfo());
         pstmt.setInt(4,pb.getSmallPrice());
         pstmt.setInt(5,pb.getMiddlePrice());
         pstmt.setInt(6,pb.getBigPrice());
         pstmt.setString(7,pb.getBoardAddress());
         pstmt.setString(8,pb.getBoardAddressContent());
        
         result=pstmt.executeUpdate();
      
      }catch(SQLException e ) {
         e.printStackTrace();
      }finally {
         close(pstmt);
      }
      
      return result;
      
   }
   
   
   
   
public int boardImg(Connection conn,PetSitterBoard pb ,String img) {
     
      PreparedStatement pstmt = null;
      int result = 0;
      String sql = "";
      sql=prop.getProperty("boardImg");
      try {
    	  System.out.println("이미지no:"+pb.getBoardNo());
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,pb.getBoardNo());
            pstmt.setString(2, img);
            result=pstmt.executeUpdate();
         
      }catch(SQLException e ) {
         e.printStackTrace();
      }finally {
         close(pstmt);
      }
      return result;
}

public  int plusOptionInsert(Connection conn,String plus,PetSitterBoard pb,int boardNo) {
   PreparedStatement pstmt = null;
   int result = 0;
   String sql = prop.getProperty("plusOptionInsert");
   try {
      pstmt=conn.prepareStatement(sql);
      
      pstmt.setInt(1,boardNo);
      pstmt.setString(2, plus);
      pstmt.setInt(3, pb.getSmallPrice1());
      pstmt.setInt(4, pb.getMiddlePrice1());
      pstmt.setInt(5, pb.getBigPrice1());
      pstmt.setInt(6, pb.getOneWayPrice());
      pstmt.setInt(7, pb.getAllWayPrice());
      pstmt.setInt(8,pb.getSalePrice());
      result = pstmt.executeUpdate();
   }catch(SQLException e) {
      e.printStackTrace();
   }finally {
      close(pstmt);
   }
   return result;
}

public int defaultOption(Connection conn,String defaults,PetSitterBoard  pb,int boardNo) {
   PreparedStatement pstmt = null;
   int result = 0;
   String sql = prop.getProperty("defaultOptionInsert");
   try {
      pstmt=conn.prepareStatement(sql);
      pstmt.setInt(1, boardNo);
      pstmt.setString(2, defaults);
      result=pstmt.executeUpdate();
   }catch(SQLException e) {
      e.printStackTrace();
   }finally { 
      close(pstmt);
   }
   return result;
}

public PetSitterBoard boardDetail(Connection conn,String userId) {
   System.out.println(userId);
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   PetSitterBoard pb = null;
   String sql = prop.getProperty("boardDetail");
   
   
   try { 
      pstmt=conn.prepareStatement(sql);
      pstmt.setString(1, userId);
      rs = pstmt.executeQuery();
      
     while(rs.next()) {
        pb = new PetSitterBoard();
         pb.setBoardNo(rs.getInt("BOARD_CODE"));
         pb.setUserId(rs.getString("USER_ID"));
          pb.setBoardTitle(rs.getString("BOARD_TITLE"));
          pb.setBoardInfo(rs.getString("BOARD_INFO"));
          pb.setSmallPrice(rs.getInt("ONE_DAY_CARE_S_PRICE"));
          pb.setMiddlePrice(rs.getInt("ONE_DAY_CARE_M_PRICE"));
          pb.setBigPrice(rs.getInt("ONE_DAY_CARE_B_PRICE"));
          pb.setBoardAddress(rs.getString("BOARD_ADDRESS"));
          pb.setBoardAddressContent(rs.getString("BOARD_ADDRESS_COMMENT"));
          pb.setBoardBlind(rs.getString("BOARD_BLIND"));
        
     }
   }catch(SQLException e) {
      e.printStackTrace();
   }finally {
      close(rs);
      close(pstmt);
   }
   return pb;
}

public PetSitterBoard imgDetail(Connection conn, PetSitterBoard pb) {
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = prop.getProperty("imgDetail");
      List<String> list = new ArrayList<String>();
      
      try { 
         pstmt=conn.prepareStatement(sql);
         pstmt.setInt(1,pb.getBoardNo());
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
           
            pb.setBoardNo(rs.getInt("BOARD_CODE"));
            list.add(rs.getString("IMG_FILENAME"));
            System.out.println(list);
         }
         pb.setBoardImages(list);
         
         System.out.println("list:"+list);
         System.out.println("이미지:"+pb.getBoardImages());
         System.out.println("이미지:"+(pb.getBoardImages()) instanceof String);
         
            
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         close(rs);
         close(pstmt);
      }
      return pb;
   }

public PetSitterBoard defaultOptionDetail(Connection conn, PetSitterBoard pb) {
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
    
      String sql = prop.getProperty("defaultOptionDetail");
      List<String> list = new ArrayList<String>();
      
      try { 
         pstmt=conn.prepareStatement(sql);
         pstmt.setInt(1,pb.getBoardNo());
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
            
            pb.setBoardNo(rs.getInt("BOARD_CODE"));
            list.add(rs.getString("DEFAULT_SERVICE_VALUES"));
            
         }
         pb.setServiceTypes(list);
         System.out.println("list2:"+list);
            
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         close(rs);
         close(pstmt);
      }
      return pb;
   }

public PetSitterBoard plusOptionDetail(Connection conn, PetSitterBoard pb) {
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = prop.getProperty("plusOptionDetail");
      List<String> list = new ArrayList<String>();
      
      try { 
         pstmt=conn.prepareStatement(sql);
         pstmt.setInt(1,pb.getBoardNo());
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
            
            
            pb.setBoardNo(rs.getInt("BOARD_CODE"));
            list.add(rs.getString("PLUS_SERVICE_VALUES"));
            pb.setSmallPrice1(rs.getInt("PLUS_SERVICE_SMALL_PRICE"));
            pb.setMiddlePrice1(rs.getInt("PLUS_SERVICE_MEDIUM_PRICE"));
            pb.setBigPrice1(rs.getInt("PLUS_SERVICE_BIG_PRICE"));
            pb.setOneWayPrice(rs.getInt("PLUS_SERVICE_ONE_WAY_PRICE"));
            pb.setAllWayPrice(rs.getInt("PLUS_SERVCIE_ROUND_TRIP_PRICE"));
            pb.setSalePrice(rs.getInt("PLUS_SERVICE_SAIL_PRICE"));
           
            
         }
         pb.setPlus(list);
         System.out.println("list3:"+list);
            
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         close(rs);
         close(pstmt);
      }
      return pb;
   }

public PetSitterBoard boardUpdate(Connection conn,String userId) {
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	PetSitterBoard pb = null;
	String sql = prop.getProperty("boardUpdate");
	
	try { 
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
				  pb = new PetSitterBoard();
				  pb.setBoardNo(rs.getInt("BOARD_CODE"));
				  pb.setUserId(rs.getString("USER_ID"));
				  pb.setBoardTitle(rs.getString("BOARD_TITLE"));
				  pb.setBoardInfo(rs.getString("BOARD_INFO"));
				  pb.setSmallPrice(rs.getInt("ONE_DAY_CARE_S_PRICE"));
		          pb.setMiddlePrice(rs.getInt("ONE_DAY_CARE_M_PRICE"));
		          pb.setBigPrice(rs.getInt("ONE_DAY_CARE_B_PRICE"));
		          pb.setBoardAddress(rs.getString("BOARD_ADDRESS"));
		          pb.setBoardAddressContent(rs.getString("BOARD_ADDRESS_COMMENT"));
		          pb.setBoardBlind(rs.getString("BOARD_BLIND"));
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally { 
		close(rs);
		close(pstmt);
	}
	return pb;
}

public PetSitterBoard imgUpdate(Connection conn,PetSitterBoard pb) {
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<String> list = new ArrayList<String>();
	String sql = prop.getProperty("");
	
	try {
		pstmt=conn.prepareStatement(sql);
	    pstmt.setInt(1,pb.getBoardNo());
		rs=pstmt.executeQuery();
		 while(rs.next()) {
	           
	            pb.setBoardNo(rs.getInt("BOARD_CODE"));
	            list.add(rs.getString("IMG_FILENAME"));
	            System.out.println("이미지업뎃:" +list);
	         }
	         pb.setBoardImages(list);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(rs);
		close(pstmt);
	}
	return pb;
}

public PetSitterBoard plusOptionUpdate(Connection conn, PetSitterBoard pb) {
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String sql = prop.getProperty("plusOptionDetail");
    List<String> list = new ArrayList<String>();
    
    try { 
       pstmt=conn.prepareStatement(sql);
       pstmt.setInt(1,pb.getBoardNo());
       rs = pstmt.executeQuery();
       
       while(rs.next()) {
          
          
          pb.setBoardNo(rs.getInt("BOARD_CODE"));
          list.add(rs.getString("PLUS_SERVICE_VALUES"));
          pb.setSmallPrice1(rs.getInt("PLUS_SERVICE_SMALL_PRICE"));
          pb.setMiddlePrice1(rs.getInt("PLUS_SERVICE_MEDIUM_PRICE"));
          pb.setBigPrice1(rs.getInt("PLUS_SERVICE_BIG_PRICE"));
          pb.setOneWayPrice(rs.getInt("PLUS_SERVICE_ONE_WAY_PRICE"));
          pb.setAllWayPrice(rs.getInt("PLUS_SERVCIE_ROUND_TRIP_PRICE"));
          pb.setSalePrice(rs.getInt("PLUS_SERVICE_SAIL_PRICE"));
         
          
       }
       pb.setPlus(list);
       System.out.println("플러스업뎃:"+list);
          
    }catch(SQLException e) {
       e.printStackTrace();
    }finally {
       close(rs);
       close(pstmt);
    }
    return pb;
 }

public PetSitterBoard defaultOptionUpdate(Connection conn, PetSitterBoard pb) {
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
  
    String sql = prop.getProperty("defaultOptionDetail");
    List<String> list = new ArrayList<String>();
    
    try { 
       pstmt=conn.prepareStatement(sql);
       pstmt.setInt(1,pb.getBoardNo());
       rs = pstmt.executeQuery();
       
       while(rs.next()) {
          
          pb.setBoardNo(rs.getInt("BOARD_CODE"));
          list.add(rs.getString("DEFAULT_SERVICE_VALUES"));
          
       }
       pb.setServiceTypes(list);
       System.out.println("기본업뎃:"+list);
          
    }catch(SQLException e) {
       e.printStackTrace();
    }finally {
       close(rs);
       close(pstmt);
    }
    return pb;
 }



}
   
