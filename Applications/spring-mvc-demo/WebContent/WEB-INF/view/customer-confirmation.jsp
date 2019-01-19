<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>

<title> Customer Confirmation Page</title>
</head>

<body>


	Customer is : ${customer.firstName}  ${customer.lastName}
	<br>
	Free Pass is : ${customer.freePass}
	<br>
	
	postalCode is : ${customer.postalCode}
	
	<br>
	CourseCode is : ${customer.courseCode}
</body>
</html>