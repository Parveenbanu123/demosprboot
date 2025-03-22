<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
	<h2>Hello World!</h2>
	<form action="MyServlet" method="get">
		Customer Name:<input type="text" name="custname" /> 
		Customer Password:<input type ="text" name="custpwd" />
		<input type="submit" value="Submit" />
	</form>
	<form action="CookieSessionServlet" method="post">
		User Name:<input type="text" name="username" /> 
		<input type="submit" value="Login with Cookie" />
	</form>
	<form action="URLRewritingSessionServlet" method="post">
		User Name:<input type="text" name="username" /> 
		<input type="submit" value="Login with URL" />
	</form>
</body>
</html>
