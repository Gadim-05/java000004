import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be converted: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency code: ");
        String source = scanner.next();

        System.out.print("Enter the target currency code: ");
        String target = scanner.next();

        switch (source) {
            case "AZN":
                switch (target) {
                    case "USD":
                        amount /= 1.7;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    case "EUR":
                        amount /= 2;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;
            case "USD":
                switch (target) {
                    case "AZN":
                        amount *= 1.7;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    case "EUR":
                        amount /= 1.2;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;
            case "EUR":
                switch (target) {
                    case "AZN":
                        amount *= 2;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    case "USD":
                        amount *= 1.2;
                        System.out.println("Converted amount: " + amount + " " + target);
                        break;

                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;

            default:
                System.out.println("ERROR");
                break;
        }
    }
}