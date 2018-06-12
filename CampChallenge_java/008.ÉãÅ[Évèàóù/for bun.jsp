<%-- 
    Document   : if bun
    Created on : Jun 12, 2018, 4:14:25 PM
    Author     : jamesgrimm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            long total = 8;
          for (int i=2;i<=20;i++){
             total *= 8;
             
          } 
          out.print(total);
          %>
    </body>
</html>
