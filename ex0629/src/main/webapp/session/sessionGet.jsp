<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: session Get</title>
	</head>
	<body>
		<%
			//섹션 1개 가져오기
			String login_id = (String)session.getAttribute("login_id");
			//섹션 출력
			out.println("login_id: " + login_id + "<br>");
			String login_nName = (String)session.getAttribute("login_nName");
			out.println("login_nName: " + login_nName + "<br>");
			String login_flag = (String)session.getAttribute("login_flag");
			out.println("login_flag: " + login_flag + "<br>");
			
			//섹션 1개삭제
			session.removeAttribute("login_id");
		
/* 			//섹션 전체삭제
			session.invalidate(); */
			
		%>
		
		<a href="sessionResult1.jsp">섹션 결과</a>
		
	</body>
</html>