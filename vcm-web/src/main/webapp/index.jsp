<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Sample</title>
</head>
<body>
	<h1>Hiiiii... Please enter your details</h1>
	<form action="sample">
	<label for="firstName">FirstName : </label>
	<input type="text" name="firstName"/><br/>
	<label for="lastName">LastName : </label>
	<input type="text" name="lastName"/>
	<input type="submit" value="Create"/>
	</form>
</body>
</html>