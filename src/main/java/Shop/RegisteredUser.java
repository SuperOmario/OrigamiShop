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
public class RegisteredUser extends Shopper {
    private int CustomerID;
    
    //no setters as CustomerID is not something that should be changeable
    public int getCustomerID(){
        return CustomerID;
    }
}
