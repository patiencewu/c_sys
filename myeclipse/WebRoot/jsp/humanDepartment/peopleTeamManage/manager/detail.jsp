<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include  file="/jsp/humanDepartment/peopleTeamManage/manager/managerHead.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<base href="<%=basePath%>">
		<title>入住人员详细信息</title>
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
							<blockquote>
								<p><s:property value="member.mName"/>的详细资料：</p>
							</blockquote>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-8 col-lg-offset-2">
							<table class="table table-bordered table-condensed">
								<tbody>
									<tr>
										<th>姓名：</th>
										<td><s:property value="member.mName"/></td>
										<th>学号：</th>
										<td><s:property value="member.mStudentNumber"/></td>
									</tr>
									<tr>
										<th>性别：</th>
										<td><s:property value="member.mSex"/></td>
										<th>学院：</th>
										<td><s:property value="member.mCollege"/></td>
									</tr>
									<tr>
										<th>所属公司/团队：</th>
										<td><s:property value="member.mTeamName"/></td>
										<th>系别：</th>
										<td><s:property value="member.mDepartment"/></td>
									</tr>
									<tr>
										<th>出生年月：</th>
										<td><s:property value="member.mBirthday"/></td>
										<th>专业：</th>
										<td><s:property value="member.mMajor"/></td>
									</tr>
									<tr>
										<th>籍贯：</th>
										<td><s:property value="member.mNativePlace"/></td>
										<th>年级：</th>
										<td><s:property value="member.mGrade"/></td>
									</tr>
									<tr>
										<th>身份证：</th>
										<td><s:property value="member.mIdNumber"/></td>
										<th>学历：</th>
										<td><s:property value="member.mEducationBackground"/></td>
									</tr>
									<tr>
										<th>手机：</th>
										<td><s:property value="member.mLphone"/></td>
										<th>短号：</th>
										<td><s:property value="member.mSphone"/></td>
									</tr>
									<tr>
										<th>邮箱：</th>
										<td><s:property value="member.mEmail"/></td>
										<th>地址：</th>
										<td><s:property value="member.mAddress"/></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!--end表格-->
					<br />
				</div>
			</div>
		</div>
	</body>

</html>