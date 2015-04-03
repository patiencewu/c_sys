<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>会员注册</title>
</head>
<body>
<div style="background:#2775cb; height:100px; width:1000px; margin-left:170px">

<p style="position:absolute; top:5px; font-size:30px; color:white; font-family:隶书">&nbsp;&nbsp;华南农业大学大学生创新创业孵化基地</p>
<p style="font-family:华文彩云;position:absolute; top:20px; right:450px;font-size:30px; color:white">会&nbsp;员&nbsp;注&nbsp;册</p>

<img alt="" src="images/flower.jpg" style="position:absolute; right:200px; top:8px; height:90px"/>
</div>
<s:form id="registerForm" action="Register_enroll" method="post">
<div style="width:994px; height:1250px; margin-left:170px;position:absolute; top:105px; border-left-style:solid; border-right-style:solid; border-bottom-style:solid; border-color:#2775cb">

<div style="position:absolute; top:50px; left:80px; border-color:#e2e4e5; border-style:dotted; width:800px">
<p style="font-family:隶书; color:#2775cb; font-size:30px">基本信息</p>
&nbsp;&nbsp;姓名：<input type="text" name="name" size="10" style="font-size:20px"/><br><br>
&nbsp;&nbsp;性别：<input type="radio" name="sex" value="boy">男</input>
<input type="radio" name="sex" value="girl">女</input><br><br>
&nbsp;&nbsp;出生日期：<input type="date" name="birthDay"/><br><br>
&nbsp;&nbsp;民族：<input type="text" name="nation" size="10" style="font-size:20px"><br><br>  
&nbsp;&nbsp;籍贯：<input type="text" name="nativePlace" size="10" style="font-size:20px"><br><br>        
&nbsp;&nbsp;政治面貌：<select name="pliticsStatus" size="" style="font-size:20px">
        <option value="群众">群众</option>
        <option value="共青团员">共青团员</option>
        <option value="预备党员">预备党员</option>
        <option value="党员">党员</option>
        </select>
&nbsp;&nbsp;身份证：<input type="text" name="idNumber" size="18" style="font-size:20px"><br><br>
&nbsp;&nbsp;手机号码：<input type="tel" name="lphone" size="11" style="font-size:20px">&nbsp;&nbsp;华南农业大学集团短号：<input type="tel" name="sphone" size="6" style="font-size:20px"><br><br>
&nbsp;&nbsp;电子邮箱：<input type="email" name="Email" size="15" style="font-size:20px"><br><br>
&nbsp;&nbsp;学历：<select name="educationBackground" size="" style="font-size:20px">
        <option value="大专">大专</option>
        <option value="本科">本科</option>
        <option value="硕士">硕士</option>
        <option value="博士">博士</option>
        </select><br><br>   
&nbsp;&nbsp;现居地：<input type="text" name="address" size="40" style="font-size:20px"><br>       
</div>

<div style="position:absolute; top:120px; left:600px; width:180px; height:240px;">
<div style="width:180px;height:205px;border-style:dashed; border-color:#2775cb"></div>
<div><br>
<input type="file" name="photo" value="上传照片"/>
</div>
</div>

<div style="position:absolute; top:670px; left:80px; border-color:#e2e4e5; border-style:dotted; width:800px">
<p style="font-family:隶书; color:#2775cb; font-size:30px">在校情况</p>
&nbsp;&nbsp;学号：<input type="text" name="studentNumber" size="10" style="font-size:20px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;学校：<input type="text" name="school" size="20" style="font-size:20px"><br><br>
&nbsp;&nbsp;学院：<input type="text" name="college" size="10" style="font-size:20px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;系别：<input type="text" name="department" size="10" style="font-size:20px">&nbsp;&nbsp;专业：<input type="text" name="major" size="20" style="font-size:20px"><br><br>
&nbsp;&nbsp;班级：<input type="text" name="clazz" size="15" style="font-size:20px">
&nbsp;&nbsp;年级：<input type="tel" name="grade" size="5" style="font-size:20px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;学制：<select name="educationSystem" size="" style="font-size:20px">
        <option value="2">2年</option>
        <option value="3">3年</option>
        <option value="4">4年</option>
        <option value="5">5年</option>
        <option value="6">6年</option>
        <option value="7">7年</option>
        <option value="8">8年</option> 
        </select> <br><br>
</div>

<div style="position:absolute; top:935px; left:80px;width:800px">

<div style="border-color:#e2e4e5; border-style:dotted; width:800px" >
<p style="font-family:隶书; color:#2775cb; font-size:30px">详细信息</p>
&nbsp;&nbsp;家庭电话：<input type="tel" name="homePhone" size="10" style="font-size:20px">&nbsp;&nbsp;&nbsp;&nbsp;注册账号：<input type="text" name="userName" size="16" style="font-size:20px"><br><br>
&nbsp;&nbsp;家庭邮编：<input type="text" name="postcode" size="10" style="font-size:20px">&nbsp;&nbsp;&nbsp;&nbsp;注册密码：<input type="password" name="password" size="16" style="font-size:20px"><br><br>
&nbsp;&nbsp;家庭住址：<input type="text" name="homeaddress" size="20" style="font-size:20px"><br><br>
</div>

<div><br>
<input type="submit" name="submit" value="提交" style="font-size:20px; margin-left:300px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" name="reset" value="重置" style="font-size:20px;">
</div>
</div>

</div>
</s:form>
</body>
</html>