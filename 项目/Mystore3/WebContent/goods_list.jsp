<%--
<%@page import="com.it666.domain.Books"%>
<%@page import="java.util.List"%>
 --%>  

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--设置标签图标-->
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/goods_list.css">
    <link rel="stylesheet" href="css/pageStyle.css">
</head>
<body>
<!--头部-->

<!-- 通过jsp指令导入头部 -->
<%@ include file="/header.jsp" %>

<!---->
<div id="hot_goods">
    <h3>相关图书</h3>
    <div class="hot_goods_body">
        <ul>
         <c:if test="${empty allBooks}">
                                        没有图书                       
         </c:if>
         
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

<div id="page" class="page_div"></div>
<!--尾部-->

<%@ include file="/footer.jsp" %>

<script src="js/jquery.min.js"></script>
<!-- <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script>
    //分页
    $("#page").paging({
        pageNo:,  /*当前选中的是哪一页*/
        totalPage: 5, /*共多少页*/
        totalSize: 10,/*共多少条记录*/
        callback: function(num) {
           console.log(num);
        }
    }) -->
</script>
</body>
</html>
<!-- 1.把css引入到项目 当中
2.把分页的代码写到对应的位置  <div id="page" class="page_div"></div>
3.引入js   在尾部引入js -->

<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script>
    //分页
    $("#page").paging({
        pageNo:1,  /*当前选中的是哪一页*/
        totalPage: 5, /*共多少页*/
        totalSize: 10,/*共多少条记录*/
        callback: function(num) {
           console.log(num);
        }
    })
</script>
