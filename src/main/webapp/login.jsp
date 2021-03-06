<%-- 
    Document   : login
    Created on : 24 Nov 2020, 13:52:53
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="css/shortPages.css">
    </head>
    <body>
        <% if (session.getAttribute(IConstants.SESSION_KEY_USER) != null){
            request.getRequestDispatcher("/Home").forward(request, response);
        }     
        %>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="Home"><h2>Kami Rōtasu</h2></a>
            <div class="navbar-text">
            </div> 
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class='collapse navbar-collapse' id='navbarSupportedContent'>
                <ul class='navbar-nav ml-auto mt-2 mt-lg-0'>
                    <a href='register.jsp'><li>Don't have an account? Register</li></a>
                </ul>
            </div>
        </nav>
        <div class='container mainbody'>
            <%if (session.getAttribute("message") != null && session.getAttribute("message") != ""){%>
            <jsp:include page="messages.jsp"/>
            <%}%>
            <!-- once the messages are rendered they are cleared so that they don't appear on other pages -->
            <%
                session.setAttribute("message", "");
            %>
            <h1>Login</h1>
            <form name="loginform" action="Login" method="post">
                <label for="email">Email</label>
                <div class="input-group mb-3">
                    <input type="text" class="form-control" id="email" name="email" placeholder="Email" required>  
                </div>
                <label for="password">Password</label>
                <div class="input-group mb-3">
                    <input type="text" class="form-control" id="password" name="password" placeholder="Password" required>
                </div>
                <label>
                    <input type="checkbox" name="remember" value='true' class='mr-2'>Stay Signed In?
                </label>
                <br>
                <button type="submit" name="submit" value="Submit" class="btn btn-success btn-lg">Log in</button> 
            </form>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>  
</html>