<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Eighth class: 쿠키 설정</title>
	</head>
	<body>
		<%
			Cookie cookie = new Cookie("login_id","aaa");  
			Cookie nickName = new Cookie("nickName","CITY");  
			cookie.setMaxAge(60*30);	//60초*30분 = 30분
			nickName.setMaxAge(60*30);	//60초*30분 = 30분
			response.addCookie(cookie);		
			response.addCookie(nickName);		
		%>
		
		<a href="cookieGet.jsp">쿠키정보 읽기</a>
		
	</body>
</html>