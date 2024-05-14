package com.Books;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DatabseConnection;

@WebServlet("/BookEditScreen")
public class BookEditScreen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String bname = request.getParameter("name");
			  System.out.println("abc");
			  PrintWriter pw = response.getWriter();
			  Connection con = DatabseConnection.getConn();
			  String sql = "select bname,bedition from book where bname = ?";
			  
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,bname);
				 ResultSet rs = ps.executeQuery();
				 response.setContentType("text/html");
				if(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2));
					pw.println("<form action='EditUrl?name="+bname+"' method = 'post'>");
					pw.println("<table border=1 align = 'center'>");
					pw.println("<tr>");
					pw.println("<td>bookname</td>");
					pw.println("<td><input type = 'text' name = 'bname' value = '"+rs.getString(1)+"'></td>");
					pw.println("</tr>");
					pw.println("<tr>");
					pw.println("<td>booedition</td>");
					pw.println("<td><input type = 'text' name = 'bedition' value = '"+rs.getString(2)+"'></td>");
					pw.println("</tr>");
					
					pw.println("<tr>");
					pw.println("<td><input type='reset' value = 'cancel'></td>");
					pw.println("<td><input type='submit' value = 'submit'></td>");
					pw.println("</tr>");
					pw.println("</table>");
					pw.println("</form>");
					
					
					
					
					
					
				}
			  
			  
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
				
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	}


