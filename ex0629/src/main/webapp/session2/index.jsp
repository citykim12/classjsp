<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Eighth class: index</title>
	</head>
	<body>
		<!-- index 로그인전, 로그인후 → login.jsp → 
			loginCheck.jsp, session 저장 → 
		index.jsp → logout.jsp -->
		<%
			String session_flag = (String)session.getAttribute("session_flag");
			if(session_flag != null){
				if(session_flag.equals("success")){
				%>
					<a href="logout.jsp"><img src="../images/login.JPG"></a>
				<%
				}
			}else{
			%>
				<a href="login.jsp"><img src="../images/logout.JPG"></a>
			<%	
			}
		%>
	</body>
</html>