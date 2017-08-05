<%--
  Created by IntelliJ IDEA.
  User: zxc
  Date: 2017/8/5
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传页面</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $('#lefile').change(function () {
                $('#photoCover').val($(this).val());
            });
            })



    </script>

</head>
<body>
<div class="text-center">
    <form method="post" action="/up" enctype="multipart/form-data">
        <input id="lefile" type="file" name="file" style="display:none" accept="image/x-png, image/jpg, image/jpeg, image/gif">
        <div class="input-append">
            <input id="photoCover" class="input-large" type="text" style="height:30px;" readonly>
            <a class="btn btn-default" onclick="$('input[id=lefile]').click();">选择图片</a>
        </div>
        <input class="btn btn-success" type="submit" value="提交">
    </form>
</div>

</body>
</html>
