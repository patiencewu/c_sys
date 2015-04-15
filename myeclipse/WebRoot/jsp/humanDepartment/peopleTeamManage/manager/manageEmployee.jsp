<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include  file="/jsp/humanDepartment/peopleTeamManage/manager/managerHead.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<base href="<%=basePath%>">
		<title>主页发布</title>
		<script language="javascript" type="text/javascript">
			document.onclick = delete_confirm;

			function delete_confirm(e) {
				if (event.srcElement.outerText == "注销") {
					event.returnValue = confirm("注销后不可恢复，你确认要注销此人吗？");
				}
			}
		
			function seletDepartment(){
				var obj=document.getElementById('departmentSelect');
				var index=obj.selectedIndex; //序号，取当前选中选项的序号
				var val = obj.options[index].value;
				window.location.href="DMTE_goToManageDE.action?departmentId="+val;
			}
		</script>
	</head>

	<body style="background: #EDEFF0;">
				<!--start主面板-->
				<div class="col-lg-10 bg-color top-margion-24">
					<!--start路径导航-->
					<div class="row">
						<div class="col-lg-4">
							<ol class="breadcrumb">
								<li><a href="#">主页</a></li>
								<li><a href="#">人员管理</a></li>
								<li class="active"><a href="DMTE_goToManageDE.action">工作人员</a></li>
							</ol>
						</div>
						<div class="col-lg-offset-5 col-lg-3 top-margion-5">
							<label class="glyphicon glyphicon-filter">筛选：</label>
							<select id="departmentSelect" onChange="seletDepartment()">
								<option value="0">请选择</option>
								<option value="0">全部</option>
								<option value="4">外宣部</option>
								<option value="1">人事部</option>
								<option value="2">行政部</option>
								<option value="3">财务部</option>
							</select>
						</div>
					</div>
					<div style="border:1px; background-color:#CCC; height:1px; width:95%">
					</div>
					<!--end路径导航-->
					<!--star表格-->
					<div class="row">
						<div class="left-margion right-margion">
							<div class="table-responsive">
								<table class="table table-condensed table-hover">
									<thead>
										<tr>
											<th>姓名</th>
											<s:if test='#session.power == "2"'><th>账号</th></s:if>
											<s:if test='#session.power == "2"'><th>密码</th></s:if>
											<th>部门</th>
											<th>性别</th>
											<th>手机</th>
											<th>短号</th>
											<th>邮箱</th>
											<th>地址</th>
											<s:if test='#session.power == "2"'><th>操作</th></s:if>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="pageResults.results" status="stuts" var="men">
										<tr>
											<td><s:property value="deName"/></td>
											<s:if test='#session.power == "2"'><td><s:property value='pageResults1.results.{?#this.upId == #men.deId}.{upUser}[0]'/></td></s:if><!--<s:property value="persons.{?#this.name=='pla1'}.{age}[0]"/>-->
											<s:if test='#session.power == "2"'><td><s:property value="pageResults1.results.{?#this.upId == #men.deId}.{upPassword}[0]"/></td></s:if>
											<td><s:if test="deDepartmentId == 1">人事部</s:if ><s:elseif test="deDepartmentId == 2">行政部</s:elseif><s:elseif test="deDepartmentId == 3">财务部</s:elseif><s:elseif test="deDepartmentId == 4">宣传部</s:elseif></td>
											<td><s:property value="deSex"/></td>
											<td><s:property value="deLphone"/></td>
											<td><s:property value="deSphone"/></td>
											<td><s:property value="deEmail"/></td>
											<td><s:property value="deAddress"/></td>
											<s:if test='#session.power == "2"'><td><a href='DMTE_deleteDE.action?userName=<s:property value="pageResults1.results.{?#this.upId == #men.deId}.{upUser}[0]"/>' data-toggle="modal" onClick="delete_confirm">注销</a></td></s:if>
										</tr>
										</s:iterator>
										<s:if test='#session.power == "2"'><s:iterator value="pageResults2.results">
										<tr>
											<td>新用户</td>
											<td><s:property value="upUser"/></td>
											<td><s:property value="upPassword"/></td>
											<td><s:if test="upPower == 121">人事部</s:if ><s:elseif test="upPower == 122">行政部</s:elseif><s:elseif test="upPower == 123">财务部</s:elseif><s:elseif test="upPower == 124">宣传部</s:elseif></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td><a href='DMTE_deleteDE.action?userName=<s:property value="upUser"/>' data-toggle="modal" onClick="delete_confirm">注销</a></td>
										</tr>
										</s:iterator></s:if>
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
		<div class="modal fade" id="mymodal-data" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">操作提示！</h4>
					</div>
					<div class="modal-body">
						<p>该操作无法撤销，是否注销该用户？</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-danger">注销</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
					</div>
				</div>
			</div>
		</div>
		
		<!-- sometime later, probably inside your on load event callback -->
	</body>

</html>