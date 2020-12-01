/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Shop.RegisteredUser;
import Utils.IConstants;

/**
 *
 * @author Omar
 */
public class UserDAO {
    private RegisteredUser[] users;
    
    //populates the "database" with two users
    public void populateUsers(){
        RegisteredUser Admin = new RegisteredUser(1, "Bill", "admin@admin.com", "a", IConstants.USER_TYPE_ADMIN);
        RegisteredUser User = new RegisteredUser(2, "Bill", "user@user.com", "a", IConstants.USER_TYPE_USER);
        
        RegisteredUser[] users = {Admin, User};
        this.users = users;
    }
    
    //will check if the user with that email exists and return it
    public RegisteredUser getUserByEmail(String email) {
        for (RegisteredUser user : this.users) {
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
    
}
