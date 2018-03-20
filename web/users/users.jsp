<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<body>
<h1 align="center">用户管理</h1>
<table width="90%"  border="1" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <th scope="col">姓名</th>
    <th scope="col">地址</th>
    <th scope="col">邮编</th>
    <th scope="col">电话</th>
    <th scope="col">Email</th>
    <th scope="col">操作</th>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td> <a href="modifyUsers.htm" target="_self"><input type="button" value="修改"  /></a>
      <a href="#" target="_self"><input type="button"  value="删除"></a>
    </td>
  </tr>
</table>
<p align="center">
<a href="addUsers.htm" target="_self"><input type="button"  value="添加"/></a>
  
</p>
</body>
</html>
