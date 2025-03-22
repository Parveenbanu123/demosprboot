<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Edit</title>
</head>
<body>
	<div class="container-fluid">
		<div class="col align-self-center">
			<form action="updateEmp" method="POST">
			<div class="form-group">
					<label for="eid">Employee ID</label> <input type="text"
						name="eid" class="form-control" id="eid" value="${param.eid }"
						readonly>
				</div>
				<div class="form-group">
					<label for="ename">EmployeeName</label> <input type="text"
						name="ename" class="form-control" id="ename" value="${param.ename }"
						placeholder="Enter Emp name">
				</div>
				<div class="form-group">
					<label for="email">Email address</label> <input type="email"
						name="email" class="form-control" id="email" value="${param.email }"
						placeholder="Enter Email">
				</div>
				<div class="form-group">
					<label for="pass">Password</label> <input type="text"
						name="password" class="form-control" id="pass" value="${param.password }"
						placeholder="Enter Password">
				</div>
				<div class="form-group">
					<label for="gender">Gender</label> <input type="text"
						name="gender" class="form-control" id="gender"  value="${param.gender }"
						placeholder="Enter Gender">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Update Employee</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>