<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Start page</title>

</head>

<body>
<div align="center">
    <h1>Welcome to application </h1>
    <hr>
    <form action="/sendName" method="get">
        <input type="text" width="150" name="name" placeholder="Input name">
        <input type="submit" value="send">
        <input type="reset" value="clean">
    </form>
    <hr>
    <h2> ${message} </h2>
</div>
</body>
</html>