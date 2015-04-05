<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap-theme.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/mystyle.css" />
		<title>超级管理员</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>
		<script type="text/javascript">
			function opennew() {
				//				var openUrl="logoin.jsp"; //弹出窗口的url
				var us=document.getElementByName("userName").value;
				if(us==""){alert("请选择部门");return false;}
				else return true;
			}
		</script>

	<body class="adimin-body">
		<!--strat导航条-->
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="administrator.jsp">
						<img alt="Brand" src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/img/未标题-1.png">
					</a>
					<p class="navbar-text">华南农业大学创创业学院<small>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<s:property value="#session.name"/></small>
					</p>
				</div>
				<h4 class="blok-right">
							<a href="#"><span class="glyphicon glyphicon-remove"></span></a>
						</h4>
			</div>
		</nav>
		<ol class="breadcrumb" style="padding-left: 100px;">
			<li><a href="administrator.jsp">首页</a>
			</li>
			<li class="active">添加账号</li>
		</ol>
		<!--end导航条-->
		<s:form id="addForm" action="SupToDM_addNewDM.action" method="post" onsubmit="return opennew()" target="_blank">
			<div class="container">
				<!--start主面板-->
				<div class="col-lg-4 col-lg-offset-4 admini-panle">
					<label>
						<h4>请选择成成账号类型：</h4>
					</label>
					<div class="form-group">
						<label class="radio-inline">
							<input type="radio" value="111" name="dmPower" checked>人事部
						</label>
						<label class="radio-inline">
							<input type="radio" value="112" name="dmPower">行政部
						</label>
						<label class="radio-inline">
							<input type="radio" value="113" name="dmPower">财务部
						</label>
						<label class="radio-inline">
							<input type="radio" value="114" name="dmPower">宣传部
						</label>
					</div>
					<div class="btn-wrap">
						<div class="btn-group btn-group-justified">
							<s:submit value="生成"></s:submit>
							<a class="btn btn-default" href="administrator.jsp">取消</a>
						</div>
					</div>
					<br />
					<br />
				</div>
				<!--end主面板-->
			</div>
		</s:form>
		<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>

</html>