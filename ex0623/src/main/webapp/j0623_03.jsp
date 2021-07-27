<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			<style type="text/css">
			table,td,th{border:1px solid black; border-collapse: collapse;
				text-align: center;}
			</style>
	</head>
	<body>
	<% 
		String[] name = {"홍길동","이순신","유관순","강감찬","김구"};
		int[] stuNo = {1,2,3,4,5};
		int[][] score = {{100,100,100,300},{100,100,100,300},{100,100,100,300},{100,100,100,300},{100,100,100,300}};
		double[] avg = {100.0,100.0,100.0,100.0,100.0,100.0};
	%>

      <%
      for (int i=0; i<name.length; i++) {

         /*    for(int j=0; j<name.length; j++){
         out.println(j);
            } */
      %>
      
         <td>
            <%
            out.print(stuNo[i]);
            %>
         </td>
         <td>
            <%
            out.print(name[i]);
            %>
         </td>
         <%
         for (int j=0; j<4; j++) {
         %>
         <td>
            <%
            out.print(score[i][j]);
            %>
         </td>
         <%
         }
         %>
         <td>
            <%
            out.print(avg[i]);
            %>
         </td>

      <tr><% out.println();%></tr>
      <%
      }
      %>
		<tr>
		<%! 
			public int max(int a, int b){
				return Math.max(a, b);
			}
			public int diff(int a, int b){
				int c = a-b;
				return (c<0) ? -c : c ;
			}
		
		%>
		</tr>
		</table>

<%-- 			<%
			for(int i=1;i<name.length;i++){
				out.println("<tr><td>");
				out.println(i);
				out.println("</td><td>");
				out.println(name[i]);
				out.println("</td>");
				out.println("</tr>");
			}	
			%>
			<%
			for(int j=0;j<score.length;j++){
				for(int k=1;k<score.length;k++){
				out.println(j + "<td>");
				out.print(score[j] + score[k] + "</td>");
				}
			}
			%> --%>
<!-- 			<tr>
				<td>1</td>
				<td>홍길동</td>
				<td>100</td>
				<td>100</td>
				<td>100</td>
				<td>300</td>
				<td>100.0</td>
			</tr> -->
<%-- 	<%
		ArrayList<ItemBeans> itemArray = ItemArrayBeans.getItemArray();
		for(ItemBeans record : itemArray){
		%>
		<tr>
		<td><input type="text" name="prid" value="<%=record.getId()%>"></td>
		<td><%=record.getTitle()%></td>
		<td><%=record.getGroups()%></td>
		<td><%=record.getGenre()%></td>
		<td><%=record.getPrice()%></td>
		</tr>
	<% 
	} 
	%> --%>
	
<%-- 	<%
	for(int i=1; i<stuNo.length; i++) {
	  for(int j=1; j<name.length; j++) {
	%>
		<tr>
	<%
	    for(int k=0; k<name.length; k++) {
	    	out.println(i+j+k);
	    }
	%>
		</tr>
	<%
	  }
	}
	%> --%>
	</body>
</html>

