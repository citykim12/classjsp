<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First class: index</title>
	</head>
	<body>
		<%
			//session.getAttribute("session_flag");
			//session.setAttribute("session_flag", "success"); 
			String flag = (String)session.getAttribute("session_flag");
			//if(flag !=null){
				if(flag.equals("success"))
					out.println("로그인이 되었습니다.<br>");
			//}
			//session.removeAttribute("session_flag"); //1개 삭제
			session.invalidate(); //모두 삭제
		%>
	</body>
</html>