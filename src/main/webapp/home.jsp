<%-- 
    Document   : index
    Created on : 17 Nov 2020, 21:19:01
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Shop.OrigamiKit"%>
<%@page import="Shop.Cart"%>
<%@page import="Shop.RegisteredUser"%>
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
        <!-- custom styles -->
        <link rel="stylesheet" href="css/styles.css">
        
        <!-- custom javascript -->
        <script src="js/submitProductForm.js">
    </head>
    <body>
        
        <jsp:include page="navbar.jsp"/>
        <div class="container">
            <div class='card-deck'>
                <div class="row">
        <!-- the forEach jsp tag wasn't working for me so I did it this way instead 
        I only wanted three products per row so if the index is divisible by three it will just go onto a new row
        Each product has has it's ID as a value in two forms. One to allow a product page for expanding a product
        And another to add to cart directly from this home page
        -->
        
        <% ArrayList<OrigamiKit> products = (ArrayList<OrigamiKit>)request.getAttribute("products"); 
        for (OrigamiKit product : products) {
            if (products.indexOf(product) % 3 == 0){
                out.print("</div><br><div class='row'>");
            }
            long id = product.getID();
            out.print("<div class='card h-100'><form action='ProductServlet' id='" + id + "'>"
            + "<input type='hidden' name='product' value='" + id + "'>"
            + "<a href='#' onclick='submitProductForm(" + id + ")'><img src='images/"
            + product.getImageLocation() + "' class='card-img-top' alt='productplaceholder'></a>"
            + "<div class='card-body d-flex flex-column align-content-md-centre'>"
            + "<a class='text-dark' class='text-info href='#' onclick='submitProductForm(" + id + ")'><h4 class='card-title'>" 
            + product.getName() + "</h4></a>"
            + "<ul class='list-unstyled mt-3 mb-4'>"
            + "<li><a class='text-dark' href='#' onclick='submitProductForm(" + id + ")'><h5>€" + product.getPrice() + "</h5></a></li>"
            + "<li><p class='card-text'>" + product.getDesc() + "</p></li></form>"
            + "<form action='AddToCart'><button type='submit' name='product' value='" + id
            + "' class='mt-auto btn btn-dark'>Add to cart</button></form>"
            + "</div>"
            + "</div>");
        }
        %>
                </div>
            </div>
        </div>
    </body>
</html>
