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
		<title>Fifth class: test4</title>
		<style type="text/css">
			table, th, td{border:1px solid black; border-collapse : collapse;}
		</style>
	</head>
	<body>
	<table>
		<tr>
			<td align="center">사원번호</td>
			<td align="center">사원이름</td>
			<td align="center">부서번호</td>
			<td align="center">부서이름</td>
		</tr>	
	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","1234");
			stmt = conn.createStatement();
			String sql = "select employee_id,emp_name,e.department_id,department_name from employees e, departments d where e.department_id=d.department_id order by employee_id";
			rs = stmt.executeQuery(sql);

			while(rs.next()){
				int employee_id = rs.getInt("employee_id");
				String emp_name = rs.getString("emp_name");
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("department_name");
				
				//out.println(employee_id +", "+ emp_name +", "+ department_id +", "+ department_name +"<br>");
	%>
		<tr>
			<td align="center"><%=employee_id %></td>
			<td align="center"><%=emp_name %></td>
			<td align="center"><%=department_id %></td>
			<td align="center"><%=department_name %></td>
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