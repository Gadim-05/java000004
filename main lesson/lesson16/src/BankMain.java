import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws InsufficientFundsException, InvalidAccountException {

        BankAccount b = new BankAccount("1002", "Tima", 1000);
//        b.depositAmount();
//        //b.withdrawAmount();
//        b.isWithdrawing();
        transferFunds();

    }
    public static void transferFunds() throws InsufficientFundsException, InvalidAccountException{
        Scanner sc = new Scanner(System.in);
        BankAccount account1 = new BankAccount("1003", "Teymur",2000);
        BankAccount account2 = new BankAccount("1005", "Qedim",3000);

        System.out.println("Enter amount to transfer: ");
        double bal = sc.nextDouble();

        System.out.println("Hansi hesabdan gondermek isteyirsiniz: ");
        String accNum1 = sc.next();

        System.out.println("Hansi hesaba gondermek isteyirsiniz: ");
        String accNum2 = sc.next();

        if (!accNum1.equals(account1.accountNumber) ){
            throw new InvalidAccountException("Menbe Hesab tapilmadi");
        } else if (!accNum2.equals(account2.accountNumber)) {
            throw new InvalidAccountException("Pul Gonderilen hesab kurdistandir");
        }
        else if (bal>account1.balance){
            throw new InsufficientFundsException("Balansda kifayet qeder vesait yoxdur");
        }
        else {
            account1.balance-=bal;
            account2.balance+=bal;
        }
        System.out.println("Account 1 balance: " + account1.balance);
        System.out.println("Account 2 balance: " + account2.balance);
    }

}
