<%-- 
    Document   : Registration
    Created on : 18-03-2019, 12:13:01
    Author     : shpattt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/LegoHus/stylereg.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="regi-box">
            <form action="Logger" method="post">
                <h1> Register </h1>
                <div class="textbox">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <input type="text" placeholder="Email" name="email">
                </Div>
                <div class="textbox">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                    <input type="password" placeholder="Password" name="pass">
                </div>
                <div class="textbox">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                    <input type="password" placeholder="Re-type password" name="pass1">
                </div>
                <input class="btn" type="submit" name="" value="Register">
                <input type="hidden" name="from1" value="reger">
            </form>  
        </div>
    </body>
</html>
