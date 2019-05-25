<%--
  Created by IntelliJ IDEA.
  User: 小飞
  Date: 2019/5/24
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
                /*alert("hello btn");*/
                // 发送ajax请求
                $.ajax({
                    //编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"haha","password":"12345","age":12}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器相应的json数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <a href="user/testString">testString测试</a><br/>
    <a href="user/testVoid">testVoid测试</a><br/>
    <a href="user/testModelAndView">testModelAndView</a><br/>
    <a href="user/testForwardOrRedirect">testForwordOrRedirect</a><br/>
    <button id="btn">发送ajax的请求</button>
</body>
</html>
