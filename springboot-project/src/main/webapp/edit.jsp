<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="rollno" value="${Student.rollno}">
<br>
Name:-<input type="text" name="name" value="${Student.name}">
<br>
UserName:-<input type="text" name="uname" value="${Student.uname}">
<br>
Password:<input type="password" name="password" value="${Student.password}">
<br>
MobileNo:<input type="text" name="mobileno" value="${Student.mobileno}">
<br>
Address:<input type="text" name="addr" value="${Student.addr}">
<br>
<input type="submit" value="UPDATE">
</form>
</body>
</html>