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
		<link href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap.min.css" rel="stylesheet">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

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
			<li class="active">修改密码</li>
		</ol>
		<!--end导航条-->
		<div class="container">
			<!--start主面板-->
			<div class="col-lg-4 col-lg-offset-4 admini-panle">
				<label>
					<h3>修改密码</h3>
				</label>
				<form action="SupToDM_changePassword.action" method="post" class="form-horizontal" role="form">
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-4 control-label">原密码：</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="inputPassword3" name="oldPassword" placeholder="请输入您的原密码">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-4 control-label">新密码：</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="inputPassword3" name="newPassword" placeholder="8-16位，由数字、字母和下划线组成">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-4 control-label">确认密码：</label><!-- 这里要用js来实现密码确认的检查 -->
						<div class="col-sm-8">
							<input type="password" class="form-control" id="inputPassword3" name="confirmPassword" placeholder="请再次输入您的新密码">
						</div>
					</div>

					<div class="btn-wrap">
						<div class="btn-group btn-group-justified">
							<s:submit class="btn btn-default" value="确定"></s:submit>
							<a class="btn btn-default" href="administrator.jsp">取消</a>
						</div>
					</div>
				</form>
				<br />
				<br />
			</div>
			<!--end生成成功-->
		</div>
		<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>

</html>