<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Eighth class: 쿠키 설정</title>
	</head>
	<body>
		<%
			Cookie[] cookies = request.getCookies();
			for(int i=0;i<cookies.length;i++){
					String cookName = cookies[i].getName();	//Cookie에 저장되어 있는 모든 이름을 가져옴
					String cookValue = cookies[i].getValue();
					out.println("쿠키 이름: " + cookName + ",");
					out.println("쿠키 값: " + cookValue + "<br>");
					if(cookName.equals("login_id")){
						out.println("login_id=aaa 쿠키가 존재합니다." + "<br>");
					}
			}
		%>
	
	</body>
</html>