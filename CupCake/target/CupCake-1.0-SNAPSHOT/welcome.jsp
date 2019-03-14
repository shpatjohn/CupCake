<%-- 
    Document   : welcome
    Created on : 06-03-2019, 00:14:34
    Author     : shpattt
--%>

<%@page import="Data.user"%>
<%@page import="Data.Bottom"%>
<%@page import="Data.topping"%>
<%@page import="Mapper.DataMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


 <%
            if(request.getSession().getAttribute("username")==null)
            {
              response.sendRedirect("/CupCake/index.jsp");
            }           
    
                 
  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/CupCake/Styling.css" rel="stylesheet" type="text/css">
        
    </head>
    <body>
       

<div class="topnav" id="id">
  <a href="https://www.google.dk" class="active" target="_blank">Home</a>
  <a href="https://www.google.dk" target="_blank"> News</a>
  <a href="https://www.google.dk" target="_blank">Contact</a>
  <a href="https://www.google.dk" target="_blank">About</a>
  <a href="${pageContext.request.contextPath}/LogOutServlet"> log out</a>
  <p style="text-align: right; color:chocolate;">
        Logged in as: ${username}   Account balance: ${balance} $
        </p>
</div>
        <div class="john"> <img src="https://www.lifeloveandsugar.com/wp-content/uploads/2018/01/Chocolate-Covered-Strawberry-Cupcakes4.jpg" alt="john" style="z-index: 0;">  </div>
      
       <div class="master">
          
        
        <form action ="WelcomeServlet" method="get">
            <p1> View topping selection: </p1> 
            <select name="topping">
            <%
                int price = 0;
                DataMapper m = new DataMapper();
                for(topping t : m.getTopping())
                {   
            %>
            View topping: <option value="<%= t.getTopping()%>"> <%= t.getTopping() + " " + t.getPrice() %>  </option>
                
               
            <% }    %>
            </select>
            <p1> View bottom selection: </p1> 
            <select name="bottom">
                <%
                for(Bottom bo : m.getBottom())
                {
            %>
            <option value="<%= bo.getBottom()%>" > <%= bo.getBottom()+ " " + bo.getPrice()%> </option>
            <% } %>
            </select>
            <h1> Click to order a CupCake! :) </h1>
            <% 
             %>
            <input type="submit" name="orderPrice" value="click"><br>
            <h1></h1>
            <%
                if(request.getSession().getAttribute("orderprice") != null)
                {
                       System.out.println("sne");
            %>
            <h1>
                Your order: <%= request.getSession().getAttribute("names") %> Full price: <%= request.getSession().getAttribute("orderprice") %> $
            </h1>
            <%}%>
             
            
        </form>
       </div>
      
    </body>
</html>
