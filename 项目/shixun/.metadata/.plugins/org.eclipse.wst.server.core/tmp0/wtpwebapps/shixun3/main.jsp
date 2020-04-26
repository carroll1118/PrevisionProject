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
</div>

<!--  导入jquery插件文件-->
<script src="../static/jquery.min.js"></script> 
<script src="../static/echarts.min.js"></script> 
<div>
	<input  type="text" id="searchid" name="searchid"/>
	<input  type="button" id="btnsubmit" onclick="searchUsers()" value="查询"/>
</div>
<div id="searchresult">
      
</div>

<script type="text/javascript">
function searchUsers()
{
var username=$("#searchid").val();
console.log(username);
if(username==undefined||null==username||username=="")
{
	alert("搜索内容不能为空！");
}
else
{
	$.ajax({
		type: 'post',
		     url: '../qd/getusersparam.do',
		     data:JSON.stringify({"name":username}),
		     contentType:'application/json;charset=utf-8',
		     dataType: 'json',
		     success: function(dataObj) {
		     console.log(dataObj);
		     var restr="<table> <tr><td>姓名</td><td>性别</td><td>年龄 </td></tr>";
		     for(var i=0;i<dataObj.length;i++)
		     {
		        console.log(dataObj[i]); 	restr+="<tr><td>"+dataObj[i].name
		     		+"</td><td>"+dataObj[i].sex
		     		+"</td><td>"+dataObj[i].age
		     		+"</td></tr>";
		     }
		          restr+="</table>";
		     	$("#searchresult").html(restr);
				console.log(restr);

			},
		     error: function(text) {
		     console.log(text);
		 },
		});
	}

}
</script>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            tooltip: {},
            toolbox:
            {
            	 show: true,
                 showTitle: true, // 隐藏默认文字，否则两者位置会重叠
                 feature: {
                     saveAsImage: {
                         show: true,
                         title: 'Save As Image'
                     },
                     dataView: {
                         show: true,
                         title: 'Data View'
                     },
                     magicType: {
                         type: ['line', 'bar', 'stack', 'tiled']
                     },
                 }
            },
            legend: {
                data:['销量1']
            },
            xAxis: {
                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
            },
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        
        
        $(function()
        {
        	myChart.setOption(option);
        })
    </script>



</body>
</html>