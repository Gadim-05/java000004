import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {


        String paragraph = "The quick brown fox jumped over the lazy dog, but the lazy dog didn't notice because the lazy dog was too busy sleeping";

        String lowercaseParagraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();


        String[] words = lowercaseParagraph.split("\\s+");

        Set<String> unique = new HashSet<>();

        Collections.addAll(unique, words);

        System.out.println("New Paragraph: ");
        for (String word: unique){
            System.out.println(word );
        }

    }
}