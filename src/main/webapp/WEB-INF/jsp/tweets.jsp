<%--
    Document   : tweets
    Created on : Nov 9, 2017, 12:52:40 PM
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
        <title>Tweets</title>
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
                <li class="active"><a href="/minitwitter-master/tweets">Tweets</a></li>
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
                    <form id="regForm" action="/minitwitter-master/sendTweet" method="post" modelAttribute="tweetData">
                        <fieldset>
                            <div class="control-group">
                                <label class="control-label" for="tweet">What's on your mind?</label>
                                <div id="tweetId" class="controls">
                                    <input type="text" id="tweet" name="tweet"
                                           placeholder="Tweet something.." class="form-control" value="">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Send tweet</button>
                        </fieldset>
                        <h1>${successMessage}</h1>
                        <div class="container" style="width: 800px">
                            <div class="row">
                                <div class="col-9""><p><c:out value = ""/></p></div>
                            </div>
                        </div>
                        <c:if test="${size > 0}">
                            <c:forEach var = "i" begin = "0" end = "${size -1}">
                                <div class="container theme-showcase" role="main">
                                    <div class="row">
                                        <div class="col-md-6 col-xs-12">
                                            <table class="table fixed" id="tweetList">
                                                <tbody id="extend">
                                                    <tr data-toggle="collapse123" class="clickableRow spaceUnder" nowrap="true">
                                                        <td class="AlignLeft" nowrap="true" style="border-right: 0px;">
                                                            <strong>${listTweet[i].getUsername()}</strong> tweeted: ${listTweet[i].getTweet()}</p>
                                                        </td>
                                                        <td align="right" class="AlignRight" style="border-left: 0px;" nowrap="true">${listTweet[i].getTimeStamp()}</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </c:if>
                </div>
            </div>
        </div>
    </div>
</body>
</html>