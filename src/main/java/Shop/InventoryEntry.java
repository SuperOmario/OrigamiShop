/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import Utils.PriceRounder;

/**
 *
 * @author Omar
 */
public class InventoryEntry {
    private OrigamiKit kit;
    private int amount;
    private double price;
    
    /**
     * @return the kit
     */
    public OrigamiKit getKit() {
        return kit;
    }

    /**
     * @param kit the kit to set
     */
    public void setKit(OrigamiKit kit) {
        this.kit = kit;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * @return the amount
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param amount the amount to set
     */
    public void setPrice(double price) {
        PriceRounder pr = new PriceRounder();
        price = pr.round(price, 2);
        this.price = price;
    }
    
    public InventoryEntry(OrigamiKit kit, int amount, double price){
        this.kit = kit;
        this.amount = amount;
        PriceRounder pr = new PriceRounder();
        price = pr.round(price, 2);
        this.price = price;
    }
}
