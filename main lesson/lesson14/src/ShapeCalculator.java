import java.util.Scanner;

public class ShapeCalculator {
    int area(int length, int width){
        return length*width;
    }
    double area(double base, double height){
        return base*height/2;
    }

    double area(int radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator calculator = new ShapeCalculator();
        int totalScore = 0;

        System.out.print("Enter the number of challenges: ");
        int numChallenges = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numChallenges; i++) {
            System.out.print("Enter the shape (rectangle, circle, triangle): ");
            String shape = scanner.nextLine().trim().toLowerCase();
            double area = 0;
            int points = 0;

            switch (shape) {
                case "rectangle":
                    System.out.print("Enter the length of the rectangle: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the width of the rectangle: ");
                    int width = scanner.nextInt();
                    scanner.nextLine();
                    area = calculator.area(length, width);
                    points = 3;
                    break;

                case "circle":
                    System.out.print("Enter the radius of the circle: ");
                    int radius = scanner.nextInt();
                    scanner.nextLine();
                    area = calculator.area(radius);
                    points = 5;
                    break;

                case "triangle":
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    area = calculator.area(base, height);
                    points = 10;
                    break;

                default:
                    System.out.println("Invalid shape. Please enter rectangle, circle, or triangle.");
                    i--;
                    continue;
            }

            System.out.println("The area of the " + shape + " = " + area);
            totalScore += points;
            System.out.println("You earned "  + points + " points. Total score:" + totalScore);
        }

        System.out.println("Game over! ");
        System.out.println("Your point: " + totalScore);

    }
}
