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

	<body onLoad="time()" class="adimin-body">
		<!--strat导航条-->
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/administrator.jsp">
						<img alt="Brand" src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/img/未标题-1.png">
					</a>
					<p class="navbar-text">华南农业大学创新创业学院<small>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<s:property value="#session.name"/></small>
					</p>
				</div>
				<h4 class="blok-right">
							<a href="#"><span class="glyphicon glyphicon-remove"></span></a>
						</h4>
			</div>
		</nav>
		<!--end导航条-->
		<div class="container">
			<!--start主面板-->
			<div class="row">
				<s:a action="SupToDM_goToManageDM">
					<div class="col-lg-offset-3 col-lg-2 block-center">
						<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/img/23.png" class="admini-img" />
					</div>
				</s:a>
				<s:a action="SupToDM_goToAdd">
					<div class="col-lg-2 block-center">
						<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/img/3434.png" class="admini-img" />
					</div>
				</s:a>
				<s:a action="SupToDM_goToChangePassword">
					<div class="col-lg-2 block-center">
						<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/img/12.png" class="admini-img" />
					</div>
				</s:a>
			</div>
			<!--end主面板-->
		</div>
		<script src="http://m.adpro.cn/adpro.js"></script>
		<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/js/bootstrap.min.js"></script>
	</body>

</html>