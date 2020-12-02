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
public class OrigamiKit {
    private long ID;
    private String name, desc, skillLevel, imageLocation, paperType;
    private boolean doubleSided;
    private double price;

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

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the skillLevel
     */
    public String getSkillLevel() {
        return skillLevel;
    }

    /**
     * @param skillLevel the skillLevel to set
     */
    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
    
    /**
     * @return the imageLocation
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * @param imageLocation the imageLocation to set
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
    
    /**
     * @return the paperType
     */
    public String getPaperType() {
        return paperType;
    }

    /**
     * @param paperType the paperType to set
     */
    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
    
    /**
     * @return the doubleSided
     */
    public boolean getDoubleSided() {
        return doubleSided;
    }

    /**
     * @param doubleSided the doubleSided to set
     */
    public void setImageLocation(boolean doubleSided) {
        this.doubleSided = doubleSided;
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
        this.price = price;
    }
      
    public OrigamiKit(long ID, String name, String desc, String skillLevel, String imageLocation, String paperType, double price, boolean doubleSided){
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.skillLevel = skillLevel;
        this.imageLocation = imageLocation;
        this.paperType = paperType;
        this.doubleSided = doubleSided;
        this.price = price;
    }
}