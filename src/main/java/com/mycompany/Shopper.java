/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.ArrayList;
/**
 *
 * @author Omar
 */
public abstract class Shopper {
    private ArrayList<String> functionCalls;
    private Cart cart;
    
    public ArrayList<String> getFunctionCalls(){
        return functionCalls;
    }
    public OrigamiKit selectProduct(OrigamiKit selected){
        return selected;
    }
    
    public ArrayList<InventoryEntry> addToCart(ArrayList<InventoryEntry> cart) {
        return cart;
    }
    
    //This will take an InventoryEntry item and the cart of the  and call the removeItem function in Cart
    public Cart removeFromCart(Cart cart){
        return cart.removeItem(cart);
    }
    
    public String selectDeliveryOptions(String deliveryOption) {
        return deliveryOption;
    }
    
    public Cart purchase(Cart cart){
        return cart;
    }
    
    public void activityUpdate(String functionName){
        this.functionCalls.add(functionName);
    }    
}
