<%@page import="com.user.util.Utility"%>
<%@page import="com.data.dao.DAOFactory"%>
<%@page import="com.data.dao.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<html>

<head>
  <title>RDH Progressive Recovery</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
  
  <script language="javascript">
	function check()
	{
		
		if(document.f1.to.value==0)
		{
			window.location.href = 'res/jsp/user/compose_mail.jsp?no=0&no1=1';
			return false
		}
	}
	
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
<%!
	String username = "",members="";
	DAOFactory factory=new DAOFactory();
	DAO userDAO=factory.getInstance("User");
	ArrayList<String> list = null;
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
%>
<%
	String user=(String) session.getAttribute("user");
	int no=Utility.parse(request.getParameter("no"));
	int no1=Utility.parse(request.getParameter("no1"));
if(session != null)
{
	username = (String) session.getAttribute("user");
}
list = userDAO.getGroupMembers(username);
if(list.size() >0)
{
	for(int i = 0;i<list.size();i++)
	{
		members = "'"+list.get(i)+"'";
		sb.append(members+",");
	}
	int index = sb.length()-1;
	sb.deleteCharAt(index);
	members = sb.toString();
}
else
{
	members="'"+sb.toString()+"'";
}
System.out.println("--------------------------------------------");
System.out.println("Members : "+ members);
System.out.println("--------------------------------------------");

rs = userDAO.getMembersInfo(members);
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
           <li class="selected"><a href="<%=request.getContextPath() %>/Compose?name=<%=user %>">Compose</a></li>
          <li><a href="<%=request.getContextPath() %>/Encryption?name=<%=user %>">Encryption</a></li>
          <li><a href="<%=request.getContextPath() %>/DecryptionImage?name=<%=user %>">Decryption</a></li>
          <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">

      <div id="content">
        <!-- insert the page content here -->
        <h1>Examples</h1>
<%
	if(no == 0)
	{
%>
<!-- <div class="tab" style="position:absolute;top:200px;left:130px;width:400px;">
 -->
<form action="<%=request.getContextPath()%>/HideData">
    <input class="button_example" type="submit" name="action" value="Cancel" />
</form>
<form name="f1" id="login" action="<%=request.getContextPath() %>/ComposeMail" enctype="multipart/form-data" method="post">
		
			     <table id="login">
			     	<tr>
			     			<td colspan="3" align="center">Compose Your Mail</td>
			     	</tr>
			     	
			     	<tr>
			     			<td colspan="3" align="center"><hr></td>
			     	</tr>
			     	
			     	<tr>
			     		<td>To</td>
			     		<td>:</td>
			     		<td>
			     				<select name="to" class="field" style="width:250px">
			     					<option value="0">--Select Member--</option>
			     					<%
			     						if(rs != null)
			     						{
			     							while(rs.next())
			     							{
			     				    %>
			     				    <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
			     					<%
			     							}
			     					
			     						}
			     						else
			     						{
			     							response.sendRedirect(request.getContextPath()+"/res/jsp/user/compose_mail.jsp?no=0&no1=2");
			     						}
			     					%>
			     				</select>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Subject</td>
			     		<td>:</td>
			     		<td>
			     			<input class="field" type="text" name="subject" style="width:250px" required="yes"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Attach File</td>
			     		<td>:</td>
			     		<td>
			     			<input class="field" type="file" name="attached_file" style="width:250px" required="yes"></input>
			     		</td>
			     	</tr>
			     	
			     	<tr>
			     		<td>Message</td>
			     		<td>:</td>
			     		<td></td>
			     	</tr>
			     	
			     	<tr>
			     		<td colspan="3" align="right">
			     				<textarea rows="7" cols="28" name="msg"></textarea>
			     		</td>
			     	</tr>
			     	
			     </table>
				<input class="gradientbuttons" type="submit" name="sub" value="Send Mail" onclick="return check();" style="position:absolute;top:260px;left:300px;"/>
			
	</form>
</div>

<%
	if(no1 == 1)
	{
		
		%>
		
		<div class="error" id="message" style="position:absolute;top:10px;left:150px;width:400px;height:100px;">	
				<p>Please,Select The Member!!!!!</p>
		</div>
		
		<%
	}
	if(no1 == 2)
	{
		
		%>
		
		<div class="error" id="message" style="position:absolute;top:10px;left:150px;width:400px;height:100px;">	
				<p>There is No Member In Your Group!!!!!</p>
		</div>
		
		<%
	}

}
	if(no == 1)
	{
		
%>

<div class="error" id="message" style="position:absolute;top:10px;left:150px">	
			<p>Opp's,Something Went Wrong Try Again !!!! </p>
</div>

<%
	}
%>
      </div>
    </div>
    <div id="content_footer" top:200px></div>
    <div id="footer">
      <p><a href="index.html">Home</a> | <a href="examples.html">Examples</a> | <a href="page.html">A Page</a> | <a href="another_page.html">Another Page</a> | <a href="contact.html">Contact Us</a></p>
      <p>Copyright &copy; simplestyle_banner | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> | <a href="http://www.html5webtemplates.co.uk">HTML5 Web Templates</a></p>
    </div>
  </div>
</body>
</html>
