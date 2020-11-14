
package com.mycompany;

/**
 *
 * @author Omar
 */
public class PaperSet {
    private int[] size = new int[2];
    private String colour;
    private String type;
    
    public PaperSet(int[] size, String colour, String type){
        this.size = size;
        this.colour = colour;
        this.type = type;
    }
    
    //no setters as the individual paper wouldn't be changed within the Origami Kit
    public int[] getSize(){
        return size;
    }
    
    public String getColour(){
        return colour;
    }
    
    public String getType(){
        return type;
    }
}
