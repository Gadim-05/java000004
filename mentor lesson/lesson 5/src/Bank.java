import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    int accountNumber;
    double balance = 0;

    public void deposit() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Balance = " + balance);
    }

    public void cashDraw() {

        System.out.println("Enter the amount what you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("There's not enough balance");

        } else {
            balance -= amount;


        }
        System.out.println("Balance = " + balance);
    }
}
