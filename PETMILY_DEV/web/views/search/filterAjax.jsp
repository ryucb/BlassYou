<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@page import="java.util.List,com.petmily.search.model.vo.PetsitterSearch" %>

<% 
	List<PetsitterSearch> list=(List)request.getAttribute("list");
%>


<%@ include file="/views/common/header.jsp" %>

      
	         <div >
	          
	          <%for(PetsitterSearch ps:list) {%>
	            <div class="pet_sitter_info_container border-top row px-5 py-3">
	              <div class="col-6 text-center " >
	              
	              
	                <div id="demo" class="carousel slide" data-ride="carousel">
					  <!-- Indicators -->
					  <ul class="carousel-indicators">
					    <li data-target="#demo" data-slide-to="0" class="active"></li>
					    <li data-target="#demo" data-slide-to="1"></li>
					    <li data-target="#demo" data-slide-to="2"></li>
					  </ul>
					  
					  <!-- The slideshow -->
					  <div class="carousel-inner">
					  	<%for(String img : ps.getImgFile()) {%>
						    <div class="carousel-item active">
						      <img src="<%=request.getContextPath()%>/upload/<%=img %>" alt="" width="320" height="210">
						    </div>
					     <%} %>
					  </div>
					  
					  <!-- Left and right controls -->
					  <a class="carousel-control-prev" href="#demo" data-slide="prev">
					    <span class="carousel-control-prev-icon"></span>
					  </a>
					  <a class="carousel-control-next" href="#demo" data-slide="next">
					    <span class="carousel-control-next-icon"></span>
					  </a>
					</div>
	                
	              </div>
	              <div class="col-6" >
	                <div class="row align-items-center">
	                
	                	<%if(ps.getProPetsitter()!=null&&ps.getProPetsitter().equals("프로펫시터")){ %>
                  		<button class="btn btn-outline-secondary rounded-pill" id="probtn">프로 펫 시터</button>
                  		<%} %>
	                
	                  <span class="ml-2"><%= ps.getBoardAddress() %></span>
	                  <button class="ml-auto"><i class="far fa-heart"></i></button>
	                </div>
	                <div class="mt-3">
	                  <p class="h6"><%=ps.getBoardTitle() %></p>
	                </div>
	                <div class="align-items-end row justify-content-between">
	                  <div>후기 <%=ps.getReviewCount() %>   </div>
	                  <div>
	                    <% if(ps!=null){%>
	                    <div>소형 <%=ps.getOneDayCareSprice() %></div>
	                    <div>중형 <%=ps.getOneDayCareMprice() %></div>
	                    <div>대형 <%=ps.getOneDayCareBprice() %></div>
	                   <%} %>
	                  </div>
	                </div>
	              </div>
	            </div>
	            
	            <% } %>
	            
	            <hr>
	            
	            <div class="row justify-content-center">
	                  <button class="btn btn-outline-secondary rounded-pill">글쓰기</button>  
	            </div>
	            <br>
	            <br>
	            <div class="row justify-content-center" id="pageBar">
	            	<%=request.getAttribute("pageBar") %>
	            </div>
	            
	          </div>
	             
	          
<%@ include file="/views/common/footer.jsp" %>