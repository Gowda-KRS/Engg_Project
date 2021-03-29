<%@page import="com.user.util.Utility"%>
<html>

<head>
  <title>RDH Progressive Recoverye</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
  <style>
  .button_example
  {
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
<%
	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
    String fileExtension = (String) session.getAttribute("file_ext");
%>

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
          <li class="selected"><a href="<%=request.getContextPath() %>/Encryption?name=<%=user %>">Encryption</a></li>
          <li><a href="<%=request.getContextPath() %>/DecryptionImage?name=<%=user %>">Decryption</a></li>
          <%-- <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li> --%>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      
      <div id="content" style="position:absolute;top:200px;left:500px;width:450px;height: 220px">
        <!-- insert the page content here -->
        <h1>Encryption Process</h1>
        <%
	if(no == 0)
	{
%>

<form id="login" action="<%=request.getContextPath() %>/EncryptImage" enctype="multipart/form-data" method="post">
		
			<div class="tab">
			     
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Browse Image File For Encryption</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Encryption Image</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="file" name="file" style="width:250px" required></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Encryption Key</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="encryption_key" style="width:250px" required></input>
			     		</td>
			     	</tr>
			     	
			     </table>
			     
				<input class="button_example" type="submit" value="Encrypt Image" />
			</div>
			
</form>

<%
	}
	else if(no == 1)
	{
		
%>
<div class="tab" >
    
    <form action="<%=request.getContextPath()%>/GetkeyMsg">
    <input class="button_example" type="submit" name="action" value="Cancel" />
    <input class="button_example" type="submit" name="action" value="Save Image" />
    <input class="button_example" type="submit" name="action" value="Hide Data" />
    <input type="hidden" name="act" value="HideData" />
    
	<table id="login">
		<tr>
				<td colspan="3" align="center">
					<font color="green" size="5">Image Encrypted Successfully.....</font>
				</td>
		</tr>
		<tr></tr>
		<tr>
				<td align="center">
						<img alt="" src="<%=request.getContextPath()%>/Files/Encryption/in_img.<%=fileExtension%>" width="200px" height="200px">
						<br>
						Original Image
				</td>
				<td width="11px"></td>
				<td align="center">
						<img alt="" src="<%=request.getContextPath()%>/Files/Encryption/enc_img.<%=fileExtension%>" width="200px" height="200px">
						<br>
						Encrypted Image
				</td>
		</tr>
	</table>
   </form>
</div>
<%
	}
%>
      </div>
    </div>
    <div id="content_footer"></div>
    
  </div>
</body>
</html>
