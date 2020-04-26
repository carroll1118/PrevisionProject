<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>	
<%
	String ctx = request.getContextPath();
	pageContext.setAttribute("ctx", ctx);
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>我的借书信息</title>

<link rel="stylesheet" href="${ctx }/css/style1.css"  type="text/css" />
<link rel="stylesheet" href="${ctx }/css/amazeui.min1.css" />
<link rel="stylesheet" href="${ctx }/css/pageStyle1.css">

</head>
<body style="background: #f3f3f3;">
    
    <!-- 通过jsp指令导入头部 -->
    <%@ include file="/header_books.jsp" %>
	

	<div class="goods_list">
		<ul class="title_ul">
			<li>序号</li>
			<li>图书图片</li>
			<li>图书名称</li>
			<li>结束时间</li>
			<li>还书时间</li>	
		</ul>


		<%-- <c:forEach items="${allBooks }" var="books" varStatus="status">
		
		<ul class="list_goods_ul">
			<li>${status.index + 1}</li>
			<li><img src="${ctx }/images/book_image/${books.book_image}" ></li>
			<li>${books.book_name }</li>
			<li>${books.book_price }</li>
			<li><a href="${ctx }/BooksEditUIServlet?id=${books.book_id}"><img class="img_icon" src="${ctx }/admin/images/edit_icon.png" ></a></li>
			<li><a href="${ctx }/BooksDelServlet?id=${books.book_id}"><img class="img_icon" src="${ctx }/admin/images/delete_icon.png"></a></li>
		</ul>
		</c:forEach> --%>
		<ul>
		    <li>1</li>
			<li><img src="images/book_image/book1.jpg" alt=""></li>
			<li>养成良好习惯，高效管理时间</li>
			<li>2019-08-08</li>
			<li>2019-09-01</li>
		</ul>
		<ul>
		    <li>2</li>
			<li><img src="images/book_image/book2.jpg" alt=""></li>
			<li>呐喊――大屠杀回忆录</li>
			<li>2019-08-09</li>
			<li>2019-09-02</li>
		</ul>
		<ul>
		    <li>3</li>
			<li><img src="images/book_image/book3.jpg" alt=""></li>
			<li>我允许你，在我心上行走</li>
			<li>2019-08-10</li>
			<li>2019-09-03</li>
		</ul>
		
	</div>

	

</body>
</html>