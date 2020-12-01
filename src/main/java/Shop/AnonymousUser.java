/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public class AnonymousUser{
    private long ID;
    private String name;

    /**
     * @return the id
     */
    public long getID() {
        return ID;
    }

    /**
     * @param id the id to set
     */
    public void setID(long ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public AnonymousUser(long ID, String name){
        this.ID = ID;
        this.name = name;
    }
}
