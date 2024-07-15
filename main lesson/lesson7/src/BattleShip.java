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

        String[] ship3lu = new String[3];

        for (int i = 0; i < ship3lu.length; i++) {
            ship3lu[i] = area[1][i + 5];

        }
        String[] ship3lu2 = new String[3];
        for (int i = 0; i <ship3lu2.length ; i++) {
            ship3lu2[i] = area[3][i+3];

        }
        String[] ship2li = new String[2];
        for (int i = 0; i <ship2li.length ; i++) {
            ship2li[i] = area[2][i+9];

        }
        String[] ship5li = new String[5];
        for (int i = 0; i <ship5li.length ; i++) {
            ship5li[i] = area[5][i+3];

        }
        String[] ship4lu = new String[4];
        for (int i = 0; i <ship4lu.length ; i++) {
            ship4lu[i] = area[3][i+2];

        }
        String[] ship2li2 = new String[2];
        for (int i = 0; i <ship2li2.length ; i++) {
            ship2li2[i] = area[3][i+5];

        }



//        for (int i = 0; i < ship3lu2.length; i++) {
//            System.out.print(ship3lu2[i] + " ");
//
//        }
//        System.out.println();
//
//            for (int i = 0; i < ship3lu.length; i++) {
//                System.out.print(ship3lu[i] + " ");
//
//            }


            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print(area[i][j] + " ");
                }
                System.out.println(" ");
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
                    
                } else {
                    System.out.println("Miss");
                    chance--;
                    area[x][y] = "x";
                }
            }
            System.out.println("You shoted " + count + " ship");
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print(area[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }

