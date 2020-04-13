package com.petmily.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petmily.user.model.service.UserService;
import com.petmily.user.model.vo.PetSitter2;

/**
 * Servlet implementation class SitterApplyServlet
 */
@WebServlet("/apply/form")
public class SitterApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SitterApplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//앞에서 받은 데이터를 세션을 불러와서 가져옴
		HttpSession session=request.getSession();
		PetSitter2 pss=(PetSitter2)session.getAttribute("petsitter");
		//데이터 받고 세션을 끊어줌
		System.out.println(pss);
		
		
		//펫시터 지원 폼에서 받을 데이터는 아래와 같이 8개
		
		//펫시터 지원폼 작성 이름
		String sitterName=request.getParameter("name");
		//펫시터 지원폼 작성 이메일
		String sitterEmail=request.getParameter("email");
		//펫시터 지원폼 작성 주소
		String sitterAddress=request.getParameter("address");
		
		//펫시터 지원폼 작성 거주지 유형
		String[] residenceValue=request.getParameterValues("houseType");
		//펫시터 지원폼 작성 직업
		String[] petSitterJob=request.getParameterValues("jobCheck");
		//펫시터 지원폼 가족 구성원 
		String petSitterFamily=request.getParameter("familyNoChck");
		//펫시터 지원폼 반려동물 반려 경험 여부
		String petSitterKeeppets=request.getParameter("careCheck");
		//펫시터 지원폼 펫시터 경력활동 유무
		String petSitterActivity=request.getParameter("career");
		
//		pss.setSitterName(sitterName);
//		pss.setSitterEmail(sitterEmail);
//		pss.setSitterAddress(sitterAddress);
		pss.setResidenceValue(String.join(",", residenceValue));
		pss.setPetSitterJob(String.join(",",petSitterJob));
		pss.setPetSitterFamily(petSitterFamily);
		pss.setPetSitterKeeppets(petSitterKeeppets); 
		pss.setPetSitterActivity(petSitterActivity);
		
		System.out.println(pss);
		
		int result=new UserService().insertSitter(pss);
		
		//지원완료 페이지로 넘어감
		RequestDispatcher rd=request.getRequestDispatcher("/views/sitter/applyEnd.jsp");
		rd.forward(request, response);
		
		session.removeAttribute("petsitter");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
