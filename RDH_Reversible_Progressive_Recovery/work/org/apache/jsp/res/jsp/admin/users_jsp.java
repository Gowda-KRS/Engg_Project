package org.apache.jsp.res.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.user.util.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RDH Progressive Recovery</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  table {\r\n");
      out.write("\r\n");
      out.write("\t\tfont-family: \"Lato\",\"sans-serif\";  \r\n");
      out.write("\t\t }       /* added custom font-family  */\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\ttable.one {                                 \r\n");
      out.write("\r\n");
      out.write("margin-bottom: 3em;\r\n");
      out.write("\r\n");
      out.write("border-collapse:collapse;   }  \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("td {                            /* removed the border from the table data rows  */\r\n");
      out.write("\r\n");
      out.write("text-align: center;    \r\n");
      out.write("\r\n");
      out.write("width: 10em;                   \r\n");
      out.write("\r\n");
      out.write("padding: 1em;       }      \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("th {                              /* removed the border from the table heading row  */\r\n");
      out.write("\r\n");
      out.write("text-align: center;                \r\n");
      out.write("\r\n");
      out.write("padding: 1em;\r\n");
      out.write("\r\n");
      out.write("background-color: #e8503a;       /* added a red background color to the heading cells  */\r\n");
      out.write("\r\n");
      out.write("color: white;       }                 /* added a white font color to the heading text */\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("tr {   \r\n");
      out.write("\r\n");
      out.write("height: 1em;    }\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("table tr:nth-child(even) {            /* added all even rows a #eee color  */\r\n");
      out.write("\r\n");
      out.write("    background-color: #eee;     }\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("table tr:nth-child(odd) {            /* added all odd rows a #fff color  */\r\n");
      out.write("\r\n");
      out.write("background-color:#fff;      }\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("  \r\n");
      out.write(".button_example{\r\n");
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
      out.write(".tb6 {\r\n");
      out.write("\tborder: 3px double #CCCCCC;\r\n");
      out.write("\twidth: 230px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");

	HttpSession ss=null;
ss=request.getSession();
String admin=ss.getAttribute("admin").toString();

ResultSet rs=(ResultSet)Utility.parse2(request.getAttribute("rs"));

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"main\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <div id=\"logo\">\r\n");
      out.write("        <div id=\"logo_text\">\r\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("          <h1>Reversible Data Hiding<span class=\"logo_colour\"> in Encrypted Images Based on</span></a></h1>\r\n");
      out.write("          <h2>Progressive Recovery</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"menubar\">\r\n");
      out.write("        <ul id=\"menu\">\r\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Home?name=");
      out.print(admin );
      out.write("\">Home</a></li>\r\n");
      out.write("          <li ><a href=\"");
      out.print(request.getContextPath() );
      out.write("/AdminProfile?name=");
      out.print(admin );
      out.write("\">Show Profile</a></li>\r\n");
      out.write("          <li class=\"selected\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/UserList?submit=get\">User List</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/\">Sign Out</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content_header\"></div>\r\n");
      out.write("    <div id=\"site_content\">\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <!-- insert the page content here -->\r\n");
      out.write("        <h1>User List</h1>\r\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath() );
      out.write("/UserList\">\r\n");
      out.write("<div align=\"right\">\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"submit\" name=\"submit\" value=\"Edit\" class=\"button_example\"/>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<input type=\"submit\" name=\"submit\" value=\"Delete\" class=\"button_example\"/>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("\t<table id=\"results\" class=\"tab\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Select</th>\r\n");
      out.write("\t\t<th>ID</th>\r\n");
      out.write("\t\t<th>Name</th>\r\n");
      out.write("\t\t<th>Gender</th>\r\n");
      out.write("\t\t<th>Add</th>\r\n");
      out.write("\t\t<th>City</th>\r\n");
      out.write("\t\t<th>E-Mail</th>\r\n");
      out.write("\t\t<th>Contact No</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

	if(rs!=null)
		while(rs.next())
		{
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input name=\"chk\" type=\"checkbox\" value=\"");
      out.print(rs.getInt(1) );
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(6) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(7) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(8) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(rs.getString(9) );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t");
}
	
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"pageNavPosition\" style=\"cursor:hand\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('results',3); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(2);\r\n");
      out.write("    //--></script>\r\n");

	if(Utility.parse(request.getParameter("no"))==1)
    {
      out.write("\r\n");
      out.write("    \t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("    \t\t<p>User Added Successfully.....!</p>\r\n");
      out.write("    \t</div>\t\t\t\r\n");
      out.write("    ");
}
	if(Utility.parse(request.getParameter("no"))==-1)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's something went wrong.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==2)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's select atleast one.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==3)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>User Deleted Successfully.....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==4)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>Opp's Select only one user to edit....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}
	if(Utility.parse(request.getParameter("no"))==5)
	{
      out.write("\r\n");
      out.write("\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;top:10px;left:300px\">\t\r\n");
      out.write("\t\t\t<p>User Updated Successfully....!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t");
}

      out.write("\t\t\r\n");
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
