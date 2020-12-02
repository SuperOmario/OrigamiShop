/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Shop.OrigamiKit;
import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class ProductDAO {
    
    public ArrayList<OrigamiKit> getTopProducts(int numProducts) {
        //hard code some producst in absence of the database
        ArrayList<OrigamiKit> prods = new ArrayList();
        OrigamiKit p1 = new OrigamiKit(1, "GameNote Kids Origami", "54 PCS Patterns, 55 Page Craft Guiding Book", "Beginner", "gamenote.jpg", "foil-back", 21.99, true);
        prods.add(p1);
        
        OrigamiKit p2 = new OrigamiKit(2, "Aonokoy Kids Origami", "54 PCS Patterns, 55 Page Craft Guiding Book", "Beginner", "aonokoy.jpg", "abaca", 19.00, true);
        prods.add(p2);
        
        OrigamiKit p3 = new OrigamiKit(3, "Opret Kids Origami", "27 Patterns, 14 Pages Craft Guiding Book, 20 Pages 10 Colours Origami Paper", "Beginner", "opret.jpg", "washi", 14.52, false);
        prods.add(p3);
        
        OrigamiKit p4 = new OrigamiKit(4, "Sunerly Kids Beginners", "27 Patterns, 14 Pages Craft Guiding Book, 20 Pages 10 Colours Origami Paper", "Beginner", "sunerly.jpg", "copy paper", 21.99, true);
        prods.add(p4);
        
        OrigamiKit p5 = new OrigamiKit(5, "Turtle Amazing Origami", "144 Origami Papers with Book, 17 Projects", "Beginner", "turtle.jpg", "kozo", 18.15, true);
        prods.add(p5);
        
        OrigamiKit p6 = new OrigamiKit(6, "The Classic Art of Origami", "14 colourful origami sheets, 5 beautiful origami designs", "Beginner", "art.jpg", "unryu", 6.25, false);
        prods.add(p6);
        return prods;
    }
}
