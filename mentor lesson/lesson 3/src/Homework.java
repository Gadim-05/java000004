import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int a = scanner.nextInt();
        int element = 0;
        int[] arr = new int[a];

        System.out.println("Enter the elements of  the array: ");
        for (int i = 0; i < arr.length ; i++) {
             element = scanner.nextInt();
            arr[i] = element;
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if (target==arr[i]){
                System.out.println("Target value found at index: " + i);
            }


        }

    }
}
