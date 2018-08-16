<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>About</title>
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
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>Project Created By </p>
<table width="200" border="1">
  <tr>
    <td><img src="file:///E|/KnowleQuiz Project/images/bhairvi.jpg" width="200" height="200"/></td>
    <td><img src="file:///E|/KnowleQuiz Project/images/meet.jpg" width="200" height="200"/></td>
    <td><img src="file:///E|/KnowleQuiz Project/images/aman.jpg" width="200" height="200"/></td>
  </tr>
  <tr>
    <td>Bhairvi Thaker</td>
    <td>Meetbhai Dave</td>
    <td>Amandeep Kaur</td>
  </tr>
  <tr>
    <td>C0719969</td>
    <td>C0720514</td>
    <td>C0710653</td>
  </tr>
</table>

<p>All Rights Reserved ©</p>
</body>

</html>
