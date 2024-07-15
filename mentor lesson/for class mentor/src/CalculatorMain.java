public class CalculatorMain {

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println(sc.add(5, 6));
        System.out.println(sc.add(4, 7));
        System.out.println(sc.add(3, 4, 5));
        System.out.println(sc.power(3, 2));
    }
}
