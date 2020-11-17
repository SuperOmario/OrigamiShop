/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public class AnonymousUser {
    private String name;
    
    //no setters as name will always be anonymous and registered users will set their name during registration through the constructor
    public AnonymousUser(){
        name = "Anonymous";
    }
    
    public boolean login(){
        return true;
    };
    
    public RegisteredUser register(RegisteredUser username) {
        return username;
    };
    
    public String getName(){
        return name;
    }
}
