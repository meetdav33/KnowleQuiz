/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.28
 * Generated at: 2018-04-17 17:09:22 UTC
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
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

public final class leader_005fboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("javax.servlet.http.HttpSession");
    _jspx_imports_classes.add("java.sql.SQLException");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Leader Board</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".hidden\r\n");
      out.write("{\r\n");
      out.write("display:none;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #0F0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
 
		if(session.getAttribute("session_username")==null)
		{
			response.sendRedirect("LogIn.jsp");
		}

      out.write("\r\n");
      out.write("\r\n");
  

Connection connect;
ResultSet rs1;
ResultSet rs2;
ResultSet rs3;
ResultSet rs4;
PreparedStatement ps1;
PreparedStatement ps2;
PreparedStatement ps3;
PreparedStatement ps4
;
connect=common.DB_Connection.ConnectDB();


String sql1 = "select * from result WHERE Test='Computer' ORDER BY marks DESC";
String sql2 = "select * from result WHERE Test='Java' ORDER BY marks DESC";
String sql3 = "select * from result WHERE Test='PHP' ORDER BY marks DESC";
String sql4 = "select * from result WHERE Test='JSP' ORDER BY marks DESC";

ps1 = connect.prepareStatement(sql1);
ps2 = connect.prepareStatement(sql2);
ps3 = connect.prepareStatement(sql3);
ps4 = connect.prepareStatement(sql4);

rs1 = ps1.executeQuery();
rs2 = ps2.executeQuery();
rs3 = ps3.executeQuery();
rs4 = ps4.executeQuery();


	

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\r\n");
      out.write("<table width=\"343\" border=\"1\">\r\n");
      out.write("<caption>Computer</caption>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">UserID</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">Marks</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">Total</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">Test</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 while (rs1.next()) { 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">");
      out.print(rs1.getString("userid"));
      out.write("</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">");
      out.print(rs1.getString("marks"));
      out.write("</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">");
      out.print(rs1.getString("total"));
      out.write("</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">");
      out.print(rs1.getString("Test"));
      out.write("</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"343\" border=\"1\">\r\n");
      out.write("<caption>Java</caption>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">UserID</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">Marks</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">Total</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">Test</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 while (rs2.next()) { 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">");
      out.print(rs2.getString("userid"));
      out.write("</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">");
      out.print(rs2.getString("marks"));
      out.write("</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">");
      out.print(rs2.getString("total"));
      out.write("</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">");
      out.print(rs2.getString("Test"));
      out.write("</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"343\" border=\"1\">\r\n");
      out.write("<caption>PHP</caption>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">UserID</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">Marks</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">Total</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">Test</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 while (rs3.next()) { 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">");
      out.print(rs3.getString("userid"));
      out.write("</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">");
      out.print(rs3.getString("marks"));
      out.write("</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">");
      out.print(rs3.getString("total"));
      out.write("</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">");
      out.print(rs3.getString("Test"));
      out.write("</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"343\" border=\"1\">\r\n");
      out.write("<caption>JSP</caption>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">UserID</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">Marks</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">Total</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">Test</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 while (rs4.next()) { 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"92\" scope=\"col\">");
      out.print(rs4.getString("userid"));
      out.write("</th>\r\n");
      out.write("    <th width=\"85\" scope=\"col\">");
      out.print(rs4.getString("marks"));
      out.write("</th>\r\n");
      out.write("    <th width=\"62\" scope=\"col\">");
      out.print(rs4.getString("total"));
      out.write("</th>\r\n");
      out.write("    <th width=\"76\" scope=\"col\">");
      out.print(rs4.getString("Test"));
      out.write("</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
 ps1.close();
ps2.close();
ps3.close();
ps4.close();
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
