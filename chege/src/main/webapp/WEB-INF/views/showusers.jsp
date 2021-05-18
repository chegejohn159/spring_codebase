<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
  
 <div class="container">
 <div style="margin-top: 70px;">
 <h1>System Users</h1>
 <a class="btn btn-success" href="/chege">Add User</a>
 
 </div>
   <div class="row">
  <c:forEach items="${allusers}" var="users">
  <div class="card bg-info col-md-3 col-lg-3">
   <div class="card-body text-center">
      <p class="card-text">ID: ${users.id}</p>
      <p class="card-text">Name: ${users.name}</p>
      <p class="card-text">Email: ${users.email}</p>
      <a class="btn btn-danger" href="duser?id=${users.id}">Delete</a>
       <a class="btn btn-warning" href="suuser?id=${users.id}">Edit</a>
    </div>
  </div>
   </c:forEach>
  </div>
  
 </div>


  
  
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
  
 </body>
</html>


