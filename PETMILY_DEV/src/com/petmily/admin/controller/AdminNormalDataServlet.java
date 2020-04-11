package com.petmily.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.admin.model.vo.User;
import com.petmily.admin.service.AdminService;

/**
 * Servlet implementation class AdminNormalDataServlet
 */
@WebServlet("/admin/normalUserData")
public class AdminNormalDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminNormalDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = null;
		if(request.getParameter("userId")!=null) {
			userId = request.getParameter("userId");
		}
		
		User u = new AdminService().userData(userId);
		System.out.println(u);
		
		request.setAttribute("showType", "user");
		request.setAttribute("userData", u);
		request.getRequestDispatcher("/views/admin/InfoPage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
