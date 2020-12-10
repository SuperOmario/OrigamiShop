<%-- 
    Document   : product
    Created on : 8 Dec 2020, 20:09:09
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <div class="row">
                <div class="col">
            <% OrigamiKit product = (OrigamiKit)request.getAttribute("product"); 
            String doubleSided = "X";
            if (product.getDoubleSided() == true) {
                doubleSided = "✓";
            }
            out.print("<img src='images/" + product.getImageLocation() + "'></div>"
                + "<div class='col'><div class='container>"
                + "<div class='container'><h1>" + product.getName() + "</h1></div>"
                + "<div class='container'><h3>" + product.getDesc() + "</h3</div><br><br>"
                + "<div class='container'><h4>Skill level: " + product.getSkillLevel() + "</h4></div>"
                + "<div class='container'><h4>Paper Type: " + product.getPaperType() + "</h4></div>"
                + "<div class='container'><h4>Double Sided: " + doubleSided + "</h4></div>"
                + "<div class='container'><h4>€" + product.getPrice() + "</h4></div>"
                + "<form action='AddToCartFromProduct'><input type='hidden' value='" + product.getID() + "' name='product'><br>"
                + "<div class='input-group mb-3'><label for='quantity'>Quantity:  </label>"
                + "<select class='ml-4' id='quantity' name='quantity'>"
                + "<option selected value='1'>1</option>");
            for (int i = 2; i < 11; i++) {
                out.print("<option value='" + i + "'>" + i +"</option>");
            }  
            out.print("</select></div><br>"
                + "<div class='container'><button type='submit' class='btn btn-dark btn-lg'>Add to Cart</button>"
                + "</div></form>"
                + "</div>");
            %>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
