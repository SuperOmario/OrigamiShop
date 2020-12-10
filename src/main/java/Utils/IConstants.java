/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Omar
 */
public interface IConstants {
    
    //User Types
    public static final String USER_TYPE_ADMIN = "ADMIN";
    public static final String USER_TYPE_GENUSER = "GENUSER";
    
    //Session Keys
    public static final String SESSION_KEY_USER = "SKUSER";
    public static final String SESSION_KEY_ALL_USERS = "SKALLUSERS";
    
    //Message Types
    //This will help to choose the CSS class needed for the message to be displayed
    public static final String MESSAGE_TYPE_ERROR = "danger";
    public static final String MESSAGE_TYPE_SUCCESS = "success";
}
