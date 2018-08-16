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
<title>Send Message</title>
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


String sql = "select userid from user_info";

ps = connect.prepareStatement(sql);

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
<form name="form1" method="post" action="SendMessage">
To 
  <select name="To" id="To">
  <% while (rs.next()) { %>
  <option value='<%=rs.getString("userid")%>'><%=rs.getString("userid")%></option>
  <% } %>
  </select> 
  <p>&nbsp;</p>
  <label for="message">Message</label>
  <textarea name="message" id="message" name="message"  required="required" cols="45" rows="5"></textarea>

  <input type="submit" name="Send" id="Send" value="Submit" />
</form>
<p>&nbsp;</p>
</body>
<% ps.close();
   %>
</html>
