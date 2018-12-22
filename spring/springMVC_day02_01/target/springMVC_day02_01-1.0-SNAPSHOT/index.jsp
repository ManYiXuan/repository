<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/14
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                //alert("hello");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=utf-8",
                    data:'{"username":"李四","password":"123","age":18}',
                    dataType:"text",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        // alert(data.username);
                        // alert(data.password);
                        // alert(data.age);
                    }
                //     url:"user/testAjax",
                //     contentType:"application/json;charset=UTF-8",
                //     data:'{"username":"哈哈","password":100}',
                //
                //
                // dataType:"json",
                //     type:"post",
                //     success:function(data) {
                //         alert(data);
                //         alert(data.addressName);
                //     }
                });

            });
        });



    </script>
</head>
<body>
<a href="user/testString">testString</a>
<br>
<%--<form action="user/testString" method="post">--%>
    <%--用户名: <input type="text" name="username"> <br>--%>
    <%--密码: <input type="text" name="password"><br>--%>
    <%--<input type="submit" value="提交">--%>
<a href="user/testVoid">testVoid</a>
<br>
<a href="user/testModelAndView">testModelAndView</a>


<br>
<input type="button" id="btn" value="点我">
<br>
<a href="user/testException">testException</a>

</form>
</body>
</html>
