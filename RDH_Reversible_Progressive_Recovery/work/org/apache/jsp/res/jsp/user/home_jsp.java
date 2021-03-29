package org.apache.jsp.res.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");

	String user=request.getAttribute("user").toString();

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RDH Progressive Recovery</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"main\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <div id=\"logo\">\r\n");
      out.write("        <div id=\"logo_text\">\r\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("          <h1>Reversible Data Hiding<span class=\"logo_colour\"> in Encrypted Images Based on</span></a></h1>\r\n");
      out.write("          <h2>Progressive Recovery</h2>\r\n");
      out.write("          <h5 style=\"position: absolute;top:14px;\">Welcome user [");
      out.print(user );
      out.write("]</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"menubar\">\r\n");
      out.write("        <ul id=\"menu\">\r\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\r\n");
      out.write("         <li class=\"selected\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/HomeUser?name=");
      out.print(user );
      out.write("\">Home</a></li> \r\n");
      out.write("          <li ><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Encryption?name=");
      out.print(user );
      out.write("\">Encryption</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/DecryptionImage?name=");
      out.print(user );
      out.write("\">Decryption</a></li>\r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("          <li><a class=\"gradientlinks\" href=\"");
      out.print(request.getContextPath() );
      out.write("/UserProfile?name=");
      out.print(user );
      out.write("\">Show Profile</a></li>\r\n");
      out.write("           <li><a class=\"gradientlinks\" href=\"");
      out.print(request.getContextPath() );
      out.write("/\">Sign Out</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content_header\"></div>\r\n");
      out.write("    <div id=\"site_content\">\r\n");
      out.write("      <div id=\"banner\"></div>\r\n");
      out.write("\t  \r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <!-- insert the page content here -->\r\n");
      out.write("        <h1>Welcome</h1>\r\n");
      out.write("        <p>The Main aim of this project to hide and retrieve back the data in the encrypted images, reversible data hiding in encrypted images (RDH-EI) based on progressive recovery......</p>\r\n");
      out.write("        <p>Idea of reversible data hiding in encrypted images<strong>(RDH-EI) </strong> originates from reversible data hiding (RDH) in plaintext images.</p>\r\n");
      out.write("        <p>It is feasible in the applications like cloud storage and medical systems.</p>\r\n");
      out.write("        <p>In cloud storage, a content owner can encrypt an image to preserve his/her privacy, and upload the encrypted data onto cloud.</p>\r\n");
      out.write("        <h2>Advantages</h2>\r\n");
      out.write("        \r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>Approximate image with good quality can be obtained by decryption if the receiver has decryption key.</li>\r\n");
      out.write("          <li>When both keys are available, the original image can be losslessly recovered by progressive recovery.</li>\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content_footer\"></div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
