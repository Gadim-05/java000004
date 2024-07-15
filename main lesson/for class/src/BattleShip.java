import java.util.ArrayList;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chance = 10;
        int count = 0;
        String[][] area = {
                {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                {"1", "0", "0", "0", "0", "1", "1", "1", "0", "0", "0"},
                {"2", "0", "0", "0", "0", "0", "0", "0", "0", "1", "1"},
                {"3", "0", "0", "1", "1", "1", "0", "0", "0", "0", "0"},
                {"4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"5", "0", "0", "1", "1", "1", "1", "1", "0", "0", "0"},
                {"6", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"7", "0", "1", "1", "1", "1", "0", "0", "0", "0", "0"},
                {"8", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"9", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0"},
                {"10", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
        };

        ArrayList<String> ship4lu = new ArrayList<>();
        for (int i = 2; i < 6; i++) {
            ship4lu.add(area[3][i]);
        }

        // Display the ship4lu array
        System.out.println("Initial ship4lu:");
        for (String s : ship4lu) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }

        while (chance >= 1) {
            System.out.print("Choose x coordinate: ");
            int x = scanner.nextInt();

            System.out.print("Choose y coordinate: ");
            int y = scanner.nextInt();

            if (area[x][y].equals("1")) {
                System.out.println("You shoted");
                count++;
                area[x][y] = "v";

                // Remove the hit element from ship4lu
                String hitElement = area[x][y];
                if (ship4lu.contains(hitElement)) {
                    ship4lu.remove(hitElement);
                }
            } else {
                System.out.println("Miss");
                chance--;
                area[x][y] = "x";
            }
        }
        System.out.println("You shoted " + count + " ship3lu");
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }

        // Display the ship4lu array after hits
        System.out.println("Updated ship4lu:");
        for (String s : ship4lu) {
            System.out.print(s + " ");
        }
    }
}
