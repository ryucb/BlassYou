package com.petmily.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
//import com.petmily.board.model.service.BoardService;
import com.petmily.board.model.vo.Board;



@WebServlet("/sitter/write")
public class BoardWriteEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardWriteEndServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = getServletContext().getRealPath("/upload/board/");
		int maxSize=1024*1024*10;
		
		MultipartRequest mr = new MultipartRequest(request,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
		
		//아이디
		String id = mr.getParameter("userId");
		
		//제목
		String title = mr.getParameter("title");
		
		//파일 받아오기
		int count;
		try {
			count = Integer.parseInt(mr.getParameter("count"));
		}catch(NumberFormatException e) {
			count=0;
		}
		
		List<String> files = new ArrayList();
		for(int i = 0; i<count; i++){
			
			String file = "file"+i;
			
			files.add(mr.getParameter(file));
		}
		
		String introduce = mr.getParameter("introduce");
		//기본요금
		int small = Integer.parseInt(mr.getParameter("small"));
		int middle =Integer.parseInt(mr.getParameter("middle"));
		int big = Integer.parseInt(mr.getParameter("big"));
		
		//추가 할인
		String addSale = mr.getParameter("addSale");
		
		int sale;
		try {
			sale = Integer.parseInt(mr.getParameter("sale"));
		}catch(NumberFormatException e) {
			sale=0;
		}
		
		//지도api
		
		String address = mr.getParameter("address");
		String map = mr.getParameter("map");
		
		//기본 서비스 (놀기, 산책)
		String play = mr.getParameter("play");
		String walk = mr.getParameter("walk");
		
		//추가 서비스 (노견케어, 약 주기)
		String old = mr.getParameter("old");
		String drug = mr.getParameter("drug");
		
		//추가 서비스 요금기재
		String showerOn = mr.getParameter("showerOn");
		
		int small1;
		int middle1;
		int big1;
		try {
			small1 = Integer.parseInt(mr.getParameter("small1"));
			middle1 = Integer.parseInt(mr.getParameter("middle1"));
			big1 = Integer.parseInt(mr.getParameter("big1"));
		}catch(NumberFormatException e) {
			small1=0;
			middle1=0;
			big1=0;
		}
		
		//추가서비스 요금 기재
		String pickUp = mr.getParameter("pickUp");
		
		int oneWay;
		int allWay;
		try {
			oneWay = Integer.parseInt(mr.getParameter("oneWay"));
			allWay = Integer.parseInt(mr.getParameter("allWay"));
		}catch(NumberFormatException e) {
			oneWay=0;
			allWay=0;
		}

		Board b = new Board(0,id,title,files,count,introduce,small,middle,big,addSale,sale,address,map,
				play,walk,old,showerOn,small1,middle1,big1,drug,pickUp,oneWay,allWay);
		
//		int result = new BoardService().boardInsert(b);
		
		
		String msg="";
		String loc="";
		//등록이 성공 -> 등록성공 메세지출력, 공지사항리스트페이지로 이동
//		if(result>0) {
//			msg="업로드 성공";
//			loc="/sitter/write";
//		}else {
//		//등록이 실패 -> 등록실패 메세지출력, 공지사항작성페이지로 이동
//			msg="업로드 실패";
//			loc="/sitter/write";
//		}
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);

		request.getRequestDispatcher("/views/common/msg.jsp")
		.forward(request,response);
		}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
