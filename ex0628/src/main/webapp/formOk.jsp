<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Second class: 데이터 확인</title>
		<style type="text/css">
			table,th,td{ border:1px solid black; border-collapse: collapse; }
		</style>
	</head>
	<body>
		<%
			String name, id, pw, gender, hobbys="", major;
			String[] hobby;
			name = request.getParameter("name");
			id = request.getParameter("id");
			pw = request.getParameter("pw");
			gender = request.getParameter("gender");
			major = request.getParameter("major");
			hobby = request.getParameterValues("hobby");
			
			for(int i=0;i<hobby.length;i++){
				if(i==0){
					hobbys = hobby[i]; //처음으로 for 실행
				}else{ // 그 다음부터 for 실행
					hobbys = hobbys + "," + hobby[i]; //,run,read,game
				}
			}
			
			Enumeration<String> enum1 = request.getParameterNames();
			int i=0;
			String names="";
			while(enum1.hasMoreElements()){ //읽어 올 데이터가 있는지 확인?
				String name1 = enum1.nextElement(); //.toString() 사용하려면 위에 <String> 지우고, 1개의 데이터를 가져옴
				if(i==0){
					names = name1; //처음으로 for 실행
				}else{ // 그 다음부터 for 실행
					names = names + "," + name1; //,run,read,game
						i++;
				}
			}
		%>
		
		<table>
			<tr>
				<th>이름</th>
				<td><%=name %></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><%=id %></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><%=pw %></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><%=gender %></td>
			</tr>
			<tr>
				<th>취미</th>
				<td><%=hobbys %></td>
			</tr>
			<tr>
				<th>전공</th>
				<td><%=major %></td>
			</tr>
			<tr>
				<th>모든 변수명</th>
				<td><%=names %></td>
			</tr>
		</table>
	</body>
</html>