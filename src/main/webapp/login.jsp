<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Login Page</h2>
	
	<form action="LoginServlet" method="post">
		<input type="text" name="username" placeholder="Enter username"/>
		<input type="password" name="password" placeholder="Enter password"/>
		<input type="submit" value="Login"/>
	</form>
	
	<%
	String name = request.getParameter("username");
	if(name!=null){
		out.println(name);
	}
	%>
	

</body>
</html>