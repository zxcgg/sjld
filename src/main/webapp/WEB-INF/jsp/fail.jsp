<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="/js/jquery-2.1.0.js"></script>
    <script type="text/javascript">
        window.onload = function () {
            var time = 5;
            var set = document.getElementById("second");
            setInterval(
                function () {
                    set.innerHTML = time;
                    time--;
                    if (time == 0) {
                        location.href = "/register";
                    }
                }, 1000);

        }
    </script>
    <title>注册失败</title>
</head>

<body>
很遗憾你注册失败，
<span id="second">5</span>秒后跳转注册页面，请重新注册
<br>
<a href="${pageContext.servletContext.contextPath}/register"><span>点我手动跳转</span></a>
</body>

</html>