<%-- 
    Document   : directive_header
    Created on : Feb 24, 2020, 1:46:52 PM
    Author     : needle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <a>Header file : </a>
        <%int count = 1;
            count++;
            out.println(count);%> :
    </body>
</html>
