import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User(scanner.next(), scanner.next());

        System.out.println(user1);
    }
}
