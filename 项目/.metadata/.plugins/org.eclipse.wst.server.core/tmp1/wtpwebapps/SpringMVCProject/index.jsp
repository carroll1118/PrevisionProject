<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 如果web.xml中的配置是
	  <servlet-mapping>
  			<servlet-name>springDispatcherServlet</servlet-name>
  			<url-pattern>.action</url-pattern>
 	 </servlet-mapping>

	<a href="user/welcome.action">first springmvc - welcome</a>	交由springmvc处理 找 @RuestMapping映射
	<a href="user/welcome.action">first springmvc - welcome</a>交由springmvc处理  找 @RuestMapping映射
	<a href="xxx/welcome">first springmvc - welcome</a>			交由servlet处理  找url-parttern /@WebServlet()
 -->
	<a href="handler/welcome3/xyz/abcz/asb/test">33333333get - welcome</a>
	<br/>
	<a href="handler/welcome4/abc/test">4444444get - welcome</a>
		<br/>
<a href="handler/welcome5/zs">555welcome</a>
	
	<form action="handler/welcome" method="post">
		name:<input name="name"  ><br/>
		age:<input name="age"  >
		height:<input name="height"  >
		<input type="submit" value="post">
	</form>
</body>
</html>