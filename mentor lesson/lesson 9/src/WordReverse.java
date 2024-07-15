import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.print("Enter a sentence: ");
            String s = sc.nextLine();
            if (s.equals("exit")){
                break;
            }
            char[] reverse = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                reverse[i] = s.charAt(i);
            }
            for (int i = s.length() - 1; i >= 0; i--) {

                System.out.print(reverse[i]);
            }
            System.out.println();

        }
    }
}
