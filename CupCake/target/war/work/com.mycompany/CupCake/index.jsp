<%-- 
    Document   : registration
    Created on : 05-03-2019, 23:58:41
    Author     : shpattt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login">
            <h1>Login</h1>
            enter username : <input type="text" name ="uname"><br>
            enter password : <input type="password" name ="pass"><br>
            <input type="submit" value="login">
        </form>
        
        <form action="Registration">
            <h1>Registration</h1>
            enter username : <input type="text" name ="uname"><br>
            enter password : <input type="password" name ="pass"><br>
            enter balance : <input type="balance" name="bala"><br>
            <input type="submit" value="registration">
        </form>
   </body>
</html>
