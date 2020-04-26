<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书馆</title>
    <!--设置标签图标-->
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/regist.css">
    <link rel="stylesheet" href="css/footer.css">
</head>
<body>
<!--头部-->
<div id="reg_header">
    <div class="reg_h_center">
        <div class="reg_h_left">
            <img src="images/logo.png" alt="">
            <h4>欢迎注册</h4>
        </div>

        <div class="reg_h_right">
            <a href="login.jsp">请登录</a>
            <span>已有账户</span>

        </div>
    </div>
</div>
<!--表单内容-->
<div id="reg_content">
    <div class="reg_content_left">
        <form action="/Mystore3/RegistServlet" id="reg_form" method="post">

            <div>
                <label>用户名</label>
                <input id="username" name="username" type="text" placeholder="请输入用户名">
            </div>
            <div>
                <label>密码</label>
                <input id="pwd" name="password" type="text" placeholder="请输入用户名">
            </div>
            <div>
                <label>确认密码</label>
                <input id="pwd2" type="text" placeholder="请输入用户名">
            </div>
            <div>
                <label>电话</label>
                <input type="text" name="phone" placeholder="请输入用户名">
            </div>
            <div class="check_box">
                <label>验证码</label>
                <input type="text" name="code">
                <img src="images/check_code.png" alt="">
            </div>
            <div class="submit_button">
                <input type="button" value="立即注册"  onclick="checkData()">
            </div>

        </form>
    </div>
    <div class="reg_content_right">
        <a href="#">
            <img src="images/reg_right.png" alt="">
        </a>
    </div>
</div>

<!--尾部-->
<%@ include file="/footer.jsp" %>

<script type="text/javascript">
       function  checkData(){
    	  var username =  document.getElementById("username");
    	  var pwd =  document.getElementById("pwd");
    	  var pwd2 =  document.getElementById("pwd2");
    	  
    	  if(username.value ==""){
    		  alert("请输入用户名");
    		  return;
    	  }
    	  if(pwd.value ==""){
    		  alert("请输入密码");
    		  return;
    	  }
    	  if(pwd2.value ==""){
    		  alert("请再次输入密码");
    		  return;
    	  }
    	  
    	  if(pwd.value == pwd2.value){
    		  var form = document.getElementById("reg_form");
    		  form.submit();  //通过js提交表单执行action
    		  
    	  }else{
    		  alert("两次密码输入不一样");
    	  }
       }
</script>

</body>
</html>