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
				if($("#pw").val() != $(#"pw2").val()){
					alert("비밀번호가 일치하지 않습니다! 다시 입력하세요!");
					$("#pw").val("");
					$("#pw2").val("");
					$("#pw").focus();
					return false;
				}
				if(memberForm.memId.value.length<3){
					alert("4자리이상 입력하셔야 합니다.");
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
		
		<% request.setCharacterEncoding("utf-8"); 
			String gender = request.getParameter("gender");
			String hobby = request.getParameter("hobby");
			String channel = request.getParameter("channel");
		%>
		<h2>회원가입</h2>
		<form action="./memFormOk.jsp" method="post" name="memFormOk">
		<label for="memid">아이디</label>
		<input type="text" id="memid" name="memid" required value='<%= request.getParameter("memId") %>'><br>
		<label for="pw">비밀번호</label>
		<input type="password" id="pw" name="pw" value='<%= request.getParameter("pw") %>'><br>
		<label for="pw2">비밀번호 확인</label>
		<input type="password" id="pw2" name="pw2"><br>
		<label for="name">이름</label>
		<input type="text" id="name" name="name" value='<%= request.getParameter("name") %>'><br>
		<label>성별</label><br>
		<input type="radio" id="male" name="gender" value="남성" <%=(gender.contains("남자"))?"checked":"" %>>
		<label for="male">남성</label>
		<input type="radio" id="female" name="gender" value="여성" <%=(gender.contains("여자"))?"checked":"" %>>
		<label for="female">여성</label><br>
		<label>취미</label><br>
		<input type="checkbox" id="hobby" name="hobby" value="cook" <%=(hobby.contains("cook"))?"checked":"" %>>
		<label for="cook">요리</label>
		<input type="checkbox" id="hobby" name="hobby" value="game" <%=(hobby.contains("game"))?"checked":"" %>>
		<label for="game">게임</label>
		<input type="checkbox" id="hobby" name="hobby" value="sing"<%=(hobby.contains("sing"))?"checked":"" %>>
		<label for="sing">노래</label>
		<input type="checkbox" id="hobby" name="hobby" value="dance"<%=(hobby.contains("dance"))?"checked":"" %>>
		<label for="dance">춤</label>
		<input type="checkbox" id="hobby" name="hobby" value="read"<%=(hobby.contains("read"))?"checked":"" %>>
		<label for="read">독서</label><br>
		<label>유입경로</label>
		<select name="channel" <%=(hobby.contains("read"))?"selected":"" %>>
			<option value="internet">인터넷</option>
			<option value="news">뉴스</option>
			<option value="ad">광고</option>
		</select><br>
		<input type="button" onclick="formCheck()" value="입력">
		<input type="reset" value="취소">
		
		</form>
	</body>
</html>