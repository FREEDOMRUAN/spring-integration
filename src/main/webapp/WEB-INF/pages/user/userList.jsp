<%--
  Created by IntelliJ IDEA.
  User: wangchongbei
  Date: 16-2-5
  Time: 下午12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/queryUser.html" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    UserList：
    <table width="100%" border=1>
        <tr>
            <td>ID</td>
            <td>UserName</td>
            <td>Email</td>
            <td>Gender</td>
            <td>address</td>
            <td>birthDay</td>
            <td>UpdateDate</td>
            <td>registerDate</td>
        </tr>
        <c:forEach items="${userList }" var="user">
            <tr>
                <td>${user.id }</td>
                <td>${user.userName }</td>
                <td>${user.email }</td>
                <td>${user.gender }</td>
                <td>${user.address }</td>
                <td>${user.birthDay }</td>
                <td><fmt:formatDate value="${user.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                <td>${user.registerDate}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
