<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="zh-CN">

<script type="text/javascript">
  window.onload = function() {
   window.resizeTo(800,300);
  };
</script>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/bootstrap-theme.min.css" />
		<link rel="stylesheet" type="text/css" href="http://localhost:8080/c_sys/jsp/humanDepartment/peopleTeamManage/admin/css/mystyle.css" />
		<title>logo in</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>
		<form>
			<div class="container">
				<!--start登录-->
				<div class="alert alert-success alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span>
					</button>
					<strong>成功!</strong> 可以直接对文本进行复制，也可以在“人员管理”中查看。
				</div>
				<div class="table-responsive table-bordered">
					<table class="table">
						<thead>
							<tr>
								<th>账号</th>
								<th>密码</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><s:property value="newDM"/></td>
								<td><s:property value="newDM"/></td>
							</tr>

						</tbody>
					</table>
				</div>
				<!--end登录-->
			</div>
		</form>
		<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>

</html>