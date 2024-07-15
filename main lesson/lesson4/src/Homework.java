import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the SIMS");
        System.out.print("Please enter your score: ");
        int score = scanner.nextInt();

        if(score<=0 || score>100){
            System.out.println("O kadar degil hocam!!!");

        }
        else {

            if (score>0 && score<=60){
                System.out.println("Very bad :(  You got 'F'");
                System.out.println("NT");
            }
            else if (score>60 && score<=70){
                System.out.println("Good :|  You got 'D'");
            } else if (score>70 && score<=80) {
                System.out.println("Nice <3  You got 'C'");
            }
            else if (score>80 && score<=90){
                System.out.println("Impressive :)  You got 'B'");
            } else{
                System.out.println("Incredible :D  You got 'A'");
            }
        }
    }
}