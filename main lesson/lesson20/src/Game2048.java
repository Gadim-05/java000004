import java.util.Scanner;

public class Game2048 {
Scanner scanner = new Scanner(System.in);
    static int[][] area = new int[4][4];
    static int score = 0;
    public static void createArea(){
        area[0][0] = 2;
        area[0][1] = 0;
        area[0][2] = 0;
        area[0][3] = 2;
        area[1][0] = 0;
        area[1][1] = 2;
        area[1][2] = 0;
        area[1][3] = 0;
        area[2][0] = 0;
        area[2][1] = 2;
        area[2][2] = 0;
        area[2][3] = 0;
        area[3][0] = 0;
        area[3][1] = 0;
        area[3][2] = 2;
        area[3][3] = 0;
    }

    public static void printArea(){

        System.out.println("Score: " + score);
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                System.out.print(area[i][j] + " " );
            }
            System.out.println();
        }
    }

    public static void moveUp() {
        for (int j = 0; j < area.length; j++) {
            for (int i = 0; i < area.length; i++) {
                for (int k = i + 1; k < area.length; k++) {
                    if (area[k][j] != 0) {
                        if (area[i][j] == 0) {
                            area[i][j] = area[k][j];
                            area[k][j] = 0;
                        } else if (area[i][j] == area[k][j]) {
                            area[i][j] *= 2;
                            score += area[i][j];
                            area[k][j] = 0;
                        }
                        break;
                    }
                }
            }
        }
    }
    public static void moveDown(){
        for (int j = 0; j < area.length; j++) {
            for (int i = area.length-1; i >=0 ; i--) {
                for (int k = i-1; k >= 0; k--) {
                    if (area[k][j]!=0){
                        if (area[i][j]==0){
                            area[i][j] = area[k][j];
                            area[k][j] = 0;
                        } else if (area[i][j]==area[k][j]) {
                            area[i][j]*=2;
                            score+=area[i][j];
                            area[k][j] = 0;
                        }
                        break;
                    }
                }

            }

        }
    }

    public static void moveLeft(){
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                for (int k = j+1; k < area.length; k++) {
                    if (area[i][k]!=0){
                        if (area[i][j] == 0){
                            area[i][j] = area[i][k];
                            area[i][k] = 0;
                        } else if (area[i][j]==area[i][k]) {
                            area[i][j]*=2;
                            score+=area[i][j];
                            area[i][k] = 0;

                        }
                        break;
                    }
                }
            }
        }
    }

    private static void moveRight() {
        for (int i = 0; i < area.length; i++) {
            for (int j = area.length - 1; j >= 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (area[i][k] != 0) {
                        if (area[i][j] == 0) {
                            area[i][j] = area[i][k];
                            area[i][k] = 0;
                        } else if (area[i][j] == area[i][k]) {
                            area[i][j] *= 2;
                            score += area[i][j];
                            area[i][k] = 0;
                        }
                        break;
                    }
                }
            }
        }
    }


    static void addRandom() {
        while (true) {
            int row = (int) (Math.random() * area.length);
            int col = (int) (Math.random() * area.length);
            if (area[row][col] == 0) {
                area[row][col] = 2;
                break;
            }
}
}




    public static void main(String[] args) {
        createArea();
        printArea();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter direction: ");
            String direction = sc.next();
            switch (direction) {
                case "w":
                case "W":
                    moveUp();
                    break;
                case "s":
                case "S":
                    moveDown();
                    break;
                case "a":
                case "A":
                    moveLeft();
                    break;
                case "d":
                case "D":
                    moveRight();
                    break;

                default:
                    System.out.println("Wrong move. Please enter W, A, S, D.");
                    continue;
            }
            addRandom();
            printArea();

        }
    }
}
