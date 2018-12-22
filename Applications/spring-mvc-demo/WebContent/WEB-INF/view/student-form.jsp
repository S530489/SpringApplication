<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<br>
		<br>
		Last Name: <form:input path="lastName"/>
		<br>
		<br>
		Country : 
		<form:select path="country">
			<form:option value="IND" label="India" />
			<form:option value="BRA" label="Brazil" />
			<form:option value="USA" label="America" />
			<form:option value="CAN" label="Canada" />
			<form:option value="AUS" label="Australia" />
		</form:select>
		<br>
		<br>
		
		Capital:
	<form:select path="capital">
		<form:options items="${student.capitalOptions}"/>
	</form:select>
	
		<br>
		<br>
		Favorite Language:
		<br>
		JAVA <form:radiobutton path="favoriteLanguage" value="java"/>
		PYTHON <form:radiobutton path="favoriteLanguage" value="python"/>
		PHP <form:radiobutton path="favoriteLanguage" value="php"/>
		C# <form:radiobutton path="favoriteLanguage" value=".net"/>
		
		<br>
		<br>
		Operating Systems:
		Linux<form:checkbox path="operatingSystems" value="linux"/>
		Mac<form:checkbox path="operatingSystems" value="MacOS"/>
		windows<form:checkbox path="operatingSystems" value="windows 10"/>
		
		<br>
		<br>
		<input type="submit" value="Submit Form">
	</form:form>
	
	
	
</body>
</html>