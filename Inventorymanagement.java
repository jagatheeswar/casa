import java.util.*;
abstract public class Inventorymanagement 
{
    int quantity;
    Inventorymanagement(){}
    public Inventorymanagement(int Quantity) {
        quantity = Quantity;
    }
    
    abstract public void add(HashMap<Integer,Products> hm,int id,Products pr);
    abstract public void alertmessage();
    abstract public boolean check(int pid,HashMap<Integer,Products> hm);
}
