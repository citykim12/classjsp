<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fourth class: Form</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				alert("test!");
				//입력되어 있는 국어,영어,수학
				
				var a = number($("#kor").val());
				var b = number($("#eng").val());
				var c = number($("#math").val());
				//var result = $("#kor").val()+$("#eng").val()+$("#math").val(); // var 변수선언
				//total 100입력
				$("#total").val(a+b+c);
				//avg 100입력
				$("#avg").val($("#total").val/3.0);
				
				return document.form.submit();
			}
		
		</script>
	</head>
	<body>
		<form action="./j0630_03.jsp" method="post" name="form">
		<label>학번</label>
		<input type="text" id="num" name="num"><br>
		<label>이름</label>
		<input type="text" id="name" name="name"><br>
		<label>국어</label>
		<input type="text" id="kor" name="kor"><br>
		<label>영어</label>
		<input type="text" id="eng" name="eng"><br>
		<label>수학</label>
		<input type="text" id="math" name="math"><br>
		<input type="hidden" id="total" name="total">
		<input type="hidden" id="avg" name="avg">
		
		<input type="button" onclick="formCheck()" value="전송">
		
		</form>
	</body>
</html>