import java.util.*;

public class Products extends Inventorymanagement {
    int productId;
    String productName;
    int pricePerQuantity;
    String offer;

    public Products() {
        super();
    };

    public Products(int Productid,String Productname,int Quantity,int PricePerQuantity,String Offer) {
        super(Quantity);
        this.productId = Productid;
        this.productName = Productname;
        this.pricePerQuantity = PricePerQuantity;
        this.offer = Offer;
    }

    public void alertmessage() {
        System.out.println(" \n Inventory Updated.\n");
    }

    public void add(HashMap<Integer,Products> hm,int id,Products pr) {
        hm.put(id,pr );
        alertmessage();
    }

    public boolean check(int pid,HashMap<Integer,Products> hm)
    {
        Products temp = hm.get(pid);
        if(temp != null) {
            System.out.println(" \n There is a product with the same id - " + pid + " named "+ temp.productName );
            return true;
        }
        return false;
    }
}
