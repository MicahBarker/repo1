<%--
  Created by IntelliJ IDEA.
  User: renanquan
  Date: 2024/5/4
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="username"> <br>
    文件：<input type="file" name="filePic"> <br>
    <input type="submit" value="单文件上传">
</form>

<form action="${pageContext.request.contextPath}/filesUpload" method="post" enctype="multipart/form-data">
    名称：<input type="text" name="username"> <br>
    文件1：<input type="file" name="filePic"> <br>
    文件2：<input type="file" name="filePic"> <br>
    <input type="submit" value="多文件上传">
</form>
</body>
</html>
