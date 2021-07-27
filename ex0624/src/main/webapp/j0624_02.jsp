<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Second class: form</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				//제이커리(jQuery) ↓ : 위의 url을 꼭 넣어야 함
				alert("폼체크 시작!");
 				if($("#memId").val()==""){
					alert("id를 입력하세요!");
					$("#memId").focus();
					return false;
				}
 				if($("#pw").val() !=$("#pw2").val()){
					alert("비밀번호가 일치하지 않습니다! 다시 입력하세요!");
					$("#pw").val("");
					$("#pw2").val("");
					$("#pw").focus();
					return false;
				}
 				
 				//자바스크립트(JavaScript) ↓
 				/* if(memberForm.memId.value==""){
					alert("id를 입력하세요!");
					memberForm.memId.focus();
					return false;
				} */
 				if(memberForm.memId.value.length<=3){
					alert("4자리 이상 입력하셔야 합니다!");
					memberForm.memId.focus();
					return false;
				}
				//return $("#memberForm").submit();
				return document.memberForm.submit();				 
			}
		
		</script>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="./formOk.jsp" method="post" name="memberForm">
		<label for="memId">아이디</label>
		<input type="text" id="memId" name="memId" required placeholder="아이디는 3자리 이상 넣으시오."><br>
		<label for="pw">비밀번호</label>
		<input type="password" id="pw" name="pw" required><br>
		<label for="pw2">비밀번호 확인</label>
		<input type="password" id="pw2" name="pw2"><br>
		<label for="name">이름</label>
		<input type="text" id="name" name="name"><br>
		<label>성별</label><br>
		<input type="radio" id="male" name="gender" value="남자">
		<label for="male">남자</label>
		<input type="radio" id="female" name="gender" value="여자">
		<label for="female">여자</label><br>
		<label>취미</label><br>
		<input type="checkbox" id="cook" name="hobby" value="cook">
		<label for="cook">요리</label>
		<input type="checkbox" id="run" name="hobby" value="run">
		<label for="run">조깅</label>
		<input type="checkbox" id="game" name="hobby" value="game">
		<label for="game">게임</label>
		<input type="checkbox" id="read" name="hobby" value="read">
		<label for="read">독서</label>
		<input type="checkbox" id="swim" name="hobby" value="swim">
		<label for="swim">수영</label><br>
		<label>유입경로</label>
		<select name="channel">
			<option value="internet">인터넷</option>
			<option value="news">신문</option>
			<option value="advertising">광고</option>
			<option value="pamphlet">팜플렛</option>
		</select><br>
		<input type="button" onclick="formCheck()" value="전송"> <!-- 사용하기 위함 / input type="button" onclick="formCheck()"; -->
		<input type="reset" value="취소"><br>
		
		</form>
	
	</body>
</html>