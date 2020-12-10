/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Omar
 */
public class EmailValidator {
    
    public boolean isValid(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern mailFormat = Pattern.compile(regex);
        Matcher matcher = mailFormat.matcher(email);
        if (matcher.matches()){
            return true;
        }
        return false;
    }
}
