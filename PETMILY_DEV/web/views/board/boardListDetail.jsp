<%@page import="javafx.geometry.Pos"%>
<%@page import="com.petmily.pet.model.vo.PetInfo"%>
<%@page import="com.petmily.review.model.vo.ReviewPetSitter"%>
<%@page import="com.petmily.board.model.vo.boardImg"%>
<%@page import="com.petmily.petsitter.model.vo.PetSitterCertificate"%>
<%@page import="com.petmily.board.model.vo.PlusOptionService"%>
<%@page import="java.util.List"%>
<%@page import="com.petmily.user.model.vo.User"%>
<%@page import="com.petmily.petsitter.model.vo.PetSitter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>

<%@ page import="com.petmily.board.model.vo.PetSitterBoard" %>
      
<%

	/* String bFlag = ""; */
	
	
	String userId = (String)request.getAttribute("userId");
	List<String> dsList = (List)request.getAttribute("dsList");
	PetSitterBoard boardT = (PetSitterBoard)request.getAttribute("boardT");
	boolean certificateFlag = (boolean)request.getAttribute("certificateFlag");
	PetSitter sitterT = (PetSitter)request.getAttribute("sitterT");
	User userT = (User)request.getAttribute("userInfoT");
	List<PlusOptionService> pOServiceList = (List)request.getAttribute("pOServiceList");
	List<PetSitterCertificate> certificateT = (List)request.getAttribute("certificateT");
	List<String> BoardImgs = (List)request.getAttribute("boardImgs");
	boolean bookmarkFlag = (boolean)request.getAttribute("bookmark");
	List<ReviewPetSitter> reviews = (List)request.getAttribute("reviews");
	List<PetInfo> petsInfos = (List)request.getAttribute("petsInfo");


%>
      
