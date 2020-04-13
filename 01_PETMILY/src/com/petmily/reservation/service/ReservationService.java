package com.petmily.reservation.service;

import static com.petmily.common.JDBCTemplate.close;
import static com.petmily.common.JDBCTemplate.getConnection;
import static com.petmily.common.JDBCTemplate.commit;
import static com.petmily.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.petmily.reservation.model.dao.ReservationDao;
import com.petmily.reservation.model.vo.PetReservation;

public class ReservationService {
	
	  private ReservationDao dao = new ReservationDao();
	  
	  public List<PetReservation> requestRev(String id) {
		  Connection conn = getConnection();
		  List<PetReservation> list = dao.requestRev(conn,id);
		  for(int i=0;i<list.size();i++){
		  			list.set(i,dao.requestRevs(conn, id,list.get(i)));
		  			
		  }
		  System.out.println("서비스:"+list);
		  close(conn);
		  return list;

	  }
	  
	  public int requestCancel(int[] as) {
		  Connection conn = getConnection();
		  int result = 0;
		  for(int i=0;i<as.length;i++) {
			  result = dao.requestCancel(conn,as[i]);
		  }
		  if(result>0) commit(conn);
		  else rollback(conn);
		  return result;
	  }
	  
}
