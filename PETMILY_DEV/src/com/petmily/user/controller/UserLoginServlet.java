package com.petmily.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petmily.user.model.service.UserService;
import com.petmily.user.model.vo.User;


@WebServlet("/log-in")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserLoginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		로그인 화면으로 이동시켜주는 역할
		request.getRequestDispatcher("/views/user/userLogin.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
