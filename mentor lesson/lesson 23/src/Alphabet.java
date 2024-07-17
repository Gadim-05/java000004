import java.util.LinkedList;
import java.util.List;

public class Alphabet {

    public static void main(String[] args) {
        LinkedList<Character> lowercaseLetters = generateLowercases();
        LinkedList<Character> uppercaseLetters = generateUppercases();

        LinkedList<String> mergedLetters = mergeLists(lowercaseLetters, uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }



    }



    private static LinkedList<Character> generateUppercases() {
        LinkedList<Character> uppercaseLetters = new LinkedList<>();
        for (char character = 'a'; character<='z'; character++){
            uppercaseLetters.add(character);
        }
        return uppercaseLetters;
    }

    private static LinkedList<Character> generateLowercases() {

        LinkedList<Character> lowercaseLetters = new LinkedList<>();
        for (char character = 'A'; character<= 'Z'; character++){
            lowercaseLetters.add(character);
        }
        return lowercaseLetters;
    }

    private static LinkedList<String> mergeLists(LinkedList<Character> lowercaseLetters, LinkedList<Character> uppercaseLetters) {
        LinkedList<String> mergedList = new LinkedList<>();
        int size = lowercaseLetters.size();

        for (int i = 0; i < size; i++) {
            mergedList.add("" + lowercaseLetters.get(i) + uppercaseLetters.get(i));
        }
        return mergedList;
    }
    
}
