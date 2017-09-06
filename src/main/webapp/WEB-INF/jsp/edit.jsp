<%--
  Created by IntelliJ IDEA.
  User: zxc
  Date: 2017/8/14
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-table.min.css">
    <link rel="stylesheet" href="/css/bootstrap-editable.css">
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap-editable.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="/js/table.js"></script>
</head>
<body>
<a href="#" id="username" data-type="text" data-title="用户名">用户名</a>
</body>
<script>
$(function () {

    $('#username').editable({
        type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
        title: "用户名",              //编辑框的标题
        disabled: false,             //是否禁用编辑
        emptytext: "空文本",          //空值的默认文本
        mode: "inline",              //编辑框的模式：支持popup和inline两种模式，默认是popup
        validate: function (value) { //字段验证
            if (!$.trim(value)) {
                return '不能为空';
            }
        }
    });

})


</script>
</html>
