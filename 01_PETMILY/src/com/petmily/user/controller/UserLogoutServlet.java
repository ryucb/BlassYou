package com.petmily.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/log-out")
public class UserLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserLogoutServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그아웃 로직
		// 클라이언트가 [로그아웃] 버튼을 누르면 로그아웃되며 메인화면으로 화면을 전환한다.
		HttpSession session = request.getSession(false);
//		-> true : 발급된 session이 있으면 session을 반환하고 없으면 session을 생성한 후 반환한다.
//		-> false : 발급된 session이 있으면 session을 반환하고, 없으면 null을 반환한다.
		
		session.invalidate(); // session을 삭제한다.
		
		// session을 삭제하고 응답처리 필요
		response.sendRedirect(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
