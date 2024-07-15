import java.util.regex.Pattern;

public class InputDetector {

    public static final Pattern NUMBER_PATTERN = Pattern.compile("^[0-9]+$");
    public static final Pattern TEXT_PATTERN = Pattern.compile("^[A-Za-z]+$");
    public static final Pattern SPECIAL_CHARACTER_PATTERN = Pattern.compile("^[^A-Za-z0-9]+$");

    public static boolean isNumber(String input) {
        return NUMBER_PATTERN.matcher(input).matches();
    }

    public static boolean isText(String input) {
        return TEXT_PATTERN.matcher(input).matches();
    }

    public static boolean isSpecialCharacter(String input) {
        return SPECIAL_CHARACTER_PATTERN.matcher(input).matches();
    }

    public static InputCategory categorizeInput(String input) {
        if (isNumber(input)) {
            return InputCategory.NUMBER;
        } else if (isText(input)) {
            return InputCategory.TEXT;
        } else if (isSpecialCharacter(input)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            throw new IllegalArgumentException("Invalid input type");
        }
    }
}
