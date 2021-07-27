<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First class: cookieGet</title>
	</head>
	<body>
		<%
			Cookie[] cookieAll = request.getCookies();	//전체 쿠키 가져오기
			for(int i=0; i<cookieAll.length;i++){
				String cookieName = cookieAll[i].getName();		// key값 가져옴
				String cookieValue = cookieAll[i].getValue();	// value값 가져옴
				
				out.println("쿠키: " + cookieName + ",");
				out.println(cookieValue + "<br>");
				
				//모두삭제 해보기
				for(int j=0;j<cookieAll.length;j++){
						cookieAll[i].setMaxAge(0);
						response.addCookie(cookieAll[i]);
					}
			}
		
		%>
	
	</body>
</html>