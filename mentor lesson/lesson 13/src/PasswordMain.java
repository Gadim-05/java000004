public class PasswordMain {
    public static void main(String[] args) {
        PasswordValidator pv = new PasswordValidator();
        String password = "password123";

        try {
            pv.validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
