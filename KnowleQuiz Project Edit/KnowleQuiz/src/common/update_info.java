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
import javax.servlet.http.HttpSession;


@WebServlet("/update_info")
public class update_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connect;
    ResultSet rs;
    PreparedStatement ps;
    
       
    
    public update_info() {
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
		
		
		
		String sql = "UPDATE user_info SET firstname=?, lastname=?, password=? , address=? , contact=? WHERE userid=?";
		
		try{
            ps=connect.prepareStatement(sql);

            ps.setString(1,firstname);
            ps.setString(2,lastname);
            ps.setString(3,password);
            ps.setString(4,address);
            ps.setString(5,contact);
            ps.setString(6,userid);
            ps.execute();
            ps.close();
            response.sendRedirect("Welcome.jsp");
        }catch(Exception e)
        {
         
        }
		
	}

}
