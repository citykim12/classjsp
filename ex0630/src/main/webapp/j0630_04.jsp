<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fifth class: 결과 값</title>
		<style type="text/css">
			table,td{border:1px solid black; border-collapse: collapse;}
		</style>
		<%
			request.setCharacterEncoding("UTF-8");
		%>
		
	</head>
	<body>
		<jsp:useBean id="s" class="ex0630.Salary" scope="page"></jsp:useBean>
		<jsp:setProperty name="s" property="*"/>
	
		<table>
			<tr>
				<td>번호</td>
				<td><%= s.getNum() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= s.getName() %></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= s.getId() %></td>
			</tr>
			<tr>
				<td>전화 번호</td>
				<td><%= s.getTel() %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%= s.getGender() %></td>
			</tr>
			<tr>
				<td>월급</td>
				<td><%= s.getSalary() %></td>
			</tr>
			<tr>
				<td>공제액</td>
				<td><%= s.getFee() %></td>
			</tr>
		
		</table>
	</body>
</html>