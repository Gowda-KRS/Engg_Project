package org.apache.jsp.res.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.user.util.Utility;

public final class browse_005fenc_005fimage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RDH Progressive Recovery</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\tfunction showImg()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar image = document.getElementById(\"img\");\r\n");
      out.write("\t\tvar dropd = document.getElementById(\"dd\");\r\n");
      out.write("\t\timg.src = dropd.value;\t\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction radio_check(type)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(type==\"dec_key\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"dec_key\").style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"ext_key\").style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(type==\"ext_key\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"ext_key\").style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"dec_key\").style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(type==\"both\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"ext_key1\").style.display = \"block\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"ext_key\").style.display = \"none\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"dec_key\").style.display = \"block\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
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
      out.write(".tb6 {\r\n");
      out.write("\tborder: 3px double #CCCCCC;\r\n");
      out.write("\twidth: 230px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
	int no1=Utility.parse(request.getParameter("no1"));
	String fileExtension = (String) session.getAttribute("file_ext");

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
      out.write("           <li ><a href=\"");
      out.print(request.getContextPath() );
      out.write("/HomeUser?name=");
      out.print(user );
      out.write("\">Home</a></li> \r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Encryption?name=");
      out.print(user );
      out.write("\">Encryption</a></li>\r\n");
      out.write("          <li class=\"selected\"><a href=\"");
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
      out.write("      <div id=\"sidebar_container\">\r\n");
      out.write("        \r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("      <h1>Decryption Process</h1>\r\n");
      out.write("        <!-- insert the page content here -->\r\n");
      out.write("        ");

	if(no == 0)
	{
		

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form id=\"login\" action=\"");
      out.print(request.getContextPath() );
      out.write("/DecryptImage\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"tab\" style=\"position:absolute;top:300px;left:500px;width:450px;height: 220px\">\r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t     <table id=\"login\">\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t\t<td colspan=\"3\" align=\"center\">Browse Image File For Decryption</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t\t<td colspan=\"3\" align=\"center\"><hr></td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t<td>Decryption Image</td>\r\n");
      out.write("\t\t\t     \t\t<td>:</td>\r\n");
      out.write("\t\t\t     \t\t<td>\r\n");
      out.write("\t\t\t     \t\t\t<input class=\"tb6\" type=\"file\" name=\"file\" style=\"width:250px\" required=\"yes\"></input>\r\n");
      out.write("\t\t\t     \t\t</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t\r\n");
      out.write("\t\t\t     \t<tr>\r\n");
      out.write("\t\t\t     \t\t\t\r\n");
      out.write("\t\t\t     \t\t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t     \t\t\t\t<input type=\"radio\" name=\"type\" onClick=\"radio_check(value);\" value=\"dec_key\" required=\"yes\">Decrypt Image</input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"type\" onClick=\"radio_check(value);\" value=\"ext_key\" required=\"yes\">Extract Data</input>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <input type=\"radio\" name=\"type\" onClick=\"radio_check(value);\" value=\"both\" required=\"yes\">Both Decrypt And Extract Data</input> -->\r\n");
      out.write("\t\t\t     \t\t\t</td>\r\n");
      out.write("\t\t\t     \t</tr>\r\n");
      out.write("\t\t\t     \t\r\n");
      out.write("\t\t\t\t\t<div id=\"dec_key\" style=\"display:none;position: absolute;top: 170px;left: 80px;width: 450px;\">\r\n");
      out.write("\t\t\t     \t\tDecryption Key : <input class=\"tb6\" type=\"text\" name=\"decryption_key\" style=\"width:250px\";></input>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"ext_key\" style=\"display:none;position: absolute;top: 170px;left: 55px;width: 450px;\">\r\n");
      out.write("\t\t\t     \t\tData Extraction Key : <input class=\"tb6\" type=\"text\" name=\"extraction_key1\" style=\"width:250px\";></input>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <div id=\"ext_key1\" style=\"display:none;position: absolute;top: 215px;left: 55px;width: 450px;\">\r\n");
      out.write("\t\t\t     \t\tData Extraction Key : <input class=\"field\" type=\"text\" name=\"extraction_key2\" style=\"width:250px\";></input>\r\n");
      out.write("\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t     </table>\r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t\t<input class=\"button_example\" type=\"submit\" value=\"Decrypt Image\" style=\"position:absolute;top:-45px;left:425px;\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("</form>\r\n");

if(no1 == 1)
{

      out.write("\r\n");
      out.write("<div class=\"error\" id=\"message\" style=\"position:absolute;top:300px;left:500px;width:450px;height: 220px;font-weight:bold;color:green\">\t\r\n");
      out.write("\t\t\t<p>Opp's,Something Went Wrong Try Again !!!! </p>\r\n");
      out.write("</div>\t\r\n");
      out.write("\r\n");

} 

      out.write('\r');
      out.write('\n');

if(no1 == 2)
{

      out.write("\r\n");
      out.write("<div class=\"error\" id=\"message\" style=\"position:absolute;top:500px;left:500px;width:450px;height: 220px;font-weight:bold;color:green\">\t\r\n");
      out.write("\t\t\t<p>Opp's,key is Mismatched </p>\r\n");
      out.write("</div>\t\r\n");
      out.write("\r\n");

} 

      out.write("\r\n");
      out.write("\r\n");

	}
	else if(no == 1)
	{
		

      out.write("\r\n");
      out.write("<div class=\"tab\" style=\"position:absolute;top:300px;left:500px;width:450px;height: 220px\">\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"");
      out.print(request.getContextPath());
      out.write("/HideData\">\r\n");
      out.write("    <input class=\"button_example\" type=\"submit\" name=\"action\" value=\"Cancel\" style=\"position:absolute;top:-45px;left:530px;\"/>\r\n");
      out.write("    <input class=\"button_example\" type=\"submit\" name=\"action\" value=\"Save\" style=\"position:absolute;top:-45px;left:600px;\"/>\r\n");
      out.write("    \r\n");
      out.write("\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<font color=\"green\" size=\"5\">Image Decrepted Successfully.....</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Decryption/enc_img.");
      out.print(fileExtension);
      out.write("\" width=\"200px\" height=\"200px\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tEncrypted Image\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"11px\"></td>\r\n");
      out.write("\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/Decryption/dec_img.");
      out.print(fileExtension);
      out.write("\" width=\"200px\" height=\"200px\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tDecrypted Image\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height=\"20px\">\r\n");
      out.write("\t\t</tr>\r\n");

if(no1 == 1)
{
	String extData = (String)session.getAttribute("ext_data");
	
	System.out.println("extData:"+extData);	
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t<font color=\"blue\" size=\"5\">Extracted Text Data </font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<font  size=\"5\">");
      out.print(extData );
      out.write("</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

}

      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("   </form>\r\n");
      out.write("</div>\r\n");

	}
	else if(no == 2)
	{
		String extData = (String)session.getAttribute("orgval");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"tab\" style=\"position:absolute;top:300px;left:500px;width:450px;height: 220px\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(request.getContextPath());
      out.write("/HideData\">\r\n");
      out.write("    <input class=\"button_example\" type=\"submit\" name=\"action\" value=\"Cancel\" style=\"position:absolute;top:-45px;left:600px;\"/>\r\n");
      out.write("</form>\r\n");
      out.write("<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t    <td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t     \t<font color=\"green\" size=\"5\">Data Extraction Informarion </font>\r\n");
      out.write("\t\t\t     </td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t\t\t     \t\r\n");
      out.write("     \t<tr>\r\n");
      out.write("     \t\t\t<td colspan=\"3\" align=\"center\"><hr></td>\r\n");
      out.write("     \t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t<font color=\"blue\" size=\"5\">Extracted Text Data </font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<font  size=\"5\">");
      out.print(extData );
      out.write("</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("</table>\t\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");

	}
        
	

      out.write("\r\n");
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
