<%@page import="com.site.ex0715_03.MDao"%>
<%@page import="com.site.ex0715_03.MDto"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	
	String id="",pw="",name="",nickname="",gender="",tel="",address1="",address2="",hobby="";


	id = (String)session.getAttribute("session_id");
	pw = (String)session.getAttribute("session_pw");
	name = (String)session.getAttribute("session_name");
   	nickname = (String)session.getAttribute("session_nickname");
	gender = (String)session.getAttribute("session_gender");
	tel = (String)session.getAttribute("session_tel");
	address1 = (String)session.getAttribute("session_address1");
	address2 = (String)session.getAttribute("session_address2");
	hobby = (String)session.getAttribute("session_hobby");  


	MDao mDao = new MDao();
	MDto mDto = mDao.loginSelect(id, pw);
	
%>

<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 수정</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			if(<%=session.getAttribute("session_id") %> == null){
				alert("로그인이 되어 있지 않습니다. 로그인 후 접속하세요~!");
				location.href="./login.jsp";
			}else{
				alert("회원 수정페이지로 이동합니다~!");	
			}
		
			function formCheck(){
				if($("#id").val().length<3){
					alert("아이디는 3자리 이상 입력하세요~!");
					$("#id").focus();
					return false;
				}
				$("#form").submit();
			}
			
			//jQuery
			$(function(){
				
			});
		
		</script>
	</head>
	<body>

	  <h3>회원정보 수정</h3>
	  <form action="./modifyOk.jsp" id="form" name="form">
	    <label>아이디</label>
	    <input type="text" id="id" name="id" placeholder="id는 3자리이상" required value="<%=id %>" ><br>
	    <label>비밀번호</label>
	    <input type="password" id="pw" name="pw" placeholder="pw는 3자리이상" required ><br>
	    <label>이름</label>
	    <input type="text" id="name" name="name" value="<%=name %>"><br>
	    <label>닉네임</label>
	    <input type="text" id="nickname" name="nickname" value="<%=nickname %>"><br>
	    <label>성별</label>
	    <input type="radio" id="male" name="gender" value="male" <%=gender.equals("male")?"checked":"" %>><label for="male">남자</label>
	    <input type="radio" id="female" name="gender" value="female" <%=gender.equals("female")?"checked":"" %>><label for="female">여자</label><br>
	    <label>전화번호</label>
	    <input type="text" id="tel" name="tel" value="<%=tel %>"><br>
	    <label>주소1</label>
	    <input type="text" id="address1" name="address1" value="<%=address1 %>"><br>
	    <label>주소2</label>
	    <input type="text" id="address2" name="address2" value="<%=address2 %>"><br>
	    <label>취미</label>
	    <input type="checkbox" id="swim" name="hobby" value="swim" <%=hobby.contains("swim")?"checked":"" %>><label for="swim">수영</label>
	    <input type="checkbox" id="golf" name="hobby" value="golf" <%=hobby.contains("golf")?"checked":"" %>><label for="golf">골프</label>
	    <input type="checkbox" id="run" name="hobby" value="run" <%=hobby.contains("run")?"checked":"" %>><label for="run">조깅</label>
	    <input type="checkbox" id="read" name="hobby" value="read" <%=hobby.contains("read")?"checked":"" %>><label for="read">독서</label><br>
	    <input type="button" onclick="formCheck()" value="가입완료">
	    <a href="./index.jsp"><input type="button" value="취소"></a><br>
	  
	  </form>
	
	</body>
</html>