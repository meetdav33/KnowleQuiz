package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	Connection connect;
    ResultSet rs;
    PreparedStatement ps;
    
    public Login() {
        super();
        connect=DB_Connection.ConnectDB();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String sql = "select * from user_info where userid=? AND password=?";
        try{
            ps=connect.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            
            
            
            if(rs.next()){
            	HttpSession session = request.getSession();
              session.setAttribute("session_username",username );
              	response.sendRedirect("Welcome.jsp");
              	
            }
            
            else
            {
            	response.sendRedirect("LogIn.jsp");
            }
        }
           
            catch(SQLException se)
            {
            	PrintWriter out = response.getWriter();
            	out.println("SQL EXCEPTION: " +se.getMessage());
            }
        catch(Exception e)
        {
        	PrintWriter out = response.getWriter();
        	out.println("SQL EXCEPTION: " +e.getMessage());
        }
        finally {
			try {
				if(connect!=null)
				{
					//connect.close();
					//rs.close();
					ps.close();
			}
			
		}
			catch(SQLException se)
			{
				PrintWriter out = response.getWriter();
            	out.println("SQL EXCEPTION: " +se.getMessage());
            }
			}
        }
            
            
//            if(rs.next()){
//            	try{
//                    ps.close();
//                    rs.close();
//                connect.close();
//                    }catch (Exception e)
//                    {
//                    
//                    }
//                HttpSession session = request.getSession();
//                session.setAttribute("session_username",username );
//                	response.sendRedirect("Welcome.jsp");
//                
//            }else
//            {
//            	try{
//                    ps.close();
//                    rs.close();
//                connect.close();
//                    }catch (Exception e)
//                    {
//                    
//                    }
//            	response.sendRedirect("LogIn.jsp");
//            	
//            	
//            
//            }
//        }catch(Exception e)
//        {
//                
//                        
//        }
	}


