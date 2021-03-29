<%@ page import="com.user.util.*" %>
<%@ page import="java.sql.*" %>
<html>
<%
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
%>
<head>
  <title>RDH Progressive Recovery</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
  <style type="text/css">
  
    .button_example{
border-top-color: #819BCB;border-right-color: #819BCB;border-bottom-color: #bae361;border-left-color: #819BCB;border-width: 0px 0px 6px 0px;border-style: solid; -webkit-border-radius: 0px; -moz-border-radius: 0px;border-radius: 0px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;
 background-color: #CEDCE7; background-image: -webkit-gradient(linear, left top, left bottom, from(#CEDCE7), to(#596a72));
 background-image: -webkit-linear-gradient(top, #CEDCE7, #596a72);
 background-image: -moz-linear-gradient(top, #CEDCE7, #596a72);
 background-image: -ms-linear-gradient(top, #CEDCE7, #596a72);
 background-image: -o-linear-gradient(top, #CEDCE7, #596a72);
 background-image: linear-gradient(to bottom, #CEDCE7, #596a72);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#CEDCE7, endColorstr=#596a72);
}

.button_example:hover{
 border-top-color: #819BCB;border-right-color: #819BCB;border-bottom-color: #F53D68;border-left-color: #819BCB;border-width: 0px 0px 6px 0px;border-style: solid;
 background-color: #acc4d6; background-image: -webkit-gradient(linear, left top, left bottom, from(#acc4d6), to(#434f55));
 background-image: -webkit-linear-gradient(top, #acc4d6, #434f55);
 background-image: -moz-linear-gradient(top, #acc4d6, #434f55);
 background-image: -ms-linear-gradient(top, #acc4d6, #434f55);
 background-image: -o-linear-gradient(top, #acc4d6, #434f55);
 background-image: linear-gradient(to bottom, #acc4d6, #434f55);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#acc4d6, endColorstr=#434f55);
}
  
  
  .tb6 {
	border: 3px double #CCCCCC;
	width: 230px;
}
  
 
  
  
  </style>
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
          <li class="selected"><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">

      <div id="content" style="position:absolute;left:400">
        <!-- insert the page content here -->
        <h1>Edit Profile</h1>
        <%
			if(no==1)
			{
				%>
					<div class="error" id="message">	
						<p>Opp's,Seems something went wrong ..!</p>
					</div>
				<%
			}
			if(no==0)
			{
				%>
					<form id="login" action="<%=request.getContextPath() %>/EditProfile2">
					<input type="hidden" name="user" value="<%=user %>"></input>
					<input type="hidden" name="no" value="2"></input>
					<input type="hidden" name="id" value="<%=id %>"></input>
					<div align="right">
						<input type="submit" value="Save Updates" class="button_example"/>&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="button_example" href="<%=request.getContextPath() %>/ChangePass2?name=<%=user %>&no=1&id=<%=id %>" target="afrm">Change Password</a>
					</div><br></br>
					<div id="a1">
						<p>Your ID No : <%=id %></p>
						<p>Your Name : <input class="tb6" type="text" name="name" value="<%=name %>"></input></p>
						<p>Your User ID : <%=userid %></p>
						<p>Your Gedner : <input class="tb6" type="text" name="gender" value="<%=gender %>"></input></p>
						<p>Your Mail ID : <input class="tb6" type="text" name="email" value="<%=email %>"></input></p>
						<p>Your Cell N0 : <input class="tb6" type="text" name="phone" value="<%=phone %>"></input></p>
						<p>Your Address : <input class="tb6" type="text" name="add" value="<%=add %>"></input></p>
						<p>Your City : <input class="tb6" type="text" name="city" value="<%=city %>"></input></p>
					</div>
					</form>
				<%
			}
		%>
      </div>
    </div>
    
</body>
</html>
