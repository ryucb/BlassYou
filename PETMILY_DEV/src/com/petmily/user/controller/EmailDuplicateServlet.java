package com.petmily.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.user.model.service.UserService;


@WebServlet("/emailDuplicate")
public class EmailDuplicateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public EmailDuplicateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		회원가입 중, [이메일 중복확인] 기능
		String email = request.getParameter("email"); 
		System.out.println("emailId:" +email);
		
		boolean flag = new UserService().emailDuplicate(email);
		
//		가져온 값을 저장한다
		request.setAttribute("flag", flag);
		
//		회원가입하는 화면으로 전환한다.
		request.getRequestDispatcher("/views/User/joinDuplicateEmail.jsp").forward(request, response); 
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
