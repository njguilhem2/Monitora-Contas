/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.v20161208
 * Generated at: 2019-05-01 18:57:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.contas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adiciona_002dcontas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/contas/../rodapeContas.tag", Long.valueOf(1556734417348L));
    _jspx_dependants.put("jar:file:/C:/Users/Nilton/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425989470000L));
    _jspx_dependants.put("/WEB-INF/views/contas/../cabecalhoContas.tag", Long.valueOf(1556735792488L));
    _jspx_dependants.put("file:/C:/Users/Nilton/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar", Long.valueOf(1556059012237L));
    _jspx_dependants.put("jar:file:/C:/Users/Nilton/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1482324802000L));
    _jspx_dependants.put("file:/C:/Users/Nilton/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1547653073465L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/assets/css/basico.css\">\r\n");
      out.write("\t\t<title>Contas</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"container\">\r\n");
      out.write("        <header>\r\n");
      out.write("                <nav class=\"navbar navbar-default\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#collapse-navbar\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("        \r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"home.html\">Contas</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("        \r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"collapse-navbar\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li><a href=\"/\">Adiciona</a></li>\r\n");
      out.write("                                <li><a href=\"lista\">Lista</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Logout</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                         \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("        \r\n");
      out.write("        </header>");
      out.write("\t\r\n");
      out.write("\t <div class=\"panel panel-info\">\r\n");
      out.write("\t\t          <div class=\"panel-heading\">\r\n");
      out.write("\t\t           \t\t<h1>Cadastre Sua Conta</h1>\r\n");
      out.write("\t\t          </div>\r\n");
      out.write("          <div class=\"panel-body\">\r\n");
      out.write("\t\t<form action=\"contas/cadastraConta\" method = \"post\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"nomeDaConta\">Nome da Conta</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nomeDaConta\" name=\"nome\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"vencimento\">Vencimento</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"vecimento\" name=\"vencimento\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"valor\">Valor</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"valor\" name=\"valor\" />\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"pago\">Pago: </label>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"pago\" class=\"form\" name=\"pago\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t <div class=\"form-group\">\r\n");
      out.write("\t\t\t \t\t\t\t <button type=\"reset\" class=\"btn btn-danger\">Limpar</button> \r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-info\">Cadastrar</button>                                              \r\n");
      out.write("                                                                        \r\n");
      out.write("             </div>    \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t           </div> \r\n");
      out.write("\r\n");
      out.write(" <footer class=\"pFooter\">\r\n");
      out.write("                <nav class=\"navbar navbar-inverse navbar-bottom\">\r\n");
      out.write("                    <address>\r\n");
      out.write("                       Endereço: Rua xxxx, São Bernardo <br/>\r\n");
      out.write("                       Estado:São Paulo<br/>\r\n");
      out.write("                       Tel: (11) xxxx - xxxx<br/>\r\n");
      out.write("                       Email: monitoracontas@gmail.com\r\n");
      out.write("                    </address>\r\n");
      out.write("                    <p> &copy; 2019 Todas as Contas reservadas</p>\r\n");
      out.write("                </nav>\r\n");
      out.write("   \t </footer>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"/assets/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"/assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"/assets/js/navbar-animation-fix.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t</html>");
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