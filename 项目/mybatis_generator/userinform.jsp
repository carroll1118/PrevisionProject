<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息</title>
</head>



<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap-table.css">



<body>
<h1>用户信息</h1>

<div class="row-fluid">
    <div class="span12">
        <div class="portlet box grey">
        
		    <div class="portlet-body">
			    <table id="table-javascript" data-click-to-select="true"></table>
		    </div>

	    </div>
    </div>
    
</div>
<script type="text/javascript" src="static/jquery.min.js"></script>
<script type="text/javascript" src="static/css/bootstrap.min.js"></script>
<script type="text/javascript" src="static/css/bootstrap-table.js"></script>
<script type="text/javascript" src="static/css/bootstrap-table-zh-CN.js"></script>

<script type="text/javascript">
        var $table;
        $(function () {

            initTable();
        });
        function initTable() {
            var queryUrl = '../user/getuserinfo.do';
            $table = $('#table-javascript').bootstrapTable({
                method: 'get',
                url: queryUrl,
                height: $(window).height() - 200,
                striped: true,
                pagination: true,
                pageSize: 20,
                pageList: [20, 40, 60, 100, 200],
                search: true,
                showColumns: true,
                columns: [{
                    field: 'id',
                    title: 'ID',
                    radio: true
                }, {
                    field: 'unid',
                    title: 'ID',
                    align: 'left',
                    valign: 'bottom',
                    sortable: true
                }, {
                    field: 'business',
                    title: '专业',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }, {
                    field: 'sex',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }        
                ]
            });
        }
        
    </script>



</body>
</html>