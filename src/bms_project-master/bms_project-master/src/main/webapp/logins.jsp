<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <%
        String name = (String)session.getAttribute("namep");
        
        %>
       <h2> welcome <%=name %> </h2>
            <form action= "slogin" method = "post">
               
			       name:<input type="text"  name="name"><br>
			       password : <input type="text"  name="password"><br>
			      <input type="submit"  value="login"><br>
		  </form>
		  
</body>
</html>