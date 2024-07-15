import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scanner.nextLine();

        String lowerSentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = lowerSentence.split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word: words){
            frequency.put(word,frequency.getOrDefault(word,0)+1);
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
