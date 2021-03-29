<%@ page import="com.user.util.*" %>
<html>
<head>
    <title>RDH Progressive Recovery</title>
	
<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" rel="stylesheet">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/style.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/design/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/layout/wide.css" data-name="layout">

    <link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/fractionslider.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/style-fraction.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/design/css/animate.css"/>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/design/css/switcher.css" media="screen" />


</head>
<body onload="startTimer()">
<center><img src="<%=request.getContextPath() %>/Resources/Images/titl.png"></img> </center> 

<div class="col-lg-5 col-sm-5 col-lg-offset-1">
                <div class="dividerHeading">
                    <h4><span style="color:white;">Admin Login Form</span></h4>
                </div>
                <form id="loginform" method="post" name="loginform" action="<%=request.getContextPath()%>/AdminLogin">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <input type="text" name="name" class="form-control" placeholder="Username">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                            <input type="password" name="pass" class="form-control" placeholder="Password">
                        </div>
                    </div>
                   
                    <div class="form-group">
                        <button type="submit" class="btn btn-default btn-lg button">Sign in</button>
                    </div>
                </form>
            </div>
    
    
     <div class="col-lg-5 col-sm-5 col-lg-offset-1">
                <div class="dividerHeading">
                    <h4><span style="color:white;">User Login Form</span></h4>
                </div>
                <form id="loginform" method="post" name="loginform" action="<%=request.getContextPath() %>/UserLogin">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user"></i></span>
                            <input type="text" name="name" class="form-control" placeholder="Username">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                            <input type="password"  name="pass" class="form-control" placeholder="Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="checkbox">
                            <label>
                                <input style="color:white;" type="checkbox"> Remember me
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-default btn-lg button">Sign in</button>
                    </div>
                    
                </form>
            </div>
            
  
   
    

    <section class="footer_bottom">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                   
                </div>

                <div class="col-sm-6 ">
                    <div class="footer_social">
                       
                    </div>
                </div>
            </div>
        </div>
    </section>          
   <section class="footer_bottom">         
   <div class="clear"></div>  
    <div class="link-to-page">Don't  have an account? <a href="<%=request.getContextPath() %>/signup.jsp" style="color:white;">Sign up now!</a></div>      
    
     </section>        

	<%	
		int no=Utility.parse(request.getParameter("no"));
		if(no==1)
		{%>
			<div class="error" id="message" style="position:absolute;font-weight:bold;color:red">	
				<p>Opp's,Invalid userid / password..!</p>
			</div>			
		<%}
		if(no==3)
		{%>
			<div class="error" id="message" style="position:absolute;font-weight:bold;color:red">	
				<p>Opp's,Something went wrong ..!</p>
			</div>			
		<%}
		if(no==4)
		{%>
			<div class="success" id="message" style="position:absolute;font-weight:bold;color:green">	
				<p>You have registered successfully!</p>
			</div>			
		<%}
	%>

<%
	if(no==2)
	{%>
		<div style="position:absolute;top:550px;left:210" class="c">	
		<%
			if(Utility.parse(request.getParameter("no1"))==5)
			{%>
				<div class="error" id="message" style="position:absolute;font-weight:bold;color:red">	
					<p >Sorry this user id is already exists.....!</p>
				</div>			
			<%}
		%>
			<%-- <table id="login">
			<h1 align="center" id="label">User Registeration</h1>
			<hr size="10" color="#5E74D8"></hr>
			<form method="post" action="<%=request.getContextPath() %>/UserRegister">
				<tr id="label">
					<td>User-ID</td>
					<td><input class="field" name="id" type="text" required="yes"/></td>
					<td>Address</td>
					<td><input class="field" name="add" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr id="label">
					<td>Password</td>
					<td><input class="field" name="pass" type="password" required="yes"/></td>
					<td>City</td>
					<td><input class="field" name="city" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr id="label">
					<td>Name</td>
					<td><input class="field" name="name" type="text" required="yes"/></td>
					<td>Email-ID</td>
					<td><input class="field" name="email" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr id="label">
					<td>&nbsp;</td>
					<td>
						&nbsp;&nbsp;&nbsp;Male<input name="gender" value="Male" type="radio" checked="true"/>
						&nbsp;&nbsp;&nbsp;Female<input name="gender" value="Female" type="radio"/>
					</td>
					<td>Contact No</td>
					<td><input class="field" name="cno" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input class="button" type="submit" value="Register"/></td>
				</tr>
			</form>
			</table> --%>
	   </div>			
	<%
	}
	else
	{
		%>
		<div style="position:absolute;top:170px;left:210">
			<p>
				
			</p>
		</div>
		<%
	}
