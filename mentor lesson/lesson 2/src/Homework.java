import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int r =(int) (Math.random()*10)+1;

        if (a>=b && a>=c){
            System.out.println("The largest number is " + a);
            if (a==r){
                System.out.println("Random number: " + r + " is equal with: " + a);
            }
            else {
                System.out.println("Random number: " + r + " is not equal with: " + a);
            }
        } else if (b>=a && b>=c) {
            System.out.println("The largest number is " + b);

            if (b==r){
                System.out.println("Random number: " + r + " is equal with: " + b);
            }
            else {
                System.out.println("Random number: " + r + " is not equal with: " + b);
            }
        }
        else if (c>=a && c>=b){
            System.out.println("The largest number is " + c);

            if (c==r){
                System.out.println("Random number: " + r + " is equal with: " + c);
            }
            else {
                System.out.println("Random number: " + r + " is not equal with: " + c);
            }
        }

    }
}
