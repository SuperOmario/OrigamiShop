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
public class Inventory {
    private ArrayList<InventoryEntry> kits;
    private int sales;

    /**
     * @return the kits
     */
    public ArrayList<InventoryEntry> getKits() {
        return kits;
    }

    /**
     * @param kits the kits to set
     */
    public void setKits(ArrayList<InventoryEntry> kits) {
        this.kits = kits;
    }

    /**
     * @return the sales
     */
    public int getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(int sales) {
        this.sales = sales;
    }
    
    public Inventory(ArrayList<InventoryEntry> kits, int sales) {
        this.kits = kits;
        this.sales = sales;
    }
}
