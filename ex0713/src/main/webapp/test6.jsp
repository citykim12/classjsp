<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Eighth class: test6</title>
		<style type="text/css">
			table, th, td{border:1px solid black; border-collapse : collapse;}
		</style>
	</head>
	<body>
		<table>
			<tr>
			<td align="center">번호</td>
			<td align="center">제목</td>
			<td align="center">작성자</td>
			<td align="center">작성일</td>
			<td align="center">조회수</td>
		</tr>	
		<%
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
				stmt = conn.createStatement();
				String sql = "select bid,btitle,bname,bdate,bhit from board";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()){
					int bid = rs.getInt("bid");
					String btitle = rs.getString("btitle");
					String bname = rs.getString("bname");
					String bdate = rs.getString("bdate");
					int bhit = rs.getInt("bhit");
			%>
			<tr>
			<td align="center"><%=bid %></td>
			<td align="center"><%=btitle %></td>
			<td align="center"><%=bname %></td>
			<td align="center"><%=bdate %></td>
			<td align="center"><%=bhit %></td>
			</tr>
			<%	
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				}catch(Exception e2){
					e2.printStackTrace();
				}
			}
		
		%>
		</table>
	</body>
</html>