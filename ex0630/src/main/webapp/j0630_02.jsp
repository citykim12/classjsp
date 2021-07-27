<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fourth class: Member</title>
	</head>
	<body>
		<jsp:useBean id="m" class="ex0630.Member" scope="page" />
		<jsp:setProperty name="m" property="no" value="1" />
		<jsp:setProperty name="m" property="name" value="홍길동" />
		<jsp:setProperty name="m" property="id" value="aaa" />
		<jsp:setProperty name="m" property="pw" value="1111" />
		<jsp:setProperty name="m" property="gender" value="man" />
		<jsp:setProperty name="m" property="tel" value="010-111-1111" />
		
		<table>
			<tr>
				<td>번호</td>
				<td><jsp:getProperty name="m" property="no" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= m.getName()%></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= m.getId() %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%= m.getPw() %></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%= m.getGender() %></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%= m.getTel() %></td>
			</tr>
		</table>
	</body>
</html>