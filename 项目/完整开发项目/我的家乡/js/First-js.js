$(function(){
	$('#username').blur(function(){
		var in_str=$('#username').val();
		if (!isUsername(in_str)) {
			$('#1').html('只能以英文开头,4~16个英文，数字或下划线');
			$('#1').css('color','red');
		}else{
			$('#1').html('用户名验证通过');
			$('#1').css('color','green');
		}
	})

	$('#email').blur(function(){
		var in_str=$('#email').val();
		if (!isEmail(in_str)) {
			$('#2').html('电子邮箱格式不对！');
			$('#2').css('color','red');
		}else{
			$('#2').html('电子邮箱验证通过');
			$('#2').css('color','green');
		}
	})

	$('#password').blur(function(){
		var in_str=$('#password').val();
		if (!isPassword(in_str)) {
			$('#3').html('必须以英文,数字,下划线,且长度在6~24个字符');
			$('#3').css('color','red');
		}else{
			$('#3').html('密码格式验证通过');
			$('#3').css('color','green');
		}
	})

	$('#repassword').blur(function(){
		var in_str1=$('#repassword').val();
		var in_str2=$('#password').val();
		if (in_str1!=in_str2) {
			$('#4').html('两次密码输入不一样！');
			$('#4').css('color','red');
		}else{
			$('#4').html('两次密码匹配一致');
			$('#4').css('color','green');
		}
	})

	$('#iphone').blur(function(){
		var in_str=$('#iphone').val();
		if (!isPnumber(in_str)) {
			$('#6').html('电话号码格式不正确！');
			$('#6').css('color','red');
		}else{
			$('#6').html('电话号码格式验证通过');
			$('#6').css('color','green');
		}
	})

	$('#submit').click(function(){
		var user_str=$('#username').val();
		var email_str=$('#email').val();
		var psd_str=$('#password').val();
		var repsd_str=$('#repassword').val();
		var p_str=$('#iphone').val();
		var str='';
		if (!isUsername(user_str)) {
			str+='用户名输入格式不正确！\n';
		}
		if (!isPnumber(p_str)) {
			str+='电话号码格式不正确！\n'
		}
		if (!isEmail(email_str)) {
			str+='电子邮箱输入格式不正确！\n';
		}
		if (!isPassword(psd_str)) {
			str+='密码输入格式不正确！\n';
		}
		if (psd_str!=repsd_str) {
			str+='两次密码不一样！\n';
		}

		if (str!='') {
			alert(str);
			return false;
		}
	})
})