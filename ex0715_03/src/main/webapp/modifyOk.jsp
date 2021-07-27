<%@page import="com.site.ex0715_03.MDao"%>
<%@page import="com.site.ex0715_03.MDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String nickname = request.getParameter("nickname");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
	String address1 = request.getParameter("address1");
	String address2 = request.getParameter("address2");
	String[] hobby = request.getParameterValues("hobby");
	String hobbys = "";
	
	for(int i=0;i<hobby.length;i++){
		if(i==0){
			hobbys += hobby[i];
		}else{
			hobbys += ","+ hobby[i];
		}
	}
	
	MDto mDto = new MDto(id,pw,name,nickname,gender,tel,address1,address2,hobbys);
	MDao mDao = new MDao();
	
	int modifyNum = mDao.memberUpdate(mDto);

%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>modifyOk</title>
		<script type="text/javascript">
			if(<%=modifyNum == 1%>) {
				alert("데이터 저장 성공~!");
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
			%>	
				location.href="./index.jsp";
				//history.back(-1);
				
			}else {
				alert("데이터 저장 실패~!");
				location.href="./index.jsp";
			}
		
		</script>
	</head>
	<body>
	
	</body>
</html>