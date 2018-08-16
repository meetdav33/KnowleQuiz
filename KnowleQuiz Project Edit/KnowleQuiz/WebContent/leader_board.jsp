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
<title>Leader Board</title>
<style type="text/css">
.hidden
{
display:none;
}
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
ResultSet rs1;
ResultSet rs2;
ResultSet rs3;
ResultSet rs4;
PreparedStatement ps1;
PreparedStatement ps2;
PreparedStatement ps3;
PreparedStatement ps4
;
connect=common.DB_Connection.ConnectDB();


String sql1 = "select * from result WHERE Test='Computer' ORDER BY marks DESC";
String sql2 = "select * from result WHERE Test='Java' ORDER BY marks DESC";
String sql3 = "select * from result WHERE Test='PHP' ORDER BY marks DESC";
String sql4 = "select * from result WHERE Test='JSP' ORDER BY marks DESC";

ps1 = connect.prepareStatement(sql1);
ps2 = connect.prepareStatement(sql2);
ps3 = connect.prepareStatement(sql3);
ps4 = connect.prepareStatement(sql4);

rs1 = ps1.executeQuery();
rs2 = ps2.executeQuery();
rs3 = ps3.executeQuery();
rs4 = ps4.executeQuery();


	
%>
</head>

<body>
<jsp:include page="header.html"/>
<table width="343" border="1">
<caption>Computer</caption>
  <tr>
    <th width="92" scope="col">UserID</th>
    <th width="85" scope="col">Marks</th>
    <th width="62" scope="col">Total</th>
    <th width="76" scope="col">Test</th>
  </tr>
  <% while (rs1.next()) { %>
  <tr>
    <th width="92" scope="col"><%=rs1.getString("userid")%></th>
    <th width="85" scope="col"><%=rs1.getString("marks")%></th>
    <th width="62" scope="col"><%=rs1.getString("total")%></th>
    <th width="76" scope="col"><%=rs1.getString("Test")%></th>
  </tr>
  
  
  <% } %>
</table>

<table width="343" border="1">
<caption>Java</caption>
  <tr>
    <th width="92" scope="col">UserID</th>
    <th width="85" scope="col">Marks</th>
    <th width="62" scope="col">Total</th>
    <th width="76" scope="col">Test</th>
  </tr>
  <% while (rs2.next()) { %>
  <tr>
    <th width="92" scope="col"><%=rs2.getString("userid")%></th>
    <th width="85" scope="col"><%=rs2.getString("marks")%></th>
    <th width="62" scope="col"><%=rs2.getString("total")%></th>
    <th width="76" scope="col"><%=rs2.getString("Test")%></th>
  </tr>
  
  
  <% } %>
</table>

<table width="343" border="1">
<caption>PHP</caption>
  <tr>
    <th width="92" scope="col">UserID</th>
    <th width="85" scope="col">Marks</th>
    <th width="62" scope="col">Total</th>
    <th width="76" scope="col">Test</th>
  </tr>
  <% while (rs3.next()) { %>
  <tr>
    <th width="92" scope="col"><%=rs3.getString("userid")%></th>
    <th width="85" scope="col"><%=rs3.getString("marks")%></th>
    <th width="62" scope="col"><%=rs3.getString("total")%></th>
    <th width="76" scope="col"><%=rs3.getString("Test")%></th>
  </tr>
  
  
  <% } %>
</table>

<table width="343" border="1">
<caption>JSP</caption>
  <tr>
    <th width="92" scope="col">UserID</th>
    <th width="85" scope="col">Marks</th>
    <th width="62" scope="col">Total</th>
    <th width="76" scope="col">Test</th>
  </tr>
  <% while (rs4.next()) { %>
  <tr>
    <th width="92" scope="col"><%=rs4.getString("userid")%></th>
    <th width="85" scope="col"><%=rs4.getString("marks")%></th>
    <th width="62" scope="col"><%=rs4.getString("total")%></th>
    <th width="76" scope="col"><%=rs4.getString("Test")%></th>
  </tr>
  
  
  <% } %>
</table>
</body>
<% ps1.close();
ps2.close();
ps3.close();
ps4.close();%>
</html>
