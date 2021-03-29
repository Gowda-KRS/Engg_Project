<html>
<head>
  <title>RDH Progressive Recovery</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
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
<center><img src="<%=request.getContextPath() %>/Resources/Images/title.png"></img> </center> 


<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">User Registration <small></small></h3>
			 			</div>
			 			<div class="panel-body">
			    		<form method="post" action="<%=request.getContextPath() %>/UserRegister">
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			                <input type="text" name="id" id="first_name" class="form-control input-sm" placeholder="User-id" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="name" id="last_name" class="form-control input-sm" placeholder="User name" required>
			    					</div>
			    				</div>
			    			</div>

			    			<div class="form-group">
			    				<input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address" required>
			    			</div>
			    			
			    			<div class="form-group">
			    				&nbsp;&nbsp;&nbsp;Male<input name="gender" value="Male" type="radio" checked="true"/>
								&nbsp;&nbsp;&nbsp;Female<input name="gender" value="Female" type="radio"/>
			    			</div>

			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="pass" id="password" class="form-control input-sm" placeholder="Password" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="add" id="password_confirmation" class="form-control input-sm" placeholder="Address" required>
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="cno" id="password" class="form-control input-sm" placeholder="Contact Number" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="city" id="password_confirmation" class="form-control input-sm" placeholder="city" required>
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<input type="submit" value="Register" class="btn btn-info btn-block">
			    		
			    		</form>
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>






</body>






</html>