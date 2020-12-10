<%-- 
    Document   : navbar
    Created on : 1 Dec 2020, 13:49:19
    Author     : Omar
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Shop.RegisteredUser"%>
<%@page import="Shop.Cart"%>
<%@page import="Data.UserDAO"%>
<%@page import="Utils.IConstants"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Kami Rōtasu | Origami Shop</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- bootstrap links -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!-- font awesome -->
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        <!-- custom styles -->
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="Home"><h2>Kami Rōtasu</h2></a>
            <div class="navbar-text">
            <% if (session.getAttribute(IConstants.SESSION_KEY_USER) == null){
            } 
            else {
                RegisteredUser user = (RegisteredUser)session.getAttribute(IConstants.SESSION_KEY_USER);
                out.print("Hello, " + user.getName());
            }%>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class='collapse navbar-collapse' id='navbarSupportedContent'>
            <%  
            if (session.getAttribute(IConstants.SESSION_KEY_USER) != null) {
                RegisteredUser user = (RegisteredUser)session.getAttribute(IConstants.SESSION_KEY_USER);
                if (user.getUserType() == IConstants.USER_TYPE_ADMIN){
                    out.print(
                    "<ul class='navbar-nav ml-auto mt-2 mt-lg-0'>"
                    + "<li class='nav-item'>"
                    + "<a class='nav-link' href='Logout'>Logout</a>"
                    + "</li>"
                    + "<li class='nav-item'>"
                    + "<a href='checkout.jsp' type='button' class='btn btn-primary'>");
                    if (session.getAttribute("cart") != null) {
                        Cart cart = (Cart)session.getAttribute("cart");
                        out.print(cart.getItemsAmount());
                    } else {
                        out.print(0);
                    }
                    out.print("<i class='fas fa-shopping-cart'></i>Cart</a>"
                    +"</ul>");
                } else if (user.getUserType() == IConstants.USER_TYPE_GENUSER){
                    out.print(
                    "<ul class='navbar-nav ml-auto mt-2 mt-lg-0'>"
                    + "<li class='nav-item'>"
                    + "<a class='nav-link' href='Logout'>Logout</a>"
                    + "</li>"
                    + "<li class='nav-item'>"
                    + "<a href='checkout.jsp' type='button' class='btn btn-primary'>");
                    if (session.getAttribute("cart") != null) {
                        Cart cart = (Cart)session.getAttribute("cart");
                        out.print(cart.getItemsAmount());
                    } else {
                        out.print(0);
                    }
                    out.print("<i class='fas fa-shopping-cart'></i>Cart</a>"
                    +"</ul>");
                }
            } else {
                out.print(
                "<ul class='navbar-nav ml-auto'>"
                +"<li class='nav-item'>"
                +"<a class='nav-link' href='register.jsp'>Register</a>"
                +"</li>"
                +"<li class='nav-item'>"
                +"<a class='nav-link' href='login.jsp'>Login</a>"
                +"</li>"
                +"<li class='nav-item'>"
                +"<a href='checkout.jsp' type='button' class='btn btn-primary'>");
                if (session.getAttribute("cart") != null) {
                    Cart cart = (Cart)session.getAttribute("cart");
                    out.print(cart.getItemsAmount());
                } else {
                    out.print(0);
                }
                out.print("<i class='fas fa-shopping-cart'></i>Cart</a>"
                +"</ul>");
            } 
            %>
            </div>
        </nav>
    </body>
</html>
