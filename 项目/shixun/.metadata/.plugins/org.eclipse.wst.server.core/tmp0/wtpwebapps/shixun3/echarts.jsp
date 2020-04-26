<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Echart 异步加载测试</title>
</head>

<!--  导入jquery插件文件-->
<script src="../static/jquery.min.js"></script> 
<!-- <script src="../static/echarts.min.js"></script>  -->
<script src="../static/echarts.js"></script> 
<body>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    
    <script type="text/javascript">
        
        var myChart = echarts.init(document.getElementById('main'));
         // 显示标题，图例和空的坐标轴
         myChart.setOption({
             title: {
                 text: '异步数据加载示例'
             },
             tooltip: {},
             grid:{
            	 show:true
             },
             legend: {
                 data:['销量']
             },
             toolbar:
             {
            	 show:true,
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
             xAxis: {
                 data: []
             },
             yAxis: {},
             series: [{
                 name: '销量',
                 type: 'bar',
                 data: []
             }]
         });
         
         
         
         
         //ajax 提交
         function getData()
         {
        	 var names=[];    //类别数组（实际用来盛放X轴坐标值）
             var nums=[];    //销量数组（实际用来盛放Y坐标值）
             
             $.ajax({
             type : "post",
             async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
             url : "../echarts/getEchartsData.do",    //请求发送到TestServlet处
             data : {},
             dataType : "json",        //返回数据形式为json
             success : function(result) {
                 if (result) {
                        /* for(var i=0;i<result.length;i++){       
                           names.push(result[i].key);    //挨个取出类别并填入类别数组
                         }
                        for(var i=0;i<result.length;i++){       
                            nums.push(result[i].num);    //挨个取出销量并填入销量数组
                          } */
                          
                    for (var key in result[0]) 
                    {
                       names.push(key);
                       nums.push(result[0][key]); 
                    }
                  	myChart.hideLoading();    //隐藏加载动画
                  	myChart.setOption({        //加载数据图表
                      xAxis: {
                          data: names
                      },
                      series: [{
                          // 根据名字对应到相应的系列
                          name: '销量',
                          data: nums
                      }]
                  });
                        
                 }
             
            },
             error : function(errorMsg) {
                 //请求失败时执行该函数
             alert("图表请求数据失败!");
             myChart.hideLoading();
             }
        })
         }
         
         //调用自带方法
         function getEchartData()
         {
	         $.get('../echarts/getEchartsData.do').done(function (result) {		
	        	 console.log(result);
				//resule = JSON.parse(resule);//把string字符串转换为json数组
				var names=[];    //类别数组（实际用来盛放X轴坐标值）
	            var nums=[];    //销量数组（实际用来盛放Y坐标值）
				for (var key in result[0]) 
	             {
	                names.push(key);
	                nums.push(result[0][key]); 
	             }
				myChart.hideLoading();    //隐藏加载动画
				myChart.setOption({
					xAxis: {
						name:'种类',
						data: names
					},
					grid:{
		            	 show:true
		             },
		             toolbar:
		             {
		            	 show:true,
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
					yAxis: {
						position:'left',
						type:'value',
						offset:0,
						name:'百分比'
					},
					series: [{
						name: '销量',
						type: 'bar',
						data: nums
					}]
				});
			});
         }
         
         
         $(function(){
        	 getEchartData();
        	 //getData();
        	 myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
        	 
         })

         
    </script>

</body>
</html>