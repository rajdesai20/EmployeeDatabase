<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>For Employee:</h3>
<form action="delete" method="post">
	<input type="hidden" name="formname" value="emp_del">
	<input type="text" name ="id" required><br>
	<input type="submit"><br>
</form>
<br><br>
<h3>For Department:</h3>
<form action="delete" method="post">
	<input type="hidden" name="formname" value="dept_del">
	<input type="text" name ="id" required><br>
	<input type="submit"><br>
</form>
</body>
</html>