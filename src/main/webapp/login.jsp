<%-- 
    Document   : login
    Created on : 24 Nov 2020, 13:52:53
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
        <script src="js/emailValidator.js"></script>
    </head>
    <body>
        <h1>Login</h1>
        <form name="loginform" action="Login" method="post" onsubmit="return isValid(document.loginform.email)">
            <label for="email">Email</label>
            <div class="input-group mb-3">
                <input type="text" class="form-control" id="email" name="email" placeholder="Email" required>  
            </div>
            <label for="password">Password</label>
            <div class="input-group mb-3">
                <input type="text" class="form-control" id="password" placeholder="password" required>
            </div>
            <label>
                <input type="checkbox" checked="checked" name="remember">Remember Me
            </label>
            <br>
            <button type="submit" name="submit" value="Submit" class="btn btn-success btn-lg">Log in</button> 
        </form>
    </body>  
</html>