<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
	  xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
	<head>
		<title>VWA - Vulnerable Web App</title>
	</head>
	<body>
		<h1 th:inline="text">Hello [[${#httpServletRequest.remoteUser}]]!</h1>
		${message}
	</body>
</html>