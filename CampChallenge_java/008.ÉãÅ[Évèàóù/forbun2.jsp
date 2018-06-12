<%-- 
    Document   : forbun2
    Created on : Jun 12, 2018, 4:57:24 PM
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
            String moji = "A";
            for (int i=1;i<=30;i++){
            moji += "A";
        }
            out.print(moji);
            %>   
    </body>
</html>
