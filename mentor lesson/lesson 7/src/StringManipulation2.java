public class StringManipulation2 {
    public static void main(String[] args) {
        String input = "This is an example Java string, with some punctuation";
        int vowelCount = countVowels(input);

        String reversedString = reverseString(input);

        boolean containsJava = input.toLowerCase().contains("java");

        String replacedString = input.replaceAll("example", "sample");

        String cleanString = input.replaceAll("[^a-zA-Z\\s]", "");

        boolean containsOnlyAlphabetic = input.matches("[a-zA-Z]+");

        int lastIndexT = input.lastIndexOf('t');


        System.out.println("1. Number of vowels: " + vowelCount);
        System.out.println("2. Reversed string: " + reversedString);
        System.out.println("3. Contains 'Java': " + containsJava);
        System.out.println("4. Replaced 'example' with 'sample': " + replacedString);
        System.out.println("5. String without punctuation: " + cleanString);
        System.out.println("6. Contains only alphabetic characters: " + containsOnlyAlphabetic);
        System.out.println("8. Index of last 't': " + lastIndexT);

    }
    public static int  countVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "").length();
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
