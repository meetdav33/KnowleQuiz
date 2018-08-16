<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Messages</title>
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
</head>
<body>
<jsp:include page="header.html"/>
<p></p>
<p></p>
<p></p>
<p></p>

<a href="Send_Message.jsp">Send Message </a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="My_Messages.jsp">My Messages </a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="Sent_Messages.jsp">Sent Messages </a>
</body>

</html>
