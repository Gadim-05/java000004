import java.util.Arrays;

public class dm {
    public static void main(String[] args) {
        int[] numbers = {1,4,2,5,3};

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Random reqemler: " + numbers[i]);
        }
        System.out.println();
        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Duzeldilmis: " + numbers[i]);
        }
        }
    }

