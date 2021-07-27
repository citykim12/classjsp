<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fourth class: 시험</title>
		
	</head>
	<body>
		<%
			/* int No = Integer.parseInt(request.getParameter("No")); */
			request.setCharacterEncoding("utf-8");
			String No = request.getParameter("No");
			String name = request.getParameter("name");
			int score = Integer.parseInt(request.getParameter("score"));
			
			if(score>=60 && score<=100){
				// response.sendRedirect("test_success.jsp?No="+No+"&name="+name+"&score="+score);
		%>
		<jsp:forward page="test_success.jsp">
			<jsp:param name="No" value="<%=No %>" />
			<jsp:param name="name" value="<%=name %>" />
			<jsp:param name="score" value="<%=score %>" />
			<jsp:param name="param_test" value="성공" />
		</jsp:forward>
		<%	}else if(score>=0 && score<=59){
				// response.sendRedirect("test_fail.jsp?No="+No+"&name="+name+"&score="+score);
			}else{
				out.println("점수 범위를 벗어났습니다. 다시 입력해주세요!");
			}
		%>
	
	</body>
</html>