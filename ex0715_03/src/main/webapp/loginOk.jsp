<%@page import="com.site.ex0715_03.MDto"%>
<%@page import="com.site.ex0715_03.MDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	MDao mDao = new MDao();
	MDto mDto = mDao.loginSelect(id, pw);
%>


<html>
	<head>
		<meta charset="UTF-8">
		<title>LoginOk</title>
		<script type="text/javascript">
			if(<%=mDto.getId() == null %>){
				alert("아이디와 패스워드가 일치하지 않습니다~!");
				location.href="./login.jsp";
			}else{
				alert("로그인 성공~!");
				<%
					session.setAttribute("session_id", mDto.getId());
					session.setAttribute("session_pw", mDto.getPw());
					session.setAttribute("session_name", mDto.getName());
					session.setAttribute("session_nickname", mDto.getNickname());
					session.setAttribute("session_gender", mDto.getGender());
					session.setAttribute("session_tel", mDto.getTel());
					session.setAttribute("session_address1", mDto.getAddress1());
					session.setAttribute("session_address2", mDto.getAddress2());
					session.setAttribute("session_hobby", mDto.getHobby());
					
					session.setAttribute("session_flag", "success");
				%>
				location.href="./index.jsp";
			}
		
		</script>
	</head>
	<body>
	
	</body>
</html>