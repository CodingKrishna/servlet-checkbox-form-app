<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>PIONEER-CODERS tutorials</title>
		<link rel="styleSheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/app.css"/>
	</head>
	<body>
		<div class="container">
			<div>
				<a href="<%=request.getContextPath()%>/CheckBoxServlet" class="btn submit pull-right">Add New user</a>
				<h1 class="page-title">PIONEER-CODERS Tutorials</h1>
			</div>
			<h2 class="sub-title">User ${saveduser.userName} saved Successfully.</h2>
			
			<div>Languages known to ${saveduser.userName}: </div>
			<table class="table bordered striped">
				<tr>
					<th>S.No</th>
					<th>ID</th>
					<th>Language</th>
				</tr>
				<c:forEach var="lang" items="${saveduser.languagesKnown}" varStatus="loop">
					<tr>
						<td>${loop.count}</td>
						<td>${lang.id}</td>
						<td>${lang.languageKnown}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>