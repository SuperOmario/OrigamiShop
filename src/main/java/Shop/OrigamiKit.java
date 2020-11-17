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
    private int id;
    private String name, desc, type, skillLevel;
    private double price;
    private ArrayList<PaperSet> paper;
    private ArrayList<String> instructionSet;
    
    public OrigamiKit(String name, String desc, String type, String skillLevel, double price, ArrayList<PaperSet> paper, ArrayList<String> instructionSet){
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.skillLevel = skillLevel;
        this.price = price;
        this.paper = paper;
        this.instructionSet = instructionSet;
    }
    
    //no setters as individual origami sets will not be modified, new ones will be added instead
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getType(){
        return type;
    }
    
    public String getSkillLevel(){
        return skillLevel;
    }
    
    public double getPrice(){
        return price;
    }
    
    public ArrayList<PaperSet> getPaper(){
        return paper;
    }
    
    public ArrayList<String> getInstructionSet(){
        return instructionSet;
    }
}