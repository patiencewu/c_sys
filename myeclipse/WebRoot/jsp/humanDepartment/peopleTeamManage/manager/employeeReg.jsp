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
		<title>HONE</title>
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
 	 alert("您好，您是首次登陆，请先修改资料信息!!\r\n然后才可以继续进行其他操作！！");
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
						</div>
					</div>
					<div style="border:1px; background-color:#CCC; height:1px;width:95%"></div>
					<!--end路径导航-->
					<!--star表格-->
					<form action="Register_employeeEnroll.action" method="post">
					<div class="row">
						<div class="col-lg-5 col-lg-offset-4">
							<div class="box-reg">
								<div class="form-horizontal" role="form">
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">新账号:</label>
										<div class="col-lg-9">
											<input name="userName" value='<s:property value="userName"/>' type="text" class="form-control" placeholder="请输入您新账号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">密码:</label>
										<div class="col-lg-9">
											<input name="password" type="password" class="form-control" placeholder="请输入您新密码">
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
											<input name="name" type="text" class="form-control" placeholder="请输入您姓名">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*学号:</label>
										<div class="col-lg-9">
											<input name="studentNumber" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*学院:</label>
										<div class="col-lg-9">
											<input name="college" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*年级:</label>
										<div class="col-lg-9">
											<select name="grade" class="form-control">
												<script>
													var now = new Date();
													var y = now.getFullYear();
													for (i = y; i >= y - 5; i--) {
														document.write("<option value='" + i + "'>" + i + "</option>")
													}
												</script>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*系别:</label>
										<div class="col-lg-9">
											<input name="department" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*专业:</label>
										<div class="col-lg-9">
											<input name="major" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">班级:</label>
										<div class="col-lg-9">
											<input name="clazz" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">学历:</label>
										<div class="col-lg-9">
											<input name="educationBackground" class="form-control">
										</div>
									</div>
									<s:if test="#session.power < 100">
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*团队名:</label>
										<div class="col-lg-9">
											<input class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">类型:</label>
										<div class="col-lg-9">
											<input class="form-control" disabled="disabled" placeholder="队长">
										</div>
									</div>
									</s:if>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*手机:</label>
										<div class="col-lg-9">
											<input  name="lphone" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">短号:</label>
										<div class="col-lg-9">
											<input  name="sphone" class="form-control" placeholder="华农短号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*邮箱:</label>
										<div class="col-lg-9">
											<input name="email" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">籍贯:</label>
										<div class="col-lg-9">
											<input name="nativePlace" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">*身份证:</label>
										<div class="col-lg-9">
											<input name="idNumber" class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label font-color1">生日:</label>
										<div class="col-lg-9">
											<input type="date" name="birthDay" value="" />
										</div>
									</div>
									<div class="form-group slection-position">
										<label class="font-color1">&nbsp;&nbsp;&nbsp;&nbsp;性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<label class="radio-inline font-color1">
												<input type="radio" value="男" name="sex">男生
											</label>
											<label class="radio-inline font-color1">
												<input type="radio" value="女" name="sex">女生
											</label>
										</label>
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