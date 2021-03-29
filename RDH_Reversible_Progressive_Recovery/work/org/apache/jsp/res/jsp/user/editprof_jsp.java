package org.apache.jsp.res.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.user.util.*;
import java.sql.*;

public final class editprof_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");

	String user=Utility.parse1(request.getAttribute("user"));
	ResultSet rs=(ResultSet)request.getAttribute("rs");
	int no=Utility.parse(request.getParameter("no"));
	int id=0;
	String userid="",name="",gender="",add="",email="",phone="",city="";
	if(no==0)
	while(rs.next())
	{
		id=rs.getInt(1);
		userid=rs.getString(2);
		name=rs.getString(4);
		gender=rs.getString(5);
		add=rs.getString(6);
		city=rs.getString(7);
		email=rs.getString(8);
		phone=rs.getString(9);
	}

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RDH Progressive Recovery</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  \r\n");
      out.write("    .button_example{\r\n");
      out.write("border-top-color: #819BCB;border-right-color: #819BCB;border-bottom-color: #bae361;border-left-color: #819BCB;border-width: 0px 0px 6px 0px;border-style: solid; -webkit-border-radius: 0px; -moz-border-radius: 0px;border-radius: 0px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;\r\n");
      out.write(" background-color: #CEDCE7; background-image: -webkit-gradient(linear, left top, left bottom, from(#CEDCE7), to(#596a72));\r\n");
      out.write(" background-image: -webkit-linear-gradient(top, #CEDCE7, #596a72);\r\n");
      out.write(" background-image: -moz-linear-gradient(top, #CEDCE7, #596a72);\r\n");
      out.write(" background-image: -ms-linear-gradient(top, #CEDCE7, #596a72);\r\n");
      out.write(" background-image: -o-linear-gradient(top, #CEDCE7, #596a72);\r\n");
      out.write(" background-image: linear-gradient(to bottom, #CEDCE7, #596a72);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#CEDCE7, endColorstr=#596a72);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button_example:hover{\r\n");
      out.write(" border-top-color: #819BCB;border-right-color: #819BCB;border-bottom-color: #F53D68;border-left-color: #819BCB;border-width: 0px 0px 6px 0px;border-style: solid;\r\n");
      out.write(" background-color: #acc4d6; background-image: -webkit-gradient(linear, left top, left bottom, from(#acc4d6), to(#434f55));\r\n");
      out.write(" background-image: -webkit-linear-gradient(top, #acc4d6, #434f55);\r\n");
      out.write(" background-image: -moz-linear-gradient(top, #acc4d6, #434f55);\r\n");
      out.write(" background-image: -ms-linear-gradient(top, #acc4d6, #434f55);\r\n");
      out.write(" background-image: -o-linear-gradient(top, #acc4d6, #434f55);\r\n");
      out.write(" background-image: linear-gradient(to bottom, #acc4d6, #434f55);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#acc4d6, endColorstr=#434f55);\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  .tb6 {\r\n");
      out.write("\tborder: 3px double #CCCCCC;\r\n");
      out.write("\twidth: 230px;\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </style>\r\n");
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
      out.write("          <li ><a href=\"");
      out.print(request.getContextPath() );
      out.write("/HomeUser?name=");
      out.print(user );
      out.write("\">Home</a></li> \r\n");
      out.write("          <li><a href=\"");
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
      out.write("          <li class=\"selected\"><a class=\"gradientlinks\" href=\"");
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
      out.write("\r\n");
      out.write("      <div id=\"content\" style=\"position:absolute;left:400\">\r\n");
      out.write("        <!-- insert the page content here -->\r\n");
      out.write("        <h1>Edit Profile</h1>\r\n");
      out.write("        ");

			if(no==1)
			{
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"error\" id=\"message\">\t\r\n");
      out.write("\t\t\t\t\t\t<p>Opp's,Seems something went wrong ..!</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

			}
			if(no==0)
			{
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<form id=\"login\" action=\"");
      out.print(request.getContextPath() );
      out.write("/EditProfile2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"user\" value=\"");
      out.print(user );
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"no\" value=\"2\"></input>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Save Updates\" class=\"button_example\"/>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a class=\"button_example\" href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePass2?name=");
      out.print(user );
      out.write("&no=1&id=");
      out.print(id );
      out.write("\" target=\"afrm\">Change Password</a>\r\n");
      out.write("\t\t\t\t\t</div><br></br>\r\n");
      out.write("\t\t\t\t\t<div id=\"a1\">\r\n");
      out.write("\t\t\t\t\t\t<p>Your ID No : ");
      out.print(id );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your Name : <input class=\"tb6\" type=\"text\" name=\"name\" value=\"");
      out.print(name );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your User ID : ");
      out.print(userid );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your Gedner : <input class=\"tb6\" type=\"text\" name=\"gender\" value=\"");
      out.print(gender );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your Mail ID : <input class=\"tb6\" type=\"text\" name=\"email\" value=\"");
      out.print(email );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your Cell N0 : <input class=\"tb6\" type=\"text\" name=\"phone\" value=\"");
      out.print(phone );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your Address : <input class=\"tb6\" type=\"text\" name=\"add\" value=\"");
      out.print(add );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t\t<p>Your City : <input class=\"tb6\" type=\"text\" name=\"city\" value=\"");
      out.print(city );
      out.write("\"></input></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");

			}
		
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
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
