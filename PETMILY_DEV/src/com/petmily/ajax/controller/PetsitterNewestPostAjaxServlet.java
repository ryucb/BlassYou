package com.petmily.ajax.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.search.model.vo.PetsitterSearch;
import com.petmily.search.service.SearchService;

/**
 * Servlet implementation class PetsitterReviewAjaxServlet
 */
@WebServlet("/search/filterNewestPost")
public class PetsitterNewestPostAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetsitterNewestPostAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int cPage;
		// 현재 페이지
		
		try {
			cPage=Integer.parseInt(request.getParameter("cPage"));
		}catch(NumberFormatException e) {
			cPage=1;
		}
		
		int numPerPage=3;
		
		
		List<PetsitterSearch> list=new SearchService().selectFilterNewestPost(cPage,numPerPage);
		
		// 사용자가 원하는 페이지(데이터)를 볼 수 있게 버튼을 만든다 -> pageBar
		// 전체 데이터 갯수
		int totalDate=new SearchService().selectSearchCount();
				
		int totalPage=(int)Math.ceil((double)totalDate/numPerPage);
				
		// 누적시킬 변수
		String pageBar="";
		int pageBarSize=5;
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd=pageNo+pageBarSize-1;
				
		// 이전
		if(pageNo==1) {
			pageBar+="<span> << </span>";
		}else {
			pageBar+="<a href='"+request.getContextPath()+"/search?cPage="+(pageNo-1)+"'> << </a>";
			}
				
		// 다음
		while(!(pageNo>pageEnd||pageNo>totalPage)) {
			if(pageNo==cPage) {
				pageBar+="<span>"+pageNo+"</span>";
			}else {
				pageBar+="<a href='"+request.getContextPath()+"/search?cPage="+pageNo+"'>"+pageNo+"</a>";
					
				}
				pageNo++;
			}
				
				
		if(pageNo>totalPage) {
			pageBar+="<span> >> </span>";
			}else {
			pageBar+="<a href='"+request.getContextPath()+"/search?cPage="+(pageNo)+"'>&nbsp; >></a>";
			}
				
		request.setAttribute("pageBar", pageBar);
		
		System.out.println(list.size());
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/views/search/filterAjax.jsp").forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
