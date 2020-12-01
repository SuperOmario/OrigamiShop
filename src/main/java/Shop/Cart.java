/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import jdk.internal.net.http.common.Pair;
import java.util.ArrayList;
/**
 *
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public class Cart {
    private long ID;
    private ArrayList<InventoryEntry> items;
    private double price;
 
    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(long ID) {
        this.ID = ID;
    }
    
    /**
     * @return the items
     */
    public ArrayList<InventoryEntry> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<InventoryEntry> items) {
        this.items = items;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Pair<InventoryEntry, Double> addItem(InventoryEntry item, double price){
        return new Pair<InventoryEntry, Double>(item, price);
    }
    
    //This will take in an InventoryEntry item and remvoe it from the cart, returning the cart
    public Cart removeItem(Cart cart){
        return cart;
    }
}
