<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<h1>
		<%
		String n = request.getParameter("nome");
		String d = request.getParameter("desc");
		%>
	</h1>


	<table border="2px">
		<thead>
			<td>000000000000000000</td>
			<td>111111111111111111111</td>
			<td>2222222222222222222</td>
		</thead>
		<tr>
			<td>sekjfhsduajfghsadjlkgfewraqjf</td>
			<td>sekjfhsduajfghsadjlkgfewraqjf</td>
			<td>sekjfhsduajfghsadjlkgfewraqjf</td>
		</tr>
		<tr>
			<td>sekjfhsduajfghsadjlkgfewraqjf</td>
			<td><%out.println(n);%></td>
			<td><%out.println(d);%></td>
		</tr>
	</table>

</body>
</html>