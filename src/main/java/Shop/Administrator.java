/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.ArrayList;

/**
 * functions will be implemented in the next iteration and are subject to change
 * @author Omar
 */
public class Administrator extends Shopper{
    private int employeeID;
    
    //no setEmployeeID as this should be randomly generated and unavailable to change
    public int getEmployeeID(){
       return employeeID;
    };
    
    public OrigamiKit setProduct(String name, String desc, String type, String skillLevel, double price, ArrayList<PaperSet> paper, ArrayList<String> instructionSet){
        OrigamiKit newOrigamiKit = new OrigamiKit(name,desc,type,skillLevel,price,paper,instructionSet);
        return newOrigamiKit;
    }
    
    public double allocateDeliveryCharges(double charge){
        return charge;
    }
    
    public ArrayList<String> checkUserActivity(Shopper user){
        return user.getFunctionCalls();
    }
    
    public int checkTotalSales(Inventory inventory){
        return inventory.getSales();
    }
    
    public ArrayList<InventoryEntry> checkInventory(Inventory inventory){
        return inventory.getInventory();
    }
}
