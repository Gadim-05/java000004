import java.util.Scanner;

public class CarInventory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] garage = {
                {"Honda","Mercedes","BMW"},
                {"Toyota","Renault","Hyundai"},
                {"Kia","Opel","Ford"},
                {"Audi","Chevrolet","Citroen"}
        };

        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.println("car " + "(" + i + "," + j + "): " + garage[i][j] + " ");
            }

        }



    }

}
