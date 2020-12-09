package Utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Omar
 */

/*
code found at https://www.baeldung.com/java-round-decimal-number
*/
public class PriceRounder {
    public static double round(double price, int places){
        if (places < 0) throw new IllegalArgumentException();
        
        BigDecimal bd = new BigDecimal(Double.toString(price));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
