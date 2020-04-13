package com.petmily.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petmily.board.model.vo.PetSitterBoard;
import com.petmily.board.service.BoardService2;

/**
 * Servlet implementation class SitterUpdateServlet
 */
@WebServlet("/sitter/Detail")
public class SitterDetailServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SitterDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String userId="petsitter4";
      
      System.out.println("서블릿 들어옴");
      PetSitterBoard pb = new BoardService2().boardDetail(userId);
      System.out.println("서블릿 : "  +pb);
     
           
      request.setAttribute("board", pb);
      request.getRequestDispatcher("/views/board/boardDetail.jsp").forward(request, response);
      
      
      
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}