/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Code taken and adapted from https://www.w3resource.com/javascript/form/email-validation.php
 * Just uses regex to determine if the email is a valid format, cannot determine if the email itself is valid
 * I tried the apache commons validator originally but it didn't work, I think it's for a newer version of Java
 * I then realised I could just use javascript to do this and it would be better to do this client side anyway rather than submitting the form and then doing it
 */
function isValid(mail) {
    var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    if(mail.value.match(mailformat)){
        return true;
    } else {
        alert("You have entered an invalid email address!");
        document.loginform.email.focus();
        return false;
    }
}