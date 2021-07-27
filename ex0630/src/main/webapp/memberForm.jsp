<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fifth class: memberForm</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				alert("test!");
				// 이름 유효성검사
				if($("#name").val() == ""){
					alert("이름을 입력하세요!!");
					$("#name").focus();
					return false;
				}
				// 아이디 유효성검사
				if($("#id").val().length<3){
					alert("id는 3자리 이상 입력하세요!!");
					$("#id").focus();
					return false;
				}
				//salary데이터 /10을 한값을 받아 fee에 값 넣기
				var salary = Number($("#salary").val());
				$("#fee").val(salary/10);
				
				return document.form.submit();
			}
		</script>
		
	</head>
	<body>

		<form action="./j0630_04.jsp" method="post" name="form">
		<label>번호</label>
		<input type="text" id="num" name="num"><br>
		<label>이름</label>
		<input type="text" id="name" name="name"><br>
		<label>아이디</label>
		<input type="text" id="id" name="id"><br>
		<label>전화 번호</label>
		<input type="text" id="tel" name="tel"><br>
		<label>성별</label>
		<input type="radio" id="male" name="gender" value="male">
		<label for="male">남성</label>
		<input type="radio" id="female" name="gender" value="female">
		<label for="female">여성</label><br>
		<label>월급</label>
		<input type="text" id="salary" name="salary"><br>
		<input type="hidden" id="fee" name="fee"><br>
		<input type="button" onclick="formCheck()" value="전송">
		
		</form>
	
	</body>
</html>