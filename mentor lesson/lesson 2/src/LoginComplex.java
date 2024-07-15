import java.util.Scanner;

public class LoginComplex {
    static Scanner  scanner = new Scanner(System.in);

    private static String username;
    private static String password;



    public static void signUp(){
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password:  ");
        password = scanner.nextLine();

    }
    public static void signIn() {
        System.out.println("Yuxarini gormuruk kimi edek");
        System.out.println("WELCOME....");

        boolean isLogged = true;
        int count = 4;
        while (true) {
            if (count == 1) {
                System.out.println("You've made too many wrong attempts!!!!");
                break;
            }
            System.out.println("Enter your username:");
            String username1 = scanner.nextLine();

            System.out.println("Enter your password:");
            String password1 = scanner.nextLine();

            if (username1.equals(username) && password1.equals(password)) {
                System.out.println("Welcome " + username1);
                System.out.println("You are logged in");
                break;
            } else if (username1.equals(username) && !password1.equals(password)) {
                System.out.println("Your password is incorrect!!!!");
                System.out.println("Please enter your password correctly");
                count--;
            } else if (!username1.equals(username) && password1.equals(password)) {
                System.out.println("Your username is incorrect!!!!");
                System.out.println("Please enter your username correctly");
                count--;
            } else {
                System.out.println("Username and password is incorrect!!!!");
                count--;
            }
        }


    }

}
