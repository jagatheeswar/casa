import java.util.*;

class casa {
    public static void main(String args[]) {
        String input = "";
        try (Scanner sc = new Scanner(System.in)) {
            String trim = "";
            HashMap<Integer,Products> hm = new HashMap<Integer,Products>();
            Inventorymanagement im = new Products();
            Selling sell = new Selling();
            AddProduct addProduct = new AddProduct();
            Stock stock = new Stock();
            Display d = new Display();
            System.out.println("welcome to inventory management system \n");
            do {
                input = sc.nextLine();
                trim = input.split("=>")[0];
                
                switch(trim) {
                    case "INVENTORY":
                        addProduct.add(input, im, hm);
                    break;

                    case "SALE":
                        sell.sellone(input, hm);
                    break;

                    case "STOCK":
                        int stockpid = Integer.parseInt(input.split("=>")[1]);
                        stock.showStock(hm,stockpid);
                    break;

                    case "DISPLAY":
                        d.display(hm);
                    break;

                    default:
                      System.out.println("invalid input format");
                    break;
                }
            }
            while(!input.equals("quit"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}