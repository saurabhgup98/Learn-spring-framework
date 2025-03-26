<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
</head>
<body>
    Welcome to the Login Page!
    <pre>${errorMsg}</pre>
    <form action="welcome" method="post">
        Name: <input type="text" name="name"/>
        Password: <input type="password" name="password">
        <button type="submit">Submit</button>
    </form>
</body>
</html>