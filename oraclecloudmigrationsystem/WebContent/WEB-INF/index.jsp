<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="com.oraclecloudmigrationsystem.tutorial.spring.controller.*"%>
<!DOCTYPE html>
<html>
<div>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Oracle Cloud Migration System</title>
<style>
body  {
    background-image: url("C:\\oraclecloudmigrationsystem\\images\\arayuz7.jpg");
	width:100%; 
	height:auto; 
	
    text-indent: 50px;
    text-align: justify;
    letter-spacing: 3px;

}
h1   {
    text-align: left;
    text-transform: uppercase;
    color: #ff0000;
}

.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: left;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #00008B;
  border: none;

}

.button:hover {background-color: #00008B}

.button:active {
  background-color: #00008B;
  transform: translateY(4px);
}
}
</style>
</head>

<body>
   <br><br><br>
  <!--  <img src="C:\\oraclecloudmigrationsystem\\images\\logo2.jpg" align="center">  -->  

   
   <hr />
         
<br><br><br><br><br><br>
 <tr>
<form action="/spring-mvc-form-handling-example/registrationForm">
    <button type="submit" align="center" class="button" >VMware Virtual Machine</button>
</form>
</tr>
<br>
<br>
 <tr>  
<form action="/spring-mvc-form-handling-example/amazon">
    <button type="submit" align="center" class="button" >Amazon Virtual Machine</button>
</form>
</td>
<tr>
<br>
<br>
<form action="/spring-mvc-form-handling-example/azure">
    <button type="submit" align="center" class="button" >Azure Virtual Machine</button>
</form>
</tr>
<tr>
<br>
<br>
<form action="/spring-mvc-form-handling-example/google">
    <button type="submit" align="center" class="button">Google Virtual Machine</button>
</form>
</tr>
<br>
<br>
</body>
</div>
<style type="text/css">
body { background-color: aqua; margin: 0; }
div {
	width: 200px;
	height: 100px;
	background-color: #DDD;
	background-image: url("/spring-mvc-form-handling-example/arayuz.jpg");
}
div.center { background-position: center; }
div.bottomright { background-position: bottom right; }
div.positionspecified { background-position: 2px 15px; }
div.repeat { background-repeat: repeat; }
div.repeatx { background-repeat: repeat-x; }
div.repeaty { background-repeat: repeat-y; }
div.norepeat { background-repeat: no-repeat; }
div.scroll { background-attachment: scroll; }
div.fixed { background-attachment: fixed; }
</style>
</html>

