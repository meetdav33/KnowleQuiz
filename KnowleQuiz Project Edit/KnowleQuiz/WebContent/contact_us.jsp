<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
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
</head>
<body>
<p>
  <jsp:include page="header.html"/>
</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<form name="form1" method="post" action="SendEmail">
  <label for="message">Message</label>
  <textarea name="message" id="message" name="message"  required="required" cols="45" rows="5"></textarea>
<p> &nbsp;</p>
  <input type="submit" name="Send" id="Send" value="Submit">
</form>
<p>&nbsp;</p>

</body>
</html>
