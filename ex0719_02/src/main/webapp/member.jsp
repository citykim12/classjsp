<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Member</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				if($("#id").val().length<3){
					alert("아이디는 3자리 이상 입력하세요~!");
					$("#id").focus();
					return false;
				}
				$("#form").submit();
			}
			$(function(){
				
			});
			
		</script>
	</head>
	<body>
		<h3>회원가입~!</h3>
		<form action="./memberOk.jsp" id="form" name="form">
		<label>아이디</label>
		<input type="text" id="id" name="id" placeholder="id는 3자리 이상" required><br>
		<label>비밀번호</label>
		<input type="password" id="pw" name="pw" placeholder="pw는 3자리 이상" required><br>
		<label>이름</label>
		<input type="text" id="name" name="name"><br>
		<label>닉네임</label>
		<input type="text" id="nickname" name="nickname"><br>
		<label>성별</label>
		<input type="radio" id="male" name="gender" value="male">남성
		<input type="radio" id="female" name="gender" value="female">여성<br>
		<label>전화번호</label>
		<input type="text" id="tel" name="tel"><br>
		<label>주소1</label>
		<input type="text" id="address1" name="address1"><br>
		<label>주소2</label>
		<input type="text" id="address2" name="address2"><br>
		<label>취미</label>
		<input type="checkbox" id="swim" name="hobby"><label for="swim">수영</label>
		<input type="checkbox" id="golf" name="hobby"><label for="golf">골프</label>
		<input type="checkbox" id="run" name="hobby"><label for="run">조깅</label>
		<input type="checkbox" id="read" name="hobby"><label for="read">독서</label>
		<input type="button" onclick="formCheck()" value="가입완료">
		<a href="./index.jsp"><input type="button" value="취소"></a><br>
		
		</form>
	</body>
</html>