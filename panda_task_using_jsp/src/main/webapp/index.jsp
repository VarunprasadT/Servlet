<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1 style='color:blue' align="center">Enter the Details</h1>
<form action="call" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="name" ></td></tr>
<tr><td>E-mail</td><td><input type="email" name="email"></td></tr>
<tr><td>Phone Number</td><td><input type="number" name="number"></td></tr>
<tr><td>Enter The Password</td><td><input type="password" name="password"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" name="conPassword"></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>