<%--
  Created by IntelliJ IDEA.
  User: zxc
  Date: 2017/8/5
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件下载</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $("#down").click(function () {
               location.href="down"
            })
        })
    </script>
</head>

<body>
<div class="text-center ">
    <a id="down" class=" btn btn-success ">下载</a>
</div>
</body>
</html>
