<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Result</h1>
<table>
	<tr>
		<td>Student name</td>
		<td><%out.println(request.getParameter("tbname")); %>
	</tr>
	<tr>
		<td>mobile no</td>
		<td><%out.println(request.getParameter("tbmobile")); %>
	</tr>
	<tr>
		<td>result</td>
		<td><%out.println(request.getAttribute("result")); %>
	</tr>

</table>
</body>
</html>