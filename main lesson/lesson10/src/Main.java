//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GarbageCollectorDemo s = new GarbageCollectorDemo("Qedim");

        GarbageCollectorDemo s2 = new GarbageCollectorDemo("Teymur");

        s = null;

        System.gc();

    }
}