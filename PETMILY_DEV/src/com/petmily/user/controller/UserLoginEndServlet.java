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


@WebServlet("/log-in.do")
public class UserLoginEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserLoginEndServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
//		클라이언트가 입력한 값을 받는다 (아이디, 비밀번호)
//		변수명은 DB 컬럼명을 기준으로 선언한다.
		String user_id = request.getParameter("userId"); // 유저 아이디
		String password = request.getParameter("userPw"); // 유저 비밀번호
		
		System.out.println("user_id: "+user_id);
		System.out.println("password: "+password);
		
//		가져온 아이디와 비밀번호가 DB에 저장되어 있는지 찾아봐야 하기 때문에,
//		서비스에 가져온 아이디와 비밀번호를 전달하고, 가져온 값을 user에 저장한다.
		User user = new UserService().userSelect(user_id, password);
		
		System.out.println("user: "+user);

//		로그인 성공 & 로그인 실패 로직 구현
		if(user!=null) {
//			로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

			response.sendRedirect(request.getContextPath());
			
		}
		else {
//			로그인 실패
			request.setAttribute("msg","아이디나 비밀번호가 일치하지 않습니다.");
//			로그인 화면으로 전환
			request.setAttribute("loc", "/log-in");
			
//			'아이디 또는 비밀번호가 잘못 되었습니다' 멘트 분기처리하기 위해 저장
//			request.setAttribute("flag", false);
			
			request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
