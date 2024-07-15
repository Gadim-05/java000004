//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TimeCalculator tm = new TimeCalculator();

        tm.calculateDifference(10,30,5,25);
        tm.calculateDifference("04:50", "18:00");

    }
}