/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-24 12:14:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.TemplateHtml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import Model.Entities.Student;

public final class dashboardStudents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Student dashboard</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/TemplateHtml/assets/css/main.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("    <a class=\"logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.html\">Leaf+</a>\r\n");
      out.write("    <a class=\"logo\" href=\"ClientProfile.html\">My profile</a>\r\n");
      out.write("</header>\r\n");
      out.write("<section class=\"wrapper\">\r\n");
      out.write("    <div class=\"inner\">\r\n");
      out.write("        <header class=\"special\">\r\n");
      out.write("            <h2>Students</h2>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"highlights\">\r\n");
      out.write("            ");

                int i = 1;
                List<Student> projects = (List) request.getAttribute("students");
                Iterator it = projects.iterator();
                while(it.hasNext()){
                    Student student = (Student) it.next();
                    String str =
                            "            <section>\n" +
                                    "                <div class=\"content\">\n" +
                                    "                    <header>\n" +
                                    "                        <a href=\"#\" class=\"icon fa-vcard-o\"><span class=\"label\">Icon</span></a>";
                    str += "<h3>"+ student.getFname() + " " + student.getLname() + "</h3>";
                    str += "</header>\n" + "<p>";
                    str += "Studies: " + student.getStudies();
                    str += "<br>Email: " + student.getEmail();
                    str += "<br>Rating: " + student.getRating() + " / 5";
                    str +=  "                 </p>\n" +
                            "                </div>\n" +
                            "            </section>";
                    if(i == 3) {
                        //TODO: get a PhD in this
                        i = 1;
                    }
                    out.println(str);
                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
