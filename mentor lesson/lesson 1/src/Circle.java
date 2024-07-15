import java.util.Scanner;

public class Circle {
    static  Scanner scanner = new Scanner(System.in);

    public static void findArea(){
        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area of the circle is: " + area);
    }
    public static void findPerimeter(){
        System.out.print("Enter the radius: " );
        double r = scanner.nextDouble();
        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
    public static void main(String[] args) {

//        findPerimeter();
    }
}
