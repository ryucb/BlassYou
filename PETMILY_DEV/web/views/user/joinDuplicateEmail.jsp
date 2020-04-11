<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	boolean flag = (boolean)request.getAttribute("flag");
    	String email = request.getParameter("email");
    %>
    
<style>
	div{
		display:flex;
		flex-direction: column;
		margin-right:auto;
		margin-left:auto;
	}
	
	#container{
		background-color: rgb(218, 218, 218);
		border-radius:15px;
	}
	#tp{
		margin-top:120px;
	
	}
	
	
	#hr1{
		margin-top:130px;
		width: 550px;
	}
	
	#bttm{
		
		padding: 7px 15px;
		width: 100px;
		
		margin-top:30px;
		margin-bottom:30px;
	
	    background-color: black; /* 버튼 배경 */
	    border-radius:25px; /* 버튼을 둥글게! */
	    border: 0; /* 박스 선 없애기! */
	    font-size: small; /* 폰트 사이즈 */
	    color: white; /* 폰트 컬러 */
	}
	#bttm:hover {
		cursor: pointer;
	    background-color: rgb(98, 98, 98);
	}
	
	
	#hr2{
		margin-top:70px;
		width: 550px;
	}
	
	input{
		width: 200px;
		height: 30px;
	}
	
	#bttm2{
		
		padding: 7px 15px;
		width: 100px;

	    background-color: black; /* 버튼 배경 */
	    border-radius:25px; /* 버튼을 둥글게! */
	    border: 0; /* 박스 선 없애기! */
	    font-size: small; /* 폰트 사이즈 */
	    color: white; /* 폰트 컬러 */
	}
	
	#row{
		display:flex;
		flex-direction: row;
		margin-right:auto;
		margin-left:auto;
	}
</style>


<section>
	<article>
		<!-- 이메일 중복확인 팝업창 -->
		<div id="checkid-container">

			<%if(!flag){ %>
					
					<br/>
					<div id="tp">[<%=email %>] 해당 이메일은 사용 가능합니다.</div>
					<br/>
					<hr/ id="hr1">
					<div><button id="bttm" type='button' onclick="setEmail();">닫기</button></div>
					
				
			<%} else {%>
	
				<br/>
				<div id="tp">[<%=email %>] 해당 이메일은 이미 사용 중 입니다.</div>
				<br/>
				<hr/ id="hr2">
				<div id="row"><input type="text" id="email" placeholder="이메일을 입력하세요"/>&nbsp; &nbsp; 
				<button id="bttm2" type="button" onclick="fn_duplicate();">중복검사</button></div>
			<%} %>
	</div>
	
	<script>
		function fn_duplicate(){
			var email = document.querySelector("#email").value;
			if(email.trim().length<4){
				alert("이메일 4글자 이상 입력하세요");
				return;
			}
			location.replace('<%=request.getContextPath()%>/emailDuplicate?email='+email);
		}
		
		function setEmail() {
			//부모창에 있는 email입력창에 email값을 넣기!
			opener.document.getElementById("email").value='<%= email %>';
			self.close();	
		}	
	</script>
	</article>
</section>


			
			
			<%-- let email='<%= email %>';
			email=email.split("@");
			opener.document.getElementById("email").value=email[0];
			let options=opener.document.querySelectorAll("#email>option");
			for(let i=0;i<options.length;i++){
				if(options[i].value==email[1]){
					options[i].selected=true; 
				}
			}
			self.close();	--%>