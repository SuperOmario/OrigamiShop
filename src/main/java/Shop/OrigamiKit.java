/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;
/**
 *
 * @author Omar
 */
public class OrigamiKit {
    private long ID;
    private String name, desc, type, skillLevel;
    private double price;
    private ArrayList<PaperSet> paper;
    private ArrayList<String> instructionSet;

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

    /**
     * @return the paper
     */
    public ArrayList<PaperSet> getPaper() {
        return paper;
    }

    /**
     * @param paper the paper to set
     */
    public void setPaper(ArrayList<PaperSet> paper) {
        this.paper = paper;
    }

    /**
     * @return the instructionSet
     */
    public ArrayList<String> getInstructionSet() {
        return instructionSet;
    }

    /**
     * @param instructionSet the instructionSet to set
     */
    public void setInstructionSet(ArrayList<String> instructionSet) {
        this.instructionSet = instructionSet;
    }
      
    public OrigamiKit(long ID, String name, String desc, String type, String skillLevel, double price, ArrayList<PaperSet> paper, ArrayList<String> instructionSet){
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.skillLevel = skillLevel;
        this.price = price;
        this.paper = paper;
        this.instructionSet = instructionSet;
    }
}