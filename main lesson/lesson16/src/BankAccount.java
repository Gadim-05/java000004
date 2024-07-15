import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void depositAmount(){
        System.out.println("Enter deposit amount: ");
        double dep = sc.nextDouble();
        balance+=dep;

        System.out.println("Current balance : " + balance);
    }

    void withdrawAmount () throws InsufficientFundsException{
        System.out.println("Enter withdraw amount: ");

        double with = sc.nextDouble();
        balance-=with;
        if (balance<0){
            throw new InsufficientFundsException("Balansdan artiq mebleg cekmek olmaz");
        }
    }

    void isWithdrawing(){
        try {
            withdrawAmount();
        }catch (InsufficientFundsException e){
            System.out.println("Xeta: " + e.getMessage());
        }
    }



}
