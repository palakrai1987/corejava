package com.Books;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DatabseConnection;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   System.out.println("welcome");
		try {
			response.setContentType("text/html");
			String boldname = request.getParameter("name");

			PrintWriter pw = response.getWriter();
			Connection con = DatabseConnection.getConn();
			String sql = "delete from book where bname = ?";
			System.out.println(boldname);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, boldname);

			int i = ps.executeUpdate();
			if (i > 0) {
				pw.println("record deleted");
				System.out.println("deleted");
			} else {
				System.out.println(boldname);
			}
			
			pw.println("<a href='index.jsp'>home</a>");
			pw.println("<a href='bookstore'>show book list</a>");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