<%@ include file="/views/common/header.jsp"%>

    <section>
    
    <div class="row no-gutters" id="main_img">

            <div class="col-lg-8" style="height: 100%;">

                <div style="width: 100%; height: 100%; overflow: hidden;">

					<%if(BoardImgs.size()>0) {%>
                    	<img onclick="main_img_view();" src="<%=request.getContextPath()%>/img/boardMain/<%=BoardImgs.get(0) %>" alt="" width="100%">
					<%} %>
                </div>

            </div>


            <div class="col-lg-4" style="height: 100%;">
                <div style="width: 100%; height: 50%; overflow: hidden;">
                
					<%if(BoardImgs.size()>1) {%>
                    	<img onclick="main_img_view();" src="<%=request.getContextPath()%>/img/boardMain/<%=BoardImgs.get(1) %>" alt="" width="100%">
                    <%} %>

                </div>

                <div style="width: 100%; height: 50%; overflow: hidden;">

					<%if(BoardImgs.size()>2){ %>
                    	<img onclick="main_img_view();" src="<%=request.getContextPath()%>/img/boardMain/<%=BoardImgs.get(2) %>" alt="" width="100%">
                    <%} %>
					
                </div>
            </div>

        </div>

        <div style="height: 10px;"></div>

        <div class="row" id="main_content">

            <div class="col-lg-6 main_content_01">

				<%if(!bookmarkFlag){%>
	                <img id="bookmark" onclick="bookmark();"src="<%=request.getContextPath()%>/img/bookmark/bookmarkBlack.png" alt=""
	                width="50px" height="50px">
                <%} else{%>
                <img id="bookmark" onclick="bookmark();"src="<%=request.getContextPath()%>/img/bookmark/bookmarkRed.png" alt=""
	                width="50px" height="50px">
               	<% }%>
               	
                <p style="display: inline;margin-left: 50px; font-size:24px; vertical-align: middle;"><%=boardT.getBoardTitle() %></p>

                

            </div>

            <div class="col-lg-6 main_content_01">

				
				
                <button id="bline_process" class="btn btn-secondary button_radius" style="margin-left: 10px;">블라인드 처리</button>
                <button onclick="handlePaste();"class="btn btn-secondary button_radius">수정</button>
                <button class="btn btn-secondary button_radius">공유</button>

            </div>

			<div class="col-lg-6 main_content_02" >
                <div id="main_content_02_info" class="row no-gutters" style="width:100%; height:100%">
                
                	<div class="col-lg-4" style="width:120px; height:120px">
                	
	                	<div id="profile">
	                		<img src="<%=request.getContextPath() %>/img/profile/sitterT" alt=""
	                        width="100%" height="100%">
                        </div>
                	
                	</div>
                	
                	<div class="col-lg-8" style="height: 100%;">
                	
                		<table style="width:200px; height:50%; margin-left: 50%;transform: translateX(-50%); margin-top: 50px;">
                            <tr>
                            	<%if(certificateFlag) {%>
	                                <td><button>프로 펫시터</button></td>
	                                <td><%=userT.getUserName().substring(0,1)%>*<%=userT.getUserName().substring(2)%> 펫시터</td>
                                <%} else{%>
                                	<td colspan="2"><%=userT.getUserName().substring(0,1)%>*<%=userT.getUserName().substring(2)%></td>
                                <%} %>
                                
                            </tr>
                            <tr>
                                <td colspan="2"><%=userT.getAddress() %></td>
                            </tr>
                        </table>
                	
                	</div>
                
                </div>
            </div>

            <div class="col-lg-6 main_content_02">

                <div id="main_content_02_calendar">

                    <p class="sub_title">예약 가능 날짜</p>

                    <svg class="bi bi-chevron-left" width="30px" height="30px" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-left:28px"> 
                        <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 010 .708L5.707 8l5.647 5.646a.5.5 0 01-.708.708l-6-6a.5.5 0 010-.708l6-6a.5.5 0 01.708 0z" clip-rule="evenodd"/>
                    </svg>

                    <p style="display: inline; vertical-align: top; font-size:20px; padding-left: 150px; padding-right: 150px;">2020년 2월</p>

                    <svg class="bi bi-chevron-right" width="30px" height="30px" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="   M4.646 1.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L10.293 8 4.646 2.354a.5.5 0 010-.708z" clip-rule="evenodd"/>
                    </svg>

                    <div id="temporary1">









                    </div>

                </div>
                
            </div>

            <div class="row col-lg-12 no-gutters" style="height: 30px; margin-top: 30px;">

                <div class="col-lg-6 no-gutters main_content_03">

                    <button onclick="info();">
                        <p class="sub_title">펫시터 정보</p>
                    </button>

                </div>

                <div class="col-lg-6 no-gutters main_content_03">

                    <button onclick="review();">
                        <p class="sub_title">후기</p>
                    </button>

                </div>

            </div>


            <div class="col-lg-6 main_content_04 info" style="border-right: 1px solid black;">

                <div class="main_content_04_sub">

                    <p class="sub_title"><%=userT.getUserName().substring(0,1)%>*<%=userT.getUserName().substring(2)%> 펫 시터 님을 소개합니다.</p>                    
                    <div class="write_space" style=""overflow:hidden; word-break:break-all"><%=boardT.getBoardInfo() %></div>

					<%if(certificateFlag){%>
                    	<p class="sub_title">자격증 및 교육 수료</p>

	                    <table id="certificate">
	
	                        <tr><!-- https://www.icqa.or.kr/cn/data/editor/1807/cd5a1aca61481dbfad1f1be4de961b59_1532498782_3776.jpg -->
	                            <td rowspan="3"><img src="<%=request.getContextPath() %>/img/certificate/<%=certificateT.get(0).getCertificateFilename()%>" width="200px" height="130px"></td>
	                            <td><%=certificateT.get(0).getCertificateName() %></td>                            
	                        </tr>
	
	                        <tr>                            
	                            <td><%=certificateT.get(0).getCertificationNmae() %>에서 발급</td>
	                        </tr>
	
	                        <tr>
	                            <td><%=certificateT.get(0).getDateOfAcquisition() %> 발급</td>
	                        </tr>
	
	
	                    </table>
					<%} %>
                    
                    

                </div>

            </div>

            <div class="col-lg-6 main_content_04 info" style="margin-bottom:100px;">

                <div class="main_content_04_sub">

                    <p class="sub_title">이용 요금</p>

                    <table id="price">
                        <tr>
                            <th>반려 동물 유형</th>
                            <th>1박 케어</th>
                        </tr>
                        <tr>
                            <td>소형견</td>
                            <td><%=boardT.getSmallPrice() %>원</td>
                        </tr>
                        <tr>
                            <td>중형견</td>
                            <td><%=boardT.getMiddlePrice() %>원</td>
                        </tr>
                        <tr>
                            <td>대형견</td>
                            <td><%=boardT.getBigPrice() %>원</td>
                        </tr>
                    </table>
                    
                    <table id="price_discription">
                        <tr>
                            <td>반려동물추가비</td>
                            <td style="text-align: right;">10,000원 할인</td>
                        </tr>
                        <tr><td></td></tr>
                        <tr><td></td></tr>
                        <tr><td></td></tr>
                        <tr>
                            <td>공휴일 연휴 할증비</td>
                            <td style="text-align: right;">기본 요금에서 10,000원 할증</td>
                        </tr>
                    </table>

                    <table id="location">
                        <tr>
                            <td style="text-align: center;"><p class="sub_title">펫시터 위치</p></td>
                            <td rowspan="2" style="text-align: right;"><img src="https://www.hanchao.com/company/kr/img/map_img01.jpg" width="200px" height="100px"></td>
                        </tr>
                        <tr>
                            <td style="text-align: center;"><%=boardT.getBoardAddress() %><br><%=boardT.getBoardAddressContent() %></td>
                        </tr>
                    </table>

                </div>

            </div>

            <div class="col-lg-12 info"><p class="sub_title">기본 제공 서비스</p></div>
            <div class="col-lg-1 info"></div>

            <div class="row col-lg-10 info" id="default_service">

                

                    
                <!-- <table style="display: inline;">
                    
                    <tr>
                        <td rowspan="2">

                            <img style="vertical-align: middle;" src="https://cdns.iconmonstr.com/wp-content/assets/preview/2017/240/iconmonstr-medical-11.png" width="40px" height="30px" style="margin-top: 20px">

                        </td>
                        <td>실내 놀이</td>
                    </tr>

                    <tr>
                        <td>터그놀이, 노즈워크 등</td>
                    </tr>

                </table> -->

				<%for(String s : dsList){%>
	                <div class="service_sub col-lg-3">
	                    <table>
	
	                        <tr>
	                            <td>
	    
	                                <img src="https://cdns.iconmonstr.com/wp-content/assets/preview/2017/240/iconmonstr-medical-11.png" width="40px" height="30px">
	    
	                            </td>
	                            <td style="text-align: right;"><%=s %></td>
	                        </tr>
	  
	    
	                    </table>
	                </div>
                <%} %>
                
            </div>

            <div class="col-lg-1 info" ></div>


            <div class="col-lg-12 info"><p class="sub_title">이용 가능한 추가 옵션</p></div>
            <div class="col-lg-1 info"></div>

            <div class="row col-lg-10 info" id="add_service">

				<%for(PlusOptionService pos : pOServiceList){%>
	                <div class="service_sub col-lg-3">
	                    <table>
	
	                        <tr>
	                            <td>
	    
	                                <img src="https://cdns.iconmonstr.com/wp-content/assets/preview/2017/240/iconmonstr-medical-11.png" width="40px" height="30px">
	    
	                            </td>
	                            <td style="text-align: right;"><%=pos.getPlusOptionType() %></td>
	                        </tr>
	                    </table>
	                </div>  
                <%} %>

            </div>

            <div class="col-lg-1 info"></div>

        </div>

        <div class="row" id="review_con">
        <%for(ReviewPetSitter review : reviews) {%>    
            <div class="col-lg-1"></div>
            
            

            <div class="col-lg-10 row review">
                
                
	                <div class="col-lg-12">
	
	                    <style>
	                        #review tbody{
	                            width:100%;
	                        }    
	                        #review td{
	                            width:300px;
	                        }
	                    </style>
	
	                    <table style="margin-top: 20px; width:100%; word-break:break-all">
	                        <tr>
	                        
	                        	<td><%=review.getUserName().substring(0,1)%>*<%=review.getUserName().substring(2)%><br><%=review.getReviewDate() %></td>
	                        	<%if(userId.equals(sitterT.getPetSitterId())){%>
	                            	<td style="text-align: right;"><button id="bline_request" style="width:150px; height:30px; margin-bottom: 50px;">블라인드 요청</button></td>
	                            <%} else{%>
	                            	<td style="text-align: right;"><button id="bline_request" style="display:none; width:150px; height:30px; margin-bottom: 50px;">블라인드 요청</button></td>
	                            <%} %>
	                            
	                        </tr>
	                        <tr>
	                            <td colspan="2"><%=review.getReviewText() %></td>
	                        </tr>
	                    </table>
	
	                </div>
	
					<%if(review.getReviewSend()!=null) {%>
		                <div class="col-lg-2" style="height: 200px;">
		
		                    <div class="review_profile">
		                        <img src="<%=request.getContextPath() %>/img/profile/<%=sitterT.getPetSitterImg() %>" alt=""
		                        width="100%" height="100%">
		                    </div>
		
		                </div>
		    
		                    
		                <div class="col-lg-10">
		
		                    <div style="border:1px solid gray; width:100%; height: 100px; margin-top: 50px;"></div>
		
		                </div>
		       		<%} %>
	                
	                
	            </div>
	            
	
	            <div class="col-lg-1"></div>
	            <%} %>
	    	
        </div>
        
	    <div class="row" id="section_end1">
	        <div class="col-lg-10" style="height: 100%;">
	            
	        </div>
	
	        <div class="col-lg-2" style="height: 100%;">
	            <button id="reservation" class="btn btn-secondary button_radius" style="width: 150px; height: 60%; margin-top: 12.5px;">예약 하기</button>
	        </div>
	    </div>
	
	
	    <div class="row" id="section_end2">
	        <div class="col-lg-10" style="height: 100%;">
	            <div style="position: absolute; top:50%; transform: translateY(-50%); margin-left:30px;">날짜: ~~~~~~   소형견: 2 중형견: 0 대형견 0    추가옵션: 목욕, 약물복용, 등 합계금액: xxxx원</div>
	        </div>
	
	        <div class="col-lg-2" style="height: 100%;">
	             <button id="reservation_end" class="btn btn-secondary button_radius" style="width: 150px; height: 60%; margin-top: 12.5px;">결제</button>
	        </div>
	
	    </div>

    </section>







    <div id="reservation_modal" class="modal">
 
        <!-- Modal content -->
        <div class="modal-content" style="width:30%">

            <table>
                <tr>
                    <td style="width: 70px"></td>
                    <td style="text-align: center;">예약하기</td>
                    <td><span class="close">&times;</span></td>
                </tr>
            </table>

            <hr>

            <br>

            <div>체크 인 - 체크 아웃</div>
            <hr>
            <!-- 달력 api 완성 이후 작업 -->
            <div>xxxx년 x월 xx일 ~ xxxx년 x월 xx일</div>
            
            <br>
            
            <table>
                <tr>
                    <td>반려견 선택</td>
                   	<%for(PlusOptionService pos: pOServiceList) {%>
	                    <%if(pos.getPlusOptionType().equals("노견케어")) {%>
	                    <td style="text-align: right;">노견케어는 지원하지 않습니다.</td>
	                    
	                    <%break;} %>
                    <%} %>
                </tr>
            </table>
            <hr style="margin-top: 1px;">
            <div class="row">
            	<%for(PetInfo petInfo : petsInfos) {%>
                	<div class="col-md-6"><button onclick="petDisplayCh('<%=petInfo.getPetCode() %>');"; style="width: 80%;margin-left: 50%;transform: translateX(-50%);"><%=petInfo.getPetName() %></button></div>
                <%} %>
            </div>
            
            <br>

			<%for(PetInfo petInfo : petsInfos) {%>
				<div id="<%=petInfo.getPetCode()%>" style="display :none;">
		            <div>추가 옵션 선택</div>
		            <hr>
		            <table>
		            	<%for(PlusOptionService pos : pOServiceList) {%>
		            		<%if(pos.getPlusOptionType().equals("목욕가능")){ %>
		            			<%if(petInfo.getPetWeight().equals("소형")) {%>
				            		<tr>
					                    <td>목욕</td>
					                    <td style="text-align: right; margin-right: 30px; "><%=pos.getSmallPrice() %>원&nbsp;&nbsp;&nbsp;<input onclick="bath_con('<%=petInfo.getPetName() %>');" id="bath" type="checkbox"></td>
					                </tr>
					         	<%}else if(petInfo.getPetWeight().equals("중형")) {%>
					         		<tr>
					                    <td>목욕</td>
					                    <td style="text-align: right; margin-right: 30px; "><%=pos.getMiddlePrice() %>원&nbsp;&nbsp;&nbsp;<input onclick="bath_con('<%=petInfo.getPetName() %>');" id="bath" type="checkbox"></td>
					                </tr>
					         	<%} else{ %>
					         		<tr>
					                    <td>목욕</td>
					                    <td style="text-align: right; margin-right: 30px; "><%=pos.getBigPrice() %>원&nbsp;&nbsp;&nbsp;<input onclick="bath_con('<%=petInfo.getPetName() %>');" id="bath" type="checkbox"></td>
					                </tr>
					         	<%} %>
			                <%break;} %>
		            	<%} %>
		            	
		            	<%-- <tr>
		                    <td>목욕</td>
		                    <td style="text-align: right; margin-right: 30px; ">??원&nbsp;&nbsp;&nbsp;<input onclick="bath_con('<%=petInfo.getPetName() %>');" id="bath" type="checkbox"></td>
		                </tr> --%>
		
		            	<%for(PlusOptionService pos : pOServiceList) {%>
		            		<%if(pos.getPlusOptionType().equals("약물복용")){ %>
		            			<%if(petInfo.getPetWeight().equals("소형")) {%>
				            		<tr>
					                    <td>약물 복용</td>
					                    <td style="text-align: right; margin-right: 30px;"><input onclick="medication_con('<%=petInfo.getPetName() %>');" id="Medication" type="checkbox"></td>
					                </tr>
					         	<%}else if(petInfo.getPetWeight().equals("중형")) {%>
				            		<tr>
					                    <td>약물 복용</td>
					                    <td style="text-align: right; margin-right: 30px;"><input onclick="medication_con('<%=petInfo.getPetName() %>');" id="Medication" type="checkbox"></td>
					                </tr>
					         	<%} else{ %>
				            		<tr>
					                    <td>약물 복용</td>
					                    <td style="text-align: right; margin-right: 30px;"><input onclick="medication_con('<%=petInfo.getPetName() %>');" id="Medication" type="checkbox"></td>
					                </tr>
					         	<%} %>
			                <%break;} %>
		            	<%} %>		                
		
<%-- 						<%for(PlusOptionService pos : pOServiceList) {%>
							<%if(pos.getPlusOptionType().equals("집앞픽업")){ %>
				                <tr>
				                    <td>집 앞 픽업</td>
				                    <td style="text-align: right; margin-right: 30px;">편도 <%=pos.getOneWayPrice() %>원 왕복 <%=pos.getAllWayPrice() %>원&nbsp;&nbsp;&nbsp;<input type="checkbox"></td>
				                </tr>
				                <tr>
				                    <td colspan="2">펫 시터에게 갈 때 <input type="radio" name="move"> &nbsp;&nbsp;집으로 돌아 갈 때 <input type="radio" name="move">&nbsp;&nbsp; 왕복 <input type="radio" name="move"></td>
				                </tr>
			                <%} %>
		                <%} %>
		 --%>
		            </table>
	            </div>
            <%} %>

            <div>추가 요청 및 문의 사항</div>
            <input type="text" placeholder="300자 이내" style="width: 100%; line-height: 100px;">

            <div>영수증</div>
            <hr>

            <table>
                <tr>
                    <td>날짜</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
                <tr>
                    <td>대중소</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
                <tr>
                    <td>목욕</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
                <tr>
                    <td>약물복용</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
                <tr>
                    <td>집앞픽업</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
            </table>

            <hr>

            <table>
                <tr>
                    <td>합계금액</td>
                    <td style="text-align: right;">해당금액</td>
                </tr>
            </table>

            <div class="row">
                <div class="col-md-4"></div>

                <div class="col-md-4"><button id="select_end">선택완료</button></div>

                <div class="col-md-4"></div>
            </div>
            
      </div>

    </div>

    <!-- The Modal -->
    <div id="bline_process_modal" class="modal">

        <!-- Modal content -->
        <div class="modal-content" style="height: 230px; margin-top: 15%; width:500px;">
            <table>
                <tr>
                    <td style="width: 70px"></td>
                    <td style="text-align: center;">블라인드 처리</td>
                    <td><span class="close">&times;</span></td>
                </tr>
            </table>

            <hr>

            <div class="row" style="height: 85px; margin-top:20px;">

                <div class="col-md-2"></div>
                <div class="col-md-8">사유<br>
                    <input type="text" list="reason" style="width:110%" placeholder="사유 선택">
                    <datalist id="reason">
                        <option value="사유1"></option>
                        <option value="사유2"></option>
                        <option value="사유3"></option>
                    </datalist></div>                    
                <div class="col-md-2"></div>

            </div>

            <hr>

            <input type="button" value="블라인드 처리" style="width:40%; margin-left: 50%; transform: translateX(-50%);">

        </div>

    </div>


    <!-- The Modal -->
    <div id="bline_request_modal" class="modal">

        <!-- Modal content -->
        <div class="modal-content" style="height: 230px; margin-top: 15%; width:500px;">
            <table>
                <tr>
                    <td style="width: 70px"></td>
                    <td style="text-align: center;">블라인드 요청</td>
                    <td><span class="close">&times;</span></td>
                </tr>
            </table>

            <hr>

            <div class="row" style="height: 85px; margin-top:20px;">

                <div class="col-md-2"></div>
                <div class="col-md-8">사유<br>
                    <input type="text" list="reason" style="width:110%" placeholder="사유 선택">
                    <datalist id="reason">
                        <option value="사유1"></option>
                        <option value="사유2"></option>
                        <option value="사유3"></option>
                    </datalist></div>                    
                <div class="col-md-2"></div>

            </div>

            <hr>

            <input type="button" value="블라인드 요청" style="width:40%; margin-left: 50%; transform: translateX(-50%);">

        </div>

    </div>

    <!-- The Modal -->
    <div id="reservation_end_modal" class="modal">

        <!-- Modal content -->
        <div class="modal-content" style="width: 30%;">
            <table>
                <tr>
                    <td style="width: 70px"></td>
                    <td style="text-align: center;">결제 수락 대기</td>
                    <td><span class="close">&times;</span></td>
                </tr>
            </table>

            <hr>

            <table style="text-align: center; margin-top: 70px;">
                <tr><td>총 결제 금액</td></tr>
                <tr><td>xx0,000원</td></tr>
                <tr><td><a href="" style="text-decoration: none;">>예약 상세 보기</a></td></tr>
            </table>

            <hr style="margin-top: 75px">

            <div class="row no-gutters" id="end_modal">

                <div class="col-md-6"><button onclick="resulvation_cancel();">결제 취소</button></div>
                <div class="col-md-6"><button>펫 시터와 채팅</button></div>

            </div>

        </div>

    </div>

        <!-- The Modal -->
        <div id="img_modal" class="modal" >

            <!-- Modal content -->
            <div class="modal-content" style="width: 100%; height: 100%; margin: 0 0;">


                <div class="row" style="height: 100%;">

                    
                    <div class="col-lg-2" style="height: 100%;">
                    
                        <svg onclick="front_img();" class="bi bi-chevron-left" width="70px" height="70px" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-left:28px; margin-top:300px;"> 
                            <path fill-rule="evenodd" d="M11.354 1.646a.5.5 0 010 .708L5.707 8l5.647 5.646a.5.5 0 01-.708.708l-6-6a.5.5 0 010-.708l6-6a.5.5 0 01.708 0z" clip-rule="evenodd"/>
                        </svg>

                    </div>
                

                    
                    <div class="col-lg-8" style="height: 100%; margin-top: 60px">

                        <div style="width: 100%; height: 400px; ">
                            
                            <img id="modal_img" src="" width="100%" height="100%" >
                            
                        </div>

                        <div class="row no-gutters" style="height: 150px; margin-top: 50px; margin-left: 13px;">
                        
                            <div class="col-lg-12 row " style="height: 100%;">

                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img id="firstImg" data-index="0" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/fd37e21adee1436c8b9341758eafe5d5.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="1" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/cc06070da695433f92721c1c7ec4f08d.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="2" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/fdd7ce476cb1458c88e67ea1ac5873c4.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="3" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/83cf124a05ca4b2aad158d95c0f4d577.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="4" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/6feeb5a1ed5741b8b196a746e8ccf38f.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="5" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/6e95dd0cb42e424691c11461f2d5c58c.jpg" width="100%" height="100%"></div>
                                <div class="col-lg-3 modal_sub_img_none" style="height:100%"><img data-index="6" onclick="small_image();" class="modal_sub_img" src="https://d1cd60iwvuzqnn.cloudfront.net/page/c5cd9b95324142e7b023a2f0ce3a121c.jpg" width="100%" height="100%"></div>

                            </div>
                        
                        </div>

                    </div>

                    <div class="col-lg-2" style="height: 100%;">

                        <span class="close" style="text-align: right; font-size: 60px;">
                            &times;
                        </span>

                        <svg onclick="end_img();" class="bi bi-chevron-right" width="70px" height="70px" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg" style="margin-left:130px; margin-top:240px;">
                            <path fill-rule="evenodd" d="   M4.646 1.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L10.293 8 4.646 2.354a.5.5 0 010-.708z" clip-rule="evenodd"/>
                        </svg>

                    </div>

                </div>
    
            </div>

    
        </div>

