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
			Cookie[] cookieAll = request.getCookies(); 
			for(int i=0; i<cookieAll.length;i++){
				String cookieName = cookieAll[i].getName();		// key값 가져옴
				String cookieValue = cookieAll[i].getValue();	// value값 가져옴
				
				out.println("쿠키: " + cookieName + ",");
				out.println(cookieValue + "<br>");
				
				if(cookieAll[i].getValue().equals("success")){
					out.println("로그인이 되었습니다.");
				}
			}
			
			//삭제
			for(int i=0;i<cookieAll.length;i++){
				//cookieAll[i].setMaxAge(0); // 쿠키모두 삭제
				if(cookieAll[i].getName().equals("cookie_flag")){
					cookieAll[i].setMaxAge(0);	//1개 삭제
					response.addCookie(cookieAll[i]);
				}
			}
			
		%>
		
		<a href="cookieDel.jsp">쿠키 삭제하기</a>
		
	</body>
</html>