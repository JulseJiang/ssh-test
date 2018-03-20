<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
<title>无标题文档</title>
</head>

<body>
<h1 align="center">登陆</h1>
<%--<%=request.getContextPath()%>--%>
<form name="form1" method="post" action="/home!login.action">
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <td width="19%" height="30">登陆名：</td>
    <td width="81%" height="30"><input type="text" name="textfield"></td>
  </tr>
  <tr>
    <td height="30">密码：</td>
    <td height="30"><input type="password" name="textfield2"></td>
  </tr>
  <tr>
    <td height="30" colspan="2" align="center"><input type="submit" name="Submit" value="登陆"></td>
    </tr>
</table>

</form>

</body>
</html>
