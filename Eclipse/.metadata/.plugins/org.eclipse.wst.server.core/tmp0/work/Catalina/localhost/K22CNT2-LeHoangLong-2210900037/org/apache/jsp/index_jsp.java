/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.97
 * Generated at: 2025-02-28 08:19:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/WebLogin/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/K22CNT2-LeHoangLong-2210900037/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1740620032469L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.1.1.RELEASE.jar", Long.valueOf(1740620030542L));
    _jspx_dependants.put("jar:file:/D:/WebLogin/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/K22CNT2-LeHoangLong-2210900037/WEB-INF/lib/spring-webmvc-5.1.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1539560830000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Project 3</title>\r\n");
      out.write("<style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: #f9f9f9;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("        .header {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .header h1 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("        }\r\n");
      out.write("        .content {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .content p {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("        a {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            background-color: #28a745;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover {\r\n");
      out.write("            background-color: #218838;\r\n");
      out.write("        }\r\n");
      out.write("        .footer {\r\n");
      out.write("            background-color: #f1f1f1;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px 0;\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <h1>Xin Chao Nguoi Anh Em</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        ");
 
            // Xá»­ lÃ½ mÃ£ Java
            String message = "Hello, Bro!";
            out.print("<p>" + message + "</p>");
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <a href=\"viewsanpham\">Den Trang San Pham</a>\r\n");
      out.write("        <a href=\"viewkhachhang\">Den Trang khach hang</a>\r\n");
      out.write("        <a href=\"viewsanpham\">Den Trang San Pham</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <p>&copy; 2210900037 Le Hoang Long</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
