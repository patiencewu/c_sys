<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	
	<body class="adimin-body">
		<!--strat导航条-->
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="SupToDM_goToSuperManagerP.action">
						<img alt="Brand" src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/img/未标题-1.png">
					</a>
					<p class="navbar-text">华南农业大学创创业学院<small>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<s:property value="#session.name"/></small>
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
			<li class="active">人员管理</li>
		</ol>
		<!--end导航条-->
			<div class="container">
				<!--start主面板-->
				<div class="table-responsive bg-color">
					<table class="table">
						<thead>
							<tr>
								<th>姓名</th>
								<th>账号</th>
								<th>密码</th>
								<th>部门</th>
								<th>性别</th>
								<th>手机</th>
								<th>短号</th>
								<th>邮箱</th>
								<th>地址</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="pageResults.results" status="stuts">
							<tr>
								<td><s:property value="dmName"/></td>
								<td><s:property value="pageResults1.results[#stuts.index].upUser"/></td>
								<td><s:property value="pageResults1.results[#stuts.index].upPassword"/></td>
								<td><s:if test="dmDepartmentId == 1">人事部</s:if ><s:elseif test="dmDepartmentId == 2">行政部</s:elseif><s:elseif test="dmDepartmentId == 3">财务部</s:elseif><s:elseif test="dmDepartmentId == 4">宣传部</s:elseif></td>
								<td><s:property value="dmSex"/></td>
								<td><s:property value="dmLphone"/></td>
								<td><s:property value="dmSphone"/></td>
								<td><s:property value="dmEmail"/></td>
								<td><s:property value="dmAddress"/></td>
								<td><a href='SupToDM_deleteDM.action?userName=<s:property value="pageResults1.results[#stuts.index].upUser"/>'>注销</a></td>
							</tr>
							</s:iterator>
							<s:iterator value="pageResults2.results">
							<tr>
								<td>新用户</td>
								<td><s:property value="upUser"/></td>
								<td><s:property value="upPassword"/></td>
								<td><s:if test="upPower == 110">无部门</s:if ><s:if test="upPower == 111">人事部</s:if ><s:elseif test="upPower == 112">行政部</s:elseif><s:elseif test="upPower == 113">财务部</s:elseif><s:elseif test="upPower == 114">外宣部</s:elseif></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td><a href='SupToDM_deleteDM.action?userName=<s:property value="upUser"/>'>注销</a></td>
							</tr>
				
							</s:iterator>
						</tbody>
					</table>
				</div>
				<div style="border:1px; background-color:#CCC; height:1px;width:100%"></div>
				<div class="row bg-color">
				</br>
					<div class="col-lg-offset-1 col-lg-3">
						<FORM action="SupToDM_addNewDM.action" method="post">
						<label class="glyphicon glyphicon-plus">新增用户</label>
							<select name="dmPower">
								<option value="110">无部门</option>
								<option value="111">人事部</option>
								<option value="112">行政部</option>
								<option value="114">外宣部</option>
								<option value="113">财务部</option>
							</select>
							<button type="submit">添加</button>
						</FORM>
					</div>	
					</br>
					</br>
				</div>
				<!--end主面板-->
			</div>
		<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/admin/js/bootstrap.min.js"></script>
	</body>

</html>