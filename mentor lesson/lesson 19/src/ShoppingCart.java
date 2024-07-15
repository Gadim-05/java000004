import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {

    static Map<String,Double> items = new HashMap<>();

    public static void addItem(String itemName, Double itemPrice){
        items.put(itemName,itemPrice);
    }

    public static double calculatingPrice(){
        double total = 0;

        for (double price : items.values()){
            total+=price;
        }
        return total;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many item would you add: ");
        int numItems = scanner.nextInt();

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter item name: ");
            String name = scanner.next();

            System.out.println("Enter item price: ");
            double price = scanner.nextDouble();

            addItem(name,price);

        }


        System.out.println("Total Price: "  + calculatingPrice());

    }

}
