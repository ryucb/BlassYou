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
 * Servlet implementation class PetsitterFinderServlet
 */
@WebServlet("/search/locationFinder")
public class PetsitterLocationFinderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetsitterLocationFinderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// dao컬럼명
		String key=request.getParameter("searchKeyword");
		// 컬럼명에 들어가있는 값이랑 비교할 대상
		//System.out.println(key);
				
		// 현재 페이지 설정
		int cPage;
				
		try {
				cPage=Integer.parseInt(request.getParameter("cPage"));
			}catch(NumberFormatException e) {
				cPage=1;
			}
				
		int numPerPage=3;
				
		List<PetsitterSearch> list=new SearchService().searchPetsitter(key,cPage,numPerPage);

		// pageBar 만들기
		String pageBar="";
		int totalData=new SearchService().selectCount(key);
		int totalPage=(int)Math.ceil((double)totalData/numPerPage);
				
		int pageBarSize=5;
				
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd=pageNo+pageBarSize-1;
				
		// 이전
		if(pageNo==1) {
			pageBar+="<span> << </span>";
		}else {
			pageBar+="<a href='"+request.getContextPath()+"/search/locationFinder?cPage="+(pageNo-1)+"&searchKeyword="+key+"'> << </a>";
		}
				
		// 번호출력하기
		while(!(pageNo>pageEnd||pageNo>totalPage)) {
		// 작으면 적용
					
		if(pageNo==cPage) {
			pageBar+="<span>"+pageNo+"</span>";
			}else {
			pageBar+="<a href='"+request.getContextPath()+"/search/locationFinder?cPage="+pageNo+"&searchKeyword="+key+"'>"+pageNo+"</a>";
			}
			pageNo++;
			}
				
		// 다음
		if(pageNo>totalPage) {
			pageBar+="<span> >> </span>";
					
			}else {
			pageBar+="<a href='"+request.getContextPath()+"/search/locationFinder?cPage="+pageNo+"&searchKeyword="+key+"'> >> </a>";
		}
				
		//System.out.println(list.size());		
				
		request.setAttribute("pageBar", pageBar);
				
		request.setAttribute("list", list);
		
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
