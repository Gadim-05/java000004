public class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return Math.PI*r*r;
    }
}
