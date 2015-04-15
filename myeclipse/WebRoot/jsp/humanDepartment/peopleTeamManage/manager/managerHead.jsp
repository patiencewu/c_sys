<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/mystyle.css" />
		<title>主页发布</title>
		<link href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
		<script language="javascript" type="text/javascript">
			function time() {
				var now = new Date();
				var year = now.getFullYear();
				var month = now.getMonth();
				var date1 = now.getDate();
				var hours = now.getHours();
				var minutes = now.getMinutes();
				document.getElementById("info1").innerHTML = year + "年" + (month + 1) + "月" + date1 + "日" + hours + "点" + minutes;
			}
		</script>

	</head>

	<body onLoad="time()" data-spy="scroll" data-target="sidebarMenu" style="background: #EDEFF0;">
		<!--start导航栏-->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="Manager_goToManagerHome.action">Brand</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="Manager_goToManagerHome.action">主页 <span class="sr-only">(current)</span></a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="Exit.action"><span class="glyphicon glyphicon-remove"></span>退出</a>
						</li>
						<!--<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">Action</a>
								</li>
								<li><a href="#">Another action</a>
								</li>
								<li><a href="#">Something else here</a>
								</li>
								<li class="divider"></li>
								<li><a href="#">Separated link</a>
								</li>
							</ul>
						</li>-->
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
		<!--end导航栏-->
		<!--start状态栏-->
		<div class="container top-margion-55">
			<div class="row bg-color">
				<div class="col-lg-3">
					<a href="Manager_goToSelfDeatail.action" class="navbar-brand"><span class="glyphicon glyphicon-user">当前用户：<s:property value="#session.name"/></span></a>
				</div>
				<div class="col-lg-3">
					<div id="info1" class="glyphicon glyphicon-time top-margion"></div>
				</div>
			</div>
			<!--end状态栏-->
			<div class="row">
				<!--start菜单-->
				<div class="col-lg-2 top-margion-20">
					<ul class="main-nav nav nav-tabs nav-stacked">
						<li>
							<a href="Manager_goToManagerHome.action">
								<i class="glyphicon glyphicon-home"></i> 首页
							</a>
						</li>
						<li>
							<a href="#Message" class="nav-header collapsed" data-toggle="collapse">
								<i class="glyphicon glyphicon-comment"></i> 消息管理
								<span class="badge pull-right">1</span>
								<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
							</a>
							<ul id="Message" class="nav nav-list secondmenu collapse">
								<li><a href="#"><i class="glyphicon glyphicon-bullhorn"></i>&nbsp;发送信息</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-envelope"></i>&nbsp;未读消息</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-ok"></i>&nbsp;已读消息</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#people" class="nav-header collapsed" data-toggle="collapse">
								<i class="glyphicon glyphicon-user"></i> 人员管理

								<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
							</a>
							<ul id="people" class="nav nav-list secondmenu collapse">
								<li><a href="DMTE_goToManageDE.action"><i class="glyphicon glyphicon-lock"></i>&nbsp;工作人员</a>
									<li><a href="DToM_goToManageMember.action"><i class="glyphicon glyphicon-thumbs-up"></i>&nbsp;入驻人员</a>
									</li>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-calendar"></i>&nbsp;值日排班</a>
								</li>
								<s:if test='#session.power == "2"'><li><a href="#"><i class="glyphicon glyphicon-floppy-saved"></i>&nbsp;人员档案</a></li></s:if>
								<li><a href="#"><i class="glyphicon glyphicon-leaf"></i>&nbsp;考勤记录</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#team" class="nav-header collapsed" data-toggle="collapse">
								<i class="glyphicon glyphicon-th"></i> 团队项目

								<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
							</a>
							<ul id="team" class="nav nav-list secondmenu collapse">
								<li><a href="#"><i class="glyphicon glyphicon-equalizer"></i>&nbsp;入驻团队</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>&nbsp;项目管理</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#source" class="nav-header collapsed" data-toggle="collapse">
								<i class="glyphicon glyphicon-gift"></i> 资源管理
								<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
							</a>
							<ul id="source" class="nav nav-list secondmenu collapse">
								<li><a href="#"><i class="glyphicon glyphicon-shopping-cart"></i>&nbsp;物资管理</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-blackboard"></i>&nbsp;办公场地</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-folder-open"></i>&nbsp;文件管理</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#study" class="nav-header collapsed" data-toggle="collapse">
								<i class="glyphicon glyphicon-edit"></i> 主页编辑
								<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
							</a>
							<ul id="study" class="nav nav-list secondmenu collapse">
								<li><a href="#"><i class="glyphicon glyphicon-send"></i>&nbsp;编辑发布</a>
								</li>
								<li><a href="#"><i class="glyphicon glyphicon-link"></i>&nbsp;友情链接</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">
								<i class="glyphicon glyphicon-education"></i> 学习园区
							</a>
						</li>
						<li>
							<a href="#">
								<i class="glyphicon glyphicon-info-sign"></i> 系统信息
							</a>
						</li>
					</ul>
				</div>
				<!--end菜单-->
		
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/bootstrap.min.js"></script>
  </body>
</html>
