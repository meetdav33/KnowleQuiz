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
<p>	Bhairvi Thaker C0719969</p>
<p>	Amandeep Kaur C0710653</p>
<p>Meetbhai Dave C0720514</p>
<p>All Rights Reserved ©</p>
</body>

</html>
