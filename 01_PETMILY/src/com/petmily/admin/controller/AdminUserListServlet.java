package com.petmily.admin.controller;

import static com.petmily.common.PageBarTemplate.getPageBar;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.admin.model.vo.AdminUser;
import com.petmily.admin.service.AdminService;

/**
 * Servlet implementation class AdminUserListServlet
 */
@WebServlet("/admin/user_list")
public class AdminUserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cPage = 1;
		if(request.getParameter("cPage")!=null) {
			cPage = Integer.parseInt(request.getParameter("cPage"));
		}
		String type = "USER_NAME";
		if(request.getParameter("type")!=null) {
			type = request.getParameter("type");
		}
		int numPerPage = 10;
		
		ArrayList<AdminUser> list = new AdminService().userList(cPage,numPerPage,type);
		System.out.println(type);
		int totalDate = new AdminService().boardCount();
		String url = request.getContextPath() + "/admin/user_list?type="+(type.equals("BCOUNT DESC")?"BCOUNT%20DESC":type);
		String pageBar = getPageBar(url,totalDate,cPage,numPerPage);
		
		
		request.setAttribute("pageType", "1");
		request.setAttribute("type", type);
		request.setAttribute("pageBar", pageBar);
		request.setAttribute("userList", list);
		request.getRequestDispatcher("/views/admin/adminUserService.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
