<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	int dan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
사용법 http://localhost:8088/helloweb/gugudan?dan=3 ?의 뜻 값을 넣어준다
	 <table border="1">
      <%
         for(int i=1; i<=9; i++){
      %>
            <tr>
               <td><%=dan%></td>
               <td><%=i%></td>
               <td><%=dan*i%></td>
            <tr>   
      <%
         }
      %>      
   </table>
</body>
</html>