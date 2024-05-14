package com.Books;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sregister")
public class StudentRegistration extends HttpServlet
{   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
	{
		PrintWriter out = resp.getWriter();
		HttpSession hs=req.getSession();
		String sname = req.getParameter("name");
		String spassword = req.getParameter("password");
		String sgender = req.getParameter("Gender");
		String scity = req.getParameter("City");
		System.out.println(sname + ""+spassword + sgender + scity);
		//out.println(sname + spassword +sgender +scity);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "localhost");
			PreparedStatement ps = con.prepareStatement("insert into studentregistration1 values (?,?,?,?)");
			ps.setString(1,sname);
			ps.setString(2,spassword);
			ps.setString(3,sgender);
			ps.setString(4,scity);
			hs.setAttribute("namep",sname);
			int i = ps.executeUpdate();
			if(i>0)
			{
				hs.setAttribute("s_name",sname);
				resp.setContentType("text/html");
				out.println("<h2 style='color:green'>Registration done</h2>");
				RequestDispatcher rd = req.getRequestDispatcher("/logins.jsp");
				rd.include(req, resp);
				System.out.println("insertion done");
			}
			else 
			{
				System.out.println("not done");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
    }
}