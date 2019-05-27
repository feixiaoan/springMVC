<%--
  Created by IntelliJ IDEA.
  User: 小飞
  Date: 2019/5/25
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>文件普通上传</h3>
    <form action="file/fileUpload1" enctype="multipart/form-data" method="post">
        选择文件：<input type="file" name="upload"/><br/>
        <input type="submit" value="上传"/>
    </form>
    <h3>文件springnvc的上传</h3>
    <form action="file/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"/><br/>
        <input type="submit" value="上传"/>
    </form>
    <h3>文件上传之跨服器上传</h3>
    <form action="file/fileUpload3" enctype="multipart/form-data" method="post">
        选择文件：<input type="file" name="upload"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
