package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.user.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <title>RDH Progressive Recovery</title>\r\n");
      out.write("\t\r\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
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
      out.write("/Resources/Images/titl.png\"></img> </center> \r\n");
      out.write("\r\n");
      out.write("<div class=\"col-lg-5 col-sm-5 col-lg-offset-1\">\r\n");
      out.write("                <div class=\"dividerHeading\">\r\n");
      out.write("                    <h4><span style=\"color:white;\">Admin Login Form</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"loginform\" method=\"post\" name=\"loginform\" action=\"");
      out.print(request.getContextPath());
      out.write("/AdminLogin\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                            <input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default btn-lg button\">Sign in</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <div class=\"col-lg-5 col-sm-5 col-lg-offset-1\">\r\n");
      out.write("                <div class=\"dividerHeading\">\r\n");
      out.write("                    <h4><span style=\"color:white;\">User Login Form</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"loginform\" method=\"post\" name=\"loginform\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                            <input type=\"password\"  name=\"pass\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"checkbox\">\r\n");
      out.write("                            <label>\r\n");
      out.write("                                <input style=\"color:white;\" type=\"checkbox\"> Remember me\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default btn-lg button\">Sign in</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <section class=\"footer_bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-6 \">\r\n");
      out.write("                    <div class=\"footer_social\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>          \r\n");
      out.write("   <section class=\"footer_bottom\">         \r\n");
      out.write("   <div class=\"clear\"></div>  \r\n");
      out.write("    <div class=\"link-to-page\">Don't  have an account? <a href=\"");
      out.print(request.getContextPath() );
      out.write("/signup.jsp\" style=\"color:white;\">Sign up now!</a></div>      \r\n");
      out.write("    \r\n");
      out.write("     </section>        \r\n");
      out.write("\r\n");
      out.write("\t");
	
		int no=Utility.parse(request.getParameter("no"));
		if(no==1)
		{
      out.write("\r\n");
      out.write("\t\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;font-weight:bold;color:red\">\t\r\n");
      out.write("\t\t\t\t<p>Opp's,Invalid userid / password..!</p>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t");
}
		if(no==3)
		{
      out.write("\r\n");
      out.write("\t\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;font-weight:bold;color:red\">\t\r\n");
      out.write("\t\t\t\t<p>Opp's,Something went wrong ..!</p>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t");
}
		if(no==4)
		{
      out.write("\r\n");
      out.write("\t\t\t<div class=\"success\" id=\"message\" style=\"position:absolute;font-weight:bold;color:green\">\t\r\n");
      out.write("\t\t\t\t<p>You have registered successfully!</p>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t");
}
	
      out.write("\r\n");
      out.write("\r\n");

	if(no==2)
	{
      out.write("\r\n");
      out.write("\t\t<div style=\"position:absolute;top:550px;left:210\" class=\"c\">\t\r\n");
      out.write("\t\t");

			if(Utility.parse(request.getParameter("no1"))==5)
			{
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;font-weight:bold;color:red\">\t\r\n");
      out.write("\t\t\t\t\t<p >Sorry this user id is already exists.....!</p>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t");
}
		
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t   </div>\t\t\t\r\n");
      out.write("\t");

	}
	else
	{
		
      out.write("\r\n");
      out.write("\t\t<div style=\"position:absolute;top:170px;left:210\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

	}

      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/retina-1.1.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.cookie.js\"></script> <!-- jQuery cookie -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/styleswitch.js\"></script> <!-- Style Colors Switcher -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.fractionslider.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.smartmenus.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.smartmenus.bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jflickrfeed.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.isotope.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.easypiechart.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/swipe.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery-hoverdirection.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery.matchHeight-min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/jquery-scrolltofixed-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Style Switcher -->\r\n");
      out.write("   <!--  <div class=\"switcher\"></div> -->\r\n");
      out.write("    <!-- End Style Switcher -->\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            /*Portfolio*/\r\n");
      out.write("            (function($) {\r\n");
      out.write("                \"use strict\";\r\n");
      out.write("                var $container = $('.portfolio'),\r\n");
      out.write("                        $items = $container.find('.portfolio-item'),\r\n");
      out.write("                        portfolioLayout = 'fitRows';\r\n");
      out.write("\r\n");
      out.write("                if( $container.hasClass('portfolio-centered') ) {\r\n");
      out.write("                    portfolioLayout = 'masonry';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                $container.isotope({\r\n");
      out.write("                    filter: '*',\r\n");
      out.write("                    animationEngine: 'best-available',\r\n");
      out.write("                    layoutMode: portfolioLayout,\r\n");
      out.write("                    animationOptions: {\r\n");
      out.write("                        duration: 750,\r\n");
      out.write("                        easing: 'linear',\r\n");
      out.write("                        queue: false\r\n");
      out.write("                    },\r\n");
      out.write("                    masonry: {\r\n");
      out.write("                    }\r\n");
      out.write("                }, refreshWaypoints());\r\n");
      out.write("\r\n");
      out.write("                function refreshWaypoints() {\r\n");
      out.write("                    setTimeout(function() {\r\n");
      out.write("                    }, 1000);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                $('ul#filter li').on('click', function() {\r\n");
      out.write("                    var selector = $(this).attr('data-filter');\r\n");
      out.write("                    $container.isotope({ filter: selector }, refreshWaypoints());\r\n");
      out.write("                    $('ul#filter li').removeClass('selected');\r\n");
      out.write("                    $(this).addClass('selected');\r\n");
      out.write("                    return false;\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                function getColumnNumber() {\r\n");
      out.write("                    var winWidth = $(window).width(),\r\n");
      out.write("                            columnNumber = 1;\r\n");
      out.write("\r\n");
      out.write("                    if (winWidth > 1200) {\r\n");
      out.write("                        columnNumber = 5;\r\n");
      out.write("                    } else if (winWidth > 950) {\r\n");
      out.write("                        columnNumber = 4;\r\n");
      out.write("                    } else if (winWidth > 600) {\r\n");
      out.write("                        columnNumber = 3;\r\n");
      out.write("                    } else if (winWidth > 400) {\r\n");
      out.write("                        columnNumber = 2;\r\n");
      out.write("                    } else if (winWidth > 250) {\r\n");
      out.write("                        columnNumber = 1;\r\n");
      out.write("                    }\r\n");
      out.write("                    return columnNumber;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function setColumns() {\r\n");
      out.write("                    var winWidth = $(window).width(),\r\n");
      out.write("                            columnNumber = getColumnNumber(),\r\n");
      out.write("                            itemWidth = Math.floor(winWidth / columnNumber);\r\n");
      out.write("\r\n");
      out.write("                    $container.find('.portfolio-item').each(function() {\r\n");
      out.write("                        $(this).css( {\r\n");
      out.write("                            width : itemWidth + 'px'\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                function setPortfolio() {\r\n");
      out.write("                    setColumns();\r\n");
      out.write("                    $container.isotope('reLayout');\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                $container.imagesLoaded(function () {\r\n");
      out.write("                    setPortfolio();\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $(window).on('resize', function () {\r\n");
      out.write("                    setPortfolio();\r\n");
      out.write("                });\r\n");
      out.write("            })(jQuery);\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- WARNING: Wow.js doesn't work in IE 9 or less -->\r\n");
      out.write("    <!--[if gte IE 9 | !IE ]><!-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/design/js/wow.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        // WOW Animation\r\n");
      out.write("        new WOW().init();\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
