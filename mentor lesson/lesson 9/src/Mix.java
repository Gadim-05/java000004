import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        System.out.println("Enter the times: ");
        int count = sc.nextInt();
        StringBuilder sb;
        sb = new StringBuilder(word);

        String reword = String.valueOf(sb.reverse());

        for (int i = 0; i <count ; i++) {
            System.out.print(reword);
        }

    }
}
