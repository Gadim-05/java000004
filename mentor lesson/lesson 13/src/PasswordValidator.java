import java.util.regex.Pattern;

public class PasswordValidator {
    public void validatePassword(String password) throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }


        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
        }


        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
        }


        if (!Pattern.compile("\\d").matcher(password).find()) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }
    }
}
