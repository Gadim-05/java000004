import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter input (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                break;
            }

            try {
                InputCategory category = InputDetector.categorizeInput(userInput);
                System.out.println("The input: " + category.getValue());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}