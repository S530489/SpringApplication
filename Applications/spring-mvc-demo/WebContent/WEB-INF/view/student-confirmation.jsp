<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Student Confirmation</title>
</head>

<body>
	The student is confirmed: ${student.firstName}  ${student.lastName }
	<br>
	He is from : ${student.country } and capital is ${student.capital }
	<br>
	Favorite Language is ${student.favoriteLanguage }
	
	<br>
	<br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }" >
			<li> ${temp} </li>
		</c:forEach>
	</ul>
</body>

</html>