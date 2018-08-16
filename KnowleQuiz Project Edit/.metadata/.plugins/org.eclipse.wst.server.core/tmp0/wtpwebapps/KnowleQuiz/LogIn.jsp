<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Log In</title>
<style type="text/css">
.hidden
{
display:none;
}
body {
	background-color: #0F0;
}
</style>
</head>
<% 
		if(session.getAttribute("session_username")!=null)
		{
			response.sendRedirect("Welcome.jsp");
		}
%>
<body>
<h1 align="center"><strong>Welcome to KnowleQuiz</strong></h1>
<p align="center"><strong>Please Log in Or Register to Continue</strong></p>
<p align="center">&nbsp;</p>
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="Login">
  <label for="username"></label>
  <div align="center">
    <p><strong>User name:</strong>
      <input type="text" name="username" id="username" required="required" />
    </p>
    <p><strong>Password : 
      <label for="password"></label>
      <input type="password" name="password" id="password" required="required" />
    </strong></p>
    <p>&nbsp;</p>
   
    
    <p> 
      <input type="submit" name="submit" id="submit" value="Log In" />
      <a href="Registration.jsp">New User ?</a>
    </p>
  </div>
</form>
</body>
</html>
