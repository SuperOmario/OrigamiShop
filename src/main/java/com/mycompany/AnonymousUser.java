/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author Omar
 */
public class AnonymousUser {
    private String name;
    
    public boolean login() 
    {
        return true;
    };
    
    public RegisteredUser register(RegisteredUser username) {
        return username;
    };
    
    public String getName()
    {
        return name;
    }
}
