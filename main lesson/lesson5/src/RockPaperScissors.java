import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOM TO GAME");
        System.out.println("Game rules:");
        System.out.println("0---rock");
        System.out.println("1---paper");
        System.out.println("2---scissors");
        System.out.println("rock>scissors\n  scissors>paper\n paper>rock");
        System.out.println("q---exit");

        int playerPoint = 0;
        int computerPoint = 0;
        String exit = "";

        while (exit.equals("")){
            int random = (int) (Math.random()*10)/4;

//            System.out.println(random);

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (random==0 && choice==2){
                System.out.println("Computer won");
                computerPoint++;
            } else if (random==1 && choice==0) {
                System.out.println("Computer won");
                computerPoint++;
            } else if (random==2 && choice==1) {
                System.out.println("Computer won");
                computerPoint++;
            }
            else if (random==choice){
                System.out.println("Tie");
            }
            else {
                System.out.println("You won");
                playerPoint++;
            }
            System.out.println("If you want to exit press 'q' or press 'enter' for continue to the game");
            scanner.nextLine();
            exit = scanner.nextLine();
            System.out.println("Your score: " + playerPoint);
            System.out.println("Computer's score: " + computerPoint);
            if (exit.equals("q")){
                System.out.println("GAME OVER");
                break;

            }
        }

    }
}
