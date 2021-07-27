<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: session Set</title>
	</head>
	<body>
		<%
			//섹션 저장
			session.setAttribute("login_id", "aaa");
			session.setAttribute("login_nName", "섹션쨩");
			session.setAttribute("login_flag", "success");
		%>
		
		<a href="./sessionGet.jsp">섹션 확인</a>
	</body>
</html>