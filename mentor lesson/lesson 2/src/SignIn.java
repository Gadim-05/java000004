import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME");

        boolean isLogged = true;
        int count = 4;
        while (true) {
            if (count == 1){
                System.out.println("You've made too many wrong attempts!!!!");
                break;
            }
            System.out.println("Enter your username:");
            String username = scanner.nextLine();

            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (username.equals("qedim") && password.equals("12345")) {
                System.out.println("Welcome " + username);
                System.out.println("You are logged in");
                break;
            } else if (username.equals("qedim") && !password.equals("12345")) {
                System.out.println("Your password is incorrect!!!!");
                System.out.println("Please enter your password correctly");
                count--;
            } else if (!username.equals("qedim") && password.equals("12345")) {
                System.out.println("Your username is incorrect!!!!");
                System.out.println("Please enter your username correctly");
                count--;
            }
            else {
                System.out.println("Username and password is incorrect!!!!");
                count--;
            }

        }
    }
}
