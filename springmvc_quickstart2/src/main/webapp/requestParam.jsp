<%--
  Created by IntelliJ IDEA.
  User: renanquan
  Date: 2024/4/23
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${pageContext.request.contextPath}获取当前项目路径--%>
<a href="${pageContext.request.contextPath}/user/simpleParam?id=1&username=杰克">
    基本类型
</a>

<form action="${pageContext.request.contextPath}/user/pojoParam" method="post">
    编号：<input type="text" name="id"> <br>
    用户名：<input type="text" name="username"> <br>
    <input type="submit" value="对象类型">
</form>

<form action="${pageContext.request.contextPath}/user/arrayParam">
    编号：<br>
    <input type="checkbox" name="ids" value="1">1<br>
    <input type="checkbox" name="ids" value="2">2<br>
    <input type="checkbox" name="ids" value="3">3<br>
    <input type="checkbox" name="ids" value="4">4<br>
    <input type="checkbox" name="ids" value="5">5<br>
    <input type="submit" value="数组类型">
</form>

<form action="${pageContext.request.contextPath}/user/queryParam" method="post">
    搜索关键字：
    <input type="text" name="keyword"> <br> user对象：
    <input type="text" name="user.id" placeholder="编号">
    <input type="text" name="user.username" placeholder="姓名"><br> list集合<br>
    第一个元素：
    <input type="text" name="userList[0].id" placeholder="编号">
    <input type="text" name="userList[0].username" placeholder="姓名"><br>
    第二个元素：
    <input type="text" name="userList[1].id" placeholder="编号">
    <input type="text" name="userList[1].username" placeholder="姓名"><br> map集合<br>
    第一个元素：
    <input type="text" name="userMap['u1'].id" placeholder="编号">
    <input type="text" name="userMap['u1'].username" placeholder="姓名"><br>
    第二个元素：
    <input type="text" name="userMap['u2'].id" placeholder="编号">
    <input type="text" name="userMap['u2'].username" placeholder="姓名"><br>
    <input type="submit" value="复杂类型">
</form>

<form action="${pageContext.request.contextPath}/user/converterParam">
    生日：<input type="text" name="birthday">
    <input type="submit" value="自定义类型转换器">
</form>

<a href="${pageContext.request.contextPath}/user/findByPage?pageNo=2">
    分页查询
</a>
</body>
</html>
