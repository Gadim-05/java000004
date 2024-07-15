public class Rectangle extends Shape{
    int a = 5;
    int b = 4;

    @Override
    public double calculateArea() {
        result = a*b;
        return super.calculateArea();
    }
}
