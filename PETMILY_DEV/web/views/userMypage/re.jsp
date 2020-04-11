<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ include file="/views/common/header.jsp" %>
	
	<button onclick="location.replace('<%=request.getContextPath() %>/userReview?userId=user01')">작성 후기</button>

<%@ include file="/views/common/footer.jsp" %>