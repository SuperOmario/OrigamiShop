/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author Omar
 */
public class InventoryEntry {
    private long ID;
    private OrigamiKit kit;
    private int amount;
    
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
    
    public InventoryEntry(long ID, OrigamiKit kit, int amount){
        this.ID = ID;
        this.kit = kit;
        this.amount = amount;
    }
}
