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
	
	int resultNum = mDao.memberInsert(mDto);
	
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입~!</title>
		<script type="text/javascript">
			if(<%=resultNum == 1%>){
				alert("회원가입완료~!");
				location.href="./index.jsp";
			}else{
				alert("회원가입이 되지 않았습니다~! 다시 입력하세요~!");
				location.href="./member.jsp";
			}
		
		</script>
	</head>
	<body>
	
	</body>
</html>