<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invoice Number Generation</title>

<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text] {
        width: 100px;  
    }     
    button {
        padding: 10px;
        margin: 10px;
    }
    .error {
	    color: red;
	    font-style: italic;
	}
</style>


</head>
<body>

<div id="wrapper">
		<div id="header">
			<h2>Add Invoice Number</h2>
		</div>
	
	</div>
	<div id="container">
		<div id="content">
			<form:form action="/saveInvoiceNum" method="POST" modelAttribute="number">
       		
       			<form:label path="invoiceNum">Enter Invoice Number:</form:label>
            	<form:input path="invoiceNum" /> <form:errors path="invoiceNum" cssClass="error"></form:errors>
            	<br/><br/>
            	 
            	<button type="submit">Save</button>
       
       		</form:form>
       		
       		<a href="${pageContext.request.contextPath}/"><button>Back</button></a>
       </div>
    </div>

</body>
</html>