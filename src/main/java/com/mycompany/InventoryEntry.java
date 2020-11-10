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
public class InventoryEntry {
    OrigamiKit kit;
    int amount;
    
    public InventoryEntry(OrigamiKit kit, int amount)
    {
        this.kit = kit;
        this.amount = amount;
    }
    
    public OrigamiKit getKit()
    {
        return kit;
    }
    
    public int getAmount()
    {
        return amount;
    }
}
