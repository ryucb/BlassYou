<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="/views/common/header.jsp" %> --%>

	<!-- 내가 적용한 CSS : 아이디,비밀번호 찾기 -->
	<!-- css 적용이 잘 되지 않아서 내부스타일 방식으로 css 작업함 -->
	<%-- <link rel="stylesheet" href="<%=request.getContextPath()%>/css/idFindForm.css"> --%>
	<!-- 내가 적용한 폰트 -->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>

	<!-- 내가 적용한 내부CSS : 아이디 찾기 -->
	<style>
		/* 전체 페이지의 폰트 설정 */
		* {
			font-family: 'Noto Sans KR', sans-serif;
		}
		
		/* 아이디찾기 타이틀 가운데로 이동 */
		h3#title {
			/* 글씨 가운데 정렬 */
			text-align: center;
			/* 주변 영역 설정 */
			padding-top: 10px;
		}
		
		/* -------------------------- [ modal1 영역 설정 ] -------------------------- */
		/* 이메일입력 멘트 설정 */
		p {
			text-align: center; 
			padding-top: 50px;
		}
		
		/* 이메일입력 input 설정 */
		input#email {
			width:150px; /* 가로설정 */
			height:30px; /* 세로설정 */
			line-height:20px; /* 태그 내 글씨위치 설정 */
			
			border-radius:5px; /* 테두리 설정 */
			border:1px solid rgb(182, 182, 182); /* 테두리  색상 설정  */
			
			padding-left:10px; /* 글씨 살짝 왼쪽에서 띄움 */
			margin-left: 70px; /* 영역을 왼쪽에서 살짝 띄움 */
		}
		
		/* 이메일선택 select문 설정 */
		select#email_select {
			width:150px; /* 가로설정 */
			height:31px; /* 세로설정 */
			/* 테두리설정 */
		    border-radius: 5px;
		    border: 1px solid rgb(182, 182, 182);
		}
		
		/* [인증번호 전송] 버튼 설정 */
		button#send-btn {
			/* 버튼 영역 설정 */
			padding: 7px 15px; 
			margin-left: 10px;
			/* 버튼 테두리, 폰트 색상, 배경 설정 */
			border: 1px solid #ffcc33;
			border-radius: 25px;
			color: #ffcc33;
			background-color: white;
		}
		
		/* [인증번호 전송] 버튼에 마우스를 올렸을 때 포인터, 배경색상 설정 */
		button#send-btn:hover {
			cursor: pointer;
		    background-color: #ffcc33;
		    color: white;
		}
		
		/* [로그인] 버튼 설정  */
		button#send-login-btn { 
			/* 원래는 안 보이게 해야 한다 */
			/* display: none; */
			
			/* 버튼 크기, 테두리 설정 */
		    padding: 10px 60px;
		    margin-left: 200px;
		    margin-bottom: 20px;
		
		    background-color: black; /* 버튼 배경 */ 
		    border-radius:25px; /* 버튼을 둥글게! */ 
		    border: 0; /* 박스 선 없애기!*/ 
		    font-size: large;  /* 폰트 사이즈*/ 
		    color: white;  /* 폰트 컬러 */
		}
		/* [로그인] 버튼에 마우스를 올렸을 때 마우스 포인터 설정 */
		button#send-login-btn:hover {
		    cursor: pointer;
		    background-color: rgb(98, 98, 98);
		}
		/* -------------------------- [ modal1 영역 설정 끝 ] -------------------------- */
		
		/* --------------------------- [ modal2 영역 설정 ] --------------------------- */
		input#randomNum {
			width: 150px;
			height: 30px;
		
			margin-left: 180px;
			
			padding-left: 10px;
			
			border-radius: 5px;
			border: 1px solid rgb(182, 182, 182);
		}
		
		/* [번호인증] 버튼 설정 */
		button#certification_Num {
			/* 버튼 영역 설정 */
			padding: 7px 15px; 
			margin-left: 10px;
			/* 버튼 테두리, 폰트 색상, 배경 설정 */
			border: 1px solid #ffcc33;
			border-radius: 25px;
			color: #ffcc33;
			background-color: white;
		}
		/* [번호인증] 버튼에 마우스를 올렸을 때 포인터, 배경색상 설정 */
		button#certification_Num:hover {
			cursor: pointer;
		    background-color: #ffcc33;
		    color: white;
		}
		/* --------------------------- [ modal2 영역 설정 끝] --------------------------- */
	</style>

<!-- -------------------------------------------------------------------------------------------------------- -->
<section>
	
	<article>
	
		<h3 id="title">아이디 찾기</h3>
		
		<hr>
		
		<div id="divModal1" name="contentModal1">
			<p>회원가입 시 작성한 이메일을 입력해 주세요</p> <br><br>
			<input type="text" id="email" name="email"> @ 
			<select id="email_select">
				<option>직접입력</option>
				<option value="naver.com">naver.com</option>
				<option>여기엔 뭐 넣지</option>
			</select>
			<button id="send-btn" onclick="nextModal();">인증번호 전송</button> <!-- API랑 어떻게 이어야 하는 부분이죠?ㅋㅋ -->
		</div>
		
		
		<!-- [아이디 찾기] 이메일 인증번호 입력 -->
		<div id="contentModal2" name="contentModal2" style="display: none; margin-bottom: 100px;">
			<p>인증번호 입력</p>
			<input type="text" id="randomNum" name="randomNum" placeholder="인증번호 입력">
			<button id="certification_Num">번호 인증</button>
		</div>
		
		<br><br>
		
		<!-- 로그인 버튼을 눌렀을때, 자식윈도우의 아이디의 값이 부모 윈도우의 아이디 값으로 이동할 수 있게 설정한다.
			(자바스크립트 기술 필요)
		 -->
		<hr style="margin-bottom: 30px;">
		
		<button id="send-login-btn">인증완료</button>
	</article>
</section>

<!-- -------------------------------------------------------------------------------------------------------- -->

<script>
	function nextModal() {
		let modal1 = document.getElementById("divModal1");
		let ss = $("#divModal1");
		console.log(ss);
		let modal2 = document.getElementById("contentModal2");
		console.log("modal1:"+modal1);
		console.log("modal2:"+modal2);
		
		modal1.style.display = "none";
		modal2.style.display = "inline";
	};
</script>


<%-- <%@ include file="/views/common/footer.jsp" %> --%>