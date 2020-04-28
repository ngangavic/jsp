<%@page import="models.User"%>
<%@page import="actions.DbActions,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP CRUD|View Users</title>
    </head>
    <body>

        <div class="container">
            <h1 style="text-align: center">Users List</h1>  

        <%
            List<User> list = DbActions.getAllRecords();
            request.setAttribute("list", list);
        %>  

        <table border="1" class="table">  
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Password</th>
                <th>Email</th>  
                <th>Sex</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>  
                    <c:forEach items="${list}" var="u">  
                <tr>
                    <td>${u.getId()}</td>
                    <td>${u.getName()}</td>
                    <td>${u.getPassword()}</td>  
                    <td>${u.getEmail()}</td>
                    <td>${u.getGender()}</td>
                    <td>${u.getCountry()}</td>  
                    <td><a href="editform.jsp?id=${u.getId()}" class="btn btn-sm btn-warning">Edit</a></td>  
                    <td><a href="deleteuser.jsp?id=${u.getId()}" class="btn btn-sm btn-danger">Delete</a></td></tr>  
                </c:forEach>  
        </table>  
        <br/><a href="addUserForm.jsp" class="btn btn-success">Add New User</a>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
