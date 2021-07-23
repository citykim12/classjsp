<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% response.setStatus(200); %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Second class: error404</title>
	</head>
	<body>
		<div>
			<a href="./main.jsp"><img src="./images/e2.png"></a>
		</div>
		<%= exception.getMessage() %>
	</body>
</html>