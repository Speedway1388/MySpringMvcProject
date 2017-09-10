<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="jc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<jc:forEach items="${users}" var ="user">
    ${user.purchase}
</jc:forEach>

</body>
</html>