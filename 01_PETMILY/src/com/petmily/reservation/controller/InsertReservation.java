package com.petmily.reservation.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InsertReservation
 */
@WebServlet("/insertReservation.do")
public class InsertReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		/* String userId = (String)session.getAttribute("userId"); */
		String userId = "user10";
		String sitterId = request.getParameter("sitterId");
		int boardCode = Integer.parseInt(request.getParameter("boardCode"));
		String checkIn = request.getParameter("checkIn");
		String checkOut = request.getParameter("checkOut");
		String plusQuestions = request.getParameter("plusQuestions");
		int price = Integer.parseInt(request.getParameter("price"));
		String medicine = request.getParameter("medicine");
		String pickup = request.getParameter("pickup");
		
		int[] petCodes =  Arrays.stream(request.getParameterValues("petCodes")).mapToInt(Integer::parseInt).toArray();
		String[] petSizes = request.getParameterValues("petSizes");
		int[] petBaths = Arrays.stream(request.getParameterValues("petBaths")).mapToInt(Integer::parseInt).toArray();
		
		
		System.out.println(userId);
		System.out.println(sitterId);
		System.out.println(boardCode);
		System.out.println(checkIn);
		System.out.println(checkOut);
		System.out.println(plusQuestions);
		System.out.println(price);
		System.out.println(medicine);
		System.out.println(pickup);
		
		for(int i=0; i<petCodes.length; i++) {
			System.out.println(petCodes[i]);
		}

		for(int i=0; i<petSizes.length; i++) {
			System.out.println(petSizes[i]);
		}
		
		for(int i=0; i<petBaths.length; i++) {
			System.out.println(petBaths[i]);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
