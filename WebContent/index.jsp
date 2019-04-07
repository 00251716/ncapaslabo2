<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log in</title>
</head>
<body>
<h1>Log in</h1>
<form action="MainServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="usr" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>