package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class result
 */
@WebServlet("/result_computer")
public class result_computer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connect;
    ResultSet rs;
    PreparedStatement ps;
    ResultSet rs1;
    PreparedStatement ps1;
    int marks=0;
    int total=0;
   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public result_computer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		connect=DB_Connection.ConnectDB();
		HttpSession session = request.getSession();
		String username = session.getAttribute("session_username").toString();
		
		String sql2 = "select * from Computer";
		String sql3 = "INSERT INTO result (userid,marks,total,Test) VALUES (?,?,?,?)";
        try {
			ps = connect.prepareStatement(sql2);
//			ps.setString(1, test);
			rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			
			while (rs.next()) {
				
			String Que = request.getParameter(rs.getString("Que_Num"));
			String Ans = rs.getString("Correct");
			 
			if(Que.equals(Ans)) {
				
				marks++;
			} 
			else
			{
				
				out.println("Question: " + rs.getString("Question") + "<br/>");
				out.println("Correct Answer: " + Ans + "<br/><br/>");
			}
				total++;
			
			}
			
			ps1 = connect.prepareStatement(sql3);
			ps1.setString(1,username);
			ps1.setInt(2,marks);
			ps1.setInt(3,total);
			ps1.setString(4,"Computer");
			ps1.execute();
			ps1.close();
			
			out.println("You got "+ marks + " marks out of " + total);
			out.print("<a href=\"Welcome.jsp\"> Go to Home Page </a>");
			marks=0;
			total=0;
			ps.close();
			
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
        
        
        
        
        	
        	
        
        
        }
        
        
		
		
	

}
