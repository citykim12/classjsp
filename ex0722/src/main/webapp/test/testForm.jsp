<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>testForm</title>
		<style type="text/css">
			table, th, td{border:1px solid black; border-collapse:collapse; }
		</style>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			var count=1;
			
			function subInput(){
				if($("input:checkbox[name=filecheck]").length<=0){
					alert("파일첨부가 1개 이상되어야 삭제 가능합니다!");
					return false;
				}
				
				if($("input:checkbox[name=filecheck]:checked").length<=0){
					alert("파일체크가 1개 이상되어야 삭제 가능합니다!");
					return false;
				}
				
				$("input:checkbox[name=filecheck]").each(function(){
					if(this.checked){
						alert("체크되었습니다!");
						$("#"+this.value).remove();
					}
				});
			}//subInput
			
			function addInput(){
				alert("파일 업로드 행추가!" + count);
				var addHtml="";
				addHtml += '<tr id="'+count+'">';
				addHtml += '<th><input type="checkbox" id="file'+count+'" name="filecheck" value="'+count+'"></th>';
				addHtml += '<td><input type="file" id="file'+count+'" name="file'+count+'"></td>';
				addHtml += '</tr>';
				count++;
				$("#tbodyTr").append(addHtml);
			}
			
			function submitForm(){
				$("#fileCount").val($("input:checkbox[name=filecheck]").length);
				$("#testForm").submit();
			} //addInput
		</script>
	</head>
	<body>
		<h3>다중파일 업로드</h3>
		<form action="testFormOk.jsp" method="post" id="testForm" name="testForm" enctype="multipart/form-data">
		<input type="hidden" id="fileCount" name="fileCount">
		<label>작성자</label>
		<input type="text" id="name" name="name"><br>
		<label>제목</label>
		<input type="text" id="title" name="title"><br>
		<input type="button" onclick="submitForm()" value="파일 전송"><br>
		<br><br>
		<button type="button" onclick="addInput()">파일 업로드 행추가</button>
		<button type="button" onclick="subInput()">파일 업로드 행삭제</button>
		<br>
		<table>
			<tr>
				<th>체크</th>
				<td>파일첨부</td>
			</tr>
			<tbody id="tbodyTr">
			
			</tbody>
		
		</table>
		
		</form>
	</body>
</html>