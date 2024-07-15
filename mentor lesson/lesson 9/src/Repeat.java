import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        System.out.println("Enter the number of times to concatenate: ");
        int count = scanner.nextInt();

        for (int i = 0; i <count ; i++) {
            System.out.print(word);
        }
    }
}
