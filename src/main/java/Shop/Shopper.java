/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;
/**
 *
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public abstract class Shopper {
    private ArrayList<String> functionCalls;
    private Cart cart;
    
    //no setters as functionCalls and carts are dynamic and will be added to, not set directly
    public ArrayList<String> getFunctionCalls(){
        return functionCalls;
    }
    
    public Cart getCart(){
        return cart;
    }
    
    public OrigamiKit selectProduct(OrigamiKit selected){
        return selected;
    }
    
    public OrigamiKit addToCart(OrigamiKit origamikit) {
        return origamikit;
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
