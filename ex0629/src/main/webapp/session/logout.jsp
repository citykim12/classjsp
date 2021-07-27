<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: logout</title>
	</head>
	<body>
		<%
			//섹션 모두삭제
			session.invalidate();
			response.sendRedirect("./index.jsp");
		%>
	</body>
</html>