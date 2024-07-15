import java.util.Scanner;

public class GuessNumberGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random()*10)+1;
//        System.out.println(a);

        int health = 3;

        while(true){
            System.out.print("Guess the number: ");
            int b = scanner.nextInt();
            if(a==b){
                System.out.println("Congratulations, you found the number");
                break;
            }
            else if(a>b){
                System.out.println("Too low");
                health-=1;
            }
            else{
                System.out.println("Too high");
                health-=1;
            }
            if (health==0){
                System.out.println("GAME OVER");
                System.out.println("The number was " + a);
                break;
            }
        }
    }
}
