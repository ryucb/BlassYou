package com.petmily.admin.controller;

import java.io.IOException;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.fastinfoset.sax.Properties;

/**
 * Servlet implementation class AdminEmailServlet
 */
@WebServlet("/admin/email")
public class AdminEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		System.out.println(type);
		System.out.println(userId);
		System.out.println(userName);
		
		String host = "smtp.naver.com";
		String user = "wadsij@naver.com";
		String password = "kim1q2w3e";
		
		// SMTP서버 정보 설정
		java.util.Properties props = new java.util.Properties(); 
		props.put("mail.smtp.host", host); 
		props.put("mail.smtp.port", 587); 
		props.put("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() { 
			protected PasswordAuthentication getPasswordAuthentication() { 
				return new PasswordAuthentication(user, password); } 
		});
		// 전송할 페이지 작성
		String content = "<div style='border:1px solid black;'";
		content += "<h1 style='text-align:center; font-size:55px;'>펫 밀리에서 알려드립니다!</h1>";
		content += "<hr/>";
		content += "<br/>";
		content += "<div style='border:1px solid black; background-color:lightgreen;'>";
		if(type.equals("반려")) {
			content += "<p style='text-align:center; font-size:28px; background-color:lightgray;'>" + userName + "님은 반려되셨습니다.</p>";
			content += "<p style='text-align:center; font-size:17px; background-color:lightgreen;'>자세한 사항은 관리자에게 문의해주세요</p>";
		} else {
			content += "<p style='text-align:center; font-size:28px; background-color:lightgray;'>" + userName + "님은 합격되셨습니다!</p>";
			content += "<p style='text-align:center; font-size:17px; background-color:lightgreen;'>PETMILY의 가족이 되신 것을 환영합니다.</p>";
		}
		content += "</div>";
		content += "</div>";
		try { 
			MimeMessage msg = new MimeMessage(session); 
			msg.setFrom(new InternetAddress(user)); 
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress("pdg300@naver.com")); 
			// 메일 제목 
			msg.setSubject("PETMILY 펫시터 지원 답변이메일입니다."); 
			// 메일 전송 및 html로 셋팅
			msg.setContent(content, "text/html; charset=UTF-8");
			// send the message 
			Transport.send(msg);
			
		} catch (MessagingException e) { 
			e.printStackTrace(); 
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
