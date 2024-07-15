import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] symbols =   {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
        double balance = 100;
        String[] slot = new String[6];
        int rand;

        System.out.println("WELCOME TO SLOT GAME");
        System.out.println("=============================");
        System.out.println("ARE YOU LUCKY  FOR TODAY?");
        System.out.println("=============================");
        System.out.println("EXIT--->'Q'");
        System.out.println("=============================");


        while (balance > 0) {
            System.out.println("Balance: " + balance);
            System.out.println("=============================");
            System.out.print("Enter bet amount: ");
            double bet = scanner.nextDouble();

            if (bet > balance) {
                System.out.println("INVALID AMOUNT!!!!");
                System.out.println("Balance: " + balance);
            } else {
                for (int i = 0; i < 6; i++) {
                    rand = random.nextInt(6);
                    slot[i] = symbols[rand];
                    System.out.print(slot[i]);
                }
                System.out.println();
                boolean won = false; // Bu değişken, kazanılan bir durumun olup olmadığını kontrol etmek için kullanılacak
                for (int i = 0; i < slot.length; i++) {
                    for (int j = i + 1; j < slot.length; j++) {
                        for (int k = j + 1; k < slot.length; k++) {
                            if (slot[i].equals(slot[j]) && slot[j].equals(slot[k])) {
                                won = true; // Eğer kazanılan bir durum varsa, won değişkenini true yap
                                switch (slot[i]) {
                                    case "🍒":
                                        balance += bet;
                                        break;
                                    case "🍋":
                                        balance += (2.4 * bet);
                                        break;
                                    case "🍊":
                                        balance += (0.5 * bet);
                                        break;
                                    case "🔔":
                                        balance += (0.25 * bet);
                                        break;
                                    case "🍉":
                                        balance += (5 * bet);
                                        break;
                                    case "🍇":
                                        balance += (3 * bet);
                                        break;
                                }
                                System.out.println("CONGRATULATIONS, YOU WON " + balance + "$");
                                System.out.println("Balance: " + balance);
                                break;
                            }
                        }

                    }

                }

            }
//            System.out.println("If you want to quit press 'Q'");
//            String exit = scanner.next();
//            if (exit.equals("Q")) {
//                break;
//            }
        }

    }
}