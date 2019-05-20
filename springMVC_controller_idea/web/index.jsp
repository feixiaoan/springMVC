<%--
  Created by IntelliJ IDEA.
  User: 小飞
  Date: 2019/5/9
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      未注册用户，请<a href="${pageContext.request.contextPath }/index/register">注册 </a>! <br>
      已注册用户，去<a href="${pageContext.request.contextPath }/index/login">登录</a>!
  </body>
</html>
