import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter length: ");
        rectangle.length = scanner.nextInt();

        System.out.print("Enter width: ");
        rectangle.width = scanner.nextInt();

       int area = rectangle.calculateArea();
       int perimeter = rectangle.calculatePerimeter();

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}