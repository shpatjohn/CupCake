<%-- 
    Document   : legohouse
    Created on : 20-03-2019, 10:44:06
    Author     : shpattt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%
            if(request.getSession().getAttribute("email")==null)
            {
              response.sendRedirect("/CupCake/Login.jsp");
            }           
    
                 
  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
