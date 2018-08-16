//package common;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.mail.MailMessage;
//import org.springframework.mail.MailParseException;
//import java.util.*;
//import java.util.Date;
//import java.util.Properties;   
//import javax.mail.Authenticator;  
//import javax.mail.Message;  
//import javax.mail.MessagingException; 
//import javax.mail.PasswordAuthentication;  
//import javax.mail.Session;  
//import javax.mail.Transport;
//import javax.mail.internet.*;
//import javax.mail.*;
//
//
//@WebServlet("/SendEmail")
//public class SendEmail extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	String SMTP_HOST = "smtp.gmail.com";  
//    String FROM_ADDRESS = "jhanvidwivedi2018@gmail.com";  
//    String PASSWORD = "Superman@1234";  
//    String FROM_NAME = "KnowleQuiz"; 
//    String TO_ADDRESS = "jhanvidwivedi1993@gmail.com"; 
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public SendEmail() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		String subject = session.getAttribute("session_username").toString();  
//        String messageBody = request.getParameter("message");
//	    
//        
//        Properties props = new Properties();
//        
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        
//        Session ses = Session.getInstance(props, new javax.mail.Authenticator()
//        		{
//        	     protected PasswordAuthentication getPasswordAuthentication()
//        	     {
//        	    	 return new PasswordAuthentication(FROM_ADDRESS,PASSWORD);
//        	     }
//        		});
//        
//        
//        MimeMessage message = new MimeMessage(ses);
//        try {
//			message.setFrom(new InternetAddress(FROM_ADDRESS));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO_ADDRESS));
//			message.setSubject(subject);
//			message.setText(messageBody);
//			
//			Transport.send(message);
//			
//			response.sendRedirect("Welcome.jsp");
//		} catch (AddressException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   
//		
//	}
//	
//
//	}   
//
//	
//
//	 
