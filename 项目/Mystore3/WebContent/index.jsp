<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <!--设置标签图标-->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
      <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
       <script src="js/jquery.min.js"></script>
	   <script src="js/bootstrap.js"></script>
	   <script src="js/npm.js"></script>
       <script src="js/highlight.min.js"></script>
       <script src="js/holder.min.js"></script>
       <script src="js/application.js"></script>
        <link rel="stylesheet" href="css/index.css">
    
</head>

<body>
<!-- 通过jsp指令导入头部 -->
<%@ include file="/header.jsp" %>

<!--轮播图-->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div id="ad" class="carousel-inner" type="hight=700px">
          <div class="item active">
            <img src="images/banner_01.png" alt="First slide">
          </div>
          <div class="item">
            <img src="images/banner_02.png" alt="Second slide">
          </div>
          <div class="item">
            <img src="images/banner_03.png" alt="Third slide">
          </div>
  </div>
  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div>

<!--秒杀-->
<div id="ms">
    <div class="ms_top">
        <span>本周推荐</span>
        <span>总有你喜欢的图书</span>
    </div>
    <div class="ms_body">
        <ul>
            <li>
                <a href="#">
                    <img src="images/book.jpg" alt="">
                    <p>养成良好习惯，高效管理时间</p>
                    <p>杰米・希尔</p>
                    <p>H313 /34</p>
                    <p>库存：有</p>              
                </a>
            </li>
             <li>
                <a href="#">
                    <img src="images/book.jpg" alt="">
                    <p>养成良好习惯，高效管理时间</p>
                    <p>杰米・希尔</p>
                    <p>H313 /34</p>
                    <p>库存：有</p>              
                </a>
            </li>
             <li>
                <a href="#">
                    <img src="images/book.jpg" alt="">
                    <p>养成良好习惯，高效管理时间</p>
                    <p>杰米・希尔</p>
                    <p>H313 /34</p>
                    <p>库存：有</p>              
                </a>
            </li>
             <li>
                <a href="#">
                    <img src="images/book.jpg" alt="">
                    <p>养成良好习惯，高效管理时间</p>
                    <p>杰米・希尔</p>
                    <p>H313 /34</p>
                    <p>库存：有</p>              
                </a>
            </li>
             <li>
                <a href="#">
                    <img src="images/book.jpg" alt="">
                    <p>养成良好习惯，高效管理时间</p>
                    <p>杰米・希尔</p>
                    <p>H313 /34</p>
                    <p>库存：有</p>              
                </a>
            </li>
        </ul>
    </div>
</div>
<!--热卖-->
<div id="hot_goods">
    <h3>热门图书</h3>
    <div class="hot_goods_body">
       <ul>
           <c:forEach items="${allBooks }" var="books">
            <li>
                <a href="/Mystore3/BooksInfoServlet?id=${books.book_id}">
                    <img src="images/book_image/${books.book_image}" alt="">
                    <p>图书名称：${books.book_name}</p>
                    <span>作者：${books.book_author}</span>
                    <hr>
                    <span>图书位置：${books.book_nackNo}</span>
                </a>
            </li>                
         </c:forEach>
       </ul>
    </div>
</div>
<%@ include file="/footer.jsp" %>

</body>
</html>