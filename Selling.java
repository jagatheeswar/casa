import java.util.*;
public class Selling {
    public Selling(){};

    public void sellone(String input, HashMap<Integer,Products> hm) {
        String salesplit[] = input.split("=>")[1].split(";");
        int totalCost = 0;
        System.out.println();
        System.out.println("== BILL ==");
        System.out.println(salesplit.length);
        for(int i = 0;i<salesplit.length;i++) {
            String temp = salesplit[i];
            int saleproductid = Integer.parseInt(temp.split("[|]")[0]);
            int salequantity = Integer.parseInt(temp.split("[|]")[1]);
            totalCost+=sell(hm,salequantity,saleproductid);
        }
        System.out.println("\n == Total ==");
        System.out.println("  " +totalCost + " Rs ");
        System.out.println("===============");
    }

    public int sell(HashMap<Integer,Products> hm, int quantity, int pid) {
        Products temp = hm.get(pid); 
        if(quantity<=temp.quantity) {
            int net = quantity*(temp.pricePerQuantity);
            System.out.println(pid + "  -  " + temp.productName + "  --  "+ quantity + "  --  "+ temp.pricePerQuantity + "  --  " + temp.offer + "  --  " +net);
            decrement(hm, quantity, pid);
            return net;
        }
        else {
            System.out.println(temp.productName +  " IS OUT OF STOCK!! ");
            return 0;
        }
    }
    public void decrement(HashMap<Integer,Products> hm,int quantity,int pid) {
        Products temp = hm.get(pid); 
        temp.quantity -= quantity;
    }
}
