package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class quiz_selection
 */
@WebServlet("/quiz_selection")
public class quiz_selection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quiz_selection() {
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
		HttpSession session = request.getSession();
        session.setAttribute("selected_quiz",request.getParameter("selected_quiz").toString() );
        String selected_quiz = request.getParameter("selected_quiz").toString();
        	if(selected_quiz.equals("Java"))
        	{
        		response.sendRedirect("Java_quiz.jsp");
        	}
        	else if(selected_quiz.equals("PHP"))
        	{
        		response.sendRedirect("PHP_quiz.jsp");
        	}
        	if(selected_quiz.equals("JSP"))
        	{
        		response.sendRedirect("JSP_quiz.jsp");
        	}
        	if(selected_quiz.equals("Computer"))
        	{
        		response.sendRedirect("Computer_quiz.jsp");
        	}
	}

}
