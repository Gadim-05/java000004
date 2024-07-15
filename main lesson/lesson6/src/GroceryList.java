import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many products do you want to buy:");
        int pro = scanner.nextInt();
        System.out.println("Please enter products what you want to buy");

        String[] arr = new String[pro];
        for (int i = 0; i <arr.length ; i++) {


            System.out.print(i+1 + ". product: ");
            arr[i] = scanner.next();
        }



        System.out.println("Your products are these:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + ". product: " + arr[i]);
        }




    }
}
