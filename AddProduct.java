import java.util.*;

public class AddProduct{

    public AddProduct(){}

    public void add(String input, Inventorymanagement im, HashMap<Integer, Products> hm)
    {
        String[] splitarr = input.split("=>")[1].split("[|]");
        int productId = Integer.parseInt(splitarr[0]);
        if(im.check(productId,hm))
        {
            return;
        }
        String productName = splitarr[1];
        int quantity = Integer.parseInt(splitarr[2]);
        int pricePerQuantity = Integer.parseInt(splitarr[3]);
        Products pr = new Products(productId, productName, quantity, pricePerQuantity,"N/A");
        pr.add(hm, productId, pr);

    }
}
