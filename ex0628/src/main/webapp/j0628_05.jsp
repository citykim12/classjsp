<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: jsp:forward-param</title>
	</head>
	<body>
		<jsp:forward page="result.jsp">
		<jsp:param name="id" value="admin" />
		<jsp:param name="pw" value="1111" />
		<jsp:param name="name" value='<%=URLEncoder.encode("관리자","utf-8") %>' />
		</jsp:forward>		
		
	</body>
</html>