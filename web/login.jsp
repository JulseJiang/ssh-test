<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--这个标签库在本地包中--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>登录页面</title>
</head>

<body>
<h1 align="center">登录</h1>
<<br>
<h2 align="center"><s:fielderror/></h2>
<%--<%=request.getContextPath()%>--%>
<form name="form1" method="post" action="/home/home.action">
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <td width="19%" height="30">登陆名：</td>
    <td width="81%" height="30"><input type="text" name="user_email"></td>
  </tr>
  <tr>
    <td height="30">密码：</td>
    <td height="30"><input type="password" name="user_password"></td>
  </tr>
  <tr>
    <td height="30" colspan="2" align="center"><input type="submit" name="Submit" value="登陆"></td>
    </tr>
</table>

</form>

</body>
</html>