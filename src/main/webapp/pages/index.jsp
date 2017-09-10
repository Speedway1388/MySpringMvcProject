<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>

<h1>DSAFfghjfhg</h1>>
<%--<h2>${findAllUsers}</h2>--%>
<hr>
<h1>All products:</h1>
${findAllProducts}
<hr>
<%--<sf:form action="user" method="post" modelAttribute="emptyUser">--%>
    <%--Spring form:--%>
    <%--<br>--%>
    <%--name    <sf:input path="name" name="userName" placeholder="Your Name"/><br>--%>
    <%--Surname <sf:input path="surName"  name="userSurName" placeholder="Your Surname"/><br>--%>
    <%--email   <sf:input path = "email" name="email" placeholder="Your email"/><br>--%>
    <%--password<form:password path = "password" placeholder="Your password" /><br>--%>
    <%--Register!<input type="submit">--%>
<%--</sf:form>--%>
<<a href="showAllUsersWithPurchase">showAllUsersWithPurchase</a>

<a href="/main">hivasia</a>

<%--<hr>--%>
<%--<form action="user" method="post" >--%>
    <%--Spring form:--%>
    <%--<br>--%>
    <%--name    <input type = "text", name="userName" placeholder="Your Name"><br>--%>
    <%--Surname <input type = "text", name="userSurName" placeholder="Your Surname"><br>--%>
    <%--email   <input type = "text", name="email" placeholder="Your email"><br>--%>
    <%--password<input type = "password", name="password" placeholder="Your password"><br>--%>
    <%--Register!<input type="submit">--%>
<%--</form>--%>
</body>
</html>