%>
<script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery-1.10.2.min.js"></script>
    <script src="<%=request.getContextPath() %>/design/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/design/js/jquery.easing.1.3.js"></script>
    <script src="<%=request.getContextPath() %>/design/js/retina-1.1.0.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.cookie.js"></script> <!-- jQuery cookie -->
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/styleswitch.js"></script> <!-- Style Colors Switcher -->
    <script src="<%=request.getContextPath() %>/design/js/jquery.fractionslider.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.smartmenus.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.smartmenus.bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/owl.carousel.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jflickrfeed.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.magnific-popup.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.isotope.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.easypiechart.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/swipe.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery-hoverdirection.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery.matchHeight-min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/jquery-scrolltofixed-min.js"></script>

    <script src="<%=request.getContextPath() %>/design/js/main.js"></script>

    <!-- Start Style Switcher -->
   <!--  <div class="switcher"></div> -->
    <!-- End Style Switcher -->

        <script>
            /*Portfolio*/
            (function($) {
                "use strict";
                var $container = $('.portfolio'),
                        $items = $container.find('.portfolio-item'),
                        portfolioLayout = 'fitRows';

                if( $container.hasClass('portfolio-centered') ) {
                    portfolioLayout = 'masonry';
                }

                $container.isotope({
                    filter: '*',
                    animationEngine: 'best-available',
                    layoutMode: portfolioLayout,
                    animationOptions: {
                        duration: 750,
                        easing: 'linear',
                        queue: false
                    },
                    masonry: {
                    }
                }, refreshWaypoints());

                function refreshWaypoints() {
                    setTimeout(function() {
                    }, 1000);
                }

                $('ul#filter li').on('click', function() {
                    var selector = $(this).attr('data-filter');
                    $container.isotope({ filter: selector }, refreshWaypoints());
                    $('ul#filter li').removeClass('selected');
                    $(this).addClass('selected');
                    return false;
                });

                function getColumnNumber() {
                    var winWidth = $(window).width(),
                            columnNumber = 1;

                    if (winWidth > 1200) {
                        columnNumber = 5;
                    } else if (winWidth > 950) {
                        columnNumber = 4;
                    } else if (winWidth > 600) {
                        columnNumber = 3;
                    } else if (winWidth > 400) {
                        columnNumber = 2;
                    } else if (winWidth > 250) {
                        columnNumber = 1;
                    }
                    return columnNumber;
                }

                function setColumns() {
                    var winWidth = $(window).width(),
                            columnNumber = getColumnNumber(),
                            itemWidth = Math.floor(winWidth / columnNumber);

                    $container.find('.portfolio-item').each(function() {
                        $(this).css( {
                            width : itemWidth + 'px'
                        });
                    });
                }

                function setPortfolio() {
                    setColumns();
                    $container.isotope('reLayout');
                }

                $container.imagesLoaded(function () {
                    setPortfolio();
                });

                $(window).on('resize', function () {
                    setPortfolio();
                });
            })(jQuery);
        </script>


    <!-- WARNING: Wow.js doesn't work in IE 9 or less -->
    <!--[if gte IE 9 | !IE ]><!-->
    <script type="text/javascript" src="<%=request.getContextPath() %>/design/js/wow.min.js"></script>
    <script>
        // WOW Animation
        new WOW().init();
    </script>
</body>
</html>