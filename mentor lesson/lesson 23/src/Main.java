import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = generateRandomNumbers( 30, 2, 11);

        System.out.println("Random Numbers:");
        System.out.println(numbers);

        Set<Integer> uniqueNumbers = getUniqueNumbers(numbers);

        System.out.println("\nUnique Numbers:");
        System.out.println(uniqueNumbers);


    }
    public static ArrayList<Integer> generateRandomNumbers(int count, int min, int max){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = r.nextInt((max - min) + 1) + min;
            numbers.add(randomNumber);
        }

        return numbers;
    }

    public static Set<Integer> getUniqueNumbers(ArrayList<Integer> a){
        return new HashSet<>(a);
    }
}