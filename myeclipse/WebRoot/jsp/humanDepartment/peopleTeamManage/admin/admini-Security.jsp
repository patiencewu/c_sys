<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
	<%@ taglib prefix="s" uri="/struts-tags" %>
		<html lang="zh-CN">

		<head>
			<meta charset="utf-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap.min.css" />
			<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap-theme.min.css" />
			<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/css/mystyle.css" />
			<title>超级管理员</title>
			<link href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap.min.css" rel="stylesheet">
			<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
			<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
			<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
		</head>
		<s:if test="message != null && message == '密码修改失败'">
		<script type="text/javascript">
		function display_alert()
		  {
 		 alert("密码修改失败！！\r\n请重新修改！！");
 		 }
		</script></s:if>
		<body  onLoad="display_alert()" class="adimin-body">
			<!--strat导航条-->
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="SupToDM_goToSuperManagerP.action">
							<img alt="Brand" src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/img/未标题-1.png">
						</a>
						<p class="navbar-text">华南农业大学创创业学院<lgall>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<s:property value="#session.name"/></lgall>
						</p>
					</div>
					<h4 class="blok-right">

							<a href="Exit.action"><span class="glyphicon glyphicon-remove"></span></a>

						</h4>
				</div>
			</nav>
			<ol class="breadcrumb" style="padding-left: 100px;">
				<li><a href="SupToDM_goToSuperManagerP.action">首页</a>
				</li>
				<li class="active">修改密码</li>
			</ol>
			<!--end导航条-->
			<div class="container">
				<!--start主面板-->
				<div class="col-lg-4 col-lg-offset-4 bg-color">
					<label>
						<h3>修改密码</h3>
					</label>
					<form action="SupToDM_changePassword.action" method="post" class="form-horizontal" role="form">
						<div class="form-group">
							<label for="inputPassword3" class="col-lg-4 control-label">原密码：</label>
							<div class="col-lg-7">
								<input type="password" class="form-control" id="inputPassword3" name="oldPassword" placeholder="请输入您的原密码">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-lg-4 control-label">新密码：</label>
							<div class="col-lg-7">
								<input type="password" class="form-control" id="inputPassword3" name="newPassword" placeholder="8-16位，由数字、字母和下划线组成">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-lg-4 control-label">确认密码：</label>
							<!-- 这里要用js来实现密码确认的检查 -->
							<div class="col-lg-7">
								<input type="password" class="form-control" id="inputPassword3" name="confirmPassword" placeholder="请再次输入您的新密码">
							</div>
						</div>
						<div class="row">
						</br>
						<div class="col-lg-offset-4 col-lg-8">
							<button type="submit" class="btn btn-default">确定</button>
							<button class="btn btn-default" href="administrator.html">取消</button>
						</div>
					    </div> 
					</form>
					<br />
					<br />
				</div>
				<!--end生成成功-->
			</div>
			<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
			<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/js/bootstrap.min.js"></script>
		</body>

		</html>