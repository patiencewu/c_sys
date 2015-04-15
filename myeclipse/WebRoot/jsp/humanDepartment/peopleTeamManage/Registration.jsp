<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/mystyle.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/supersized.css" />
		<title>注册</title>
		<link href="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/css/bootstrap.min.css" rel="stylesheet">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>

      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>

      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->
	</head>

	<body>
		<div class="container">
			<div class="row top-margion">
				<div class="alert transparent font-color" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span>
					</button>
					<strong>注意：</strong> Better check yourself, you're not looking too good.
				</div>
			</div>
			<form action="Register_enroll.action" method="post">
				<div class="row">
					<!--start账户信息-->
					<div class="col-lg-3">
						<div class="box-reg transparent">
							<h2 align="center" class="font-color top-margion">账号信息<small>必填</small></h2>
							<br />
							<div class="form-horizontal" role="form">
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">姓名:</label>
									<div class="col-lg-8">
										<input class="form-control" name="name">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">账号:</label>
									<div class="col-lg-8">
										<input class="form-control" name="userName" placeholder="8-16位，数字、字母、下划线">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">密码:</label>
									<div class="col-lg-8">
										<input type="password" name="password" class="form-control" placeholder="请输入您的密码">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">确认密码:</label>
									<div class="col-lg-8">
										<input type="password" name="repassword" class="form-control" placeholder="请再次输入您的密码">
									</div>
								</div>
								<br />
							</div>
						</div>
					</div>
					<!--end账户信息-->
					<!--start用户信息-->
					<div class="col-lg-3 col-lg-offset-1">
						<div class="box-reg transparent">
							<h2 align="center" class="font-color top-margion">用户信息<small>*号必填</small></h2>
							<br />
							<div class="form-horizontal" role="form">
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">*手机:</label>
									<div class="col-lg-8">
										<input class="form-control" name="lphone">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">短号:</label>
									<div class="col-lg-8">
										<input class="form-control" name="sphone" placeholder="华农短号">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">*邮箱:</label>
									<div class="col-lg-8">
										<input class="form-control" name="email">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">籍贯:</label>
									<div class="col-lg-8">
										<input class="form-control" name="nativePlace">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">*身份证:</label>
									<div class="col-lg-8">
										<input class="form-control" name="idNumber">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">生日:</label>
									<div class="col-lg-8">
										<input type="date" name="birthDay">
									</div>
								</div>
								<div class="form-group slection-position">
									<label class="font-color">&nbsp;&nbsp;&nbsp;&nbsp;性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<label class="radio-inline font-color">
											<input type="radio" value="boy" name="sex">男性
										</label>
										<label class="radio-inline font-color">
											<input type="radio" value="girl" name="sex">女性
										</label>
									</label>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">住址:</label>
									<div class="col-lg-8">
										<input class="form-control" name="address">
									</div>
								</div>
							</div>
							<br />
						</div>
					</div>
					<!--end用户信息-->
					<!--start学校信息-->
					<div class="col-lg-3 col-lg-offset-1">
						<div class="box-reg transparent">
							<h2 align="center" class="font-color top-margion">在校情况<small>必填</small></h2>
							<br />
							<div class="form-horizontal" role="form">
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">学号:</label>
									<div class="col-lg-8">
										<input class="form-control" name="studentNumber">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">学院:</label>
									<div class="col-lg-8">
										<select class="form-control" name="college">
											<option value="理学院">理学院</option>
											<option value="数信学院">数信学院</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">年级:</label>
									<div class="col-lg-8">
										<select class="form-control" name="grade">
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
									<label class="col-lg-3 control-label font-color">系别:</label>
									<div class="col-lg-8">
										<select class="form-control" name="department">
											<option  value="化学系">化学系</option>
											<option value="数学系">数学系</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">专业:</label>
									<div class="col-lg-8">
										<select class="form-control" name="major">
											<option value="信科">信科</option>
											<option value="计机">计机</option>
											<option value="网络">网络</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-3 control-label font-color">学历:</label>
									<div class="col-lg-8">
										<select class="form-control" name="educationBackground">
											<option value="本科">本科</option>
											<option value="研究生">研究生</option>
										</select>
									</div>
								</div>
							</div>
							<br />
							<div class="row">
								<div class="col-lg-3"></div>
								<div class="col-lg-3">
									<button type="submit" class="btn btn-primary">提交</button>
								</div>
								<div class="col-lg-1"></div>
								<div class="col-lg-3">
									<button type="button" onclick="location.href='${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/login.jsp'" class="btn btn-primary">取消</button>
								</div>
							</div>
							<br />
						</div>
					</div>
				</div>
			</form>
			<!--end在校信息-->
		</div>
		<!-- Javascript -->
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/supersized.3.2.7.min.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/supersized-init.js"></script>
		<script src="${pageContext.request.contextPath}/jsp/humanDepartment/peopleTeamManage/js/birthday.js"></script>
		<script>
			$(function() {
				$.ms_DatePicker({
					YearSelector: ".sel_year",
					MonthSelector: ".sel_month",
					DaySelector: ".sel_day"
				});
			});
		</script>
	</body>

</html>