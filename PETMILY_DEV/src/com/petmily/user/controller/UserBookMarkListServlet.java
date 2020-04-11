package com.petmily.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petmily.user.model.service.UserService;
import com.petmily.user.model.vo.User;
import com.petmily.user.model.vo.UserBookMark;
import com.petmily.user.model.vo.UserBookMarkBoard;


@WebServlet("/userBookMarkList")
public class UserBookMarkListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserBookMarkListServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		회원정보 - 북마크 화면으로 전환하는 기능
//		로그인 된 상태로 진행되어야 한다.
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser")==null) {
//			잘못된 접근 처리
			request.setAttribute("msg","잘못된 접근입니다.");
			request.setAttribute("loc", ""); // 메인으로 이동
			request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
		}
		else {
			String id = request.getParameter("userId");
			System.out.println("회원정보수정 화면으로 이동하기 위해 확인하는 id 값 : "+id);
			
//			DB에서 id와 동일한 정보를 가져온다
			List<UserBookMarkBoard> list = new UserService().userBookMarkList(id);
			System.out.println("회원이 북마크한 리스트. dao에서 북마크 list값을 잘 가져왔는가? : "+list);
			
//			가져온 내용을 저장하고 아이디값과 함께 매핑값을 보낸다.
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/User/userBookMarkList.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
