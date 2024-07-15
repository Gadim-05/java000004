import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many book you want to add: ");
        int  count = scanner.nextInt();

        String[][] bookInfo = new String[count][2];
        System.out.println("Enter book name and author:");
        for (int i = 0; i <count ; i++) {
            System.out.print((i+1) + ". Book Name:" );
            bookInfo[i][0] = scanner.next();
            System.out.print((i+1) + ". Book Author: ");
            bookInfo[i][1] = scanner.next();

        }
        System.out.println("Library: ");
        for (int i = 0; i <count ; i++) {
                System.out.println("Book Name: " + bookInfo[i][0]);
                System.out.println("Author: " + bookInfo[i][1]);

        }
    }
}
