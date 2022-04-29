import java.util.HashMap;

public class Stock {

    public void showStock(HashMap<Integer,Products> hm,int pid)
    {
        Products temp = hm.get(pid);
        System.out.println(temp.productName + "  -  " + temp.quantity);
    }    
}
