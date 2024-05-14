<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action= "sregister" method = "post">
               
       name:<input type="text"  name="name"><br>
  
      password : <input type="text"  name="password"><br>
      
      gender :
       <label for="html">Male</label>
       <input type="radio" id="genderm" name="Gender" value="M">
       <label for="css">Female</label>
       <input type="radio" id="genderf" name="Gender" value="F"><br><br>
        
        city:
        <select name="City">
             <option>bhopal</option>
             <option>Indore</option>
             <option>Jabalpur</option>
        </select>
      <br>
      <input type="submit" value = "Register">
      
      </form>
</body>
</html>