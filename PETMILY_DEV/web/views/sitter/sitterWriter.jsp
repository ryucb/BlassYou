<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">

<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/write.css">
</head>
<body>
    <section>
        <div class="container">
            <form action="<%=request.getContextPath()%>/sitter/write?userId=sebin" method="post" onsubmit="return test();" enctype="multipart/form-data">
            <div class="row">
            <div class="col-2 menu">
                    <div id="menu">
                        <ul type="none">
                            <li class="title">회원정보</li>
                            <hr class="hr-line"/>
                            <li class="content"><a href=""> - 회원정보 수정</a></li>
                            <li class="content"><a href=""> - 회원 탈퇴</a></li>
                            <br/>
        
                            <li class="title">작성글</li>
                            <hr class="hr-line"/>
                            <li class="content"><a href=""> - 작성글 보기</a></li>
                            <li class="content"><a href=""> - 작성한 비밀후기 보기</a></li>
                            <br/>
                            
                            <li class="title">예약</li>
                            <hr class="hr-line"/>
                            <li class="content"><a href=""> - 예약 현황</a></li>
                            <li class="content"><a href=""> - 요청중인 예약</a></li>
                            <li class="content"><a href=""> - 진행중인 예약</a></li>
                            <li class="content"><a href=""> - 완료된 예약</a></li>
                            <li class="content"><a href=""> - 채팅</a></li>
                            <br/>
                            
                            <li class="title">정산</li>
                            <hr class="hr-line"/>
                            <li class="content"><a href=""> - 이번 달 정산 현황</a></li>
                            <li class="content"><a href=""> - 이번 정산 보기</a></li>
                            <br/>
                            
                            <li class="title">자격증</li>
                            <hr class="hr-line"/>
                            <li class="content"><a href=""> - 보유 자격증 목록</a></li>
                            <li class="content"><a href=""> - 자격증 추가</a></li>
                        </ul>
                    </div>
                </div>
            <div class="vl"></div>
            <div class="col-9" style="padding:0;">
                <div class="row top-div" style="height: 200px;overflow: hidden;">
                    <img class="top-img" style="width: 100%; margin-top: -230px;" src="https://images.unsplash.com/flagged/photo-1548245643-7b805f2f93d5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80">
                </div>
                <ul class="breadcrumb">
                    <li class="breadcrumb-item">작성글 보기</li>
                    <li class="breadcrumb-item active">글 작성하기</li>
                </ul>
                    <table>
                        <tr>
                            <td class="sub-title" style="width: 100px;">제목</td>
                            <td>
                                <input type="text" name="title" class="title" style="width: 500px" required>
                            </td>
                        </tr>
                        <tr>

                            <td class="sub-title" style="width: 100px; padding:10px">파일 첨부</td>
                            <td colspan="1">
                                <div class="filebox">
                                    <div class="files">
                                       <input type="button" value="파일첨부" class="addFlie" onclick="addFile();" name="file0" required>
                                    </div>
                            <div class="selectFile">
                             <input type="hidden"class="fileNo" name="count">
                            </div>
                                    </div>
                              
                            </td>
                              
                        </tr>
                       
                        <tr>
                            
                        </tr>
                        <tr>
                            <td colspan="2" class="sub-title">
                            <br>
                            펫 시터 소개글
                            <hr  id="line"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input id="intro" class="intro" type="text" name="introduce" style="width: 750px; margin-left: 5px;"
                                placeholder="&nbsp;&nbsp;300자 내외로 작성해주세요." required>
                            </td>
                        </tr>
                        <!-- 기본 이용 요금 -->
                        <tr>
                            <td colspan="2" class="sub-title">
                                <br/>
                                <br/>
                                기본 이용 요금 설정
                                <hr  id="line"/>
                            </td>
                        </table>
                        <div class="row">
                        <div class="in-table d-flex justify-content-center">
                            <table id="inner" style="width: 750px; margin-left: 60px;" >
                                <tr>
                                    <td style="width: 150px;">반려 동물 유형
                                    <button type="button" class="btn btn-secondary" data-container="body"
                                        data-toggle="toggle" data-placement="right"
                                        title="소형견 : 7kg 미만, &#10;&#13; 중형견 : 7kg-14.9kg, &#10;&#13; 대형견 : 15kg 이상">
                                            ?
                                          </button>
                                        </td>
                                    <td>1박 케어</td>
                                    
                                    <td rowspan="4" style="text-align: left;">
                                        <p style="text-align: center; margin-bottom: 0px; font-weight: 500;">< 공휴일, 연휴 요금관련 안내 ></p><br/>
                                        ‘펫 플래닛’은 공휴일, 연휴 할증 정책을 시행합니다.
                                        공휴일, 연휴에 예약시 자동으로 기존 요금에서 1만 원이 추가됩니다.
                                        </td>
                                </tr>
                                <tr>
                                    <td>소형견</td>
                                    <td><input name="small" style="width: 150px; height: 25px; font-size: 12px;"type="number" class="form-control onecare"  step="5000" min='20000' max='50000'></td>
                                    
                                    
                                </tr>
                                <tr>
                                    <td>중형견</td>
                                    <td><input name="middle" style="width: 150px; height: 25px; font-size: 12px;"type="number" class="form-control onecare" step="5000" min='20000' max='50000'></td>
                                    
                                </tr>
                                <tr>
                                    <td>대형견</td>
                                    <td><input name="big" style="width: 150px; height: 25px; font-size: 12px;"type="number" class="form-control onecare" step="5000" min='20000' max='50000'></td>
                                    
                                </tr>
                            </table>
                        </div>
                        </div><!-- 기본 이용 요금 -->
                        
                        <!-- 반려동물 추가비 할인 -->
                        <div class="row">
                         <table style="margin-top: 30px;">
                             <tr>
                                 <td class="sub-title">
                                    <div class="chiller_cb">
                                        <input onclick="toggle1();" name="addSale" class="chkbox" id="myCheckbox2" type="checkbox" value="추가할인">
                                        <label class="lab" for="myCheckbox2">반려동물 추가비 할인 </label>
                                        <span></span>
                                        <button type="button" class="btn btn-secondary" data-container="body"
                                        data-toggle="tooltip" data-placement="right"
                                        title="1마리 이상의 반려동물을 맡길 시에, 할인을 적용할지 여 부를 선택하고 새로 추가 되는 1마리당 할인 되는 가격을 적어주세요.">
                                            ?
                                          </button>
                                      </div>
                                     <hr  id="line"/>
                                 </td>
                             </tr>
                        </table>
                        <div class="row1" style="display: none;">
                            <table style="text-align: center; margin-top:0px;">
                                 <tr>
                                     <td style="width: 50px;">1박</td style="width: 100px;">
                                     <td><input name="sale" style="width: 100px; height: 25px; font-size: 12px;"type="number" id="onecare2" class="form-control onecare2" step="5000" min="5000" max='20000'></td>
                                     <td>할인</td>
                                 </tr>
                                
                             </table>
                            </div>
                            <div>
                         <!-- 반려동물 추가비 할인 -->
                        </div>
                    </div>
                    <!-- 펫 시터님 위치 -->
                    <table style= "margin-top:20px;">
                        <tr>
                            <td class="sub-title">
                            <br>
                            펫 시터님 위치
                            <hr  id="line"/>
                            </td>
                        </tr>
                    </table>
                    <table style="margin-top:0px;">
                         <tr>
                             <td class="sub-title" style=" margin-left: 10px; width: 80px;">주소 검색</td>
                             <td style="margin-left: 0px;"><input class="address" type="text" name="map" style="width: 485px;"required><button style="margin-left: 10px;">검색</button></td>
                         </tr>
                         <tr>
                             <td></td>
                             <td>
                                <div style="width: 600px; height: 250px; border: 1px solid lightgray;"></div>
                             </td>
                        </tr>
                        <tr>
                            <td class="sub-title">추가 코멘트</td>
                            <td><input type="text" name="address" style="width: 600px" placeholder=" &nbsp;&nbsp;예 ) 혜화역 도보 10분내에 있습니다 / 건대 입구 cgv에서 10분 거리입니다."></td>
                        </tr>
                     </table><!-- 펫 시터님 위치 -->

                     <!-- 기본 제공 서비스 -->
                     <table style= "margin-top:20px;">
                        <tr>
                            <td class="sub-title">
                            <br>
                            기본 제공 서비스<sup style="color: grey;">* 추가 요금을 청구할 수 없습니다.</sup>
                            <hr  id="line"/>
                            </td>
                        </tr>
                    </table>

                    <table style="margin-top:0px;">
                        <tr>
                            <td>
                                <div class="chiller_cb">
                                    <input id="myCheckbox3" name="play" type="checkbox" value="실내놀이">
                                    <label for="myCheckbox3">실내놀이</label>
                                    <span></span>
                                  </div>
                            </td>
                            <td>
                                <div class="chiller_cb">
                                    <input id="myCheckbox4" name="walk" type="checkbox" value="매일산책">
                                    <label for="myCheckbox4">매일산책</label>
                                    <span></span>
                                  </div>
                            </td>
                        </tr>
                    </table><!-- 기본 제공 서비스 -->

                    <!-- 추가 옵션 -->
                    <table style= "margin-top:20px;">
                        <tr>
                            <td class="sub-title">
                            <br>
                            추가 옵션 <sup style="color: grey;">* 일부 옵션에서 추가 요금을 청구할 수 있습니다.</sup>
                            <hr  id="line"/>
                            </td>
                        </tr>
                    </table>

                    <table style="margin-top:0px;">
                        <tr>
                            <td>
                                <div class="chiller_cb">
                                    <input name="old"id="myCheckbox5" type="checkbox" value="노견케어">
                                    <label for="myCheckbox5">노견 케어</label>
                                    <span></span>
                                  </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="chiller_cb">
                                    <input name="showerOn"id="myCheckbox6" onclick="toggle2();" type="checkbox" value="목욕가능">
                                    <label for="myCheckbox6">목욕 가능</label>
                                    <span></span>
                                  </div>
                            </td>
                        </tr>
                    </table><!-- 추가 옵션 -->

                    <div class="row2" style="display: none;">
                        <div class="in-table d-flex justify-content-center">
                            <table id="inner" style="width: 300px; margin-left: 60px;" >
                                <tr>
                                    <td style="width: 160px;">반려 동물 유형 
                                        <button type="button" class="btn btn-secondary" data-container="body"
                                        data-toggle="tooltip" data-placement="right"
                                        title="소형견 : 7kg 미만, &#10;&#13; 중형견 : 7kg-14.9kg, &#10;&#13; 대형견 : 15kg 이상">
                                            ?
                                          </button>
                                        </td>
                                    <td style="width: 150px;">1회 당 목욕 비용</td>
                                    
                                </tr>
                                <tr>
                                    <td>소형견</td>
                                    <td style="text-align:center;"><input name="small1" style=" margin-left: 10px; width: 150px; height: 25px; font-size: 12px;"type="number"  class="form-control shower" step="1000" min="1000" max='5000'></td>
                                    
                                </tr>
                                <tr>
                                    <td>중형견</td>
                                    <td><input name="middle1" style="margin-left: 10px;  width: 150px; height: 25px; font-size: 12px;"type="number" class="form-control shower" step="1000" min="1000" max='5000'></td>
                                    
                                </tr>
                                <tr>
                                    <td>대형견</td>
                                    <td><input name="big1" style="margin-left: 10px;  width: 150px; height: 25px; font-size: 12px;"type="number"  class="form-control shower" step="1000" min="1000" max='5000'></td>
                                </tr>
                            </table>
                        </div>
                        </div>

                    <!-- 추가 옵션 -->
                    <table style="margin-top:0px;">
                        <tr>
                            <td>
                                <div class="chiller_cb">
                                    <input name="drug" id="myCheckbox7" type="checkbox" value="약물복용">
                                    <label for="myCheckbox7">약물 복용</label>
                                    <span></span>
                                  </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="chiller_cb">
                                    <input name="pickUp" onclick="toggle3();" id="myCheckbox8" type="checkbox" value="집앞픽업">
                                    <label for="myCheckbox8">집 앞 픽업</label>
                                    <span></span>
                                  </div>
                            </td>
                        </tr>
                    </table><!-- 추가 옵션 -->

                    <div class="row3" style="display: none;">
                        <div class="in-table d-flex justify-content-center">
                            <table id="inner" style="width: 300px; margin-left: 60px;" >
                                <tr>
                                    <td style="width: 100px;">픽업 횟수</td>
                                    <td style="width: 150px;">픽업 비용</td>
                                    
                                </tr>
                                <tr>
                                    <td>편도</td>
                                    <td style="text-align:center;"><input name="oneWay" style=" margin-left: 10px; width: 150px; height: 25px; font-size: 12px;" type="number" class="form-control pick" step="1000" min='500' max='10000'></td>
                                    
                                </tr>
                                <tr>
                                    <td>왕복</td>
                                    <td><input name="allWay" style="margin-left: 10px;  width: 150px; height: 25px; font-size: 12px;"type="number" class="form-control pick" step="1000" min='500' max='10000'></td>
                                    
                                </tr>

                            </table>
                        </div>
                        </div>

                        <div class="row" style="margin-left: 35%;">
                            <div style="margin-top:80px; margin-bottom: 100px;">
                                <button style="color:white; border: solid 1px #666666; background-color :#666666; margin-right:10px;" class="btn1 preview" type="button">미리 보기</button>
                                <button style="color:white; border: solid 1px black; background-color :black" class="btn1" type="submit">글 등록</button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </form>
        </div>
    </section>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</body>
