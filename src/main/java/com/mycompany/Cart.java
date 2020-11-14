/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import jdk.internal.net.http.common.Pair;
import java.util.ArrayList;
/**
 *
 * @author Omar
 */
public class Cart {
    private ArrayList<InventoryEntry> items;
    private double price;
    
    public ArrayList<InventoryEntry> getItems(){
        return items;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Pair<InventoryEntry, Double> addItem(InventoryEntry item, double price){
        return new Pair<InventoryEntry, Double>(item, price);
    }
    
    //This will take in an InventoryEntry item and remvoe it from the cart, returning the cart
    public Cart removeItem(Cart cart){
        return cart;
    }
}
