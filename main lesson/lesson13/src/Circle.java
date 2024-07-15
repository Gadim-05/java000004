public class Circle extends Shape{

    int radius = 5;


    @Override
    public double calculateArea() {
        result = Math.PI*radius*radius;
        return super.calculateArea();
    }
}
