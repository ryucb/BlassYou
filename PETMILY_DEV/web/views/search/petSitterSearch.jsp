<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@include file="/views/common/header.jsp" %>
	
	<style>
		#add{
		   padding-left: 100px;

		}
		#d{
			padding-left: 100px;
		}
		.btn{
			border-radius: 16px;
		}
	
		.mr button:not(:last-child) {
 			 margin-right: 90px;
   		}	
   		
   		#search{
   			padding-right: 130px;
   		}	
   		
   		.bt{
   			margin-right: 20px;
   		}
   		
		.input_container {
		  width: 300px;
		  height: 40px;
		  background-color: #f3f6f8;
		  border: 1px solid #c3d1da;
		  border-radius: 21px;
		  display: flex;
		  align-items: center;
		}
		
		.input_container:last-child {
		  margin-left: auto;
		}
		
		.input_label {
		  margin-left: 20px;
		}
		
		.input_box {
		  margin-left: 5px;
		  border: none;
		  width: 220px;
		  background-color: #f3f6f8;
		}
		
	</style>
	
	
	<section>
	
		<br>
		<br>



	
		
		<div class="containers">
		  <div class="rows form-group" >
		    <div class="input_container">
		      <span class="input_label">장소</label>
		      <input class="input_box" type="text" />
		    </div>
		    <div class="input_container">
		      <span class="input_label">대여</label>
		      <input class="input_box" type="text" />
		    </div>
		  </div>
		  <div class="rows">
		    
		  </div>  
		</div>

	    
	    <br>
	    <br>
		<div class="col-12">
			
			<div class="mr flex row justify-content-center" id="d" style="text-align:center;">
			    <button type="button" class="btn btn-outline-warning  text-center">프로 펫시터</button>
			    <button type="button" class="btn btn-outline-warning text-center">반려동물 없음</button>
			    <button type="button" class="btn btn-outline-warning text-center">픽업 가능</button>
			    <button type="button" class="btn btn-outline-warning text-center">대형견 가능</button>
			    <button type="button" class="btn btn-outline-warning text-center">노견 케어</button>
			    
			 </div>
			
			<br>
			<br>
			<div class="row justify-content-end" id="search">
				<button type="button" class="btn btn-dark">검색</button>
			</div>
		</div>
		
	
	</section>
	
	
	
	
	
	
	<hr>
	
	<section class="container col-8">
	
		
		<br>
		
		<div class="row">
			<div class="col">
				<p class="text-body"><small>해당 지역에 대해 200개의 후기가 있으며,평점은 5점 만점에 4.7점입니다.</small></p>
			</div>
			<div class="col">
				<div class="row justify-content-around bt">
					
					<button type="button" class="filter btn">인기 순</button>
					<button type="button" class="filter btn">후기 순</button>
					<button type="button" class="filter btn">가격 순</button>
					<button type="button" class="filter btn">가까운 순</button>
				
				</div>
				
			</div>
			
		</div>
		
		<br>
		
		<div class="row">
		
		
		</div>
		
		
		<hr>
		
		<div class="row align-items-end">
			<div class="col">
				<img src="https://images.homify.com/c_fill,f_auto,h_700,q_auto/v1558895377/p/photo/image/3068714/5.jpg" class="rounded" width="340px" height="220px">
			</div>
			<div class="col">
				<table>
					<tr>
						<td>
							<button type="button" class="btn-sm btn btn-outline-secondary">프로펫시터</button>
						</td>
						<td colspan="2">
							<p class="title"><small>서울 서대문구 홍은동</small></p>
						</td>
						<td>
							<span class="fas fa-heart heart"></span>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							제목 들어갈 공간
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<span class="col">
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								
								<small> 후기 40개 </small>
							</span>
						</td>
						<td colspan="2">
								<h6 class="text">1박\40,000</h6>
								<h6 class="text">하루\30,000</h6>
						</td>
					</tr>
				
				</table>	
			</div>
		</div>
		
		
		
		<hr>
		
		<div class="row">
			<div class="col">
				<img src="https://blog.lgdisplay.com/lgdisplay/wp-content/uploads/2018/04/20180409_004820.jpg" class="rounded" width="340px" height="220px">
			</div>
			<div class="col">
				<table>
					<tr>
						<td>
							<button type="button" class="btn-sm btn btn-outline-secondary">프로펫시터</button>
						</td>
						<td colspan="2">
							<p class="title"><small>서울 서대문구 홍은동</small></p>
						</td>
						<td>
							<span class="fas fa-heart heart"></span>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							제목 들어갈 공간
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<span class="col">
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								
								<small> 후기 40개 </small>
							</span>
						</td>
						<td colspan="2">
								<h6 class="text">1박\40,000</h6>
								<h6 class="text">하루\30,000</h6>
						</td>
					</tr>
				
				</table>	
				
			</div>
		</div>
				
				
				
				
		
		
		<hr>
		
		<div class="row">
			<div class="col">
				<img src="https://phmkorea.com/wp-content/uploads/2018/06/%ED%95%B4%EC%99%B8-%EC%9D%B8%EB%8D%94%EC%8A%A4%ED%8A%B8%EB%A6%AC%EC%96%BC-%EB%94%94%EC%9E%90%EC%9D%B8-%EC%9D%B8%ED%85%8C%EB%A6%AC%EC%96%B4-5.jpg" class="rounded" width="340px" height="220px">
			</div>
			<div class="col">
				<table>
					<tr>
						<td>
							<button type="button" class="btn-sm btn btn-outline-secondary">프로펫시터</button>
						</td>
						<td colspan="2">
							<p class="title"><small>서울 서대문구 홍은동</small></p>
						</td>
						<td>
							<span class="fas fa-heart heart"></span>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							제목 들어갈 공간
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<span class="col">
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								
								<small> 후기 40개 </small>
							</span>
						</td>
						<td colspan="2">
								<h6 class="text">1박\40,000</h6>
								<h6 class="text">하루\30,000</h6>
						</td>
					</tr>
				
				</table>	
				
			</div>
		</div>
		
		
		
		
		<hr>
		
		<div class="row">
			<div class="col">
				<img src="https://i.pinimg.com/originals/3e/19/3b/3e193beb54aa78d26762757fcdb72d1a.jpg" class="rounded" width="340px" height="220px">
			</div>
			<div class="col">
				<table>
					<tr>
						<td>
							<button type="button" class="btn-sm btn btn-outline-secondary">프로펫시터</button>
						</td>
						<td colspan="2">
							<p class="title"><small>서울 서대문구 홍은동</small></p>
						</td>
						<td>
							<span class="fas fa-heart heart"></span>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							제목 들어갈 공간
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<span class="col">
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								<i class="far fa-star"></i>
								
								<small> 후기 40개 </small>
							</span>
						</td>
						<td colspan="2">
								<h6 class="text">1박\40,000</h6>
								<h6 class="text">하루\30,000</h6>
						</td>
					</tr>
				
				</table>	
			
			</div>
		</div>
		
		<hr>
		
		<div class="row justify-content-center">
			
				<button type="button" class="btn-sm btn btn-outline-secondary">글 등록하기</button>
			
		
		</div>
		<br>

	</section>
	
	
<style>
	tr,td,div,gspan{
		border:solid 1px;
	}
	.text{
		text-align:right;
	}
	.heart{
		padding-left: 90px;
	}
	td{
		width:140px;
		height:70px;
	}
	.title{
		text-align:center;
	}
	.price{
		
	}

</style>	
	
<%@include file="/views/common/footer.jsp" %>  