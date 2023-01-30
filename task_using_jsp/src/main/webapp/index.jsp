<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1 style='color:Blue' align="center"> Please Register Here</h1>
<form action="call" method="post">
<div align="center">
<table>
<tr><td>First_Name</td><td><input type="text" name="fname"></td></tr>
<tr><td>Last_Name</td><td><input type="text" name="lname"></td></tr>
<tr><td>E-mail</td><td><input type="email" name="email"></td></tr>
<tr><td>Gender</td></tr>
<tr><td><input type="radio" name="gender" value="male">Male</td>
<td><input type="radio" name="gender" value="Female">Female</td>
<td><input type="radio" name="gender" value="others">Others</td></tr>
<tr><td>Address</td><td><textarea rows="5" cols="25" name="address"></textarea></td></tr>
<tr><td>Reason</td><td><textarea rows="5" cols="25" name="reason"></textarea></td></tr>
<tr><td><input type="submit" value="Submit" ></td></tr>
<tr><td>
</table>
</div>
</form>
</body>
</html>