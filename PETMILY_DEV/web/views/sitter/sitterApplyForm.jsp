<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/sitterApplyForm.css">
<script src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script>

<body>
	<section>
		<p id="title">펫 시터 지원폼</p>
		<article>
			<form action="<%=request.getContextPath() %>/apply/form" method="post" onsubmit="return join_check_validate();">
        <!-- 1. -->
        	<!-- <div id="agreementBox">
        	본인은 아래의 [개인정보 수집 및 이용에 관한 동의]를 잘 읽어 보았으며, 
        	최종적으로 지원서를 작성하는 경우 위 내용에 동의하는 것으로 인정합니다. * <br>
            1. 목적 : 지원자 개인 식별, 지원의사 확인  2. 항목 : 지원자 성명, 휴대폰번호 및 해당 신청서에서 수집된 정보
            3. 보유기간 : 해당 지원자 모집 종료 후 1년간 보유, 이용됩니다.
            4. 동의를 거부할 권리 및 동의 거부에 따른 불이익 : 지원자는 위 내용에 대해서 동의를 하지 않을 권리가 있으며 
			지원자가 개인정보의 삭제를 요청하는 경우 지체없이 이를 삭제합니다.
			</div>
            <div id="agreementRadio"> 
                <label>
                    <input type="radio" name="agreeDisagree" value="동의합니다."/>동의합니다.
                </label>
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label>
                    <input type="radio" name="agreeDisagree" value="동의하지 않습니다."/>동의하지 않습니다.
                </label>
            </div> -->

        <!-- 2. -->
        <div id="wholeMargin" style="border: 1px solid rgb(182, 182, 182); border-radius:5px; width:900px; margin: 0 auto;padding-top: 50px;">
    
        <div id="agreementBox">
        	본인은 아래의 [개인정보 수집 및 이용에 관한 동의]를 잘 읽어 보았으며, 
        	최종적으로 지원서를 작성하는 경우 위 내용에 동의하는 것으로 인정합니다. * <br>
            1. 목적 : 지원자 개인 식별, 지원의사 확인  2. 항목 : 지원자 성명, 휴대폰번호 및 해당 신청서에서 수집된 정보
            3. 보유기간 : 해당 지원자 모집 종료 후 1년간 보유, 이용됩니다.
            4. 동의를 거부할 권리 및 동의 거부에 따른 불이익 : 지원자는 위 내용에 대해서 동의를 하지 않을 권리가 있으며 
			지원자가 개인정보의 삭제를 요청하는 경우 지체없이 이를 삭제합니다.
			</div>
            <div id="agreementRadio"> 
                <label>
                    <input type="radio" name="agreedisagree" id="agreedisagree" value="Y"/>동의합니다.
                </label>
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <label>
                    <input type="radio" name="agreedisagree" id="agreedisagree" value="N"/>동의하지 않습니다.
                </label>
            </div>
            <table id="applyInfo">
                <tr>
                    <td class="info">지원자 성명</td>
                    <td class="info">
                        <input class="applyInfoWidth" type="text" class="infoInput" name="name">
                    </td>
                </tr>
                <tr >
                    <td class="info">이메일</td>
                    <td class="info">
                        <input class="applyInfoWidth" type="email" class="infoInput" name="email">
                    </td>
                </tr>
                <tr>
                    <td class="info">거주지 주소</td>
                    <td class="info">
                        <input class="applyInfoWidth" type="text" class="infoInput" name="address">
                    </td>
                </tr>
            </table>
        
        
        <!-- 3. -->
        <div id="additionalInfoBox" >  
        	<table class="additionalInfo">
				<tr>
					<td colspan="4" class="tableSubheading">거주지 유형(중복 체크 가능)</td>
				</tr>
				<tr>
					<td class="labelpadding"><label><input class="checkcheck" type="checkbox" name="houseType" id="houseType" value="taste" width="50px" height="50px"/>단독주택</label></td>
					<td class="labelpadding"><label><input type="checkbox" name="houseType" id="houseType" value="apt" width="50px" height="50px"/>아파트</label></td>
					<td class="labelpadding"><label><input type="checkbox" name="houseType" id="houseType" value="vilage" width="50px" height="50px"/>빌라</label></td>
					<td class="labelpadding"><label><input type="checkbox" name="houseType" id="houseType" value="oneRoom" width="50px" height="50px"/>원룸<br></label></td>
				</tr>
				<tr>
					<td><label><input class="checkcheck" type="checkbox" name="houseType" id="houseType" value="officetel" width="50px" height="50px"/>오피스텔</label></td>
					<td><label><input type="checkbox" name="houseType" id="houseType" value="includingGarden" width="50px" height="50px"/>마당보유</label></td>
					<td colspan="2"><label><input type="checkbox" name="houseType"  id="houseType" value="walkingTrack" width="50px" height="50px"/>주변 산책로 보유</label></td>
				</tr>
			</table>
             
        	<table class="additionalInfo" >
	    		<tr>
	    			<td colspan="2" class="tableSubheading">반려동물 관련 자격증 보유</td>
	    		</tr>
	    		<tr>
	    			<td>
						<label>
							<input class="checkcheck" type="radio" name="certificateCheck" id="certificateCheck" value="네" style="margin-left:30px;"/>네
						</label>
						<label id="certiLabel">
							<input type="radio" name="certificateCheck" id="certificateCheck" value="아니오"/>아니오
						</label>
	    			</td>
	    		</tr>
        	</table>
                
        	<table class="additionalInfo">
        		<tr>
        			<td colspan="3" class="tableSubheading">직업</td>
        		</tr>
        		<tr>
        			<td class="labelpadding"><label><input class="checkcheck" type="radio" name="jobCheck" id="jobCheck" value="주부"/>주부</label></td>
        			<td class="labelpadding"><label><input type="radio" name="jobCheck" id="jobCheck" value="학생"/>학생</label></td>
        			<td class="labelpadding"><label><input type="radio" name="jobCheck" id="jobCheck" value="직장인"/>직장인</label></td>
        		</tr>
        		<tr>
        			<td><label><input class="checkcheck" type="radio" name="jobCheck" id="jobCheck" value="프리랜서"/>프리랜서</label></td>
        			<td><label><input type="radio" name="jobCheck" id="jobCheck" value="아직없음"/>아직없음</label></td>
        			<td><label><input type="radio" name="jobCheck" id="jobCheck" value="기타"/>기타</label></td>
        		</tr>
        	</table>
            
            
        	<table class="additionalInfo">
        		<tr>
        			<td class="tableSubheading">가족 구성원에 대해서 말해주세요</td>
        		</tr>
        		<tr>
        			<td>
        				<textarea class="detailWriteBox" class="textarea" name="familyNoChck" id="familyNoChck" cols="68" rows="3" placeholder="ex)엄마,아빠,동생 등 4명의 가족과 같이 살고 있습니다."></textarea>
        			</td>
        		</tr>
        		<tr>
        			<td class="tableSubheading">반려동물을 키우신 적이 있나요? 있다면 얼마나 있으신가요?</td>
        		</tr>
        		<tr>
        			<td>
        				<textarea class="detailWriteBox" name="careCheck" id="careCheck" cols="68" rows="4" placeholder="ex)키운 적 없습니다. 본가에서 5년 포메라니안 여아 등 자세하게 기재해주세요."></textarea>
        			</td>
        		</tr>
        		<tr>
        			<td class="tableSubheading">가족 구성원에 대해서 말해주세요</td>
        		</tr>
        		<tr>
        			<td>
        				<textarea class="detailWriteBox" name="career" id="career" cols="68" rows="4" placeholder="ex)직접 방문 펫시터로 4개월 근무 했습니다."></textarea>
        			</td>
        		</tr>
        	</table>	
        </div><!-- div id="additionalInfoBox" 끝 -->
        </div><!-- div id="wholeMargin" 끝 -->
        	<br>
			<br>
        <div style="background-color:grey; width:100%; height:150px; padding-top:10px;">
        	<br>
			<br>
        <button id="submitbtn" type="submit">제출</button>
		</div>
		
			</form>
		</article>
	</section>
	
	
