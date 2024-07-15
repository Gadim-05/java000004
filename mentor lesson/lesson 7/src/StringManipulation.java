import java.util.Arrays;
public class StringManipulation {



        public static void main(String[] args) {
            String input = "Hello World. Numune ucun sozler ";


            int charCount = countCharacters(input);


            String upperCaseString = input.toUpperCase();


            String lowerCaseString = input.toLowerCase();


            boolean startsWithA = input.toUpperCase().startsWith("A");


            boolean endsWithZ = input.toUpperCase().endsWith("Z");


            String replacedString = input.replace('e', 'E');


            String[] words = input.split(" ");


            int indexOfO = input.indexOf('o');


            String substring = input.substring(4, 10);


            String trimmedString = input.trim();


            System.out.println("1. Number of characters: " + charCount);
            System.out.println("2. Uppercase string: " + upperCaseString);
            System.out.println("3. Lowercase string: " + lowerCaseString);
            System.out.println("4. Starts with 'A': " + startsWithA);
            System.out.println("5. Ends with 'Z': " + endsWithZ);
            System.out.println("6. String with 'e' replaced by 'E': " + replacedString);
            System.out.println("7. Array of words: " + Arrays.toString(words));
            System.out.println("8. Index of first 'o': " + indexOfO);
            System.out.println("9. Substring from 5th to 10th character: " + substring);
            System.out.println("10. Trimmed string: \"" + trimmedString + "\"");
        }

        private static int countCharacters(String str) {
            // Remove whitespaces and count characters
            return str.replaceAll(" ", "").length();
        }


}
