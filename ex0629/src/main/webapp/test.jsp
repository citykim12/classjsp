<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Third class: test</title>
	</head>
	<body>
		<%
			String id="aaa";
			String pw="1234";
			if(id.equals("aaa") && pw.equals("1234")){
		%>
			<script type="text/javascript">
				alert("バカ、ちゃいますか？");			
			
			</script>	
		<%		
			}else{
		%>
		<script type="text/javascript">
			alert("アホ、ちゃいませんか？")
		</script>
		<%		
			}
		%>
	</body>
</html>