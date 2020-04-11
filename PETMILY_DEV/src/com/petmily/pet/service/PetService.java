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
		int result = dao.petprofileinsert(conn,pet, id);
		
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

}
