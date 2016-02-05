<%--
  Created by IntelliJ IDEA.
  User: wangchongbei
  Date: 16-2-5
  Time: 下午12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="post" id="userReg" action="insert.html">

    <div align="center">
        <div>
            用户名：<input name="username" type="text"/>
        </div>

        <div>
            Email： <input name="passwd" type="password"/>
        </div>

        <div>
            <input type="submit" value="注册"/>
            <input type="reset" value="取消"/>
        </div>
    </div>

</form>

</body>
</html>
