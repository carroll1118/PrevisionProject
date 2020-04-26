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
    <title>Book Info</title>
    <!--设置标签图标-->
    <link rel="stylesheet" href="css/goods_list.css">
</head>
<body>

    <div>
        <ul>      
 
        <c:if test="${books!=null }" > 
            <li>
                    <img src="images/book_image/${books.book_image}" alt="">
                    <p>图书名称：${books.book_name}</p>
                    <span>作者：${books.book_author}</span>
                    <span>图书位置：${books.book_nackNo}</span>
            </li>                
         </c:if>
       
        </ul>
    </div>

</body>
</html>

