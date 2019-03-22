<%--
    Document   : errorpage
    Created on : Nov 9, 2017, 4:58:21 PM
    Author     : mattias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Minitwitter</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li><a href="/minitwitter-master/login">Login</a></li>
                <li><a href="/minitwitter-master/register">Register</a></li>
                <li><a href="/minitwitter-master/myContacts">My contacts</a></li>
                <li><a href="/minitwitter-master/tweets">Tweets</a></li>
                <li><a href="/minitwitter-master/findPeople">Find people</a></li>
                <li><a href="/minitwitter-master/logout">Logout</a></li>
            </ul>
        </div>
    </nav>
    <br>
    <body>
        <h1>${errorMessage}</h1>
    </body>
</html>
