import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        int max = arr[0][0];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                System.out.print("Enter element at position (" + i + "," + j + ") : ");
                arr[i][j] = scanner.nextInt();

                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The biggest element: " + max);
    }
}
