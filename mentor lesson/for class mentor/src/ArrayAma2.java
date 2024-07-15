import java.util.Scanner;

public class ArrayAma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        int max = arr[0][0];

        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                System.out.print("Enter element at position (" + i + "," + j + ") : ");
                arr[i][j] = scanner.nextInt();


            }

        }
        System.out.println("The array you entered is: ");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                System.out.print(arr[i][j] + " ");
                int element = arr[i][j];
                 sum = sum + element;
            }
            System.out.println(" ");
        }
        System.out.println("Total sum: " + sum);
    }
}
