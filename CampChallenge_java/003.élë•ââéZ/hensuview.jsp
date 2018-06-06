<%-- 
    Document   : 　変数の宣言と表示
    Created on : Jun 6, 2018, 4:04:04 PM
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
            final int BASE =100;
            int num = 10;
             
            int tasu = BASE + num;
            out.print(tasu);
             
            int hiku = BASE - num;
            out.print(hiku);
             
            int kake = BASE * num;
            out.print(kake);
            
            int wari = BASE / num;
            out.print(wari);
            
            int amari = BASE % num;
            out.print(amari);
            %>
            
    </body>
</html>
