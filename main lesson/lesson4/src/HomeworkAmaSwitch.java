import java.util.Scanner;

public class HomeworkAmaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the SIMS");
        System.out.print("Please enter your score: ");
        int score = scanner.nextInt();

        int r = score%10;
        if (r==0){
            score--;
        }

        if(score<=0 || score>100){
            System.out.println("O kadar degil hocam!!!");

        }
        else {
            switch(score / 10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Very bad :(  You got 'F'");
                    System.out.println("NT");
                    break;
                case 6:
                    System.out.println("Good :|  You got 'D'");
                    break;
                case 7:
                    System.out.println("Nice <3  You got 'C'");
                    break;
                case 8:
                    System.out.println("Impressive :)  You got 'B'");
                    break;
                default:
                    System.out.println("Incredible :D  You got 'A'");
                    break;
            }

        }
    }
}
