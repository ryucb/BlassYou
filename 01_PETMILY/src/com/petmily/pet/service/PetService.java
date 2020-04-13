package com.petmily.pet.service;

import static com.petmily.common.JDBCTemplate.getConnection;
import static com.petmily.common.JDBCTemplate.close;
import static com.petmily.common.JDBCTemplate.commit;
import static com.petmily.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.petmily.pet.model.dao.PetDao;
import com.petmily.pet.model.vo.Pet;

public class PetService {
	
	PetDao dao = new PetDao();
	
	public int petprofileinsert(Pet pet, String id) {
		Connection conn = getConnection();
		System.out.println("받아온 정보"+pet+"아이디"+id);
		int result = dao.petprofileinsert(conn,pet,id);
		
		
		if(result>0) commit(conn);
		else rollback(conn);
		
		close(conn);
		return result;
		
	}
	
	public List<Pet> petProfile(String user) {
		
		Connection conn = getConnection();
		List<Pet> list = dao.petprofile(conn,user);
		
		close(conn);
		return list;
		
	}
	
	public Pet petProfileDetail(String id, int no) {
		
		Connection conn = getConnection();
		Pet p = dao.petProfileDetail(conn, id, no);
		System.out.println("받아온 세부 정보 "+p);

		close(conn);
		return p;
		
	}
	
	public int petprofileeidt(Pet pet,String id, int no) {
		
		Connection conn = getConnection();
		System.out.println("수정할 정보"+pet+"아이디"+id+"번호"+no);
		int result = dao.petprofileeidt(conn,pet,id,no);
		
		
		if(result>0) commit(conn);
		else rollback(conn);
		
		close(conn);
		System.out.println("새로운 수정할 정보"+result);
		return result;
		
	}

}
