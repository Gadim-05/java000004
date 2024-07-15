import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);

    public static void findArea(){

        System.out.print("Enter the first side: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double b = scanner.nextDouble();

        double area = a*b;
        System.out.println("Area of the rectangle is: " + area);
    }
    public static void findPerimeter(){
        System.out.print("Enter the first side: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double b = scanner.nextDouble();

        double perimeter = 2*(a+b);
        System.out.println("Perimeter of the rectangle is: " + perimeter);

    }

    public static void main(String[] args) {
    findArea();
        findPerimeter();
    }
}
