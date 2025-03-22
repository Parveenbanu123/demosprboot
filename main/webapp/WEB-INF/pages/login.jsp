<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Login Page</title>
</head>
<body>
	Login Page
	<div class="container-fluid">
		<div class="col align-self-center">
			<form action="signin" method="post">
				<div class="form-group">
					<label for="email">Email Address</label> <input type="email"
						name="txtemail" class="form-control" id="email"
						placeholder="Enter Email">
				</div>
				<div class="form-group">
					<label for="pass">Password</label> <input type="text"
						name="txtpass" class="form-control" id="pass"
						placeholder="Enter Password">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Sign-in</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>