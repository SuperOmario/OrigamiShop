
package Shop;

/**
 *
 * @author Omar
 */
public class PaperSet {
    private long ID;
    private int[] size = new int[2];
    private String colour;
    private String type;
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
     * @return the size
     */
    public int[] getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int[] size) {
        this.size = size;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
    
    public PaperSet(long id,int[] size, String colour, String type, int amount){
        this.size = size;
        this.colour = colour;
        this.type = type;
        this.amount = amount;
    }
}
