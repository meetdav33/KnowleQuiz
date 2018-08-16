<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Welcome</title>
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
%>
<body>
<jsp:include page="header.html"/>
  <p>&nbsp;</p> 
  <h1>Welcome to KnowleQuiz! <%=  session.getAttribute("session_username") %></h1>
  <p>	Here you can test your knowledge about different programming languages.</p>
  <p>To start just click on the Quiz link and select the programming language.</p>
  <p>You can check your highscore on Leaderboards page.</p>
  <p>So, get ready to compete and show your knowledge.</p>
  <p>Good luck</p>


</body>
</html>