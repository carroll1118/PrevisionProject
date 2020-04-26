<%--
<%@page import="com.it666.domain.Goods"%>
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

<!--热卖-->
<div id="hot_goods">
    <h3>热卖商品</h3>
    <div class="hot_goods_body">
        <ul>
        <%--
           <%
            //从域当中取数据
           List<Goods>  allGoods = (List<Goods>)request.getAttribute("allGoods");
           System.out.println(allGoods);
           if(allGoods != null){
        	   for(Goods pro: allGoods){
        		   
        		   out.write("<li>");
        		   out.write("<a href=''>");
        		   out.write("<img src='images/goods/"+pro.getImage()+"' alt=''>");
        		   out.write("<p>"+pro.getName()+"</p>");
        		   out.write("<i class='yuan'>￥</i><span class='price'>"+pro.getPrice()+"</span>");
        		   out.write("</a>");
        		   out.write("</li>");
        		   
        	   }
           }else{
        	   out.write("没有商品");
           }
        %>
        
        
         --%>
         
         <c:if test="${empty allGoods}">
                                        没有商品
         </c:if>
         
         <c:forEach items="${allGoods }" var="goods">
            <li>
                <a href="">
                    <img src="images/goods/${goods.image }" alt="">
                    <p>${goods.name}</p>
                    <i class="yuan">￥</i><span class="price">${goods.price}</span>
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
<script type="text/javascript" src="js/paging.js"></script>
<script>
    //分页
    $("#page").paging({
        pageNo:3,  /*当前选中的是哪一页*/
        totalPage: 15, /*共多少页*/
        totalSize: 300,/*共多少条记录*/
        callback: function(num) {
           console.log(num);
        }
    })
</script>
</body>
</html>

<!--
1.把css引入到项目 当中
2.把分页的代码写到对应的位置  <div id="page" class="page_div"></div>
3.引入js   在尾部引入js

<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script>
    //分页
    $("#page").paging({
        pageNo:3,  /*当前选中的是哪一页*/
        totalPage: 15, /*共多少页*/
        totalSize: 300,/*共多少条记录*/
        callback: function(num) {
           console.log(num);
        }
    })
</script>

-->