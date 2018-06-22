<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="com.oraclecloudmigrationsystem.tutorial.spring.controller.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oracle Cloud Migration System</title>
</head>
<body>
   <h1>Oracle Cloud Migration System</h1>
   <hr />

   <form:form action="saveUser" method="post" modelAttribute="user">
      <table>
         <tr>
            <td>VMware Username:</td>
            <td><form:input path="firstName" /></td>
         </tr>
            <tr>
            <td>VMware Password:</td>
            <td><form:password path="password" /></td>
         </tr>
         <tr>
            <td> Source Path at ESX </td>
            <td><form:input path="username" /></td>
         </tr>
          <tr>
            <td>Target Path at Local Folder</td>
            <td><form:input path="lastName" /></td>
         </tr>
         <tr>
            <td><form:button>Submit</form:button></td>
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
            <td><form:button>Submit</form:button></td>
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
            <td><form:button>Submit</form:button></td>
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
            <td><form:button>Submit</form:button></td>
         </tr>

      </table>
   </form:form>

</body>
</html>