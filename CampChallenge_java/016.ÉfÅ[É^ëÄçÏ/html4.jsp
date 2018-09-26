<%-- 
    Document   : html4
    Created on : Sep 26, 2018, 5:46:45 PM
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
             
            request.setCharacterEncoding("UTF-8");
            out.println(request.getParameter("name"));
            out.println(request.getParameter("gender"));
            out.print(request.getParameter("hobby"));
            %>
    </body>
</html>