<script>

var flag = <%=bookmarkFlag%>;
console.log(window.location.href);

function bookmark(){
		
    	$.ajax({
    		type: "POST",
    		url: "<%=request.getContextPath()%>/BookmarkChange.do",
    		data: {"userId": "<%=request.getParameter("userId")%>", "sitterId": "<%=sitterT.getPetSitterId()%>", "bookmarkFlag": flag},
    		success: function(data){
    			flag = !flag;
    			
    		},
    		error: function(){
    			// jsp의 전역변수
    		}
    	});
    	
    	if(flag)
			event.target.src = "<%=request.getContextPath()%>/img/bookmark/bookmarkBlack.png";
		else
			event.target.src = "<%=request.getContextPath()%>/img/bookmark/bookmarkRed.png";
		
}

bline_process.onclick = function() {
    bline_process_modal.style.display = "block";
    $('body').css("overflow", "hidden");
}

function petDisplayCh(data){
	
	<%for(PetInfo petInfo : petsInfos){%>
	
		$("#" + <%=petInfo.getPetCode()%>).attr("style", "display : none;");
	
	<%}%>
	
	
	
	
	$("#" + data).attr("style", "display :block; width:100%; height:100%;");
	
}

function bath_con(data){
	var code = "<tr id='bath_content'><td>" + data +  "<br><input type='text' placeholder='ex)입력해!!'></td><td style='text-align:right;'>목욕 횟수<br><input type='number'></td></tr>";
	
	$("#bath").parent().parent().after(code);
	
	if(document.getElementById("bath").checked==false)
		$("tr").remove("#bath_content");
	
}

function medication_con(data){
	var code = "<tr id='medication_content'><td colspan='2'>" + data +  "<br><input style='width: 100%;' type='text' placeholder='입력!'></td></td></tr>";

	$("#Medication").parent().parent().after(code);
	
	if(document.getElementById("Medication").checked==false)
		$("tr").remove("#medication_content");
	
}

	
</script>


<%@ include file="/views/common/footer.jsp"%>
<script src="js/PST.js"></script>