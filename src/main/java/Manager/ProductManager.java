/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Data.ProductDAO;
import Shop.Cart;
import Shop.InventoryEntry;
import Shop.OrigamiKit;
import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class ProductManager {
    /*
    Helper functions to check if an item is already in a cart, update quantity of products already in the cart,
    count items in the cart and calculate the price of everything in the cart
    */
    
    public boolean isInCart(Cart cart, String ID){
        ArrayList<InventoryEntry> items = cart.getItems();
        for (InventoryEntry item : items) {
            OrigamiKit product = item.getKit();
            String PID = String.valueOf(product.getID());
            if (ID.equals(PID)){
                return true;
            }
        } return false;    
    }
    
    public Cart updateItems(Cart cart, String ID, int quantity) {
        ArrayList<InventoryEntry> items = cart.getItems();
        for (InventoryEntry item : items) {
            OrigamiKit product = item.getKit();
            String PID = String.valueOf(product.getID());
            int index = items.indexOf(item);
            if (ID.equals(PID)){
                quantity += item.getAmount();
                item.setAmount(quantity);
                items.set(index, item);
                cart.setItems(items);
                return cart;
            }
        }
        return cart;
    }
    
    public Cart itemCount(Cart cart){
        int itemsAmount = 0;
        for (InventoryEntry item : cart.getItems()){
            itemsAmount += item.getAmount();
        }
        cart.setItemsAmount(itemsAmount);
        return cart;
    }
    
    public Cart calcPrice(Cart cart){
        double price = 0;
        for (InventoryEntry item : cart.getItems()){
            OrigamiKit product = item.getKit();
            int amount = item.getAmount();
            price += (product.getPrice()*amount);
        }
        cart.setPrice(price);
        return cart;
    }
    
    /*
    Uses the helper functions to add items to the cart depending on where they were added from
    */
    public Cart addToCartFromHome(Cart cart, String ID) {
        if (isInCart(cart,ID)){
            cart = updateItems(cart, ID, 1);
        }
        else {
            ProductDAO PDAO = new ProductDAO();
            OrigamiKit product = PDAO.getProductByID(ID);
            InventoryEntry item = new InventoryEntry(product, 1, product.getPrice());
            ArrayList<InventoryEntry> items = cart.getItems();
            items.add(item);
            cart.setItems(items);
        }
        cart = itemCount(cart);
        cart = calcPrice(cart);
        return cart;
    }
    
    public Cart addToCartFromProduct(Cart cart, String ID, int quantity){
        if (isInCart(cart, ID)){
            cart = updateItems(cart, ID, quantity);
        }
        else {
            ProductDAO PDAO = new ProductDAO();
            OrigamiKit product = PDAO.getProductByID(ID); 
            InventoryEntry item = new InventoryEntry(product, quantity, (product.getPrice()*quantity));
            ArrayList<InventoryEntry> items = cart.getItems();
            items.add(item);
            cart.setItems(items);
        }
        cart = itemCount(cart);
        cart = calcPrice(cart);
        return cart;
    }
}
