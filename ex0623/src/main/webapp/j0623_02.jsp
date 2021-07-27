<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>for문</title>
			<style type="text/css">
			table,td,th{border:1px solid black; border-collapse: collapse;
				text-align: center;}
			</style>
		
	</head>
	<body>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회</th>
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
			</tr>
			<!-- teacher answer -->
			<%
				for(int i=1;i<40;i=i+4){
			%>
					<tr>
					<td>out.println(i);</td>
					<td>out.println(i+1);</td>
					<td>out.println(i+2);</td>
					<td>out.println(i+3);</td>
					</tr>
			<%
				}
			%>
			
<%-- me answer 	
	<%
		for(int i = 1; i <= 10; i++){
		    out.println("<tr>");
		    out.println("<th>" + i + "</th>");
		    for(int j = 1; j <= 4; j++){
		        out.println("<td align='right' width='20'>" 
		                        + (i * j) + "</td>");
		    }
		    out.println("</tr>");
	}
	%> --%>
			<!-- <tr>
				<td>5</td>
				<td>6</td>
				<td>7</td>
				<td>8</td>
			</tr>
			<tr>
				<td>9</td>
				<td>10</td>
				<td>11</td>
				<td>12</td>
			</tr> -->
		
		</table>
	
	</body>
</html>