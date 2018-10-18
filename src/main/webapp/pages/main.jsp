<%--
  Created by IntelliJ IDEA.
  User: Yurij
  Date: 26.08.2017
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="stg" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>


<head>
    <title>Main page</title>
    <%--<stg:url value="/styles/styles.css" var="mstyles"/>--%>
    <link rel="stylesheet", type="text/css" href="/css/styles.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
</head>

<body>
<div>
    <div class="btn-group btn-group-justified">
        <form action="/findProduct" method="post">
        <button type="button" class="btn btn-lg btn-success">ГОЛОВНА</button>
        <button type="button" class="btn btn-lg btn-success">ТОВАРИ</button>
        <button type="button" class="btn btn-lg btn-success">КОРЗИНА</button>

            <%--<li class="dinblock width150">--%><input class="btn btn-lg btn-success"  type="submit">
            <%--<li class="dinblock"><a class="upmenu upacl" href="">ПОШУК</a></li>--%>
        <%--<button class="dinblock width150">--%><input  class="btn btn-lg btn-success" name="searchbyproduct" type="text">
        </form>
    </div>


</div>
<div class="btn-group btn-group-lg">
    <button type="button" class="btn btn-primary">Apple</button>
    <button type="button" class="btn btn-primary">Samsung</button>
    <button type="button" class="btn btn-primary">Sony</button>
</div>

<br>
<div class="up1 alcen backliblue">
    <ul>
        <li class="dinblock "><a href=""class="btn btn-lg btn-default">ГОЛОВНА</a></li>
        <li class="dinblock "><a href=""class="upmenu upacl">ГОЛОВНА</a></li>
        <li class="dinblock"><a class="upmenu upacl" href="">ТОВАРИ</a></li>
        <li class="dinblock"><a class="upmenu upacl" href="">КОРЗИНА</a></li>
        <form action="/findProduct" method="post">
            <li class="dinblock width150"><input class="upacl"  type="submit"></li>
            <%--<li class="dinblock"><a class="upmenu upacl" href="">ПОШУК</a></li>--%>
            <li class="dinblock width150"><input class="upacl" name="searchbyproduct" type="text"></li>
        </form>
    </ul>
</div>
</body>
</html>
