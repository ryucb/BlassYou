package com.petmily.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.user.model.service.UserService;


@WebServlet("/UserIdDuplicate")
public class UserIdDuplicateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserIdDuplicateServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		회원가입 로직 중 아이디 중복 체크 기능
//		클라이언트가 입력한 값이 DB에 저장되어 있는지 확인한다.

		String userId = request.getParameter("user_Id"); // 유저 아이디
		
		System.out.println("userId : "+userId);
		// true : 아이디가 존재하기 때문에 쓸 수 없다
		// false : 아이디가 존재하지 않기 때문에 쓸 수 있다.
		boolean flag = new UserService().userIdDuplicate(userId);
		
//		가져온 값을 저장한다
		request.setAttribute("flag", flag);
		
		request.getRequestDispatcher("/views/user/joinDuplicate.jsp?user_Id="+userId).forward(request, response); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
