<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Quiz Selection</title>
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
<jsp:include page="header.html"/>
<h1 align="center"><strong>Select Subject</strong></h1>
<p align="center">&nbsp;</p>
<form id="form2" name="form2" method="post" action="quiz_selection">
  <p>
    <label>
      <input type="radio" name="selected_quiz" value="Java" id="Java" />
      Java</label>
    <br />
    <label>
      <input type="radio" name="selected_quiz" value="JSP" id="JSP" />
      JSP</label>
    <br />
    <label>
      <input type="radio" name="selected_quiz" value="PHP" id="PHP" />
      PHP</label>
    <br />
    <label>
      <input type="radio" name="selected_quiz" value="Computer" id="Computer" />
      Computer</label>
  </p>
  <p>
    <input type="submit" name="submit" id="submit" value="Submit" />
    <br />
  </p>
</form>
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="Login">
  <div align="center">  </div>
</form>
</body>
</html>
