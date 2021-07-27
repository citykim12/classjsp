<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fourth class: 시험</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function testCheck(){
				alert("테스트 체크 시작!");
				if($("#name").val()==""){
					alert("이름을 입력하세요!");
					$("#name").val("");
					$("#name").focus();
					return false;
				}
				if($("#score").val()==""){
					alert("점수를 입력하세요!");
					$("#score").val("");
					$("#score").focus();
					return false;
				}
				return document.test.submit();
			}
			
		</script>
	</head>
	<body>
		<!-- 시험번호:1 이름:홍길동 점수:70  -->
		<!-- test.jsp → test_success.jsp, test_fail.jsp 
			→ 60이상 합격, 60미만 불합격 → 시험번호,이름,점수,합격입니다! -->
		
		<form action="test.jsp" method="post" name="test">
			<h3>시험 결과</h3>
			<label>시험번호</label>		
			<input type="text" id="No" name="No"><br>		
			<label>이름</label>		
			<input type="text" id="name" name="name"><br>		
			<label>점수</label>		
			<input type="text" id="score" name="score"><br>		
			<input type="button" onclick="testCheck()" value="입력">
			<input type="reset" value="취소">
		</form>
	</body>
</html>