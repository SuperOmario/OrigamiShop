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
public class Inventory {
    private ArrayList<InventoryEntry> kits;
    private int sales;
    
    //standard constructor as a new inventory object would have no stock or sales
    public Inventory(){
        sales = 0;
    }
    
    public ArrayList<InventoryEntry> getKits(){
        return kits;
    }
    
    public int getSales(){
        return sales;
    }
    
    public ArrayList<InventoryEntry> stock(){
        return kits;
    }
    
    public Pair<InventoryEntry, Double> sell(InventoryEntry kit, double money){
        return new Pair<InventoryEntry, Double>(kit, money);
    }
    
    public ArrayList<InventoryEntry> getInventory(){
        return kits;
    }
}
