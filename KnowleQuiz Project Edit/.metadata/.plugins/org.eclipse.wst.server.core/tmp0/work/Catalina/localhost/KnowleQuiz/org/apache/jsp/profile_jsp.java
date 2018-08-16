/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.28
 * Generated at: 2018-04-03 01:05:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Profile</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #0F0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
 
		if(session.getAttribute("session_username")==null)
		{
			response.sendRedirect("LogIn.jsp");
		}
		else
		{
		
		}

      out.write('\r');
      out.write('\n');
  

Connection connect;
ResultSet rs;
PreparedStatement ps;
connect=common.DB_Connection.ConnectDB();

String sql1 = "select * from user_info where userid=?";
ps = connect.prepareStatement(sql1);
ps.setString(1, session.getAttribute("session_username").toString());
rs = ps.executeQuery();



      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("<h1 align=\"center\">Profile</h1>\r\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"update_info\">\r\n");
      out.write("<p align=\"center\">First Name: \r\n");
      out.write("  <label for=\"firstname\"></label>\r\n");
      out.write("  <input type=\"text\" name=\"firstname\" id=\"firstname\" value='");
      out.print(rs.getString("firstname"));
      out.write("' required=\"required\" />\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">Last Name: \r\n");
      out.write("  <label for=\"lastname\"></label>\r\n");
      out.write("  <input type=\"text\" name=\"lastname\" id=\"lastname\"  value='");
      out.print(rs.getString("lastname"));
      out.write("' required=\"required\"/>\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">User ID :\r\n");
      out.write("  <label for=\"userid\"></label>\r\n");
      out.write("  <input type=\"text\" name=\"userid\" id=\"userid\" required=\"required\"  value='");
      out.print(rs.getString("userid"));
      out.write("' readonly=\"readonly\"/>\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">Password: \r\n");
      out.write("  <label for=\"password\"></label>\r\n");
      out.write("  <input type=\"password\" name=\"password\" id=\"password\"  value='");
      out.print(rs.getString("password"));
      out.write("' required=\"required\"/>\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">Address: \r\n");
      out.write("  <label for=\"address\"></label>\r\n");
      out.write("  <input type=\"text\" name=\"address\" id=\"address\"  value='");
      out.print(rs.getString("address"));
      out.write("' required=\"required\"/>\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">Contact: \r\n");
      out.write("  <label for=\"contact\"></label>\r\n");
      out.write("  <input type=\"text\" name=\"contact\" id=\"contact\"  value='");
      out.print(rs.getString("contact"));
      out.write("' required=\"required\"/>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <input type=\"submit\" name=\"Register\" id=\"Register\" value=\"Submit\" />\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
 ps.close(); 
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
