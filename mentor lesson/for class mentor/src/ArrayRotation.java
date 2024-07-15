import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int eded = scanner.nextInt();


        if (eded != 0) {
            cevrilmisMassiv(massiv, eded);
        }

        System.out.println("Cevrilmis Massiv: " + Arrays.toString(massiv));
    }

    private static void cevrilmisMassiv(int[] arr, int numOfElements) {
        int uzunluq = arr.length;
        int surusme = Math.floorMod(numOfElements, uzunluq);
        if (surusme != 0) {
            int[] temp = Arrays.copyOfRange(arr, uzunluq - surusme, uzunluq);
            System.arraycopy(arr, 0, arr, surusme, uzunluq - surusme);
            System.arraycopy(temp, 0, arr, 0, surusme);
        }
    }
}
