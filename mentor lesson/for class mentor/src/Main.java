import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int a = scanner.nextInt();
//        if (a>0&&a<100) {
//
//
//            if (a % 2 == 0) {
//                System.out.println("The number is an even and ranges from 0 to 100");
//            }
//            else{
//                System.out.println("The number is an odd and ranges from 0 to 100");
//            }
//        }
//        else{
//            System.out.println("Condition is not met...");
//        }
        double sum = 0;
        System.out.print("Please enter array size: ");
        int a = scanner.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter " + i + ". element:");
            double element = scanner.nextDouble();
             sum += element;
        }
        double average = sum/a;
        System.out.println("Average value of the array elements is: " + average);

    }
}