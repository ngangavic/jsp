<%@page import="actions.DbActions"%>  
<%@ page errorPage="error.jsp" %>
<jsp:useBean id="u" class="models.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
    int i = DbActions.update(u);
    response.sendRedirect("viewUsers.jsp");
%>  