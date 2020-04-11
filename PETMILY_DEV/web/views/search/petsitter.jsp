<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@include file="/views/common/header.jsp" %>
	

	
  <div class="container">
    <nav>
      <div>
        menu
      </div>
    </nav>
    <main>
      <section class="filter_container mt-4 mb-3">
        <div class="row justify-content-center">
          <div class="col-1"></div>
          <div class="col-5">
            <div class="place_container row align-items-center" id="search_box">
              <label class="ml-3">장소</label>
              <input type="text" placeholder="동 이름을 검색하세요" />
            </div>
          </div>
          <div class="col-5">
            <div class="place_container row align-items-center justify-content-between" id="check_in_out">
              <button type="button" class="btn">체크인</button>
              <span>
                <i class="fas fa-arrow-right"></i>
              </span>
              <button type="button" class="btn">체크아웃</button>
            </div>
          </div>
          <div class="col-1"></div>
        </div>
        <div class="filter_box mt-5">
          <header>
            <span>필터 추가하기</span>
          </header>
          <article class="filter_btn_box row mt-4">
            <div class="col-1"></div>
            <div class="col-10 row justify-content-between">
              <button type="button" class="btn">프로 펫 시터</button>
              <button type="button" class="btn">반려동물 없음</button>
              <button type="button" class="btn">픽업 가능</button>
              <button type="button" class="btn">대형견 가능</button>
              <button type="button" class="btn">노견 케어</button>
            </div>
            <div class="col-1"></div>
          </article>
          <footer class="search_btn">
            <button type="button" class="btn">검색</button>
          </footer>
        </div>
      </section>
      <section class="pet_sitter_container border-top">
        <header class="mt-4 row justify-content-center">
          <div class="col-1"></div>
          <div class="col-5">
            <p class="text-dark">해당 지역에 대해 200개 이상의 후기가 있으며, 평점은 5점 만점에 4.7점 입니다.</p>
          </div>
          <div class="col-5">
            <ul class="nav justify-content-end">
              <li class="nav-item active">인기 순</li>
              <li class="nav-item inactive">후기 순</li>
              <li class="nav-item inactive">가격 순</li>
              <li class="nav-item inactive">가까운 순</li>
            </ul>
            <ul class="nav justify-content-end mt-3">
              <li class="nav-item inactive">높은 가격 순</li>
              <li class="nav-item inactive">낮은 가격 순</li>
            </ul>
          </div>
          <div class="col-1"></div>
        </header>
        <section class="mt-5 row justify-content-center">
          <div class="col-2"></div>
          <div class="col-8">
            <div class="pet_sitter_info_container border-top row px-5 py-3">
              <div class="col-6 text-center">
                <img src="https://images.mypetlife.co.kr/wp-content/uploads/2018/02/08140957/shutterstock_292917410.jpg" class="figure-img img-fluid rounded" alt="..." width="150px" height="100px">
              </div>
              <div class="col-6">
                <div class="row align-items-center">
                  <button class="btn btn-outline-secondary rounded-pill">프로 펫 시터</button>
                  <span class="ml-2">서울 서대문구 홍은동</span>
                  <button class="ml-auto">좋아요</button>
                </div>
                <div class="mt-3">
                  <p class="h5">차분하고 세심하게 돌봅니다</p>
                </div>
                <div class="align-items-end row justify-content-between">
                  <div>후기</div>
                  <div>
                    <div>1박</div>
                    <div>하루</div>
                  </div>
                </div>
              </div>
            </div>
            <div class="pet_sitter_info_container border-top row px-5 py-3">
              <div class="col-6 text-center">
                <img src="https://images.mypetlife.co.kr/wp-content/uploads/2018/02/08140957/shutterstock_292917410.jpg" class="figure-img img-fluid rounded" alt="..." width="150px" height="100px">
              </div>
              <div class="col-6">
                <div class="row align-items-center">
                  <button class="btn btn-outline-secondary rounded-pill">프로 펫 시터</button>
                  <span class="ml-2">서울 서대문구 홍은동</span>
                  <button class="ml-auto">좋아요</button>
                </div>
                <div class="mt-3">
                  <p class="h5">차분하고 세심하게 돌봅니다</p>
                </div>
                <div class="align-items-end row justify-content-between">
                  <div>후기</div>
                  <div>
                    <div>1박</div>
                    <div>하루</div>
                  </div>
                </div>
              </div>
            </div>
            <div class="pet_sitter_info_container border-top row px-5 py-3">
              <div class="col-6 text-center">
                <img src="https://images.mypetlife.co.kr/wp-content/uploads/2018/02/08140957/shutterstock_292917410.jpg" class="figure-img img-fluid rounded" alt="..." width="150px" height="100px">
              </div>
              <div class="col-6">
                <div class="row align-items-center">
                  <button class="btn btn-outline-secondary rounded-pill">프로 펫 시터</button>
                  <span class="ml-2">서울 서대문구 홍은동</span>
                  <button class="ml-auto">좋아요</button>
                </div>
                <div class="mt-3">
                  <p class="h5">차분하고 세심하게 돌봅니다</p>
                </div>
                <div class="align-items-end row justify-content-between">
                  <div>후기</div>
                  <div>
                    <div>1박</div>
                    <div>하루</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-2"></div>
        </section>
      </section>
    </main>  
  </div> 
	
<%@include file="/views/common/footer.jsp" %>  