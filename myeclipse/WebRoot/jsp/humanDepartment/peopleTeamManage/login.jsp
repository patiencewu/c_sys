<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- meta http-equiv="Content-Type" content="text/html; charset=utf-8" / -->
<title>登陆 - 华南农业大学学生创业基地</title>
<link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body class="body">

<script type="text/javascript">
function checkUser(){
  var us=document.getElementById("userName").value;
  var pa=document.getElementById("password").value;

  if(us==""){alert("用户名不能为空");return false;}
  if(pa==""){alert("密码不能为空");return false;}
  document.getElementById("logForm").submit();
}
</script>

  <div><img src="images/images/log_01.jpg" width="1366" height="264" /></div>
  <div><img src="images/images/log_02.jpg" class="p1"/></div>
  
  <form id="logForm" action="Login.action" method="post">
  <div class="account">
    <input id="userName" name="userName" type="text" style="width:339px; height:29px; border: 0px; font-size: 18px; vertical-align: middle;" />
  </div>
  <div><img src="images/images/log_04.jpg" width="269" height="30" /></div>
  <div><img src="images/images/log_05.jpg" width="1366" height="19" /></div>
  <div><img src="images/images/log_06.jpg" class="p2"/></div>
  <div class="key">
    <input id="password" name="password" type="password" style="width:339px; height:29px; border: 0px; font-size: 30px; vertical-align:middle;" maxlength="16"/>
  </div>
  <div><img src="images/images/log_08.jpg" width="269" height="31" /></div>
  <div><img src="images/images/log_09.jpg" width="1366" height="23" /></div>
  <div class="p3"><img src="images/images/log_10.jpg" /></div>
  
  <div class="logButton"><input type="image" src="images/images/log_11.jpg" onclick="javascript:checkUser()"></input></div>
  </form>
  <div class="p4"><img src="images/images/log_12.jpg" /></div>
  <div class="forgetButton"><a href="#"><img src="images/images/log_13.jpg" /></a></div>
  <div class="p5"><img src="images/images/log_14.jpg" /></div>
  <div class="newButton"><s:a action="Register_goToRegister"><img src="images/images/log_15.jpg" /></s:a></div>
  <div><img src="images/images/log_16.jpg" width="269" height="46" /></div>
  <div><img src="images/images/log_17.jpg" width="1366" height="227" /></div>
</body>
</html>
