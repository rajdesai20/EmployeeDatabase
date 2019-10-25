<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Employees:</h3>
<form action = "create" method="post">
	Enter Employee id:<input type="number" name="eid" required><br>
	Enter Employee First Name:<input type="text" name="fname" required><br>
	Enter Employee Last Name:<input type="text" name="lname" required><br>
	Select Department:<br>
	<select name="department">
		<c:forEach items="${depts}" var="dept">
		<option value="${dept.did}">${dept.did}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Submit"><br>
</form>
<br><br>
<h3>Department:</h3>
<form action = "create1" method="post">
	Enter Department id:<input type="number" name="did" required><br>
	Enter Department Name:<input type="text" name="dname" required><br>
	Select Employee:<br>
	<select name="employee" multiple>
		<c:forEach items="${emps}" var="emp">
		<option value="${emp.eid}">${emp.eid}</option>
		</c:forEach>
	</select><br>
	<input type="submit" value="Submit"><br>
</form><br><br>

</body>
</html>