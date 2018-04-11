<%--
  Created by IntelliJ IDEA.
  User: jules
  Date: 2018/4/10
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>未登录</title>
</head>
<body>
    你还未登录，请登录<br>
    <%--在html中的斜杠表示从服务器端口开始的路径--%>
<a href="<%=request.getContextPath()%>/home/home!home.action"><input type="button" value="登录"></a>
</body>
</html>
