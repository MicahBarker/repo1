<%--
  Created by IntelliJ IDEA.
  User: renanquan
  Date: 2024/4/27
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <%--ajax异步交互--%>
    <button id="btn1">ajax异步提交</button>
    <script>
        $("#btn1").click(function () {
            let url = '${pageContext.request.contextPath}/user/ajaxRequest';
            let data = '[{"id":1,"username":"张三"},{"id":2,"username":"李四"}]';
            $.ajax({
                type: 'POST',
                url: url,
                data: data,
                contentType: 'application/json;charset=utf-8',
                success: function (resp) {
                    alert(JSON.stringify(resp))
                }
            })
        })

    </script>


</body>
</html>
