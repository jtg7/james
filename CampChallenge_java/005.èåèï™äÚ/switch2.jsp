<%-- 
    Document   : switch2
    Created on : Jun 8, 2018, 2:14:19 PM
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
            char text = 'A';
            switch (text) {
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                default:
                        
            }
            %>
            
    </body>
</html>
