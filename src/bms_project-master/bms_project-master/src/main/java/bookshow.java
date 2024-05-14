import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
	import java.sql.DriverManager;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import com.db.DatabseConnection;
import com.mysql.cj.protocol.Resultset;
	@WebServlet("/bookshow")
	
	public class bookshow {
		protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException 
		
		{
			try {
				PrintWriter out = response.getWriter();
				  
				  Connection con = DatabseConnection.getConn();
				  String sql = "select bname,bedition from book";
				  
					PreparedStatement ps = con.prepareStatement(sql);
					 ResultSet rs = ps.executeQuery();
					 while (rs.next())
					 {
						out.println(rs.getString(0) + ""+rs.getString(1)); 
					 }
				  
				 }catch(Exception e)
				 {
					 e.printStackTrace();
				 }
					
		}

	}



