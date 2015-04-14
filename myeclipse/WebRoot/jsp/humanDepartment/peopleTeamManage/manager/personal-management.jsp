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
							</ol>
						</div>
						<div class="col-lg-offset-5 col-lg-2 top-margion-5">
							<label class="glyphicon glyphicon-filter">筛选：</label>
							<select name="">
								<option value="">宣传部</option>
								<option value="">人事部</option>
								<option value="">行政部</option>
							</select>
						</div>
					</div>
					<div style="border:1px; background-color:#CCC; height:1px;width:95%"></div>
					<!--end路径导航-->
					<!--star表格-->
					<div class="row">
						<div class="left-margion right-margion">
							<div class="table-responsive">
								<table class="table table-condensed table-hover">
									<thead>
										<tr>
											<th>姓名</th>
											<th>性别</th>
											<th>团队</th>
											<th>手机</th>
											<th>短号</th>
											<th>邮箱</th>
											<th>地址</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									<s:iterator value="pageResults.results">
										<tr>
											<td><s:property value="mName"/></td>
											<td><s:property value="mSex"/></td>
											<td><s:property value="mTeamName"/></td>
											<td><s:property value="mLphone"/></td>
											<td><s:property value="mSphone"/></td>
											<td><s:property value="mEmail"/></td>
											<td><s:property value="mAddress"/></td>
											<td><a href='DToM_checkTheDetail.action?id=<s:property value="mId"/>'>详情</a></td>
										</tr>
										</s:iterator>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!--end表格-->
					<br />
					<br />
				</div>
			</div>
		</div>
		<!-- sometime later, probably inside your on load event callback -->
	</body>

</html>