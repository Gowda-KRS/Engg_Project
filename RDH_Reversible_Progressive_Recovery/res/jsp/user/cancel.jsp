<%@page import="com.user.util.Utility"%>
<html>
<%
	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
%>
<head>
  <title>RDH Progressive Recovery</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1>Reversible Data Hiding<span class="logo_colour"> in Encrypted Images Based on</span></a></h1>
          <h2>Progressive Recovery</h2>
          <h5 style="position: absolute;top:14px;">Welcome user [<%=user %>]</h5>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
           <li ><a href="<%=request.getContextPath() %>/HomeUser?name=<%=user %>">Home</a></li> 
          <li><a href="<%=request.getContextPath() %>/Encryption?name=<%=user %>">Encryption</a></li>
          <li><a href="<%=request.getContextPath() %>/DecryptionImage?name=<%=user %>">Decryption</a></li>
          <%-- <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li> --%>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      
      <div id="content">
        <!-- insert the page content here -->
        <%
if(no == 0)
{
%>

	<div class="success" id="message">	
				<p>Process Canceled Successfully.....</p>
	</div>	

<%
}
if(no == 1)
{
%>

	<div class="success" id="message">	
				<p>Mail Sent Successfully.....</p>
	</div>	

<%
}
%>
      </div>
    </div>
    <div id="content_footer" ></div>
    
  </div>
</body>
</html>
