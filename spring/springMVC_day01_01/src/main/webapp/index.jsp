<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/13
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--<h3>入门案例</h3>--%>

    <%--<a href="hello/hello?username=张三&password=123&age=18">入门案例</a>--%>


<form action="hello/account" method="post">
    用户名:   <input type="text" name="username"><br/>
    密码:     <input type="text" name="password"><br/>
    金额:     <input type="text" name="money"><br/>

    姓名:     <input type="text" name="user.name"><br/>
    年龄:     <input type="text" name="user.age"><br/>
    生日:     <input type="text" name="user.birthday"><br/>

    list姓名: <input type="text" name="list[0].name"><br/>
    list年龄: <input type="text" name="list[1].age"><br/>

    map姓名:  <input type="text" name="map['one'].name"></map><br/>
    map年龄:  <input type="text" name="map['one'].age"></map><br/>
    <input type="submit" value="提交">
</form>
<%--<hr>--%>

    <%--<a href="hello/request">request</a>--%>
    <%--<hr>--%>
    <%--<form action="hello/requestParam" method="post">--%>
        <%--用户名:   <input type="text" name="username"><br/>--%>
        <%--密码:     <input type="text" name="password"><br/>--%>
        <%--<input type="submit" value="提交">--%>
    <%--</form>--%>

<%--<hr>--%>
<%--&lt;%&ndash;<form action="hello/user" method="post">&ndash;%&gt;--%>
    <%--&lt;%&ndash;姓名:   <input type="text" name="name"><br/>&ndash;%&gt;--%>
    <%--&lt;%&ndash;生日:     <input type="text" name="birthday"><br/>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<input type="submit" value="提交">&ndash;%&gt;--%>
<%--&lt;%&ndash;</form>&ndash;%&gt;--%>
<%--<hr>--%>
<%--<form action="hello/user/10" method="post">--%>
    <%--姓名:   <input type="text" name="name"><br/>--%>
    <%--生日:     <input type="text" name="birthday"><br/>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<%--<hr>--%>
<a href="hello/student">request</a>
    ${username}

    ${gender}
<%--${sessionScope}--%>
<br>
<a href="hello/requestParam?username=zhangsan" >requestParam</a>

</body>
</html>
