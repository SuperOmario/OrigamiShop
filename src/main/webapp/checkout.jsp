<%-- 
    Document   : checkout
    Created on : 9 Dec 2020, 12:09:14
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Shop.Cart"%>
<%@page import="Shop.InventoryEntry"%>
<%@page import="Shop.OrigamiKit"%>
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
        <!-- custom styles -->
        <link rel="stylesheet" href="css/shortPages.css">
    </head>
    <body>
        <jsp:include page="navbar.jsp"/>
        <div class="container mainbody">
            <div class='row'>
                <div class='col'><h3>Product</h3></div>
                <div class='col'><h3>Quantity</h3></div>
                <div class='col'><h3>Price</h3></div>
            </div>
            <% 
            if (session.getAttribute("cart") != null) {
                Cart cart = (Cart)session.getAttribute("cart");
                    for (InventoryEntry item : cart.getItems()) {
                        out.print("<div class='row'>");
                        OrigamiKit product = item.getKit();
                        out.print("<div class='col'>" + product.getName() + "</div><div class='col'>" + item.getAmount() + "</div><div class='col'>" + item.getPrice()
                        + "</div></div>");
                    }
                    out.print("<br><hr><div class='row'><div class='col'><h3>Total: </h3></div><div class='col'></div>"
                    + "<div class='col'><h3>" + cart.getPrice() + "</h3></div></div>"
                    + "<div class='row'><div class='col'></div><div class='col'></div><div class='col'><a href='#' class='btn btn-dark btn-lg'>Checkout</a></div></div>");
            } 
            else {
                out.print("Your cart is empty");
            }
            %>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
