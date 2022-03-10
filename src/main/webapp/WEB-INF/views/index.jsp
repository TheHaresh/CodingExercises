<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invoice Number Generation</title>

<style>
table, td, th {
  border: 1px solid black;
}

table{
  border-collapse: separate;
  border-spacing: 15px;
}

</style>

</head>
<body>

<div id="wrapper">
		<div id="header">
			<h2>Invoice Number List</h2>
		</div>
	
	</div>
	<div id="container">
		<div id="content">
		
			<table>
			<tr>
				<th>Id</th>
				<th>Invoice Number</th>
			</tr>
			
			<c:forEach var="tempinv" items="${number}">
			
				<tr>
					<td>${tempinv.id}</td>
					<td>${tempinv.invoiceNum}</td>
					</tr>
			
			
			</c:forEach>
		
		</table>
		<br><br>
		<a href="/addNew">Add New Invoice Number</a>
			
       </div>
    </div>

</body>
</html>