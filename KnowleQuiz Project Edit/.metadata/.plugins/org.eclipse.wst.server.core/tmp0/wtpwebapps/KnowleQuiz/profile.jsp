<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Profile</title>
<style type="text/css">
body {
	background-color: #0F0;
}
</style>
</head>
<% 
		if(session.getAttribute("session_username")==null)
		{
			response.sendRedirect("LogIn.jsp");
		}
		else
		{
		
		}
%>
<%  

Connection connect;
ResultSet rs;
PreparedStatement ps;
connect=common.DB_Connection.ConnectDB();

String sql1 = "select * from user_info where userid=?";
ps = connect.prepareStatement(sql1);
ps.setString(1, session.getAttribute("session_username").toString());
rs = ps.executeQuery();


%>
<body>
<jsp:include page="header.html"/>
<h1 align="center">Profile</h1>
<form id="form1" name="form1" method="post" action="update_info">
<p align="center">First Name: 
  <label for="firstname"></label>
  <input type="text" name="firstname" id="firstname" value='<%=rs.getString("firstname")%>' required="required" />
</p>
<p align="center">Last Name: 
  <label for="lastname"></label>
  <input type="text" name="lastname" id="lastname"  value='<%=rs.getString("lastname")%>' required="required"/>
</p>
<p align="center">User ID :
  <label for="userid"></label>
  <input type="text" name="userid" id="userid" required="required"  value='<%=rs.getString("userid")%>' readonly="readonly"/>
</p>
<p align="center">Password: 
  <label for="password"></label>
  <input type="password" name="password" id="password"  value='<%=rs.getString("password")%>' required="required"/>
</p>
<p align="center">Address: 
  <label for="address"></label>
  <input type="text" name="address" id="address"  value='<%=rs.getString("address")%>' required="required"/>
</p>
<p align="center">Contact: 
  <label for="contact"></label>
  <input type="text" name="contact" id="contact"  value='<%=rs.getString("contact")%>' required="required"/>
</p>

  <div align="center">
    <input type="submit" name="Register" id="Register" value="Submit" />
  </div>
</form>
<p>&nbsp;</p>


</body>
<% ps.close(); %>
</html>
