import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] symbols =   {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
        double balance = 1000;
        String[] slot = new String[6];
        int rand;

        System.out.println("WELCOME TO SLOT GAME");
        System.out.println("=============================");
        System.out.println("ARE YOU LUCKY  FOR TODAY?");
        System.out.println("=============================");
        System.out.println("EXIT--->'Q'");
        System.out.println("=============================");

       while (balance>0) {
           System.out.println("Balance: " + balance);
           System.out.println("=============================");
           System.out.print("Enter bet amount: ");
           double bet = scanner.nextDouble();

           if (bet > balance) {
               System.out.println("CEBINDE PARAMI VAR LAN");
               System.out.println("Balance: " + balance);
           }
           else {
               for (int i = 0; i <6 ; i++) {
                   rand = random.nextInt(6);
                   slot[i] = symbols[rand];
                   System.out.print(slot[i]);
               }
               System.out.println();
               boolean won = false;
               for (int i = 0; i < slot.length; i++) {
                   for (int j = i+1; j <slot.length ; j++) {
                       for (int k = j+1; k <slot.length ; k++) {
                           if (slot[i].equals(slot[j]) && slot[j].equals(slot[k])){
                               won = true;
                               switch (slot[i]){
                                   case "🍒":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  bet + "$");
                                       balance+=bet;
                                       System.out.println("Balance: " + balance);
                                       break;

                                   case "🍋":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  2.4*bet + "$");
                                       balance+= (2.4*bet);
                                       System.out.println("Balance: " + balance);
                                       break;

                                   case "🍊":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  0.5*bet + "$");
                                       balance+= (0.5*bet);
                                       System.out.println("Balance: " + balance);
                                       break;

                                   case "🔔":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  0.25*bet + "$");
                                       balance+= (0.25*bet);
                                       System.out.println("Balance: " + balance);
                                       break;

                                   case "🍉":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  5*bet + "$");
                                       balance+= (5*bet);
                                       System.out.println("Balance: " + balance);
                                       break;

                                   case "🍇":
                                       System.out.println("CONGRATULATIONS, YOU WON " +  3*bet + "$");
                                       balance+= (3*bet);
                                       System.out.println("Balance: " + balance);
                                       break;


                               }
                           }

                           }
//                       if (won) {
//                           break;
//                       }

                       }

//                   if (won) {
//                       break;
//                   }
                   }
               if (!won) {
                   balance -= bet;

               }
               }

           System.out.println("If you want to quit press 'Q'");
           String exit = scanner.next();
           if (exit.equals("Q")){
               break;
           }

       }

       }

    }



