import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bankAccount = new Bank();
        System.out.println("Enter the account number: ");
        bankAccount.accountNumber = scanner.nextInt();
        System.out.println("Enter the balance: ");
        bankAccount.balance = scanner.nextDouble();

        System.out.println("Balance: " + bankAccount.balance);

        bankAccount.deposit();
        bankAccount.cashDraw();

    }
}
