<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fourth class: test</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				alert("폼 체크 시작!");
 				if($("#memid").val()==""){
					alert("id를 입력하세요!");
					$("#memid").focus();
					return false;
				}
				if($("#pw").val() != $("#pw2").val()){
					alert("비밀번호가 일치하지 않습니다! 다시 입력하세요!");
					$("#pw").val("");
					$("#pw2").val("");
					$("#pw").focus();
					return false;
				}
				  //javascript
				if(memberForm.memId.value.length<=5){
					  alert("5자리이상 입력하셔야 합니다.");
					  memberForm.memId.focus();
					  return false;
				} 
				return document.memberForm.submit();
			}
				
		</script>
	</head>
	<body>
		<!-- 아이디,패스워드,패스워드확인,이름,성별-radio,취미-checkbox,유입경로select -->
		<!-- 아이디 5자리이상, 패스워드와 패스워드 확인 비교 -->
		<!-- memFormOk → 출력하세요 -->
		
		<h2>회원가입</h2>
		<form action="./memFormOk.jsp" method="post" name="memberForm">
		<label for="memid">아이디</label>
		<input type="text" id="memid" name="memid" placeholder="5자리 이상 입력하세요!"><br>
		<label for="pw">비밀번호</label>
		<input type="password" id="pw" name="pw"><br>
		<label for="pw2">비밀번호 확인</label>
		<input type="password" id="pw2" name="pw2"><br>
		<label for="name">이름</label>
		<input type="text" id="name" name="name"><br>
		<label>성별</label><br>
		<input type="radio" id="female" name="gender" value="여성">
		<label for="female">여성</label>
		<input type="radio" id="male" name="gender" value="남성">
		<label for="maler">남성</label><br>
		<label>취미</label><br>
		<input type="checkbox" id="hobby" name="hobby" value="cook">
		<label for="cook">요리</label>
		<input type="checkbox" id="hobby" name="hobby" value="game">
		<label for="game">게임</label>
		<input type="checkbox" id="hobby" name="hobby" value="sing">
		<label for="sing">노래</label>
		<input type="checkbox" id="hobby" name="hobby" value="dance">
		<label for="dance">춤</label>
		<input type="checkbox" id="hobby" name="hobby" value="read">
		<label for="read">독서</label><br>
		<label>유입경로</label>
		<select name="channel">
			<option value="internet">인터넷</option>
			<option value="news">뉴스</option>
			<option value="ad">광고</option>
		</select><br>
		<input type="button" onclick="formCheck()" value="입력">
		<input type="reset" value="취소">
		
		</form>
	</body>
</html>