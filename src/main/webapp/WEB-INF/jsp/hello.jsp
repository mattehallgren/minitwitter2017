<%--
    Document   : hello
    Created on : Nov 8, 2017, 3:57:49 PM
    Author     : mattias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${message}</h1>
        <h2>${listUser[0].getName()}</h2>
        <h2>${listUser[1].getName()}</h2>
    </body>
</html>
