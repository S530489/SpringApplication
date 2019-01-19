<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<title>
	<h2>Customer Registration Form</h2>
</title>

<style type="text/css">

	.error {color: red}
</style>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="customer">
		FirstName: <form:input path="firstName"/>
		
		<br><br>
		LastName(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br><br>
		Free pass: <form:input path="freePass"/>
		<form:errors path="freePass" cssClass="error"></form:errors>
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br><br>
		
		Course Code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"></form:errors>
		<br><br>
		
		<input type="submit" value="Submit Form">
	</form:form>

</body>
</html>