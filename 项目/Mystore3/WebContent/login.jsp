<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>	
<head>
<title>用户登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> 
   
   addEventListener("load", function() { 
	setTimeout(hideURLbar, 0);
	},false); 
	function hideURLbar(){ 
		window.scrollTo(0,1); 
		} 
	
	</script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!--webfonts-->
<!-- <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>  -->
<!--//webfonts-->
<script src="http://apps.bdimg.com/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
<script>

$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
});
</script>
 <!--SIGN UP-->
 <h1>用户登录</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<a href="face_detction.html"><img src="images/images/avtar.png" /></a>
	</div>
			<form action="/Mystore3/LoginServlet" id="login" method="post">
			<!-- 
			   onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'username';}"
			   onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}"
			 -->
					<input type="text" class="text" value="用户名" name="username" >
						<div class="key">
					<input type="password"  name="password">
						</div>
					<div class="signin">
	                	<input type="submit" value="Login" >
	                </div>
			</form>
	
</div>

</body>
</html>