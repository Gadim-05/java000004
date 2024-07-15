import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the colors of the rainbow:");
        String[] rainbow = new String[7];
        for (int i = 0; i < 7; i++) {
            rainbow[i] = scanner.next();
        }
        System.out.println("Rainbow colors:");
        for(String color : rainbow){
            System.out.println(color);
        }
    }
}
