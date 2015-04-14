<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/mystyle.css" />
		<title>资料修改</title>
		<link href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>
	<script type="text/javascript">
	function display_alert()
	  {
 	 alert("这位老师您好，您是首次登陆系统，请先修改资料信息!!\r\n然后您才可以继续！！");
 	 }
	</script>
	<body onLoad="display_alert()" class="body-bg">
		<div class="container top-margion-55">
			<div class="row">
				<!--start主面板-->
				<div class="col-lg-10 bg-color top-margion-24">
					<div class="row">
						<!--start主面板-->
						<div class="col-lg-10 bg-color top-margion-24">
							<!--start路径导航-->
							<s:if test="#session['userName']!=null">
							<div class="row">
								<div class="col-lg-4">
									<ol class="breadcrumb">
										<li><a href="#">主页</a>
										</li>
										<li><a href="#">个人信息</a>
										</li>
										<li class="active">修改资料</li>
									</ol>
								</div>
							</div>
							</s:if>
						</div>
					</div>
					<div style="border:1px; background-color:#CCC; height:1px;width:95%"></div>
					<!--end路径导航-->
					<!--star表格-->
					<form action="Register_teacherEnroll.action" method="post">
					<div class="row">
						<div class="col-lg-5 col-lg-offset-4">
							<div class="box-reg">
								<div class="form-horizontal" role="form">
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">新账号:</label>
										<div class="col-lg-9">
											<input value='<s:property value="userName"/>' name="userName" type="text" class="form-control" placeholder="请输入您的新账号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">密码:</label>
										<div class="col-lg-9">
											<input name="password" type="password" class="form-control" placeholder="请输入您的新密码">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">确认密码:</label>
										<div class="col-lg-9">
											<input type="password" class="form-control" placeholder="请再次输入您的密码">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">姓名:</label>
										<div class="col-lg-9">
											<input value='<s:property value="name"/>' name="name" type="text" class="form-control" placeholder="请输入您的姓名">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*手机:</label>
										<div class="col-lg-9">
											<input name="lphone" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label name="sphone" class="col-lg-3 control-label font-color1">短号:</label>
										<div class="col-lg-9">
											<input class="form-control" placeholder="华农短号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*邮箱:</label>
										<div class="col-lg-9">
											<input name="email" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">住址:</label>
										<div class="col-lg-9">
											<input name="address" class="form-control">
										</div>
									</div>
								</div>
							</div>
						</div>
					<div class="row">
						<div class="col-lg-3 col-lg-offset-6">
							<button type="submit" class="btn btn-primary">提交</button>
							<button type="button" class="btn btn-primary">取消</button>
						</div>
					</div>
					<br />
				</div>
				</form>
			</div>
		</div>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/jquery.min.js"></script>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/bootstrap.min.js"></script>
	</body>

</html>