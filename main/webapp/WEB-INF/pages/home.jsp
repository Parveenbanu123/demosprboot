<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
	${NOTIFICATION }
	Welcome to Home Page!!!
	<table class="table table-striped table-hover table-info" border="1" width="40%">
		<tr>
			<th>Emp ID</th>
			<th>Ename</th>
			<th>Email</th>
			<th>Password</th>
			<th>Gender</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach var="row" items="${allemp}">
			<tr>
				<td><c:out value="${row.eid}" /></td>
				<td><c:out value="${row.ename}" /></td>
				<td><c:out value="${row.email}" /></td>
				<td><c:out value="${row.password}" /></td>
				<td><c:out value="${row.gender}" /></td>
				<td><a href="edit?eid=${row.eid}&ename=${row.ename}&email=${row.email}&password=${row.password}&gender=${row.gender}">EDIT</a></td>
				<td><a href="delete?eid=${row.eid}">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>