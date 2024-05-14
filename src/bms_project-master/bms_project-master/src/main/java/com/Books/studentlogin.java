package com.Books;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/slogin")
public class studentlogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
	{
		PrintWriter out = resp.getWriter();
		HttpSession hs=req.getSession();
		String sname = req.getParameter("name");
		String spassword = req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "localhost");
			PreparedStatement ps = con.prepareStatement("select * from studentregistration1 where name = ? and password = ?");
			ps.setString(1,sname);
			ps.setString(2,spassword);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				hs.setAttribute("s_name",sname);
				resp.setContentType("text/html");
				out.println("<h2 style='color:green'>login done</h2>");
				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
				
			}
			else 
			{
				System.out.println("not done");
				resp.setContentType("text/html");
				out.println("<h2 style='color:green'>incorrect credentials</h2>");
				//RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				//rd.include(req, resp);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
    
		
		
		
}
}
