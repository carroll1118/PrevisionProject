<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书馆</title>
    <!--设置标签图标-->
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
</head>

<body>

<!--头部-->
<div id="header">
    <!--顶部-->
    <div class="header_top">
        <div class="header_top_center">
            <div class="h_top_left">
                欢迎来到知识的海洋
            </div>
            <div class="h_top_right">
            
            <!-- 有没有用户 session -->
           
           
            <c:if  test="${empty user}">
                    <a href="login.jsp">登录</a>
                   <a href="regist.jsp">注册</a>
            </c:if>
            
             <c:if  test="${!empty user}">
                                                   欢迎：${user.user_name}
                   <a href="/Mystore3/QuitServlet">退出</a>
            </c:if>
      
                <a href="#">收藏</a>
                <a href="user_book_list.jsp">我的订单</a>
            </div>
        </div>
    </div>
        <div class="header_center">
        <div class="h_c_logo">
            <img src="images/logo.png" alt="">
        </div>

        <div class="h_c_search">
            <form action="/Mystore3/BooksSearchServlet" >
                <input type="text" name="search_name" placeholder="输入你想查找的书籍名..." class="t_input">
                <input type="submit" class="t_button" vlaue="搜索">
            </form>
        </div>

        <div class="h_c_code">
            <img src="images/pcode.png" alt="">
        </div>
    </div>
    <!--导航-->
    <div class="nav">
        <ul>
            <li><a href="/Mystore3/BooksHotServlet">首页</a></li>
            <li><a href="/Mystore3/BooksServlet?cid=1">政治与法律</a></li>
            <li><a href="/Mystore3/BooksServlet?cid=2">生物科学</a></li>
            <li><a href="/Mystore3/BooksServlet?cid=3">计算机</a></li>
            <li><a href="/Mystore3/BooksServlet?cid=4">历史地理</a></li>
            <li><a href="/Mystore3/BooksServlet?cid=5">其他</a></li>
        </ul>
    </div>
    
    

</div>