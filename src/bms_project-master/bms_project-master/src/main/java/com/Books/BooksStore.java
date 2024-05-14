package com.Books;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.db.DatabseConnection;
@WebServlet("/book_register")
public class BooksStore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public BooksStore()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException 
	
	{
		try {
			  String bname = req.getParameter("name");
			  String bedition = req.getParameter("bedition");
			 // boolean f = false;
			  Connection con = DatabseConnection.getConn();
			  String sql = "insert into book(bname,bedition) values (?,?)";
			  
				PreparedStatement ps = con.prepareStatement(sql);
				 ps.setString(1,bname);
			      ps.setString(2,bedition);
				PrintWriter pw = response.getWriter();
				
			     
			    int  i = ps.executeUpdate();
			  if(i>0)
			    {
				  response.setContentType("text/html");
				  System.out.println("data inserted successfully");
			      pw.println("data inserted");
			      pw.println("<a href='index.jsp'>home</a>");
			    
			    }
			    else {System.out.println("error");}
			  
			  
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
				
	}

}
