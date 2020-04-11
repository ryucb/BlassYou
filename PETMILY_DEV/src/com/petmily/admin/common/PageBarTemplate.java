package com.petmily.admin.common;

public class PageBarTemplate {
	
	
	public static String getPageBar(String url, int totalDate, int cPage, int numPerPage) {
	
		int totalPage = (int)Math.ceil((double)totalDate/numPerPage);
		String pageBar = "";
		int pageBarSize = 5;
		
		int pageNo = ((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd = pageNo+pageBarSize-1;
		
		if(!(pageNo==1)) {
			pageBar += "<a href='" + url + "&cPage="+(pageNo-1)+"'>[이전]</a>";
		}
		
		while(!(pageNo>pageEnd||pageNo>totalPage)) {
			if(pageNo==cPage) {
				pageBar += "<span>"+pageNo+"</span>";
			} else {
				pageBar += "<a href='" + url + "&cPage="+pageNo+"'>"+pageNo+"</a>";
			}
			pageNo++;
		}
		
		if(!(pageNo>totalPage)) {
			pageBar += "<a href='" + url + "&cPage="+pageNo+"'>[다음]</a>";
		}
			
			
		return pageBar;
	}

}
