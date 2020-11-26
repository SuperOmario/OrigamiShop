<%-- 
    Document   : index
    Created on : 17 Nov 2020, 21:19:01
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Kami Rōtasu | Origami Shop</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <% if (request.getParameter("name") == null){
            request.setAttribute("name", "Anonymous");
            } 
        else {
            
        }%>
        <div class="container">
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#"><h2>Kami Rōtasu</h2></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div>
            </div>
            <div class="nav-item">
                Hello, ${name}
            </div>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Register</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="jsp/login.jsp">Login</a>
                    </li>
                </ul>
            </div>
        </nav>
        </div>
        <div class="container">
        <!-- For now this is hard coded. I have it done out like this so I can easily extend it when products are being pulled from a DB -->
        <!-- Pagination will be implemented as well hopefully -->
        <% if (request.getAttribute("products") == null){
            out.print("<div class='card-deck'>");
            for (int i = 0; i < 4; i++){
                out.print("<div class='card h-100'> \n"
                + "<img src='images/origami1.jpg' class='card-img-top' alt='productplaceholder'> \n"
                + "<div class='card-body'> \n"
                + "<h5 class='card-title'>Origami Product</h5> \n"
                + "<p class='card-text'>Description of origami product</p> \n"
                + "<a href='#' class='btn btn-light'>Add to cart</a> \n"
                + "</div> \n"
                + "</div>");
            }
        out.print("</div><br>");
        }%>
        <% if (request.getAttribute("products") == null){
            out.print("<div class='card-deck'>");
            for (int i = 0; i < 4; i++){
                out.print("<div class='card h-100'> \n"
                + "<img src='images/origami1.jpg' class='card-img-top' alt='productplaceholder'> \n"
                + "<div class='card-body'> \n"
                + "<h5 class='card-title'>Origami Product</h5> \n"
                + "<p class='card-text'>Description of origami product</p> \n"
                + "<a href='#' class='btn btn-light'>Add to cart</a> \n"
                + "</div> \n"
                + "</div>");
            }
        out.print("</div><br>");
        }%>
        <% if (request.getAttribute("products") == null){
            out.print("<div class='card-deck'>");
            for (int i = 0; i < 4; i++){
                out.print("<div class='card h-100'> \n"
                + "<img src='images/origami1.jpg' class='card-img-top' alt='productplaceholder'> \n"
                + "<div class='card-body'> \n"
                + "<h5 class='card-title'>Origami Product</h5> \n"
                + "<p class='card-text'>Description of origami product</p> \n"
                + "<a href='#' class='btn btn-light'>Add to cart</a> \n"
                + "</div> \n"
                + "</div>");
            }
        out.print("</div><br>");
        }%>
        </div>
    </body>
</html>
