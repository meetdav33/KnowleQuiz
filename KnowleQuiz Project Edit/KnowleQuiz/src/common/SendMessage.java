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


@WebServlet("/SendMessage")
public class SendMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connect;
    ResultSet rs;
    PreparedStatement ps;
       
    
    public SendMessage() {
        super();
        connect=DB_Connection.ConnectDB();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String To = request.getParameter("To");
		String message = request.getParameter("message");
		String from = session.getAttribute("session_username").toString();
		
		
		PrintWriter out = response.getWriter();
		
		
		
		String sql = "Insert into Messages (Sender,Reciever,Message) values (?,?,?)";
		
		try{
            ps=connect.prepareStatement(sql);

            ps.setString(1,from);
            ps.setString(2,To);
            ps.setString(3,message);
            
            ps.execute();
            try{
                ps.close();
                rs.close();
            connect.close();
                }catch (Exception e)
                {
                
                }
            response.sendRedirect("Messages.jsp");
        }catch(Exception e)
        {
         
        }
		
	}

}