<script>

    
function toggle1(){ //on/off하나의 버튼으로 가능.

    $('.row1').slideToggle(1000); //시간 부여
    
}

function toggle2(){ //on/off하나의 버튼으로 가능.
 
    $('.row2').slideToggle(1000); //시간 부여
    };

function toggle3(){ //on/off하나의 버튼으로 가능.

    $('.row3').slideToggle(1000); //시간 부여
    };


    $(function () {
   $('[data-toggle="tooltip"]').tooltip()
})

$(function(){
      $("#intro").keyup(function(){
         if($(this).val().length>300){
            $(this).val($(this).val().substring(0,300));
         }
      })
   })

   var onecare= document.getElementsByClassName("onecare");
   var onecare2 = document.getElementsByClassName("onecare2");
   var shower = document.getElementsByClassName("shower");
   var pick = document.getElementsByClassName("pick");

      $(onecare).change(function(){
              
        if(event.target.value<20000) {
          $(event.target).val(event.target.min);
        }else if(event.target.value>50000){
            $(event.target).val(event.target.max);
        }
      });

      $(onecare2).change(function(){
              
              if(event.target.value<5000) {
                $(event.target).val(event.target.min);
              }else if(event.target.value>20000){
            $(event.target).val(event.target.max);
        }
            });

      $(shower).change(function(){
              
              if(event.target.value<1000) {
                $(event.target).val(event.target.min);
              }else if(event.target.value>5000){
            $(event.target).val(event.target.max);
        }
            });
            
      $(pick).change(function(){
              
              if(event.target.value<500) {
                $(event.target).val(event.target.min);
              }else if(event.target.value>10000){
            $(event.target).val(event.target.max);
        }
            });

            


         function test() {
                if($("#myCheckbox2")[0].checked==true && $("#onecare2").val().trim().length==0) {
                    alert("추가비 할인액을 입력하세요.");
                    return false;
                }else if($("#myCheckbox6")[0].checked==true && $(".shower").val().trim().length==0) {
                    alert("목욕 비용을 입력하세요.");
                    return false;
                }else if($("#myCheckbox8")[0].checked==true && $(".pick").val().trim().length==0) {
                    alert("픽업 비용을 입력하세요.");
                    return false;
                }
                return true;
         };
         
         var num =1;
         function addFile() {
             
             let file =$("<input>").attr({
                 "type":"file",
                 "name": "file"+num,
                 "id":"file"+num
             })
             let label = $("<label>").attr({
                 'for':'file'+num
             });
             $(".fileNo").attr({
                 "value":num
             })
             var s = $(".selectFile").append(file);
             s.append(label);
             s.append("<br>");
             console.log(num);
             num++;
         }

       
                 
  
    
    


</script>
</html>