<%@ page contentType="text/html; charset=utf8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">

	<head>
		<meta charset="utf8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/mystyle.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/supersized.css" />
		<title>登录</title>
		<link href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" rel="stylesheet">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>
	<s:if test="message != null">
	<script type="text/javascript">
	function display_alert()
	  {
 	 alert("资料修改成功！！\r\n请用新账号密码登陆！！");
 	 }
	</script></s:if>
	<body onLoad="display_alert()">
		<div class="container">
			<div class="row">
				<div class="col-lg-offset-7 col-lg-3">
					<div class="box transparent">
						<h2 align="center" class="font-color top-margion">用户登录</h2>
						<br />
						<br />
						<form class="form-horizontal" role="form" method="post" action="Login.action">
							<div class="form-group">
								<label class="col-lg-3 control-label font-color">账号：</label>
								<div class="col-lg-8">
									<input name="userName" class="form-control"  placeholder="请输入账号">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label font-color">密码：</label>
								<div class="col-lg-8">
									<input type="password" name="password" class="form-control"  placeholder="请输入您的密码">
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-offset-2 col-lg-10">
									<div class="checkbox">
										<label class="font-color">
											<input type="checkbox"> 记住密码
										</label>
									</div>
								</div>
							</div>
							<br />
							<div class="row">
								<div class="col-lg-3"></div>
								<div class="col-lg-3">
									<button type="submit" class="btn btn-primary">登录</button>
								</div>
								<div class="col-lg-1"></div>
								<div class="col-lg-3">
									<button type="button" onclick="location.href='Register_goToRegister.action'" class="btn btn-primary">注册</button>
								</div>
							</div>
						</form>
						<br />
						<br />
					</div>
				</div>
			</div>
		</div>
		<!-- Javascript -->
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/jquery.min.js"></script>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/bootstrap.min.js"></script>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/supersized.3.2.7.min.js"></script>
		<script src="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/js/supersized-init.js"></script>
	</body>

</html>