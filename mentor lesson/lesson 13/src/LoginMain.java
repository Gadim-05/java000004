import javax.naming.AuthenticationException;
import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) throws AuthenticationException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String uname = scanner.next();

        System.out.print("Enter Password: ");
        String pass = scanner.next();

        login(uname,pass);

    }




    public static void login(String username, String password) throws AuthenticationException {


        if (!username.equals("Qedim")){
            throw new AuthenticationException("Username is incorrect");

        }
        if (!password.equals("Qedim123")){
            throw new AuthenticationException("Password is incorrect");
        }

        System.out.println("Login Successful");
    }
}
