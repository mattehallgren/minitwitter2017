<%--
    Document   : findPeople
    Created on : Nov 11, 2017, 10:51:04 AM
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
        <title>JSP Page</title>
    </head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <li class="active"><a href="/minitwitter-master/findPeople">Find people</a></li>
                <li><a href="/minitwitter-master/logout">Logout</a></li>
            </ul>
        </div>
    </nav>
    <br>
    <body>
        <c:if test="${size > 0}">
            <c:forEach var = "i" begin = "0" end = "${size -1}">
                <div class="container theme-showcase" role="main">
                    <div class="row">
                        <div class="col-md-6 col-xs-12">
                            <table class="table fixed" id="tweetList">
                                <tbody id="extend">
                                    <tr data-toggle="collapse123" class="clickableRow spaceUnder" nowrap="true">
                                        <td class="AlignLeft" nowrap="true" style="border-right: 0px;">
                                            <p>${listUsers[i].getUserName()}</p>
                                        </td>
                                        <td align="right" class="AlignRight" style="border-left: 0px;" nowrap="true"><input id="FollowUser" type="button" value="Follow" class="btn btn-sm btn-primary" onclick="location.href = '/minitwitter-master/followUser/${listUsers[i].getId()}';"/></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:if>
    </body>
</html>
