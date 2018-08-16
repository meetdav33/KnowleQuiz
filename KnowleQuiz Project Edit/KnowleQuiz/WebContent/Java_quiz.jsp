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
<title>Java  Quiz</title>
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
ResultSet rs;
PreparedStatement ps;
connect=common.DB_Connection.ConnectDB();


String sql = "select * from Java";

ps = connect.prepareStatement(sql);

rs = ps.executeQuery();


	
%>
</head>

<body>
<p>Good Luck</p>
<p>&nbsp;</p>
<p>Question : </p>

<form id="form1" name="form1" method="post" action="result_java">
<label for="Java"></label>
  <input type="text" name="quiz_name" id="quiz_name" value="Java" hidden="hidden" />
<% while (rs.next()) { %>
  <p>
    <label for="question2"></label>
    <input name="question" type="text" id="question2" readonly="readonly" size="120" value='<%=rs.getString("Question")%>' />
  </p>
  <p>
    <label>
      <input type="radio" name='<%=rs.getString("Que_Num")%>' required="required" value='<%=rs.getString("Ans_1")%>' id="RadioGroup1_0" />
      A. <%=rs.getString("Ans_1")%></label>
    <br />
    <label>
      <input type="radio" name='<%=rs.getString("Que_Num")%>' required="required"  value='<%=rs.getString("Ans_2")%>' id="RadioGroup1_1" />
      B. <%=rs.getString("Ans_2")%></label>
    <br />
    <label>
      <input type="radio" name='<%=rs.getString("Que_Num")%>' required="required" value='<%=rs.getString("Ans_3")%>' id="RadioGroup1_2" />
      C. <%=rs.getString("Ans_3")%></label>
    <br />
    <label>
      <input type="radio" name='<%=rs.getString("Que_Num")%>' required="required" value='<%=rs.getString("Ans_4")%>' id="RadioGroup1_3" />
      D. <%=rs.getString("Ans_4")%></label>
      </p>
  <% } %>
  <p>
    <input type="submit" name="Submit" id="Submit" value="Submit" />
  </p>
</form>

</body>
<% ps.close();
   %>
</html>
