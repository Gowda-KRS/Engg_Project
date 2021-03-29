<%@page import="com.user.util.Utility"%>
<html>
<%
	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
    int no1=Utility.parse(request.getParameter("no1"));
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
         <%--  <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li> --%>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      
      <div id="content" style="position:absolute;left:400">
      <h1>Hiding Process</h1>
        <!-- insert the page content here -->
        <%
	if(no == 0)
	{
%>

<form id="login" action="<%=request.getContextPath() %>/GetkeyMsg"  method="post">
		
			<div class="tab" >
			     
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Hiding The Data Inside The Image</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Text Data To Hide</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="textData1" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Hiding Key 1</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="hidingKey1" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Text Data To Hide 2</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="textData2" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Hiding Key 2</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="hidingKey2" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Text Data To Hide 3</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="textData3" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Hiding Key 3</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="text" name="hidingKey3" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     </table>
			     <input type="hidden" name="act" value="HideDataAction" />
				 <input class="button_example" type="submit" name="action" value="Hide Data" />
				 
			</div>
			
</form>

<%
if(no1 == 1)
{
	
%>

	<div class="error" id="message">	
			<p>Opp's,Something Went Wrong,Try Again !!!!!</p>
	</div>	

<%
}
	}//ending if(no == 0)
	else if(no == 1)
	{
		String fileExtension = (String) session.getAttribute("file_ext");
		
%>

    <div class="tab">
    
    <form method="post" action="<%=request.getContextPath()%>/HideData" >
    <input class="gradientbuttons" type="submit" value="Save File"/>
    <input type="hidden" name="action"  value="Hide Data" />
    <input type="hidden" name="act" value="Save File" />
	<table id="login">
		<tr>
				<td colspan="3" align="center">
					<font color="green" size="5">Data Hidding Process Done Successfully.....</font>
				</td>
		</tr>
		<tr></tr>
		<tr>
				<td align="center">
						<img alt="" src="<%=request.getContextPath()%>/Files/Encryption/enc_img_data.<%=fileExtension%>" width="200px" height="200px">
						<br>
						Encrypted Image With Data
				</td>
		</tr>
	</table>
   </form>
</div>

<%
	}
	else if(no==2)
	{
		%>
		<form id="login" action="<%=request.getContextPath() %>/GetkeyMsg"  method="post">
		
			<div class="tab" >
			     
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Check the key</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	
			     	
			     	<tr>
			     		<td>Enter Key</td>
			     		<td>:</td>
			     		<td>
			     			<input class="field" type="text" name="key" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	
			     	
			     </table>
			     <input type="hidden" name="act" value="Getmsg" />
				 <input class="button_example" type="submit" name="action" value="Hide Data" />
				 
			</div>
			
</form>

		
		
	<% 
	}
	else if(no==4)
	{%>
	<div class="error" id="message">	
			<p>Opp's,Sorry Your key is invalid!!!!!</p>
	</div>	
		
<% }

	else if(no==3)
	{%>
	
	<form id="login" action="<%=request.getContextPath() %>/HideData"  method="post">
		
			<div class="tab" >
			     
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Hiding The Data Inside The Image</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Text Data To Hide</td>
			     		<td>:</td>
			     		<td>
			     			<input class="field" type="text" name="textData" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Hiding Key</td>
			     		<td>:</td>
			     		<td>
			     			<input class="field" type="text" name="hidingKey" value="????" style="width:250px"></input>
			     		</td>
			     	</tr>
			     	
			     	
			     	
			     </table>
			     <input type="hidden" name="act" value="HideDataAction" />
				 <input class="button_example" type="submit" name="action" value="Hide Data" />
				 
			</div>
			
</form>
	
		
<% }
	
	
%>
      </div>
    </div>
    <div id="content_footer"></div>
    
  </div>
</body>
</html>
