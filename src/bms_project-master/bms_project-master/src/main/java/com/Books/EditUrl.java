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

/**
 * Servlet implementation class EditUrl
 */
@WebServlet("/EditUrl")
public class EditUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditUrl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		try {
			String boldname = request.getParameter("name");
			
			String bnametoupdate =request.getParameter("bname");
			String beditiontoupdate = request.getParameter("bedition");
			
			PrintWriter pw = response.getWriter();
			Connection con = DatabseConnection.getConn();
			String sql = "update book set bname =?, bedition = ? where bname = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bnametoupdate);
			ps.setString(2, beditiontoupdate);
			ps.setString(3, boldname);
			
			int i = ps.executeUpdate();
			if (i>0)
			{
				pw.println("record inserted");
				response.setContentType("text/html");
				  System.out.println("record updated successfully");
			      pw.println("record updated");
			      pw.println("<a href='index.jsp'>home</a>");
			      pw.println("<a href='bookstore'>show book list</a>");
				
			}
			//pw.println("<a href='index.jsp'>home</a>");
			//pw.println("<a href='bookstore'>show book list</a>");
		  
			
			}

		 catch (Exception e) {
			e.printStackTrace();
		}

	}

}
