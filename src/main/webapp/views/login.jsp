<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- for path variable example -->
<!-- <form action="/doLogin/helloSamaneh" method="post"> -->
<!--   <span>usrename:<input type="text" name="username" /></span><br> -->
<!--     <span>passworde:<input type="password" name="password"></span><br> -->
<!--     <input type="submit" value="login"/>  -->
 
<!-- </form> -->
<form:errors cssStyle="color:red;" path="user.*" />
<form action="/doLogin" method="post">
  <span>usrename:<input type="text" name="username" /></span><br>
    <span>passworde:<input type="password" name="password"></span><br>
   <!--  <select name="coursesName" multiple="multiple">
    
     <option value="math"> Mathematic</option>
     <option value="physic"> physic</option>
     <option value="Deep learning"> Deep learning</option>
    </select> -->
     <div>
    <input type="checkbox" id="Mathematic" name="coursesName" value="Mathematic">
    <label for="Mathematic">Mathematic</label>
    </div>
  <div>
    <input type="checkbox" id="physic" name="coursesName" value="physic">
    <label for="physic">physic</label>
  </div>
  <div><span>address</span>
  <span>via:<input type="text" name="address.via" /></span><br>
    <span>number:<input type="text" name="address.num"></span><br>
    </div>
   <input type="submit" value="login"/> 
</form>
</body>
</html>