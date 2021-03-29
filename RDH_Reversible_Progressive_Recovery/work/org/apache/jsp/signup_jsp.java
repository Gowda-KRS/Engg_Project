package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RDH Progressive Recovery</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/style.css\" media=\"screen\" data-name=\"skins\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/layout/wide.css\" data-name=\"layout\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/fractionslider.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/style-fraction.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/animate.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/design/css/switcher.css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("<center><img src=\"");
      out.print(request.getContextPath() );
      out.write("/Resources/Images/title.png\"></img> </center> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("        <div class=\"row centered-form\">\r\n");
      out.write("        <div class=\"col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4\">\r\n");
      out.write("        \t<div class=\"panel panel-default\">\r\n");
      out.write("        \t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t    \t\t<h3 class=\"panel-title\">User Registration <small></small></h3>\r\n");
      out.write("\t\t\t \t\t\t</div>\r\n");
      out.write("\t\t\t \t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t    \t\t<form method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserRegister\">\r\n");
      out.write("\t\t\t    \t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t                <input type=\"text\" name=\"id\" id=\"first_name\" class=\"form-control input-sm\" placeholder=\"User-id\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"text\" name=\"name\" id=\"last_name\" class=\"form-control input-sm\" placeholder=\"User name\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    \t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" class=\"form-control input-sm\" placeholder=\"Email Address\" required>\r\n");
      out.write("\t\t\t    \t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t    \t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t&nbsp;&nbsp;&nbsp;Male<input name=\"gender\" value=\"Male\" type=\"radio\" checked=\"true\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;Female<input name=\"gender\" value=\"Female\" type=\"radio\"/>\r\n");
      out.write("\t\t\t    \t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    \t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"password\" name=\"pass\" id=\"password\" class=\"form-control input-sm\" placeholder=\"Password\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"text\" name=\"add\" id=\"password_confirmation\" class=\"form-control input-sm\" placeholder=\"Address\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t    \t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"text\" name=\"cno\" id=\"password\" class=\"form-control input-sm\" placeholder=\"Contact Number\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"text\" name=\"city\" id=\"password_confirmation\" class=\"form-control input-sm\" placeholder=\"city\" required>\r\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t</div>\r\n");
      out.write("\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t    \t\t\t<input type=\"submit\" value=\"Register\" class=\"btn btn-info btn-block\">\r\n");
      out.write("\t\t\t    \t\t\r\n");
      out.write("\t\t\t    \t\t</form>\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t    \t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
