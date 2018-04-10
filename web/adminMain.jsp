<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>无标题文档</title>
</head>

<frameset rows="80,*" cols="*" frameborder="NO" border="0" framespacing="0">
  <%--<%=request.getContextPath() %>--%>
  <frame src="<%=request.getContextPath()%>/home/home!top.acion" name="topFrame" scrolling="NO" noresize >
  <frameset rows="*" cols="98,*" framespacing="0" frameborder="NO" border="0">
    <frame src="<%=request.getContextPath()%>/left.jsp" name="leftFrame" scrolling="NO" noresize>
    <frame src="<%=request.getContextPath()%>/main.jsp" name="mainFrame">
  </frameset>
</frameset>
<noframes><body>
</body></noframes>
</html>
