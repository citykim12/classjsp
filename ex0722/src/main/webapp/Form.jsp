<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form</title>
		<style type="text/css">
			table,th,td{border:2px solid pink; border-collapse: collapse;}
		</style>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			var count=1;
			
			function deleteLine(){
				if($("input:checkbox[name=filecheck]").length<=0){
					alert("파일첨부가 1개 이상되어야 삭제 가능하다~!!!");
					return false;
				}
				if($("input:checkbox[name=filecheck]:checked").length<=0){
					alert("체크가 1개 이상되어야 삭제 가능하다~!!!");
					return false;
				}
				$("input:checkbox[name=filecheck]").each(function(){
					if(this.checked){
						alert("체크되었지~~~!!!");
						$("#"+this.value).remove();
					}
				});
			}
			
			function addLine(){
				alert("파일업로드 행추가~!!!: " + count);
				var addHtml="";
				addHtml += '<tr id="'+count+'">';
				addHtml += '<th><input type="checkbox" id="add'+count+'" name="filecheck" value="'+count+'"></th>';
				addHtml += '<td><input type="file" id="file1'+count+'" name="file1'+count+'"></td>';		
				addHtml += '</tr>';		
				count++;
				$("#tbody").append(addHtml);
			}
		
			function submitForm(){
				$("#fileCount").val($("input:checkbox[name=filecheck]").length);
				$("#Form").submit();
			}
		</script>
	</head>
	<body>
		<h2 align="center" style="color:pink">파일첨부 폼~!!!</h2>
		<form action="FormOk.jsp" method="post" id="Form" name="Form" enctype="multipart/form-data">
		<input type="hidden" id="fileCount" name="fileCount"><br>
		<label>작성자~!!!</label>
		<input type="text" id="name" name="name"><br>
		<label>제목~!!!</label>
		<input type="text" id="title" name="title"><br>
		<input type="button" onclick="submitForm()" value="전송~!!!">
		<input type="reset" value="취소~!!!"><br>
		<br><br>
		<button type="button" onclick="addLine()">파일업로드 행추가~!!!</button>
		<button type="button" onclick="deleteLine()">파일업로드 행삭제~!!!</button>
		<br><br>
		<table>
			<tr>
				<th>확인</th>
				<td>파일첨부</td>
			</tr>
			<tbody id="tbody">

			</tbody>
		</table>
		
		
		</form>
	</body>
</html>