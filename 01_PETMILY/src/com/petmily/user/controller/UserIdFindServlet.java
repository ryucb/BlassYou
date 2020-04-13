package com.petmily.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/idFind")
public class UserIdFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserIdFindServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		로그인 화면에서 [아이디]눌렀을 때 나오는 팝업창으로 화면 전환
		request.getRequestDispatcher("/views/user/UserIdFind.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
