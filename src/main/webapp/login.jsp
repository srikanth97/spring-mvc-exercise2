<%--
  Created by IntelliJ IDEA.
  User: cgi
  Date: 09/10/19
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="user" value="${user}"/>
    <h2> Welcome <c:out value="${user.userName}"></c:out> to stackroute</h2>
</body>
</html>
