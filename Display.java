import java.util.*;

public class Display {
    public void display(HashMap<Integer,Products> hm) {
        for(Map.Entry<Integer,Products> it:hm.entrySet())
            System.out.println(it.getValue().productId + "  -  " + it.getValue().productName + "  --  "+ it.getValue().quantity + "  --  "+ it.getValue().pricePerQuantity + "  --  " + it.getValue().offer);

    }
}
