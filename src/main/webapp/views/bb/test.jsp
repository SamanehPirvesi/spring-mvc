<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> ${message} </p>
<h1>username : ${user.username}</h1>
<h1>password : ${user.password}</h1>

<c:forEach items="${user.coursesName}" var="name" >
  <c:out value="${name}"></c:out><br>
</c:forEach>

<h1>via : ${user.address.via}</h1>
<h1>num : ${user.address.num}</h1>
</body>
</html>