<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Third class: 회원가입</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String memId = request.getParameter("memId");
			out.println("아이디: " + memId+"<br>");
			out.println("비밀번호: " + request.getParameter("pw")+"<br>");
			out.println("이름: " + request.getParameter("name")+"<br>");
			out.println("성별: " + request.getParameter("gender")+"<br>");
			
			String[] hobby = request.getParameterValues("hobby");
			String hobbys="";
			for(int i=0;i<hobby.length;i++){
				if(i==0){
				hobbys = hobbys + hobby[i]; 
				}else{
				hobbys = hobbys + "," + hobby[i]; 
				}
			}
			out.println("취미: "+hobbys+"<br>");
			out.println("유입경로: " + request.getParameter("channel")+"<br>");
		
		%>
	</body>
</html>