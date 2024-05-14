<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/bootstrap.css">
</head>
<body class="container-fluid card" style="width: 40rem;">

    <h2 class="bg-danger text-white text-center">Books Registration</h2>
    <%
        String name = (String)session.getAttribute("namep");
        
        %>
       <h2> welcome <%=name %> </h2>
    
    
    
<form action = "book_register" method="post">
   <table class ="table table-hover">
     <tr>
         <td>Bookname</td>
         <td><input type= "text" name = "name"><br></td>
     </tr>
     <tr>
         <td>Bookedition</td>
         <td> <input type= "text" name = "bedition"> <br>
    </td>
     </tr>
     
     <tr>
         <td><input type = "reset" value = "cancel"></td></td>
         <td> <input type = "submit" value = "submit"></td>
     </tr>
     
     <tr>
         <td>show book list</td>
         <td> <a href='bookstore'>show book list</a></td>
     </tr>
     
     
     
    </table>
   
    
   
     
    </form>
    
   
    
</body>
</html>