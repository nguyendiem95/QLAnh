<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="social.facebook.FBConnection"%>

<%
    FBConnection fbConnection = new FBConnection();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body style="text-align: center; margin: 0 auto;">
        <a href="<%=fbConnection.getFBAuthUrl()%>"> 
            <img style="margin-top: 138px;" src="./img/facebookloginbutton.png" />
        </a>
    </body>
</html>