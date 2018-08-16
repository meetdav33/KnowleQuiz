package common;

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


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connect;
    ResultSet rs;
    PreparedStatement ps;
       
    
    public Registration() {
        super();
        connect=DB_Connection.ConnectDB();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		PrintWriter out = response.getWriter();
		
		
		
		String sql = "Insert into user_info (firstname,lastname,userid,password,address,contact) values (?,?,?,?,?,?)";
		
		try{
            ps=connect.prepareStatement(sql);

            ps.setString(1,firstname);
            ps.setString(2,lastname);
            ps.setString(3,userid);
            ps.setString(4,password);
            ps.setString(5,address);
            ps.setString(6,contact);
            ps.execute();
            try{
                ps.close();
                rs.close();
            connect.close();
                }catch (Exception e)
                {
                
                }
            response.sendRedirect("LogIn.jsp");
        }catch(Exception e)
        {
         
        }
		
	}

}
