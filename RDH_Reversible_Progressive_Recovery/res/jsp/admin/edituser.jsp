<%@ page import="com.user.util.*" %>
<%@ page import="java.sql.*" %>
<html>
<%
HttpSession ss=null;
ss=request.getSession();
String admin=ss.getAttribute("admin").toString();
	ResultSet rs=(ResultSet)request.getAttribute("rs");
	int id=0;
	String userid="",add="",cno="",city="",name="",email="";
	while(rs.next())
	{
		id=rs.getInt(1);
		userid=rs.getString(2);
		name=rs.getString(4);
		add=rs.getString(6);
		city=rs.getString(7);
		email=rs.getString(8);
		cno=rs.getString(9);
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
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="<%=request.getContextPath() %>/Home?name=<%=admin %>">Home</a></li>
          <li><a href="<%=request.getContextPath() %>/AdminProfile?name=<%=admin %>">Show Profile</a></li>
          <li class="selected"><a href="<%=request.getContextPath() %>/UserList?submit=get">User List</a></li>
          <li><a href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
     
      <div id="content" style="position:absolute;left:400">
        <!-- insert the page content here -->
        
        <!-- <div style="position:absolute;top:-20px;left:100" class="c">	 -->
		<table id="login">
			<h1 align="center" id="label">Edit User</h1>
			
			<form action="<%=request.getContextPath() %>/UserList">
			<input type="hidden" name="submit" class="myButton" value="Edit"></input>
			<input type="hidden" name="edit1" class="myButton" value="YES"></input>
			<input type="hidden" name="id" class="myButton" value="<%=id %>"></input>
				<tr id="label">
					<td>User-ID</td>
					<td><input class="tb6" value="<%=userid %>" name="id" type="text" readonly/></td>
					<td>Address</td>
					<td><input class="tb6" value="<%=add %>" name="add" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr id="label">
					<td>Contact No</td>
					<td><input class="tb6" value="<%=cno %>" name="cno" type="text" required="yes"/></td>
					<td>City</td>
					<td><input class="tb6" value="<%=city %>" name="city" type="text" required="yes"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr id="label">
					<td>Name</td>
					<td><input class="tb6" value="<%=name %>" name="name" type="text" required="yes"/></td>
					<td>Emai-ID</td>
					<td><input class="tb6" value="<%=email %>" name="email" type="text" required="yes"/></td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td><input class="myButton" type="submit" value="Register"/></td>
				</tr>
		</form>
	</table>
</div>		
<%
if(Utility.parse(request.getParameter("no"))==1)
{%>
	<div class="error" id="message" style="position:absolute">	
		<p>Sorry this user id is already exists.....!</p>
	</div>			
<%}
%>
      </div>
    </div>
    
</body>
</html>
