<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Second class: db연결</title>
	</head>
	<body>
	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//db연결
			Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdbc를 로드해서 메모리에 탑재한다고 함(메모리에 jdbc탑재)
			// 커넥션 실행(접속 url,id,pw) //옆과 같이 적어서 url이라고 지시어 명령 해도 됨(String url = "jdbc:oracle:thin@localhost:1521:xe";)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora_user","1234");
			// sql구문을 입력하는 창 생성
			stmt = conn.createStatement();
			// sql구문을 입력
			String sql = "select * from employees";
			rs = stmt.executeQuery(sql);
			
			//107개 데이터
			while(rs.next()){
				int employee_id = rs.getInt("employee_id");
				String emp_name = rs.getString("emp_name");
				String email = rs.getString("email");
				Timestamp date = rs.getTimestamp("hire_date");
				
				out.println("사원 번호: " + employee_id + ", 이름: " + emp_name + ", 이메일: " + email + ", 입사일: " + date + "<br>");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		
	%>
		
	</body>
</html>