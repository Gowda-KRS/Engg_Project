<%@page import="java.util.Arrays"%>
<html>
<%
	String user=request.getAttribute("user").toString();
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
         <li class="selected"><a href="<%=request.getContextPath() %>/HomeUser?name=<%=user %>">Home</a></li> 
          <li ><a href="<%=request.getContextPath() %>/Encryption?name=<%=user %>">Encryption</a></li>
          <li><a href="<%=request.getContextPath() %>/DecryptionImage?name=<%=user %>">Decryption</a></li>
          <%-- <li><a href="<%=request.getContextPath() %>/GroupDetails?name=<%=user %>">Create Group</a></li> --%>
          <li><a class="gradientlinks" href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>">Show Profile</a></li>
           <li><a class="gradientlinks" href="<%=request.getContextPath() %>/">Sign Out</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div id="banner"></div>
	  
      <div id="content">
        <!-- insert the page content here -->
        <h1>Welcome</h1>
        <p>The Main aim of this project to hide and retrieve back the data in the encrypted images, reversible data hiding in encrypted images (RDH-EI) based on progressive recovery......</p>
        <p>Idea of reversible data hiding in encrypted images<strong>(RDH-EI) </strong> originates from reversible data hiding (RDH) in plaintext images.</p>
        <p>It is feasible in the applications like cloud storage and medical systems.</p>
        <p>In cloud storage, a content owner can encrypt an image to preserve his/her privacy, and upload the encrypted data onto cloud.</p>
        <h2>Advantages</h2>
        
        <ul>
          <li>Approximate image with good quality can be obtained by decryption if the receiver has decryption key.</li>
          <li>When both keys are available, the original image can be losslessly recovered by progressive recovery.</li>
          
        </ul>
      </div>
    </div>
    <div id="content_footer"></div>
    
  </div>
</body>
</html>
