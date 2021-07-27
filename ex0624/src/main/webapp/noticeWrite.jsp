<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Seventh class: test</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function witerCheck(){
				alert("게시판 작성 시작!");
 				if($("#name").val()==""){
					alert("이름을 입력하세요!");
					$("#name").focus();
					return false;
				}
				return $("#notice").submit();
			}
		</script>
	</head>
	<body>
		<!--  noticeWrite.jsp 게시판번호,제목,내용,작성자 -->
		<!--  noticeView.jsp 게시판번호,제목,내용,작성자,작성일,조회수:1 -->
		<!--  noticeModify.jsp 게시판번호,제목,내용,작성자,작성일,조회수 readonly: 게시판번호, 작성일, 조회수 -->

		<h3>noticeWrite</h3>
		<form action="./noticeView.jsp" method="post" id="notice" name="notice">
		<label for="boardNo">게시판번호</label>
		<input type="text" id="boardNo" name="boardNo"><br>
		<label for="title">제목</label>
		<input type="text" id="title" name="title"><br>
		<label for="content">내용</label>
		<textarea rows="10" cols="30" id="content" name="contents" placeholder="내용을 작성하세요"></textarea><br>
		<label for="name">작성자</label>
		<input type="text" id="name" name="name"><br>
		
		<input type="button" onclick="witerCheck()" value="작성 완료">
		<input type="reset" value="취소"><br>
		
		</form>
	</body>
</html>