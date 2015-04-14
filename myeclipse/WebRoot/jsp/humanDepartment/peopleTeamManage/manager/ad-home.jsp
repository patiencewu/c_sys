<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include  file="/jsp/humanDepartment/peopleTeamManage/manager/managerHead.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
	<base href="<%=basePath%>">
		<title>主页发布</title>
	</head>

	<body style="background: #EDEFF0;">
				<!--start主面板-->
				<div class="col-lg-10 bg-color top-margion-24">
					<!--start路径导航-->
					<div class="row">
						<div class="col-lg-4">
							<ol class="breadcrumb">
								<li><a href="#">主页</a>
								</li>
								<li><a href="#">人员管理</a>
								</li>
								<li class="active">入驻人员</li>
								<li class="active">详情</li>
							</ol>
						</div>
					</div>
					<div style="border:1px; background-color:#CCC; height:1px;width:95%"></div>
					<!--end路径导航-->
					<!--star表格-->
					<div class="row">
						<div class="left-margion right-margion">
							<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<!-- Indicators -->
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
									<li data-target="#carousel-example-generic" data-slide-to="1"></li>
									<li data-target="#carousel-example-generic" data-slide-to="2"></li>
								</ol>

								<!-- Wrapper for slides -->
								<div class="carousel-inner" role="listbox">
									<div class="item active">
										<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/images/images/backgrounds/5c4d035da0efb2befb04a5286382659e.jpg" alt="...">
										<div class="carousel-caption">
											<h2>事件都去哪儿了？</h2>
										</div>
									</div>
									<div class="item">
										<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/images/images/backgrounds/01eb1c9f8278c881dd064f49396ea384.png" alt="...">
										<div class="carousel-caption">
											随便啦
										</div>
									</div>
									<div class="item">
										<img src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/images/images/backgrounds/6b935fb12c926c7e316258662b5e75b4.jpg" alt="...">
										<div class="carousel-caption">
											随便啦
										</div>
									</div>
									<p align="center">我要把你搞得不要不要的</p>
								</div>

								<!-- Controls -->
								<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
									<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
									<span class="sr-only">Previous</span>
								</a>
								<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
									<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
									<span class="sr-only">Next</span>
								</a>
							</div>
						</div>
					</div>
					<!--end表格-->
					<div class="row">
						<div class="col-lg-offset-1 col-lg-10">
							<div class="top-margion-20">
								<ul class="list-group">
									<li class="list-group-item list-group-item-heading">收到的信息</li>
									<a href="#" class="list-group-item">申请申报<span class="badge">14</span></a>
									<a href="#" class="list-group-item">工作报告</a>
									<a href="#" class="list-group-item">在线咨询</a>
								</ul>
							</div>
						</div>
					</div>
					<br />
				</div>
			</div>
		</div>
		<script>
		$('.carousel').carousel();
		</script>
	</body>

</html>