<%-- 
    Document   : expression_syntax
    Created on : Feb 24, 2020, 1:24:52 PM
    Author     : needle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression syntax</title>
    </head>
    <body>
        <% out.println("This is the results "); %>
           <% int num1=10;int num2=20;int num3=40; %>
        <%= num1*num2+num3 %>
        
    </body>
</html>
