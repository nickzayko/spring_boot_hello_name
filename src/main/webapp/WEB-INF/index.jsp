<!DOCTYPE HTML>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Start page</title>

</head>

<body>
<div align="center">
    <h1>Start page</h1>
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