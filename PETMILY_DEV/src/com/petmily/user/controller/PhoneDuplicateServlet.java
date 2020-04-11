package com.petmily.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.user.model.service.UserService;


@WebServlet("/phoneDuplicate")
public class PhoneDuplicateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PhoneDuplicateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		회원가입 중 휴대번호 중복확인 기능
//		클라이언트가 입력한 값이 DB에 저장되어 있는지 확인한다.
		String phone = request.getParameter("phone"); // 유저 휴대번호
		System.out.println("user Phone: "+phone);
		
		boolean flag = new UserService().phoneDuplicate(phone);
		
//		가져온 값을 저장한다
		request.setAttribute("flag", flag);
		
//		회원가입하는 화면으로 전환한다.
		request.getRequestDispatcher("/views/user/joinDuplicatePhone.jsp").forward(request, response); 
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
