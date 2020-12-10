/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import Utils.PriceRounder;
import java.util.ArrayList;
/**
 *
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public class Cart {
    private long ID;
    private ArrayList<InventoryEntry> items;
    private int itemsAmount;
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
     * @return the itemsAmount
     */
    public long getItemsAmount() {
        return itemsAmount;
    }

    /**
     * @param itemsAmount the itemsAmount to set
     */
    public void setItemsAmount(int itemsAmount) {
        this.itemsAmount = itemsAmount;
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
        PriceRounder pr = new PriceRounder();
        price = pr.round(price, 2);
        this.price = price;
    }
    
    public Cart(long ID, ArrayList<InventoryEntry> items, int itemsAmount, double price) {
        this.ID = ID;
        this.items = items;
        this.itemsAmount = itemsAmount;
        PriceRounder pr = new PriceRounder();
        price = pr.round(price, 2);
        this.price = price;
    }
}
