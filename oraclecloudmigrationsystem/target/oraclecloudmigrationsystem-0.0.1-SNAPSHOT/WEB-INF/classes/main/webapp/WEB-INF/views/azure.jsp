<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="com.oraclecloudmigrationsystem.tutorial.spring.controller.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style>
body  {
    background-image: url("C:\\oraclecloudmigrationsystem\\images\\arayuz4.jpg");
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
  padding: 5px 25px;
  font-size: 15px;
  cursor: pointer;
  text-align: left;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #00008B;
  border: none;
  height:50px;
  width:180px;

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
<!--   <h1>Azure Cloud MIGRATION System</h1> -->
   <hr />
<br><br><br>
   <form:form action="azurecon" method="post" modelAttribute="user">
      <table>
      <tr>
            <td>Azure VM Name</td>
            <td><form:input path="vhd_name" /></td>
         </tr>
         <tr>
         	<td>VM Convert</td>
            <td><form:button class="button">Convert</form:button></td>
         </tr>       
      </table>
   </form:form>
   
      <form:form action="qemu" method="post" modelAttribute="user">
      <table>
         <tr>
            <td>VM Name</td>
            <td><form:input path="vm_name" /></td>
         </tr>
         <tr>
            <td></td>
            <br><br>
            <td><form:button class="button">Submit</form:button></td>
         </tr>
         
      </table>
   </form:form>
   
   <form:form action="zip" method="post" modelAttribute="user">
      <table>
         <tr>
            <td>Tarball</td>
         </tr>
         <tr>
            <td></td>
            <br><br>
            <td><form:button class="button">Submit</form:button></td>
         </tr>
         
      </table>
   </form:form>

   <form:form action="upload" method="post" modelAttribute="user">
      <table>
         <tr>
            <td>Oracle Cloud Username</td>
            <td><form:input path="ftm_username" /></td>
         </tr>
         <tr>
            <td>Oracle Cloud Auth. URL</td>
            <td><form:input path="ftm_auth" /></td>
         </tr>
         <tr>
            <td>Oracle Cloud Identitiy Name</td>
            <td><form:input path="ftm_identity" /></td>
         </tr>
         <tr>
            <td></td>
            <br><br>
            <td><form:button class="button">Submit</form:button></td>
         </tr>

      </table>
   </form:form>

</body>
</html>