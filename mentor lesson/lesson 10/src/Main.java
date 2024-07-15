//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Qedim", 2000, 1.5, 5);
        Director director = new Director("Fuzuli", 1600, 1.3,4,100);

        manager.calculateBonus();
        manager.displayInfo();
        System.out.println();
        director.calculateBonus();
        director.displayInfo();
    }
}