//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "C300", 4);
        Bike bike1 = new Bike("Kawasaki","Ninja H2R",2);

        car1.details();
        System.out.println();
        bike1.details();


    }
}