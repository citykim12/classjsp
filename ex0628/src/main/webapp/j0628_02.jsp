<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Third class: 나이계산</title>
	</head>
	<body>
		<form action="rCheck.jsp">
			<h3>출생년도 나이계산</h3>
			
			<label>이름</label>
			<input type="text" id="name" name="name"><br>
			<label>출생지(예:서울,경기,부산,강원 등등)</label>
			<input type="text" id="place" name="place"><br>
			<label>출생년도를 입력해주세요.(예:1993)</label>
			<input type="text" id="birth" name="birth"><br>
			<input type="submit" value="전송"><br>
			
		</form>
	</body>
</html>