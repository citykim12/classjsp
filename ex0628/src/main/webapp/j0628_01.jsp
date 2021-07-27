<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First class: 회원 가입</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formcheck(){
				alert("폼 체크 시작!");
				if($("#pw").val() == "" || $("#pw2").val()==null){
					alert("비밀번호가 입력되지 않습니다. 비밀번호를 입력하세요.");
					$("#pw").val("");
					$("#pw").focus();
					return false;
				}
				if($("#pw").val() != $("#pw2").val()){
					alert("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
					$("#pw").val("");
					$("#pw2").val("");
					$("#pw").focus();
					return false;
				}
				return document.form.submit();
			}
		
		</script>
	</head>
	<body>
		<h3>회원 가입</h3>
		<form action="formOk.jsp" method="post" name="form">
			<label>이름</label>
			<input type="text" id="name" name="name"><br>
			<label>아이디</label>
			<input type="text" id="id" name="id"><br>
			<label>비밀번호</label>
			<input type="password" id="pw" name="pw"><br>
			<label>비밀번호 확인</label>
			<input type="password" id="pw2" name="pw2"><br>
			<label>성별</label>
			<input type="radio" id="male" name="gender" value="male">
			<label for="gender">남자</label>
			<input type="radio" id="female" name="gender" value="female">
			<label for="gender">여자</label>
			<br>
			<label>취미</label>
			<input type="checkbox" id="run" name="hobby" value="run">
			<label for="run">조깅</label>
			<input type="checkbox" id="game" name="hobby" value="game">
			<label for="game">게임</label>
			<input type="checkbox" id="read" name="hobby" value="read">
			<label for="read">독서</label>
			<input type="checkbox" id="sing" name="hobby" value="sing">
			<label for="sing">노래</label>
			<br>
			<label>전공</label>
			<select name="major">
				<option value="computer">컴퓨터공학</option>
				<option value="korea">국문학</option>
				<option value="mathmatics">수학과</option>
			</select><br>
			<input type="button" onclick="formcheck()" value="완료">
			<input type="reset" value="취소">
		
		</form>
	</body>
</html>