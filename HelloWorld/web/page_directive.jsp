<%-- 
    Document   : page_directive
    Created on : Feb 24, 2020, 1:42:37 PM
    Author     : needle
--%>

<%@ page language="java" contentType="text/html;" pageEncoding="ISO-8859-1"
         isELIgnored="false"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Directive</title>
    </head>
    <body>
        <a>Date is:</a>
        <%= new java.util.Date()%>
    </body>
</html>
