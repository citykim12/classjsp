<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<%!
			String boardNo,title,text,content,name,date,hit;
		%>
		<%
			request.setCharacterEncoding("utf-8");
			boardNo = request.getParameter("boardNo");
			text = request.getParameter("text");
			title = request.getParameter("title");
			content = request.getParameter("content");
			name = request.getParameter("name");
			date = request.getParameter("date");
			hit = request.getParameter("hit");
		%>	
	</head>
	<body>
		<form action="./noticeModify.jsp">
			<input type="hidden" name="boardNo" value='<%=boardNo %>'>
			<input type="hidden" name="text" value='<%=text %>'>
			<input type="hidden" name="title" value='<%=title %>'>
			<input type="hidden" name="content" value='<%=content %>'>
			<input type="hidden" name="name" value='<%=name %>'>
			<input type="hidden" name="date" value='<%=date %>'>
			<input type="hidden" name="hit" value='<%=hit %>'>
			
		<input type="submit" value="수정">
		</form>
	</body>
</html>