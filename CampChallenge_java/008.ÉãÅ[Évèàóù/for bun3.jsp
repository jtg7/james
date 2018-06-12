<%-- 
    Document   : for bun3
    Created on : Jun 12, 2018, 5:44:43 PM
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
            int total = 0;
            for (int i=0;i<=100;i++){
                total = total + i;
            }
            out.print(total);
            %>
    </body>
</html>
