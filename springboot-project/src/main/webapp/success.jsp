<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center>
	<h1>ALL INFORMAITION</h1>
</center>
<script type="text/javascript">
	function addStudent() {
		alert("Add Student Data");
		document.fn.action = "reg";
		document.fn.submit();
	}
	function deleteStudent() {

		document.fn.action = "delete";
		document.fn.submit();
	}
	function editStudent() {

		document.fn.action = "edit";
		document.fn.submit();
	}
	function logInStudent() {

		document.fn.action = "logIn";
		document.fn.submit();
	}
</script>
</head>
<body>
	<form name="fn">
		<table border="1" align="center">
		<th>sr.no</th>
			<th>rollno</th>
			<th>Name</th>
			<th>UName</th>
			<th>Password</th>
			<th>Mobile No</th>
			<th>Address</th>
			<tr>
				<c:forEach items="${Student}" var="Student">
					<br>
					<td><input type="radio" name="rollno" value="${Student.rollno}"></td>
					<td>${Student.rollno}</td>
					<td>${Student.name}</td>
					<td>${Student.uname}</td>
					<td>${Student.password}</td>
					<td>${Student.mobileno}</td>
					<td>${Student.addr}</td>
			</tr>
			</c:forEach>
		</table>
		<table border="2" align="center">
			<tr>
				<td><input type="button" value="EDIT" onclick="editStudent()"></td>
				<td><input type="button" value="ADD" onclick="addStudent()"></td>
				<td><input type="button" value="DELETE" onclick="deleteStudent()"></td>
				<td><input type="button" value="LOGOUT" onclick="logInStudent()"></td>
			</tr>
		</table>
	</form>
</body>
</html>