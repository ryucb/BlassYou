package com.petmily.pet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petmily.pet.model.vo.Pet;
import com.petmily.pet.service.PetService;

/**
 * Servlet implementation class PetProfileServlet
 */
@WebServlet("/user/petprofile")
public class PetProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			String user = "sebin";
	
	//      로그인 성공 & 로그인 실패 로직 구현
	      if(user!=null) {
	//         로그인 성공
	         HttpSession session = request.getSession();
	         session.setAttribute("loginUser", user);
	         List<Pet> list = new PetService().petProfile(user);
	 		request.setAttribute("list", list);
	         request.getRequestDispatcher("/views/user/petProfile.jsp").forward(request, response);
	         
	      }
	      else {
	//         로그인 실패
	         request.setAttribute("msg","아이디나 비밀번호가 일치하지 않습니다.");
	//         로그인 화면으로 전환
	         request.setAttribute("loc", "/log-in");
	
	         
	         request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
	      }
	      
			
	//		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
