package com.petmily.search.controller;

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
 * Servlet implementation class PetsitterFilterNoPetServlet
 */
@WebServlet("/filterSearch/takingDrug")
public class PetsitterFilterTakingDrug extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetsitterFilterTakingDrug() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String takingDrug="약물복용";
		
		
		int cPage;
		
		try {
				cPage=Integer.parseInt(request.getParameter("cPage"));
			}catch(NumberFormatException e) {
				cPage=1;
			}
				
		int numPerPage=3;
				
		List<PetsitterSearch> list=new SearchService().filterTakingDrug(takingDrug,cPage,numPerPage);
		// pageBar 만들기
		String pageBar="";
		int totalDate=new SearchService().selectSearchCount();
		int totalPage=(int)Math.ceil((double)totalDate/numPerPage);
				
		int pageBarSize=5;
				
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd=pageNo+pageBarSize-1;
				
		// 이전
		if(pageNo==1) {
			pageBar+="<span> << </span>";
		}else {
			pageBar+="<a href='"+request.getContextPath()+"/filterSearch/takingDrug?cPage="+(pageNo-1)+"'> << </a>";
		}
				
		// 번호출력하기
		while(!(pageNo>pageEnd||pageNo>totalPage)) {
		// 작으면 적용
					
		if(pageNo==cPage) {
			pageBar+="<span>"+pageNo+"</span>";
			}else {
			pageBar+="<a href='"+request.getContextPath()+"/filterSearch/takingDrug?cPage="+pageNo+"'>"+pageNo+"</a>";
			}
			pageNo++;
			}
				
		// 다음
		if(pageNo>totalPage) {
			pageBar+="<span> >> </span>";
					
			}else {
			pageBar+="<a href='"+request.getContextPath()+"/filterSearch/takingDrug?cPage="+pageNo+"'> >> </a>";
		}
				
		//System.out.println(list.size());		
				
		request.setAttribute("pageBar", pageBar);
				
		
		request.setAttribute("list", list);
		
		//System.out.println(list.size());
		//System.out.println(takingDrug);
		
		request.getRequestDispatcher("/views/search/search.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
