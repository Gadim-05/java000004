//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EvenOdd printer = new EvenOdd();

        Thread evenThread = new Thread(() -> printer.printNumbers(0));
        Thread oddThread = new Thread(() -> printer.printNumbers(1));

        evenThread.start();
        oddThread.start();
    }
}