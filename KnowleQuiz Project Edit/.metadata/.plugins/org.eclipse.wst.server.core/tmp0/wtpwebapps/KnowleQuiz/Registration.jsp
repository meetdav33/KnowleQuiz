<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registration</title>
<style type="text/css">
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
<h1 align="center">Registration</h1>
<form id="form1" name="form1" method="post" action="Registration">
<p align="center">First Name: 
  <label for="firstname"></label>
  <input type="text" name="firstname" id="firstname" required="required" />
</p>
<p align="center">Last Name: 
  <label for="lastname"></label>
  <input type="text" name="lastname" id="lastname" required="required"/>
</p>
<p align="center">User ID :
  <label for="userid"></label>
  <input type="text" name="userid" id="userid" required="required"/>
</p>
<p align="center">Password: 
  <label for="password"></label>
  <input type="password" name="password" id="password" required="required"/>
</p>
<p align="center">Address: 
  <label for="address"></label>
  <input type="text" name="address" id="address" required="required"/>
</p>
<p align="center">Contact: 
  <label for="contact"></label>
  <input type="text" name="contact" id="contact" required="required"/>
</p>

  <div align="center">
    <input type="submit" name="Register" id="Register" value="Submit" />
     <a href="LogIn.jsp">Existing user?</a>
  </div>
</form>
<p>&nbsp;</p>
</body>

</html>
