<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: test</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				alert("폼 체크 시작!");
 				if($("#name").val()==""){
					alert("이름을 입력하세요!");
					$("#name").focus();
					return false;
				}
				return $("#stuScoreForm").submit();
			}
		</script>
	</head>
	<body>
		<%!
			String stuNo, name;
			int kor, eng, math, total;
			double avg;
		%>
		<%
			stuNo = request.getParameter("sutNo");
			name = request.getParameter("name");
			kor = Integer.parseInt(request.getParameter("kor"));
			eng = Integer.parseInt(request.getParameter("eng"));
			math = Integer.parseInt(request.getParameter("math"));
			total = kor + eng + math;
			avg = total/3.0;
		%>
		
		<h3>학생성적 수정페이지</h3>
		<form action="./result.jsp" method="post" id="stuScoreForm" name="stuScoreForm">
		<label for="stuNo">학번</label>
		<input type="text" id="stuNo" name="stuNo" value="<%=stuNo %>" readonly><br>
		<label for="name">이름</label>
		<input type="text" id="name" name="name" value="<%=name %>"><br>
		<label for="kor">국어</label>
		<input type="text" id="kor" name="kor" value="<%=kor %>"><br>
		<label for="eng">영어</label>
		<input type="text" id="eng" name="eng" value="<%=eng %>"><br>
		<label for="math">수학</label>
		<input type="text" id="math" name="math" value="<%=math %>"><br>
		<label for="math">합계</label>
		<input type="text" id="total" name="total" value="<%=total %>" readonly><br>
		<label for="math">평균</label>
		<input type="text" id="avg" name="avg" value="<%=avg %>" readonly><br>
		
		<input type="button" onclick="formCheck()" value="수정">
		<input type="reset" value="취소"><br>
		
		</form>
	</body>
</html>