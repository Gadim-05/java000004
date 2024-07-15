import java.util.Scanner;

public class KababchiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kabab kabab = new Kabab(scanner.next(), scanner.nextDouble());
        Meze meze = new Meze(scanner.next(), scanner.nextDouble());
        Ichki ichki = new Ichki(scanner.next(), scanner.nextDouble());

        Menu menu = new Menu(kabab,meze,ichki);

        System.out.println(menu);
    }
}
