<%@page import="com.user.util.Utility"%>
<html>

<head>
  <title>RDH Progressive Recovery</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
  <script type="text/javascript">
	function showImg()
	{
		var image = document.getElementById("img");
		var dropd = document.getElementById("dd");
		img.src = dropd.value;	
	};
	function radio_check(type)
	{
		if(type=="dec_key")
		{
			document.getElementById("dec_key").style.display = "block";
			document.getElementById("ext_key").style.display = "none";
		}
		if(type=="ext_key")
		{
			document.getElementById("ext_key").style.display = "block";
			document.getElementById("dec_key").style.display = "none";
		}
		if(type=="both")
		{
			document.getElementById("ext_key1").style.display = "block";
			document.getElementById("ext_key").style.display = "none";
			document.getElementById("dec_key").style.display = "block";
		}
	};
</script>

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
<%
	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
	int no1=Utility.parse(request.getParameter("no1"));
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
          <li><a href="<%=request.getContextPath() %>/Encryption?name=<%=user %>">Encryption</a></li>
          <li class="selected"><a href="<%=request.getContextPath() %>/DecryptionImage?name=<%=user %>">Decryption</a></li>
          <%-- <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li> --%>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div id="sidebar_container">
        
      <div id="content">
      <h1>Decryption Process</h1>
        <!-- insert the page content here -->
        <%
	if(no == 0)
	{
		
%>

<form id="login" action="<%=request.getContextPath() %>/DecryptImage" enctype="multipart/form-data" method="post">
		
			<div class="tab" style="position:absolute;top:300px;left:500px;width:450px;height: 220px">
			     
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Browse Image File For Decryption</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Decryption Image</td>
			     		<td>:</td>
			     		<td>
			     			<input class="tb6" type="file" name="file" style="width:250px" required="yes"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     			
			     			<td colspan="3" align="center">
			     				<input type="radio" name="type" onClick="radio_check(value);" value="dec_key" required="yes">Decrypt Image</input>
								<input type="radio" name="type" onClick="radio_check(value);" value="ext_key" required="yes">Extract Data</input>
								<!-- <input type="radio" name="type" onClick="radio_check(value);" value="both" required="yes">Both Decrypt And Extract Data</input> -->
			     			</td>
			     	</tr>
			     	
					<div id="dec_key" style="display:none;position: absolute;top: 170px;left: 80px;width: 450px;">
			     		Decryption Key : <input class="tb6" type="text" name="decryption_key" style="width:250px";></input>
					</div>
					
					<div id="ext_key" style="display:none;position: absolute;top: 170px;left: 55px;width: 450px;">
			     		Data Extraction Key : <input class="tb6" type="text" name="extraction_key1" style="width:250px";></input>
					</div>
					
					<!-- <div id="ext_key1" style="display:none;position: absolute;top: 215px;left: 55px;width: 450px;">
			     		Data Extraction Key : <input class="field" type="text" name="extraction_key2" style="width:250px";></input>
					</div> -->
					
			     </table>
			     
				<input class="button_example" type="submit" value="Decrypt Image" style="position:absolute;top:-45px;left:425px;"/>
			</div>
			
</form>
<%
if(no1 == 1)
{
%>
<div class="error" id="message" style="position:absolute;top:300px;left:500px;width:450px;height: 220px;font-weight:bold;color:green">	
			<p>Opp's,Something Went Wrong Try Again !!!! </p>
</div>	

<%
} 
%>
<%
if(no1 == 2)
{
%>
<div class="error" id="message" style="position:absolute;top:500px;left:500px;width:450px;height: 220px;font-weight:bold;color:green">	
			<p>Opp's,key is Mismatched </p>
</div>	

<%
} 
%>

<%
	}
	else if(no == 1)
	{
		
%>
<div class="tab" style="position:absolute;top:300px;left:500px;width:450px;height: 220px">
    
    <form action="<%=request.getContextPath()%>/HideData">
    <input class="button_example" type="submit" name="action" value="Cancel" style="position:absolute;top:-45px;left:530px;"/>
    <input class="button_example" type="submit" name="action" value="Save" style="position:absolute;top:-45px;left:600px;"/>
    
	<table id="login" align="center">
		<tr>
				<td colspan="3" align="center">
					<font color="green" size="5">Image Decrepted Successfully.....</font>
				</td>
		</tr>
		<tr></tr>
		<tr>
				<td align="center">
						<img alt="" src="<%=request.getContextPath()%>/Files/Decryption/enc_img.<%=fileExtension%>" width="200px" height="200px">
						<br>
						Encrypted Image
				</td>
				<td width="11px"></td>
				<td align="center">
						<img alt="" src="<%=request.getContextPath()%>/Files/Decryption/dec_img.<%=fileExtension%>" width="200px" height="200px">
						<br>
						Decrypted Image
				</td>
		</tr>
		<tr height="20px">
		</tr>
<%
if(no1 == 1)
{
	String extData = (String)session.getAttribute("ext_data");
	
	System.out.println("extData:"+extData);	
	%>

<tr>
				<td >
					<font color="blue" size="5">Extracted Text Data </font>
				</td>
				
				<td>:</td>
				<td>
					<font  size="5"><%=extData %></font>
				</td>
</tr>

<%
}
%>			
		
	</table>
   </form>
</div>
<%
	}
	else if(no == 2)
	{
		String extData = (String)session.getAttribute("orgval");
%>

<div class="tab" style="position:absolute;top:300px;left:500px;width:450px;height: 220px">

<form action="<%=request.getContextPath()%>/HideData">
    <input class="button_example" type="submit" name="action" value="Cancel" style="position:absolute;top:-45px;left:600px;"/>
</form>
<table id="login" align="center">
		
		<tr>
			    <td colspan="3" align="center">
			     	<font color="green" size="5">Data Extraction Informarion </font>
			     </td>
	    </tr>
			     	
     	<tr>
     			<td colspan="3" align="center"><hr></td>
     	</tr>
		
		<tr>
				<td >
					<font color="blue" size="5">Extracted Text Data </font>
				</td>
				
				<td>:</td>
				<td>
					<font  size="5"><%=extData %></font>
				</td>
		</tr>
</table>		

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
