<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>实训一</title>
</head>
<body>
<h1>你好！实训一！</h1>
Hello ${info} !!!!!
<div>
      <div><span>显示用户表</span></div>
      <div>
      <table>
      <tr><td>姓名</td><td>性别</td><td>年龄 </td></tr>
      <c:forEach items="${userlist}" var="s">
    	<tr>
        <td>${s.name }</td>
        <td>${s.sex }</td>
        <td>${s.age }</td>
    	</tr>
     </c:forEach> 
</table> 
</div> 

<!-- <a href="echarts/gotopages.do"><h1>打开Echarts图表</h1></a> -->

<a href="echarts/gotoecharts.do"><h1>打开Echarts方向一图表</h1></a>
</div>

</body>
</html>