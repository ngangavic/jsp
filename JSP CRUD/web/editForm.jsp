<%@page import="actions.DbActions,models.User"%>  
<%@ page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP CRUD|Edit Users</title>
    </head>
    <body>

        <%
            String id = request.getParameter("id");
            User u = DbActions.getRecordById(Integer.parseInt(id));
        %>  
        <div class="container">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 offset-md-3">

                <h3 style="text-align: center">Add New User</h3>  
                <form action="editUser.jsp" method="post">  
                    <input type="hidden" name="id" value="<%=u.getId()%>"/>  
                    <div class="form-group">
                        <label>Name:</label>
                        <input type="text" class="form-control" name="name"  value="<%= u.getName()%>" required/>
                    </div>
                    <div class="form-group">
                        <label>Password:</label>  
                        <input type="password" class="form-control" name="password" value="<%= u.getPassword()%>" required/>
                    </div>
                    <div class="form-group">
                        <label>Email:</label>
                        <input type="email" class="form-control" name="email" value="<%= u.getEmail()%>" required/>  
                    </div>

                    <div class="form-group">
                        <label>Gender:</label>  
                        <div class="form-check-inline">
                            <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="gender" value="male" required>Male
                            </label>
                        </div>
                        <div class="form-check-inline">
                            <label class="form-check-label">
                                <input type="radio" class="form-check-input" name="gender" value="female" required>Female
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Country:</label>  
                        <select name="country" class="form-control" required>  
                            <option>Kenya</option>  
                            <option>Uganda</option>  
                            <option>Tanzania</option>  
                            <option>Rwanda</option>  
                            <option>Other</option>  
                        </select>  
                    </div>
                    <div class="form-group btn-group">
                        <input type="submit" class="btn btn-success" value="Edit User"/>
                        <a href="viewUsers.jsp" class="btn btn-warning">View Users</a>
                    </div>

                </form>  
            </div>
        </div>
    </body>
</html>
