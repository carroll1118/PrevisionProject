<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>方向一Echarts练习</title>
</head>
<script src="../static/echarts.js"></script> 

<script src="../static/jquery.min.js"></script>
<body>

<h1>启迪方向一Echarts练习</h1>
<br>
<br>
<br>
<br>

  <h1>方向一Echarts练习</h1>
 <div id="main" style="width: 600px;height:400px;"></div>

<script>

var myChart = echarts.init(document.getElementById('main'));
//显示标题，图例和空的坐标轴
myChart.setOption({
 title: {
     text: '异步数据加载示例'
 },
 tooltip: {},
 legend: {
     data:['销量']
 },
 xAxis: {
     data: []
 },
 yAxis: {},
 series: [{
     name: '销量',
     type: 'line',
     data: []
 }]
});

//异步加载数据
$.get('../echarts/echartstestdata.do').done(
		function (data) {
 // 
 console.log(data);
 
 
 var names=[];    //类别数组（实际用来盛放X轴坐标值）
 var nums=[];    //销量数组（实际用来盛放Y坐标值）
 
 //封装成echarts格式的数据
 for(var key in data[0])
{
	 names.push(key);
	 nums.push(data[0][key]);

}
 
 myChart.setOption({
     xAxis: {
         data: names,   //data.categories
     },
     series: [{
         // 根据名字对应到相应的系列
         name: '销量',
         data: nums,   //data.data
     }]
 });
});

</script>


</body>
</html>