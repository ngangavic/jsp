<%@page import="actions.DbActions"%>  
<%@ page errorPage="error.jsp" %>  
<jsp:useBean id="u" class="models.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=DbActions.save(u);  
if(i>0){  
response.sendRedirect("addUserSuccess.jsp");  
}else{  
response.sendRedirect("addUserError.jsp");  
}  
%>  