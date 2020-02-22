<%-- 
    Document   : response
    Created on : Feb 22, 2020, 5:23:47 PM
    Author     : needle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="mypackage.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <h1>Hello,<jsp:getProperty name="mybean" property="name" />!</h1>
    </body>
</html>
