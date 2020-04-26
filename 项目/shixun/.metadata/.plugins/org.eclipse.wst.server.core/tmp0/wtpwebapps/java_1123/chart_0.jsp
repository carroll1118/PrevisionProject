<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head> 
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" type="text/css" href="../static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../static/css/style.default.css" id="theme-stylesheet">
    <link rel="stylesheet" type="text/css" href="../static/css/index.css"/>

  </head>
  <body>
    <header class="header">   
      <nav class="navbar navbar-expand-lg">
        <div class="container-fluid d-flex align-items-center justify-content-between">
          <div class="navbar-header">
               <a href="index.html" class="navbar-brand">
              <div class="brand-text brand-big visible text-uppercase"><strong class="text-primary">大数据</strong><strong>分析平台</strong></div>
              </a>
<!-- Sidebar Toggle Btn-->
          </div>
          <div class="right-menu list-inline no-margin-bottom">    
           
            <div ><a><img src="../static/img/flags/16/CN.png" alt="English"><span class="d-none d-sm-inline-block">中文</span></a>
            </div>

          </div>
        </div>
      </nav>
    </header>
    <div class="d-flex align-items-stretch">
<!-- 侧边栏导航-->
      <nav id="sidebar">
<!-- 侧边栏标题-->
        <div class="sidebar-header d-flex align-items-center">
          
          <div class="title">
            <h1 class="h5">最刁实训组</h1>
            <p>组长：廖海波</p>
            <p>组员：<br>郭高勤、王嘉晨、张文昌、张锦辅</p>
          </div>
        </div>
        <!-- 左边菜单栏--><span class="heading">菜单栏</span>
        <ul class="list-unstyled">
          <li class="active"><a href="../page/chart_0.do"> <i class="icon-home"></i>首页 </a></li>
          <li><a href="../page/chart_1.do"> <i class="fa fa-bar-chart"></i>chart1 </a></li>
          <li><a href="../page/chart_2.do"> <i class="fa fa-bar-chart"></i>chart2 </a></li>
          <li><a href="../page/chart_3.do"> <i class="fa fa-bar-chart"></i>chart3 </a></li>
          <li><a href="../page/chart_4.do"> <i class="fa fa-bar-chart"></i>chart4 </a></li>
          <li><a href="../page/chart_5.do"> <i class="fa fa-bar-chart"></i>chart5 </a></li>
          <li><a href="../page/chart_6.do"> <i class="fa fa-bar-chart"></i>chart6 </a></li>
          <li><a href="../page/chart_7.do"> <i class="fa fa-bar-chart"></i>chart7 </a></li>
          </ul>

      </nav>
<!-- Sidebar Navigation end-侧边栏导航结束-->
      <div class="page-content">
        <div class="page-header">
          <div class="container-fluid">
            <h2 class="h5 no-margin-bottom">知乎数据分析</h2>
          </div>
           <div class="container-charts"  id="echarts" style="background: white;">
              
           </div>
        </div>
        
      </div>
    </div>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
    <script type="text/javascript" src="../static/js/echarts.js"></script>
    <script type="text/javascript">
   $(function(){
	   
	   initEcharts();
	   
   })
    
   function initEcharts()
   {
	  
	   var myChart = echarts.init(document.getElementById('echarts'));
	     // 显示标题，图例和空的坐标轴
			 myChart.setOption({
			     title: {
			         text: '粉丝人数排名'
			     },
			     tooltip: {},
			     legend: {
			         data:['人数']
			     },
			     xAxis: {
			         data: []
			     },
			     yAxis: {},
			     series: [{
			         name: '人数',
			         type: 'bar',
			         data: []
			     }]
			 });
			
			 // 异步加载数据
			 $.get('../fans/getMostFansNumUser.do').done(function (data) {
				 
				 var name=[];
				 var keys=[]
				 console.log(data)
				 
				for(var k in data){
					let d  = data[k]
					name.push(d['benotice_user'])
					keys.push(d['benotice_count'])
				}
				
			     // 填入数据
			     myChart.setOption({
			         xAxis: {
			             data: name
			         },
			         series: [{
			             // 根据名字对应到相应的系列
			             name: '人数',
			             data: keys
			         }]
			     });
			 });
	      
   }
    

 </script>
  
  </body>
  
</html>
