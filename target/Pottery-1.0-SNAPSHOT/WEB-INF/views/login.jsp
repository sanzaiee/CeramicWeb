<%-- 
    Document   : login.jsp
    Created on : Feb 27, 2018, 11:13:58 AM
    Author     : sanzaie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/Login" method="POST">
       
        Username: <input type="text" name="j_username" />
        
        Password: <input type="password" name="j_password"/>
                       
        <input type="submit" value="Login"/> 
        <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
