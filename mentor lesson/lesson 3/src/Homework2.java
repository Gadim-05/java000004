import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound at the range: ");
        int a = scanner.nextInt();
        System.out.print("Enter the upper bound at the range: ");
        int b = scanner.nextInt();
        System.out.println("Prime numbers within the range " + a + "to " + b);
        for (int i = a; i<=b; i++){
            boolean isPrime = true;
            for (int j = 2; j<=Math.sqrt(i); j++){

                if (i%j==0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                System.out.print(i + " ");
            }

        }
    }
}
