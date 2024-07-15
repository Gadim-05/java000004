import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random()*10)+1;
//        System.out.println(a);
        System.out.print("Guess the number: ");
        int b = scanner.nextInt();


        if(a==b){
            System.out.println("Congratulations, you found the number");
        }
        else if(a>b){
            System.out.println("Too low, The number was " + a);
        }
        else{
            System.out.println("Too high, The number was " + a);
        }
    }
}
