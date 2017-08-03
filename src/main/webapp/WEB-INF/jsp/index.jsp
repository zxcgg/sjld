<%--
  Created by IntelliJ IDEA.
  User: zxc
  Date: 2017/8/2
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<html>
<head>

    <title>Insert title here</title>
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script>

        $().ready(function () {
            $.ajax({
                url: "province",
                dataType: "json",
                method: "get",
                success: function (data) {
                    for (i = 0; i < data.length; i++) {
                        $("#province").append(" <option value='" + data[i].code + "'>" + data[i].name + "</option>");
                    }
                }
            })

            $("#province").change(function () {
                $("#city").html("")
                $("#city").append("<option>请选择</option>");
                $("#town").html("")
                $("#town").append("<option>请选择</option>")
                $.ajax({
                    url: "city",
                    dataType: "json",
                    data:"provinceCode="+ $("#province").val(),
                    method: "get",
                    success: function (data) {
                        for (i = 0; i < data.length; i++) {
                            $("#city").append(" <option value='" + data[i].code + "'>" + data[i].name + "</option>");
                        }
                    }
                })
            })
            $("#city").change(function () {
                $("#town").html("")
                $("#town").append("<option>请选择</option>")
                $.ajax({
                    url: "town",
                    dataType: "json",
                    data:"cityCode="+ $("#city").val(),
                    method: "get",
                    success: function (data) {
                        for (i = 0; i < data.length; i++) {
                            $("#town").append(" <option value='" + data[i].code + "'>" + data[i].name + "</option>");
                        }
                    }
                })
            })
        })


    </script>

</head>
<body>

<select id="province" name="city">
    <option>请选择</option>
</select>
<select id="city" name="city">
    <option>请选择</option>
</select>
<select id="town" name="town">
    <option>请选择</option>
</select>

</body>
</html>