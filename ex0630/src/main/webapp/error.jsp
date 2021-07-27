<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% response.setStatus(200); %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First class: error</title>
		<style type="text/css">
			div{text-align: center;}
		</style>
	</head>
	<body>
		<div>
			<img src="./images/error.jpg">
			<%= exception.getMessage() %>
		</div>
	</body>
</html>