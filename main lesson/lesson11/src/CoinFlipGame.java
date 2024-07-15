import java.util.Random;
import java.util.Scanner;

public class CoinFlipGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("WELCOME TO COINFLIP GAME....");
        System.out.println("Please choose Heads or Tails");
        System.out.println("1--->Heads");
        System.out.println("2--->Tails");
        System.out.print("How many rounds you want to play: ");
        int rounds = sc.nextInt();
        int userScore = 0;
        int compScore = 0;


        for (int i = 0; i<rounds; i++){
            System.out.print("Enter your choice: ");
            int user = sc.nextInt();
            int comp;
            if (user == 1){
                comp = 2;
            }
            else {
                comp = 1;
            }
            int coin = random.nextInt(2);

            if (user < 1 || user>2){
                System.out.println("Invalid number");
                break;
            }
            else {
                if (user == coin){
                    System.out.println("You won");
                    userScore++;
                }
                else {
                    System.out.println("Computer won");
                    compScore++;
                }

            }
        }
        System.out.println("Your score: " + userScore);
        System.out.println("Computer's score: " + compScore);
    }
}
