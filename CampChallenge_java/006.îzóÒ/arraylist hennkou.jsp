<%-- 
    Document   : arraylist sousa
    Created on : Jun 12, 2018, 1:38:20 PM
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
        <%@page import ="java.util.ArrayList" %>
        <%
            ArrayList<String> datas = new ArrayList<String>();
            datas.add("10");
            datas.add("100");
            datas.add("soeda");
            datas.add("hayashi");
            datas.add("-20");
            datas.add("118");
            datas.add("END");
            out.print(datas + "<br>");
            datas.set(2,"33");
            out.print(datas);
                    %>
                    
    </body>
</html>
