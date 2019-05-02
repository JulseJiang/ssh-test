<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>无标题文档</title>
</head>

<body>
<h1 align="center">修改用户</h1>
<form name="form1" method="post" enctype="multipart/form-data" action="<%=request.getContextPath()%>/user/user!modify.action">
  <table width="90%"  border="1" cellspacing="1" cellpadding="1">

    <tr>
      <td width="20%" height="30">姓名</td>
      <td width="50%" height="30"><input name="textfield" type="text" value="zxh"></td>
      <td width="30%" height="30" rowspan="9"></td>
    </tr>
    <tr>
      <td height="30">地址</td>
      <td height="30">zxh</td>
    </tr>
    <tr>
      <td height="30">邮编</td>
      <td height="30">600830</td>
    </tr>
    <tr>
      <td height="30">电话</td>
      <td height="30">11111</td>
    </tr>
    <tr>
      <td height="30">Email</td>
      <td height="30">1111@163.com</td>
    </tr>
    <tr>
      <td height="30">用户组</td>
      <td height="30"><select name="select">
        <C:forEach items="${ugList}" var ="ug">
          <option value="${ug.usergroup_id}">${ug.usergroup_name}</option>
          <option value="${ug.usergroup_note}"></option>
        </C:forEach>
      </select></td>
    </tr>
    <tr>
      <td height="30">头像</td>
      <td height="30"><input type="file" name="user_pic"></td>
    </tr>
    <tr>
      <td height="30" colspan="2" align="center"><input type="submit" name="Submit2" value="返回"> 
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="提交"></td>
    </tr>
  </table>
</form>
<p align="center">&nbsp;</p>
</body>
</html>
