<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%! 
		String id="aaa";
		String pw="111";
		String name="김구";
		//String name= URLEncoder.encode("김구", "utf-8");
	%>
	<head>
		<meta charset="UTF-8">
		<title>Sixth class: 전송 방법</title>
		<script type="text/javascript">
			function sendLink(){
				alert("테스트!");
				location.href="result.jsp?id=<%=id %>&pw=<%=pw %>&name=<%=name %>";
			}
		</script>
	</head>
	<body>
		<!--result.jsp 파라미터 방식으로 데이터 전달  -->
		<%
			//button을 이용할 경우 자바 스크립트 위에 선언문을 생성해야함
			//response.sendRedirect("result.jsp?id="+id+"&pw="+pw+"&name="+name);
		%>
	
	<%-- <a href="result.jsp?id=<%=id %>&pw=<%=pw %>&name=<%=name %>">데이터 전송</a> --%> 
	<button type="button" onclick="sendLink()">파라미터 전송</button>
	
	</body>
</html>