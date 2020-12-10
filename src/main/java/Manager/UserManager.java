package Manager;

import Data.UserDAO;
import Shop.RegisteredUser;
import Utils.IConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omar
 */
public class UserManager {
    
    public RegisteredUser loginUser(String email, String password){
        
        UserDAO userDAO = new UserDAO();
        userDAO.populateUsers();
        RegisteredUser user = userDAO.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)){
            return user;
        } else {
            return null;
        }
    }

}
