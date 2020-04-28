<%@page import="actions.DbActions"%>  
<%@ page errorPage="error.jsp" %>
<jsp:useBean id="u" class="models.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
    DbActions.delete(u);
    response.sendRedirect("viewUsers.jsp");
%>  