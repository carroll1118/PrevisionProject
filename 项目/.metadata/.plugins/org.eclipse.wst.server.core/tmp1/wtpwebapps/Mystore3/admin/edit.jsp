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
    <title>Title</title>
    <link rel="stylesheet" href="${ctx }/admin/css/style.css" type="text/css" />
    <link rel="stylesheet" href="${ctx }/admin/css/amazeui.min.css" />
</head>
<body>

<div class="main_top">
    <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">更新商品</strong><small></small></div>
    </div>
    <hr>
	<div class="edit_content">
		<form action="${ctx }/GoodsAddServlet" method="post" id="add_form" style="background: none; width: 700px;">
		<div class="item1">
			<div>
                <span>国际编号：</span>
                <input type="text" class="am-form-field" name="name">
            </div>
            <div>
                <span>图书名称：</span>
                <input type="text" class="am-form-field" name="name">&nbsp;&nbsp;
            </div>
            <div>
                <span>图书作者：</span>
                <input type="text" class="am-form-field" name="price">
            </div>
            <div>
                <span>图书价格：</span>
                <input type="text" class="am-form-field" name="price">
            </div>

        </div>

        <div class="item1">
            <div>
                <span>图书位置：</span>
                <input type="text" class="am-form-field" name="price">
            </div>
            <div>
                <span>图书状态：</span>
                <input type="text" class="am-form-field" name="price">
            </div>
            <div>
                <span>图书版本：</span>
                <input type="text" class="am-form-field" name="price">
            </div>
        	<div>
        		<span>所属分类：</span>
                 <select id="category_select" name="cid">
                 
                 	<c:forEach items="${allCategory }" var="category">
                 	 <option value="${category.cid }">${category.cname }</option>
                 	</c:forEach>
                 	
                 </select>
                 &nbsp;
        	</div>
        	
        	<div>
        		<span>是否热门：</span>
                 <select id="category_select" name="is_hot">
                    <option value="0">否</option>
                     <option value="1">是</option>
                 </select>
        	</div> 
        </div>  
        <div class="item1">
        	   <div>
                <span>图书图片：</span>
                <input type="text" class="am-form-field" name="price">
            </div>
             <div class="item1">
                <span>入库日期：</span>
                <input type="Date" name="image" />
             </div> 
        </div>
         <hr>
        <div class="item1 item_desc">
            <span>图书描述：</span>
         <textarea  id="gdesc" name="gdesc" rows="3" cols="50"></textarea>
        </div>
        
        <button class="am-btn am-btn-default" type="button" id="add">添加</button>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <button class="am-btn am-btn-default" type="button" id="reset">重置</button>
	</form>
   </div>

</div>

<script src="${ctx }/admin/js/jquery.min.js"></script>

<script>
	
	$(function () {
        
		 $("#edit").click(function () {
		        //让表单提交 GoodsEditServlet
		        //获取表单  让其提交
		        $("#edit_form").submit();
		  });
		 
		 //让value的值等于商品is_hot的option成为选中状态
		 $("#isHotSel option[value=${goods.is_hot}]").prop("selected",true);
		
		 $("#categorySel option[value=${goods.cid}]").prop("selected",true);
		 
    });

   
    
</script>
</body>
</html>