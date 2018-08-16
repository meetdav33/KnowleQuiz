<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.http.HttpSession"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sent Messages</title>
<style type="text/css">
body {
	background-color: #0F0;
}
</style>
<% 
		if(session.getAttribute("session_username")==null)
		{
			response.sendRedirect("LogIn.jsp");
		}
%>
<%  

Connection connect;
ResultSet rs;
PreparedStatement ps;
connect=common.DB_Connection.ConnectDB();
String sender = session.getAttribute("session_username").toString();

String sql = "select * from Messages WHERE Sender=?";

ps = connect.prepareStatement(sql);
ps.setString(1, sender);
rs = ps.executeQuery();




	
%>
</head>
<body>
<jsp:include page="header.html"/>
<p></p>
<p></p>
<p></p>
<p></p>
<a href="Send_Message.jsp">Send Message </a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="My_Messages.jsp">My Messages </a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="Sent_Messages.jsp">Sent Messages </a>
<p>&nbsp;</p>
<p>&nbsp;</p>
<table width="343" border="1">
  <tr>
    <th width="92" scope="col">To</th>
    <th width="85" scope="col">Message</th>
    
  </tr>
  <% while (rs.next()) { %>
  <tr>
    <th width="92" scope="col"><%=rs.getString("Reciever")%></th>
    <th width="85" scope="col"><%=rs.getString("Message")%></th>
    
  </tr>
  
  
  <% } %>
</table>

</body>
<% ps.close();
   %>
</html>
