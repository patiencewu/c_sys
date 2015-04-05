<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%

String a="<script language=javascript>\n" + "var iWidth = 800; //弹出窗口的宽度;\n" +
  "var iHeight = 300; //弹出窗口的高度;\n" +"var iTop = (window.screen.availHeight - 30 - iHeight) / 2; //获得窗口的垂直位置;\n"
  +"var iLeft = (window.screen.availWidth - 10 - iWidth) / 2; //获得窗口的水平位置;\n"
  +"window.open(\"" +"jsp/humanDepartment/peopleTeamManage/admin/add.jsp\"" +", \"" + "\", " + "\"height=" +"\" + iHeight + "
  + "\", width=" +"\" + iWidth + " +"\", top=" +"\" + iTop + " +"\", left=" +"\" + iLeft);" +"</script>";

out.print(a);									

%>