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

@WebServlet("/bookstore")
public class bookstore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			  PrintWriter pw = response.getWriter();
			  Connection con = DatabseConnection.getConn();
			  String sql = "select bname,bedition from book";
			  
				PreparedStatement ps = con.prepareStatement(sql);
				 ResultSet rs = ps.executeQuery();
				 response.setContentType("text/html");
				pw.println("<table border='1' align = 'center'>");
				pw.println("<tr>");
				pw.println("<th>bookname</th>");
				pw.println("<th>bedition</th>");
				pw.println("<th>Edit</th>");
				pw.println("<th>Delete</th>");
				
				pw.println("</tr>");
				 while(rs.next())
				 {
					 //System.out.println(rs.getString(1));
					 //pw.println(rs.getString(1) + " "+ rs.getString(2));
					 pw.println("<tr>");
						pw.println("<td> "+ rs.getString(1) + "</td>");
						pw.println("<td> " + rs.getString(2) + "</td>");
						pw.println("<td><a href='BookEditScreen?name="+rs.getString(1)+"'>edit</a></td>");
						pw.println("<td><a href='DeleteServlet?name="+rs.getString(1)+"'>delete</a></td>");
						//pw.println("<td> "+ rs.getString(1) + "</td>");
						//pw.println("<td> "+ rs.getString(1) + "</td>");
						
						pw.println("</tr>");
					 
				 }
				
				 pw.println("</table>"); 
				pw.println("<a href='index.jsp'>home</a>");
				pw.println("<a href='bookstore'>show book list</a>");
			  
			  
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
				
	}

		
		
		
		
	}


