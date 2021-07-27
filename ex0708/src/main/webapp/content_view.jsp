<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  
  <%!
  	//db에서 데이터를 가져옴 write → db 저장을 시키고 → 데이터를 가져옴
  	String bName,bTitle,bContent,file;
  %>
  <%
  	request.setCharacterEncoding("utf-8");
  	bName = request.getParameter("bName");
  	bTitle = request.getParameter("bTitle");
  	bContent = request.getParameter("bContent");
  	
  	//날짜1
/*   	Date today = new Date();
  	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  	String bdate = sdf.format(today); */
  	
  	//날짜2
  	/* SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  	String bdate2 = sdf2.format(System.currentTimeMillis()); */ 
    
  %>
</head>
<body>
<section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="3">제목</th>
      </tr>
      <tr>
        <td colspan="3"><strong><%=bTitle %></strong></td>
      </tr>
      <tr>
        <td><%=bName %></td>
        <td>조회수</td>
        <td>1</td>
      </tr>
      <tr>
        <td colspan="3" class="article"><%=bContent %></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>
    <a href=""><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
	<form action="modify_view.jsp" method="post" name="content_view">
		<input type="hidden" name="bName" value="<%=bName %>">
		<input type="hidden" name="bTitle" value="<%=bTitle %>">
		<input type="hidden" name="bContent" value="<%=bContent %>">
    	<a href="javascript:content_view.submit()"><div class="list">수 정</div></a>
	</form>
    <a href=""><div class="list">답변달기</div></a>
  </section>
  
</body>
</html>