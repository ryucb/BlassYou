<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/views/common/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/adminSideBar.css" type = "text/css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/adminMypage.css" type = "text/css">
<section id="adminMainMenu">
<%@ include file="/views/admin/adminSideBar.jsp" %>
	<section id="adminMypage">
		<img alt="" src="<%=request.getContextPath()%>/img/common/main.jpg"
			width="1016px" height="400px">
		<div id="adminPetsitterSupportList">
			<h4>펫 시터 지원목록</h4>
			<hr/>
			<p>-&nbsp;&nbsp;<a href="">펫 시터 지원자 김인술님</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2020.4.7</p>
			<p>-&nbsp;&nbsp;<a href="">펫 시터 지원자 이성연님</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2020.4.7</p>
			<p>-&nbsp;&nbsp;<a href="">펫 시터 지원자 유축복님</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2020.4.7</p>
		</div>
		<div id="adminUser">
			<div id="adminUserInfo">
				<h4>고객 문의</h4>
				<h4>추가 요금 청구 건</h4>
			</div>
			<hr/>
			<div id="adminUserData">
				<div id="adminUserQ">
					<p>-&nbsp;&nbsp;<a href="">OOO@naver.com</a> 님의 문의</p>
					<p>-&nbsp;&nbsp;<a href="">XOO@naver.com</a> 님의 문의</p>
					<p>-&nbsp;&nbsp;<a href="">OXO@naver.com</a> 님의 문의</p>
				</div>
				<div id="adminUserPlusPrice">
					<p>-&nbsp;&nbsp;<a href="">펫시터 김인술님의 요청</a></p>
					<p>-&nbsp;&nbsp;<a href="">펫시터 이성연님의 요청</a></p>
					<p>-&nbsp;&nbsp;<a href="">펫시터 유축복님의 요청</a></p>
				</div>
			</div>
		</div>
	</section>
</section>
<script>
	$(function(){
		
	})
</script>
<%@ include file="/views/common/footer.jsp" %>