<%--
    Document   : login
    Created on : Nov 13, 2017, 9:31:08 AM
    Author     : mattias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="shortcut icon" href="">
        <title>Login</title>
    </head>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Minitwitter</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li class="active"><a href="/minitwitter-master/login">Login</a></li>
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
        <div class="container theme-showcase" role="main">
            <div class="row">
                <div class="col-md-6 col-xs-12">
                    <form id="loginForm" action="/minitwitter-master/loginUser" method="post" modelAttribute="userFormData">
                        <strong>${errorMessage}</strong>
                        <br>
                        <br>
                        <fieldset>
                            <div class="control-group">
                                <label class="control-label" for="userName">Please enter a username</label>
                                <div id="usernameId" class="controls">
                                    <input type="text" id="userName" name="userName"
                                           placeholder="Enter a username.." class="form-control" value="">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="password">Password</label>
                                <div id="passwordId" class="controls">
                                    <input type="text" id="password" name="password"
                                           placeholder="Enter a password.." class="form-control" value="">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Login</button>
                        </fieldset>
                </div>
            </div>
        </div>
    </div>
</body>
</html>