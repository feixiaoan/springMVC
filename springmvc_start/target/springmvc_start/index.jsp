<%--
  Created by IntelliJ IDEA.
  User: 小飞
  Date: 2019/5/23
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序</h3>
    <%--
    <a href="hello">入门案例</a>
    --%>
    <%--
    <a href="user/testRequestMapping?username=haha">测试requestMapping</a>
    --%>
    <%--
    <a href="paramController/sayParam?username=haha&password=123456">测试参数传递</a>
    --%>
    <%--
    <form action="paramController/sayAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        用户姓名：<input type="text" name="user.uname"><br/>
        用户年龄：<input type="text" name="user.age"><br/>
        <input type="submit" value="提交">
    </form>
    --%>
    <%-- 将对象封装到集合中
    <form action="paramController/sayAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>

        用户姓名：<input type="text" name="list[0].uname"><br/>
        用户年龄：<input type="text" name="list[0].age"><br/>

        用户姓名：<input type="text" name="map['one'].uname"><br/>
        用户年龄：<input type="text" name="map['one'].age"><br/>
        <input type="submit" value="提交">
    </form>--%>
    <%--进行日期转换
    <form action="paramController/sayUser" method="post">
        用户名：<input type="text" name="uname"/><br/>
        年 龄：<input type="text" name="age"/><br/>
        生 日：<input type="text" name="date"/><br/>
        <input type="submit" value="提交"/>
    </form>
    --%>
    <%-- 进行@RequestParam的测试
    <a href="paramController/sayRequestParam?name=测试&age=12">测试@RequestParam</a>
    --%>
    <%-- 测试@ModelAttribute
    <form action="paramController/sayModelAttribute" method="post">
        用户名：<input type="text" name="uname"/><br/>
        年  龄：<input type="text" name="age"/><br/>
        <input type="submit" value="提交"/>
    </form>
    --%>
    <a href="paramController/sayPathVariable/10">测试@Pathvariable</a>

    <form action="paramController/sayRequestBody" method="post">
        用户名：<input type="text" name="uname"/><br/>
        年  龄：<input type="text" name="age"/><br/>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
